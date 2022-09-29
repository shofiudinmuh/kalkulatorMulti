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
public class Celcius extends Suhu{
    double hasil;
    
    public void Hitung(){
        if(Suhu2 == 1){
            hasil = Suhu + 273.15;
        }else{
            if(Suhu2 == 2){
                hasil = Suhu * 1.8 + 32;
            }else{
                if(Suhu2 ==3){
                   hasil = Suhu * 0.8; 
                }
            }
        }      
    }public double getHasil(){
        return hasil;
    }
}
