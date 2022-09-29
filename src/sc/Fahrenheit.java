/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

/**
 *
 * @author asus
 */
public class Fahrenheit extends Suhu{
   double hasil;
    public void Hitung(){
        if(Suhu2 == 1){
            hasil = (Suhu + 459.67)*(5/9);
        }else{
            if(Suhu2 == 2){
                hasil = (Suhu-32)*(5/9);
            }else{
                hasil = (Suhu-32)*(4/9);
            }
        }      
    }public double getHasil(){
        return hasil;
    }
    
}
