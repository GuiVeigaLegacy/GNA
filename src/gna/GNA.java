/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gna;

import javax.swing.UIManager;

/**
 *
 * @author guilherme
 */
public class GNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Tela tela = new Tela();
            tela.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
