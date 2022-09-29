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
public class Reamur extends Suhu {
    double hasil;
    public void Hitung(){
        if(Suhu2 == 1){
            hasil = ((5/4)*Suhu )+ 273;
        }else{
            if(Suhu2 == 2){
                hasil = 5/4*Suhu;
            }else{
                hasil = ((9/4)*Suhu)+32;
            }
        }      
    }public double getHasil(){
        return hasil;
    }
}
