package co.planetsystems.tela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import co.planetsystems.tela.enroll.BasicFragment;
import co.planetsystems.tela.enroll.PrimaryFragment;
import co.planetsystems.tela.enroll.SupplementaryFragment;

public class EnrollActivity extends AppCompatActivity implements
        BasicFragment.OnNextBasicClick,
        PrimaryFragment.OnNextPrimaryClickListener,
        SupplementaryFragment.OnPreviousClickSupplementaryListener,
        PrimaryFragment.OnPreviousPrimaryClickListener,
        SupplementaryFragment.OnSaveEveryDataAndCloseListener {
    public static final String ACTION_ENROLL = "co.planetsystems.tela.ACTION_ENROLL";
    public static final String ACTION_VERIFY = "co.planetsystems.tela.ACTION_VERIFY";
    public static final String FIRST_NAME = "co.planetsystems.tela.FIRST_NAME";
    public static final String LAST_NAME = "co.planetsystems.tela.LAST_NAME";
    public static final String PHONE_NUMBER = "co.planetsystems.tela.PHONE_NUMBER";
    public static final String EMAIL_ADDRESS = "co.planetsystems.tela.EMAIL_ADDRESS";
    public static final String GENDER = "co.planetsystems.tela.GENDER";
    public static final String NATIONAL_ID = "co.planetsystems.tela.NATIONAL_ID";
    public static final String SCHOOL_NAME = "co.planetsystems.tela.SCHOOL_NAME";
    public static final String DISTRICT = "co.planetsystems.tela.DISTRICT";
    public static final String ROLE = "co.planetsystems.tela.ROLE";
    public static final String CAPTURED_TEMPLATE = "co.planetsystems.tela.CAPTURED_TEMPLATE";
    public static final String CAPTURED_BITMAP = "co.planetsystems.tela.CAPTURED_BITMAP";
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String gender;
    private String nationalID;
    private String schoolName;
    private String district;
    private String role;
    private EnrollActivityViewModel viewModel;
    public byte[] capturedTemplateData;
    private byte[] teacherThumb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        viewModel = new ViewModelProvider(this).get(EnrollActivityViewModel.class);

        if (getSupportFragmentManager().findFragmentById(R.id.enroll_fragment) == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.enroll_fragment, BasicFragment.newInstance(firstName, lastName, phoneNumber))
                    .commit();
        }

        if (getIntent() != null) {
            capturedTemplateData = getIntent().getByteArrayExtra(CAPTURED_TEMPLATE);
            teacherThumb = getIntent().getByteArrayExtra(CAPTURED_BITMAP);
//            Toast.makeText(EnrollActivity.this, ""+capturedTemplateData, Toast.LENGTH_SHORT).show();
//            Toast.makeText(EnrollActivity.this, ""+bytesToHex(capturedTemplateData), Toast.LENGTH_SHORT).show();
            Toast.makeText(EnrollActivity.this, ""+bytesToHex(capturedTemplateData).length(), Toast.LENGTH_LONG).show();

        }

    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    @Override
    public void clickNextBasic(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        getSupportFragmentManager().beginTransaction().replace(
                R.id.enroll_fragment,
                PrimaryFragment.newInstance(emailAddress, gender, nationalID)
        ).commitNow();
    }

    @Override
    public void onNextPrimaryClick(String email, String gender, String nationId) {
        this.emailAddress = email;
        this.gender = gender;
        this.nationalID = nationId;
        getSupportFragmentManager().beginTransaction().replace(
                R.id.enroll_fragment,
                SupplementaryFragment.newInstance(schoolName, district, role)
        ).commitNow();
    }

    @Override
    public void onPreviousSupplementaryClick(String school, String district, String role) {
        this.schoolName = school;
        this.district = district;
        this.role = role;

        getSupportFragmentManager().beginTransaction().replace(
                R.id.enroll_fragment,
                PrimaryFragment.newInstance(emailAddress, gender, nationalID)
        ).commitNow();
    }

    @Override
    public void onPreviousPrimaryClick(String email, String gender, String nationId) {
        this.emailAddress = email;
        this.gender = gender;
        this.nationalID = nationId;

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.enroll_fragment, BasicFragment.newInstance(firstName, lastName, phoneNumber))
                .commitNow();
    }

    @Override
    public void saveEveryData(String school, String district, String role) {
        this.schoolName = school;
        this.district = district;
        this.role = role;
        Intent intent = new Intent();
        intent.putExtra(FIRST_NAME, firstName);
        intent.putExtra(LAST_NAME, lastName);
        intent.putExtra(PHONE_NUMBER, phoneNumber);
        intent.putExtra(EMAIL_ADDRESS, emailAddress);
        intent.putExtra(GENDER, gender);
        intent.putExtra(NATIONAL_ID, nationalID);
        intent.putExtra(DISTRICT, district);
        intent.putExtra(ROLE, role);
        intent.putExtra(CAPTURED_TEMPLATE, capturedTemplateData);
        intent.putExtra(CAPTURED_BITMAP, teacherThumb);
        setResult(RESULT_OK, intent);
        finish();
    }
}
