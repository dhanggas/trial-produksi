/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import aplikasi.entity.Dies;
import aplikasi.entity.Kepala;
import aplikasi.entity.Mesin;
import aplikasi.entity.Operator;
import aplikasi.entity.Trial;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import repository.RepoTrial;

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
    public Trial save(Trial a) throws SQLException {
                String sql = "INSERT INTO tb_trial (id_trial,tanggal,id_dies,id_mesin,id_kepala,id_operator,mulai,selesai)\n"
                + "VALUES (?,?,?,?,?,?,?,?)";

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, a.getId_trial());
        ps.setDate(2, a.getTanggal());
        ps.setInt(3, a.getDies().getId_dies());
        ps.setInt(4, a.getMesin().getId_mesin());
        ps.setInt(5, a.getKepala().getId_kepala());
        ps.setInt(6, a.getOperator().getId_operator());
        ps.setTime(7, a.getMulai());
        ps.setTime(8, a.getSelesai());
        ps.executeUpdate();

        ps.close();
        connect.close();
        return a;
    }

    @Override
    public Trial update(Trial b) throws SQLException {
        String sql = "UPDATE tb_trial SET tanggal = ?, id_dies = ?, id_mesin = ?, id_kepala = ?, "
                + "id_operator = ?, mulai = ?, selesai = ? WHERE id_trial = ?";

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setDate(1, b.getTanggal());
        ps.setInt(2, b.getDies().getId_dies());
        ps.setInt(3, b.getMesin().getId_mesin());
        ps.setInt(4, b.getKepala().getId_kepala());
        ps.setInt(5, b.getOperator().getId_operator());
        ps.setTime(6, b.getMulai());
        ps.setTime(7, b.getSelesai());
        ps.setInt(8, b.getId_trial());
        ps.executeUpdate();

        ps.close();
        connect.close();
        return b;
    }

    @Override
    public List<Trial> findAll() throws SQLException {
        String sql = "SELECT * FROM v_trial";
        List<Trial> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Trial a = new Trial();
            a.setId_trial(rs.getInt("id_trial"));
            a.setTanggal(rs.getDate("tanggal"));
            a.setMulai(rs.getTime("mulai"));
            a.setSelesai(rs.getTime("selesai"));
            
            Dies d = new Dies();
            d.setId_dies(rs.getInt("id_dies"));
            d.setNama(rs.getString("nama_dies"));
            d.setProses(rs.getString("proses_dies"));
            d.setCustomer(rs.getString("customer_dies"));
            a.setDies(d);
            
            Mesin m = new Mesin();
            m.setId_mesin(rs.getInt("id_mesin"));
            m.setNama(rs.getString("nama_mesin"));
            a.setMesin(m);
            
            Operator o =new Operator();
            o.setId_operator(rs.getInt("id_operator"));
            o.setNama(rs.getString("nama_operator"));
            a.setOperator(o);
            
            Kepala k =new Kepala();
            k.setId_kepala(rs.getInt("id_kepala"));
            k.setNama(rs.getString("nama_kepala"));
            a.setKepala(k);

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
        String sql = "SELECT * FROM `tb_trial` order BY id_trial DESC LIMIT 1";

        List<Trial> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Trial a = new Trial();
        while (rs.next()) {
            a.setId_trial(rs.getInt("id_trial"));
            a.setTanggal(rs.getDate("tanggal"));

            
            list.add(a);
        }
        ps.close();
        rs.close();
        connect.close();
        return list;
    }

    @Override
    public List<Trial> findTrialByProdukBymesin(Date awal, Date akhir, String produk,String proses, String mesin) throws SQLException {
                String sql = "SELECT * from v_trial \n"
                + "WHERE  tanggal between ? AND ? \n"
                + "AND nama_dies like CONCAT('%', ?, '%') \n"
                + "AND proses_dies like CONCAT('%', ?, '%') \n"
                + "AND nama_mesin LIKE ? order by id_trial asc";
        List<Trial> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setDate(1, awal);
        ps.setDate(2, akhir);
        ps.setString(3, produk);
        ps.setString(4, proses);
        ps.setString(5, mesin);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Trial t = new Trial();
            t.setId_trial(rs.getInt("id_trial"));
            t.setTanggal(rs.getDate("tanggal"));
            t.setMulai(rs.getTime("mulai"));
            t.setSelesai(rs.getTime("selesai"));
            
            Dies d = new Dies();
            d.setId_dies(rs.getInt("id_dies"));
            d.setNama(rs.getString("nama_dies"));
            d.setProses(rs.getString("proses_dies"));
            d.setCustomer(rs.getString("customer_dies"));
            
            Mesin m = new Mesin();
            m.setId_mesin(rs.getInt("id_mesin"));
            m.setNama(rs.getString("nama_mesin"));
            
            Kepala k = new Kepala();
            k.setId_kepala(rs.getInt("id_kepala"));
            k.setNama(rs.getString("nama_kepala"));
            
            Operator o = new Operator();
            o.setId_operator(rs.getInt("id_operator"));
            o.setNama(rs.getString("nama_operator"));
            
            t.setDies(d);
            t.setMesin(m);
            t.setKepala(k);
            t.setOperator(o);
            
            list.add(t);
        }

        ps.close();
        rs.close();
        connect.close();
        return list;
    }

    @Override
    public Integer countTrials() throws SQLException {
       String sql = "SELECT count(id_trial) as Total from tb_trial";
        Integer a = null;
        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
        a = rs.getInt("total");
        }

        st.close();
        rs.close();
        connect.close();
        return a; 
    }
    
}
