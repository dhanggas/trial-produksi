/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import aplikasi.entity.Mesin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import repository.RepoMesin;

/**
 *
 * @author soraya
 */
public class ServiceMesin implements RepoMesin {

    private DataSource ds;

    public ServiceMesin(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public Mesin save(Mesin value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mesin update(Mesin value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mesin> findAll() throws SQLException {
        String sql = "select * from tb_mesin";
        List<Mesin> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Mesin m = new Mesin();
            m.setId_mesin(rs.getInt("id_mesin"));
            m.setNama(rs.getString("nama"));

            list.add(m);
        }
        rs.close();
        st.close();
        connect.close();

        return list;
    }

    @Override
    public Mesin findOne(String id) throws SQLException {
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
    public List<Mesin> findMaxValue() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mesin> findByNama(String nama) throws SQLException {
        List<Mesin> list = new ArrayList<>();
        String sql = "SELECT * FROM tb_mesin \n"
                + "WHERE nama like CONCAT('%', ?, '%') ";

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, nama);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Mesin a = new Mesin();
            a.setId_mesin(rs.getInt("id_mesin"));
            a.setNama(rs.getString("nama"));

            list.add(a);
        }

        ps.close();
        rs.close();
        connect.close();
        return list;
    }

    @Override
    public List<Mesin> findById(Integer id) throws SQLException {
        List<Mesin> list = new ArrayList<>();
        String sql = "SELECT * FROM tb_mesin \n"
                + "WHERE id_mesin = ? ";

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Mesin a = new Mesin();
            a.setId_mesin(rs.getInt("id_mesin"));
            a.setNama(rs.getString("nama"));

            list.add(a);
        }

        ps.close();
        rs.close();
        connect.close();
        return list;
    }

}
