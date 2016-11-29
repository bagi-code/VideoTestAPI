
package com.bagicode.www.videotestapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelData {

    @SerializedName("id_mhs")
    @Expose
    private String idMahasiswa;

    @SerializedName("nama_mhs")
    @Expose
    private String nama;

    @SerializedName("kelas_mhs")
    @Expose
    private String kelas_mhs;

    public static final String id_mahasiswa = "ID_MAHASISWA";
    public static final String nama_mahasiswa = "ID_MAHASISWA";
    public static final String jenis_mahasiswa = "ID_MAHASISWA";

    public ModelData(String id, String nama, String kelas_mhs) {
        this.idMahasiswa = id;
        this.nama = nama;
        this.kelas_mhs = kelas_mhs;
    }

    /**
     * 
     * @return
     *     The idMahasiswa
     */
    public String getidMahasiswa() {
        return idMahasiswa;
    }

    /**
     * 
     * @param idMahasiswa
     *     The id_mahasiswa
     */
    public void setidMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    /**
     * 
     * @return
     *     The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama
     *     The Nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return
     *     The jenis
     */
    public String getKelas_mhs() {
        return kelas_mhs;
    }

    /**
     * 
     * @param kelas_mhs
     *     The Jenis
     */
    public void setKelas_mhs(String kelas_mhs) {
        this.kelas_mhs = kelas_mhs;
    }

}
