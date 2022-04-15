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
public class UjiBus2 {
    public static void main(String[] args){
        Bus2 busMini=new Bus2(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
    }
}
