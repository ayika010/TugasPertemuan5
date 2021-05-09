/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

/**
 *
 * @author Administrator
 */
public class Balok implements MenghitungRuang{
     private double panjang,lebar,tinggi;

    public void setPanjang(double inputPanjang) {
        panjang = inputPanjang;
    }

    public void setLebar(double inputLebar) {
        lebar = inputLebar;
    }

    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }
    
    @Override
    public double hitungVolume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double hitungLuas() {
       return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
}
