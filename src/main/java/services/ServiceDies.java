/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import aplikasi.entity.Dies;
import aplikasi.entity.Mesin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import repository.RepoDies;

/**
 *
 * @author soraya
 */
public class ServiceDies implements RepoDies {

    private DataSource ds;

    public ServiceDies(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public Dies save(Dies value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dies update(Dies value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dies> findAll() throws SQLException {
         String sql = "select * from tb_dies";
        List<Dies> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Dies d = new Dies();
            d.setId_dies(rs.getInt("id_dies"));
            d.setNama(rs.getString("nama"));
            d.setProses(rs.getString("proses"));
            d.setCustomer(rs.getString("customer"));

            list.add(d);
        }
        rs.close();
        st.close();
        connect.close();

        return list;
    }

    @Override
    public Dies findOne(String id) throws SQLException {
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
    public List<Dies> findMaxValue() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dies> findByNama(String nama) throws SQLException {
        List<Dies> list = new ArrayList<>();
        String sql = "SELECT * FROM tb_dies \n"
                + "WHERE nama like CONCAT('%', ?, '%') ";

        Connection connect = ds.getConnection();
        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, nama);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Dies d = new Dies();
            d.setId_dies(rs.getInt("id_dies"));
            d.setNama(rs.getString("nama"));
            d.setProses(rs.getString("proses"));
            d.setCustomer(rs.getString("customer"));

            list.add(d);
        }

        ps.close();
        rs.close();
        connect.close();
        return list;
    }

}
