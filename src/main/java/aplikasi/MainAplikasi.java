/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import view.MainMenu;
import java.util.Locale;
import javax.swing.SwingUtilities;

/**
 *
 * @author dhiskar
 */
public class MainAplikasi {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("in", "ID"));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            MainMenu aplikasi = new MainMenu();
            aplikasi.setTitle("Alikasi Utama");
            aplikasi.setLocationRelativeTo(null);
            aplikasi.setVisible(true);
            }
        });
    }
}
