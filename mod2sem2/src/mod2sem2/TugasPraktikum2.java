/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2sem2;

/**
 *
 * @author aurel
 */
public class TugasPraktikum2 {
    public static void main(String[] args){
        int password;
        
    TugasPraktikum busMini=new TugasPraktikum(30);
    busMini.cetak();
    
    busMini.getPenumpang(60);
    busMini.cetak();
    
    busMini.getPenumpang(40);
    busMini.cetak();
    
        System.out.println("Rata-rata penumpang: "+busMini.getaverage());
    }
}
