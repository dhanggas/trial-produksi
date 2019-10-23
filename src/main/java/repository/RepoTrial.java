/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import repository.BaseRepository;
import aplikasi.entity.Trial;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dhiskar
 */
public interface RepoTrial extends BaseRepository<Trial, String> {

    public List<Trial> findByKategoriKode(String kode) throws SQLException;
    
    public List<Trial> findByNama(String nama) throws SQLException;

    public List<Trial> findByQtyZeroByName(String nama) throws SQLException;

    public List<Trial> findByQtyOneByName(String nama) throws SQLException;

    public List<Trial> findFilterAlll(String text, String toString, String toString0, String text0, String toString1, String toString2, String toString3, String toString4) throws SQLException;
    
    public List<Trial> findTrialByProdukBymesin(Date awal, Date akhir, String produk,String proses, String mesin) throws SQLException;

    public Integer countTrials() throws SQLException;
}
