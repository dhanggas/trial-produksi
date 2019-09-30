/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import aplikasi.entity.Dies;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author soraya
 */
public interface RepoDies extends BaseRepository<Dies, String>{
 
    public List<Dies> findByNama(String nama) throws SQLException;
}
