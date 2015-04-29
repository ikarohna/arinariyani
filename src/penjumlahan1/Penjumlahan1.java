/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahan1;
import javax.swing.JOptionPane;

/**
 *
 * @author ika yeti romawati
 */
public class Penjumlahan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bil1, bil2;
        String g = JOptionPane.showInputDialog("Masukkan Bilangan 1 :");
        bil1=Integer.parseInt(g);
        String s = JOptionPane.showInputDialog("Masukkan Bilangan 2 :");
        bil2=Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, bil1+" + "+bil2+ " = "+(bil1+bil2), "Hasil Penjumlahan", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
