/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity;

import java.sql.Time;

/**
 *
 * @author dhiskar
 */
public class Trial {
    private Integer id_trial;
    private Dies dies;
    private Mesin mesin;
    private Jabatan jabatan1;
    private Jabatan jabatan2;
    private Time mulai;
    private Time selesai;

    public Integer getId_trial() {
        return id_trial;
    }

    public void setId_trial(Integer id_trial) {
        this.id_trial = id_trial;
    }

    public Dies getDies() {
        return dies;
    }

    public void setDies(Dies dies) {
        this.dies = dies;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Jabatan getJabatan1() {
        return jabatan1;
    }

    public void setJabatan1(Jabatan jabatan1) {
        this.jabatan1 = jabatan1;
    }

    public Jabatan getJabatan2() {
        return jabatan2;
    }

    public void setJabatan2(Jabatan jabatan2) {
        this.jabatan2 = jabatan2;
    }

    public Time getMulai() {
        return mulai;
    }

    public void setMulai(Time mulai) {
        this.mulai = mulai;
    }

    public Time getSelesai() {
        return selesai;
    }

    public void setSelesai(Time selesai) {
        this.selesai = selesai;
    }
    
            
}
