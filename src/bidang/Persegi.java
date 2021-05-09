/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Administrator
 */
public class Persegi implements MenghitungBidang {
        public double panjang,lebar;
        public double luas,keliling;


    public void setPanjang(double inputPanjang) {
        panjang = inputPanjang;
    }

    public void setLebar(double inputLebar) {
        lebar = inputLebar;
    }
    
    @Override
    public double hitungLuas() {
         luas=panjang*lebar;
         return luas;
    }
   

    @Override
    public double hitungKeliling() {
       keliling= 2*(panjang+lebar);
       return keliling;
    }
}
