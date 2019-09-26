/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author dhiskar
 */
public class Trial {
    private Integer id_trial;
    private Date tanggal;
    private Dies dies;
    private Mesin mesin;
    private Kepala kepala;
    private Operator operator;
    private Time mulai;
    private Time selesai;

    public Integer getId_trial() {
        return id_trial;
    }

    public void setId_trial(Integer id_trial) {
        this.id_trial = id_trial;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
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

    public Kepala getKepala() {
        return kepala;
    }

    public void setKepala(Kepala kepala) {
        this.kepala = kepala;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
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
