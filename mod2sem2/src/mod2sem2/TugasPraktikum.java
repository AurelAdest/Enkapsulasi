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
public class TugasPraktikum {
    private double penumpang;
    private double maxpenumpang;
    private double penumpangBaru;
    private double counter;
    
    public TugasPraktikum (double maxpenumpang) {
        this.penumpang = maxpenumpang;
        penumpang=0;
        }
    
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getPenumpang(double password){
        if(password==100){
            System.out.println("\nPassword benar");
            addPenumpang(15);
        }
        else {
            System.out.println("\nPassword Salah!!");
        }
    }
    
    public double getaverage(){
        return penumpang/counter;
    }
    
    public void cetak(){
        System.out.println("penumpang bus sekarang adalah "+penumpang);
        System.out.println("penumpang maksimum seharusnya adalah "+maxpenumpang);
    }
    }

