/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.awt.event.*;
import javax.swing.*;
import bidang.Persegi;
import ruang.Balok;
public class Main {

    public static void main(String[] args) {
        GUI g = new GUI();
    }
    
}

class GUI extends JFrame implements ActionListener{
     JLabel ljudul = new JLabel("KALKULATOR BALOK");
    
    JLabel lpanjang = new JLabel("Panjang");
    final JTextField fpanjang = new JTextField(10);
    
    JLabel llebar = new JLabel("Lebar");
    final JTextField flebar= new JTextField(10);
    
    JLabel ltinggi = new JLabel("Tinggi");
    final JTextField ftinggi = new JTextField(10);
    
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");
    
    JLabel lhasil = new JLabel("Hasil : "   );
    
    JLabel output1 = new JLabel();
    JLabel output2 = new JLabel();
    JLabel output3 = new JLabel();
    JLabel output4 = new JLabel();
    
    public GUI(){
        setSize(400,500);
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(bhitung);
        add(breset);
        add(lhasil);
        
        ljudul.setBounds(130,5,200,20);
        
        lpanjang.setBounds(30,30,120,20);
        fpanjang.setBounds(130,30,150,20);
        
        llebar.setBounds(30,60,120,20);
        flebar.setBounds(130,60,150,20);
        
        ltinggi.setBounds(30,90,120,20);
        ftinggi.setBounds(130,90,150,20);
        
        
         
        bhitung.setBounds(70,250,100,20);
        breset.setBounds(180,250,100,20);
        
        lhasil.setBounds(100,110,100,40);
        
        bhitung.addActionListener(this);
        breset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
 
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == bhitung){
           try{
            double p,l,t;
            p = Double.parseDouble(fpanjang.getText()); 
            l = Double.parseDouble(flebar.getText());
            t = Double.parseDouble(ftinggi.getText());
            Persegi persegi = new Persegi();
            persegi.setPanjang(p);
            persegi.setLebar(l);
            
            Balok balok = new Balok();
            balok.setPanjang(p);
            balok.setLebar(l);
            balok.setTinggi(t);
            
            
            output1.setText("Luas Persegi  : "+ Double.toString(persegi.hitungLuas()));
            add(output1);
            output1.setBounds(30,150,120,20);
            
            output2.setText("Keliling Persegi  : "+ Double.toString(persegi.hitungKeliling()));
            add(output2);
            output2.setBounds(30,170,180,20);
           
            output3.setText("Volume Balok  : "+ Double.toString(balok.hitungVolume()));
            add(output3);
            output3.setBounds(30,190,120,20);
            
            output4.setText("Luas Permukaan Balok  : "+ Double.toString(balok.hitungLuas()));
            add(output4);
            output4.setBounds(30,210,180,20);
           }
           catch(NumberFormatException a){
             JOptionPane.showMessageDialog(null,""+a.getMessage());
             }
           } 
        
        if(e.getSource() == breset){
            fpanjang.setText(null);
            flebar.setText(null);
            ftinggi.setText(null);
            output1.setText(null);
            output2.setText(null);
            output3.setText(null);
            output4.setText(null);
        }
    }

}