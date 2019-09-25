/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;



import java.util.Locale;
import javax.swing.SwingUtilities;
import view.MainMenu;

/**
 *
 * @author soraya
 */
public class MainAplikasi {
   public static void main(String[] args) {
        Locale.setDefault(new Locale("in", "ID"));
            MainMenu mainMenu = new MainMenu();
            mainMenu.setTitle("TRIAL PRODUKSI-Aplikasi");
            mainMenu.setLocationRelativeTo(null);
            mainMenu.setVisible(true);
    }
}
