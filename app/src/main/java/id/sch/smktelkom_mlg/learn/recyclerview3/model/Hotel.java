package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by Smktelkom on 01/11/2016.
 */
public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String foto;
    public String lokasi;
    public String detail;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
