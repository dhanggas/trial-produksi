/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import aplikasi.entity.Operator;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import repository.RepoOperator;

/**
 *
 * @author soraya
 */
public class ServiceOperator implements RepoOperator{

    private DataSource ds;

    public ServiceOperator(DataSource ds) {
        this.ds = ds;
    }
    
    @Override
    public Operator save(Operator value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operator update(Operator value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operator> findAll() throws SQLException {
         String sql = "select * from tb_operator";
        List<Operator> list = new ArrayList<>();

        Connection connect = ds.getConnection();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Operator m = new Operator();
            m.setId_operator(rs.getInt("id_operator"));
            m.setNama(rs.getString("nama"));

            list.add(m);
        }
        rs.close();
        st.close();
        connect.close();

        return list;
    }

    @Override
    public Operator findOne(String id) throws SQLException {
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
    public List<Operator> findMaxValue() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
