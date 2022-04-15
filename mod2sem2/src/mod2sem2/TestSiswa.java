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
public class TestSiswa {
    
   public static void main(String[] args){
       EncapSiswa siswa= new EncapSiswa();
       siswa.setName("Agus");
       siswa.setAge(20);
       siswa.setAddress("Malang");
       
       System.out.println("nama: "+siswa.getName()+" Alamat "+siswa.getAddress()+" Berumur"+siswa.getAge()+" Tahun ");
   }
}
