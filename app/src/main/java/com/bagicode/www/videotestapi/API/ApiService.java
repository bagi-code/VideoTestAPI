package com.bagicode.www.videotestapi.API;



import com.bagicode.www.videotestapi.Model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

//    @FormUrlEncoded
//    @POST("tambah_data.php")
//    Call<ResponseBody> tambahData(@Field("nama") String nama, @Field("jenis") String jenis, @Field("keterangan") String keterangan);
//
//    @FormUrlEncoded
//    @POST("edit_data.php")
//    Call<ResponseBody> editData(@Field("id_barang") String id, @Field("nama_barang") String nama, @Field("jenis_barang") String jenis, @Field("keterangan_barang") String keterangan);
//
//    @FormUrlEncoded
//    @POST("hapus_data.php")
//    Call<ResponseBody> hapusData(@Field("id_barang") String id_barang);

    @GET("semua_data.php")
    Call<List<ModelData>> getSemuaMhs();

//    @GET("single_data.php")
//    Call<List<ModelData>> getSingleData(@Query("id_barang") String id);

}
