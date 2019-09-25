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
public class Operator {
    private Integer id_operator;
    private String nama;
    private Jabatan jabatan;
    private Boolean aktif;

    public Integer getId_operator() {
        return id_operator;
    }

    public void setId_operator(Integer id_operator) {
        this.id_operator = id_operator;
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
