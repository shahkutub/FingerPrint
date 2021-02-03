package co.planetsystems.tela.utils;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Sadi on 11/18/2017.
 */

public interface ApiJava {


    String BASE_URL = "http://117.103.87.205:89/";
    //String BASE_URL = "http://192.168.0.119/renewableenergy/api/";
    //String BASE_URL = "http://45.64.135.226:8081/benefit_tracking/";


//    @FormUrlEncoded
//    @POST("area/get_area")
//    Call<AreaData> getArea(@Field("api_key") String apiKey
//                           //@Field("date_from") String dateFrom
//    );
//

//    @GET("api/APIBaseData/GetWarehousesForMap")
//    public Call<WareHouseMapRespoonse> getWarehousesForMap();
//
//    @GET("api/APIBaseData/GetSheltercentersForMap")
//    public Call<WareHouseMapRespoonse> GetSheltercentersForMap();
//
//    @GET("api/APICommon/GetHazardType")
//    public Call<List<HezardInfo>> getHazardType();
//
//    @GET("api/APICommon/GetDistricts")
//    public Call<List<DistrictModel>> getDistricts();
//
//     @GET
//    public Call<List<LoginResponse.Upazila>> getUpazilasByDistrict(@Url String url);
//
//
//
//    @GET
//    public Call<ShelterCenterRespponse> getSheltercentersFiltered(@Url String url);
//
//    @GET
//    public Call<SOSdataResponse> getSOSdata(@Url String url);
//
//
//    @GET
//    public Call<ImageResponse> getShelterImageInBase64(@Url String url);
//
//
//     @GET
//    public Call<ImageResponse> getWareHouseInBase64(@Url String url);
//
//
//    @GET
//    public Call<List<UnionName>> getUnion(@Url String url);
//
//    @GET
//    public Call<CitizenChartrterResponse> getCitizenCarter(@Url String url);
//
//
//    @GET
//    public Call<List<UnionNameSOS>> getUnionSos(@Url String url);
//
//
//
//    @GET
//    public Call<List<HezardNameInfo>> getHazardNameByHazardType(@Url String url);
//
//
//
//    @GET
//    public Call<WareHouseRespponse> getWareHouseFiltered(@Url String url);
//
////    @GET
////    public Call<ProductChartResponse> warehouse_product_chartUrl(@Url String url);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APIAuthorization/LogIn")
//    Call<LoginResponse> login(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APIBaseData/SaveSheltercenter")
//    Call<SubmitResponse> saveSheltercenter(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APICommon/SavePrimaryIncidence")
//    Call<SubmitResponse> savePrimaryIncidence(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("sos/SaveSosForm")
//    Call<SOSUpdate> saveSos(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APICommon/SaveIndividualHazardForm")
//    Call<SubmitResponse> saveIndividHazard(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APICommon/AddSpecialHazardForm")
//    Call<String> saveSpecialHazard(@Body String body);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APIBaseData/SaveCitizenCharter")
//    Call<String> SaveCitizenCharter(@Body String body);
//
////    @FormUrlEncoded
////    @POST("api/APIBaseData/SaveSheltercenter")
////    Call<SubmitResponse> saveSheltercenter(
////            @Field("model") String model);
//
//
////    @FormUrlEncoded
////    @POST("api/APIBaseData/SaveWarehouse")
////    Call<SubmitResponse> saveWarehouse(
////            @Field("model") String model);
//
//    @Headers("Content-Type: application/json")
//    @POST("api/APIBaseData/SaveWarehouse")
//    Call<SubmitResponse> saveWarehouse(@Body String body);


//    @FormUrlEncoded
//    @POST("api/APIBaseData/SaveSheltercenter")
//    Call<SubmitResponse> saveSheltercenter(
//            @Field("model") ShelterCenterData model);

//    @FormUrlEncoded
//    @POST("help/getHelp")
//    Call<ResponseBody> help(
//            @Field("user_id") String user_id,
//            @Field("mobile_no") String mobile_no,
//            @Field("area") String area,
//            @Field("gender") String gender);
//
//    @FormUrlEncoded
//    @POST("help/save")
//    Call<RatingResponse> helpSave(
//            @Field("user_id") String user_id,
//            @Field("name") String name,
//            @Field("mobile_no") String mobile_no,
//            @Field("gender") String gender,
//            @Field("area") String area,
//            @Field("latitude") String latitude,
//            @Field("longitude") String longitude,
//            @Field("created_at") String created_at);



}
