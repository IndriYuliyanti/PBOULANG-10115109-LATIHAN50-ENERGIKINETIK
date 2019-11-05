/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan50.energikinetik;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung energi kinetik
 */
public class Pboulang10115109Latihan50Energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Energi energi = new Energi();
        energi.setMasa(145);
        energi.setKecepatan(25);
        
         System.out.println("Diketahui :");
        System.out.println("Masa Benda : "+energi.getMasa()+" g");
        System.out.println("Kecepatan : "+energi.getKecepatan()+" m/s");
        
        System.out.println("Hasil :");
        System.out.println("Energi Kinetik :"+energi.energikinetik()+" Joule");
        System.out.println("Usaha :"+energi.besarUsaha());
        
        
        
        
    }
    
}
