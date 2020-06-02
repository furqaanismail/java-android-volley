package com.example.listmahasiswaapi;

public class Mhs {
    private String nama,kontak,alamat;

    public Mhs(String nama, String kontak, String alamat) {
        this.nama = nama;
        this.kontak = kontak;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }

    public String getAlamat() {
        return alamat;
    }
}
