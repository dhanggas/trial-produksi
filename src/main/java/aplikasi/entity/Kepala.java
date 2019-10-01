/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity;

/**
 *
 * @author dhiskar
 */
public class Kepala {
    private Integer id_kepala;
    private String nama;
    private Jabatan jabatan;
    private Boolean aktif;

    public Integer getId_kepala() {
        return id_kepala;
    }

    public void setId_kepala(Integer id_kepala) {
        this.id_kepala = id_kepala;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }
          
}
