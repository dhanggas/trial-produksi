/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import aplikasi.entity.Kepala;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import repository.RepoKepala;

/**
 *
 * @author soraya
 */
public class ServiceKepala implements RepoKepala{
    private DataSource ds;

    public ServiceKepala(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public Kepala save(Kepala value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kepala update(Kepala value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kepala> findAll() throws SQLException {
         String sql = "select * from tb_kepala";
        List<Kepala> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Kepala m = new Kepala();
            m.setId_kepala(rs.getInt("id_kepala"));
            m.setNama(rs.getString("nama"));

            list.add(m);
        }
        rs.close();
        st.close();
        connect.close();

        return list;
    }

    @Override
    public Kepala findOne(String id) throws SQLException {
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
    public List<Kepala> findMaxValue() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
