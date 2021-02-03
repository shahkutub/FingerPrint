//package co.planetsystems.tela.utils;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//import com.google.gson.Gson;
//
//import org.jetbrains.annotations.Nullable;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static android.content.Context.MODE_PRIVATE;
//
//public class Appconstant {
//
//
//    public static ShelterCenterData shelterData = new ShelterCenterData();
//    public static WarehouseDat warehouseData = new WarehouseDat();
//    public static List<ApproveHazardInfo> approveHazardInfo = new ArrayList<>();
//    public static double lat;
//    public static double lon;
//
//    public static double startLat;
//    public static double startLon;
//
//    public static double desLat;
//    public static double desLon;
//    @Nullable
//    public static String destinationName;
//    public static String startName;
//
//
//    public static void saveLoginUserdat(Context con, LoginResponse loginData) {
//        SharedPreferences mPrefs = con.getSharedPreferences("loginUserdata",MODE_PRIVATE);
//        SharedPreferences.Editor prefsEditor = mPrefs.edit();
//        Gson gson = new Gson();
//        String json = gson.toJson(loginData);
//        prefsEditor.putString("loginUserdata", json);
//        prefsEditor.commit();
//
//    }
//
//    public static LoginResponse getLoginUserdat(Context con){
//        SharedPreferences mPrefs = con.getSharedPreferences("loginUserdata",MODE_PRIVATE);
//        LoginResponse loginData = new LoginResponse();
//        Gson gson = new Gson();
//        String json = mPrefs.getString("loginUserdata", "");
//        loginData = gson.fromJson(json,LoginResponse.class);
//        return loginData;
//    }
//
//
//
//}
