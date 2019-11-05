/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan50.energikinetik;

/**
 *
 * @author  nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung energi kinetik
 */
public class Energi {
    private int masa;
    private int kecepatan;
    
    public Energi(){
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double energikinetik(){
        double enki;
        enki = 0.5*masa*(kecepatan * kecepatan);
        return enki;
    }
    public double besarUsaha(){
        double gaya;
        gaya = masa * kecepatan;
        return gaya;
    
    }
}
