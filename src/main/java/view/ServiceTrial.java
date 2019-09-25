/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import aplikasi.entity.Dies;
import aplikasi.entity.Jabatan;
import aplikasi.entity.Mesin;
import aplikasi.entity.Operator;
import aplikasi.entity.Trial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author dhiskar
 */
public class ServiceTrial implements RepoTrial{
    private DataSource ds;

    public ServiceTrial(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public List<Trial> findByKategoriKode(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findByNama(String nama) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findByQtyZeroByName(String nama) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findByQtyOneByName(String nama) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findFilterAlll(String text, String toString, String toString0, String text0, String toString1, String toString2, String toString3, String toString4) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trial save(Trial value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trial update(Trial value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findAll() throws SQLException {
        String sql = "SELECT * FROM tb_trial";
        List<Trial> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Trial a = new Trial();
            a.setId_trial(rs.getInt("id_trial"));
            a.setMulai(rs.getTime("mulai"));
            a.setSelesai(rs.getTime("selesai"));
            
//            Dies d = new Dies();
//            d.setId_dies(rs.getInt("id_dies"));
//            d.setNama(rs.getString("nama"));
//            d.setProses(rs.getString("proses"));
//            d.setCustomer(rs.getString("customer"));
//            a.setDies(d);
//            
//            Mesin m = new Mesin();
//            m.setId_mesin(rs.getInt("id_mesin"));
//            m.setNama(rs.getString("nama"));
//            
//            Jabatan j = new Jabatan();
//            j.setId_jabatan(rs.getInt("id_jabatan"));
//            
//            Operator o =new Operator();
//            o.setId_operator(rs.getInt("id_operator"));
//            o.setNama(rs.getString("nama"));
//            o.setAktif(rs.getBoolean("aktif"));
//            o.setJabatan(j);
//            a.setJabatan1(j);
//            a.setJabatan2(j);

            list.add(a);
        }

        st.close();
        rs.close();
        connect.close();

        return list;
    }

    @Override
    public Trial findOne(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean exists(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trial> findMaxValue() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
