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
public class Dies {
    private Integer id_dies;
    private String nama;
    private String proses;
    private String customer;

    public Integer getId_dies() {
        return id_dies;
    }

    public void setId_dies(Integer id_dies) {
        this.id_dies = id_dies;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProses() {
        return proses;
    }

    public void setProses(String proses) {
        this.proses = proses;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
}
