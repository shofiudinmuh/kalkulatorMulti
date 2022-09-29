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
public class PersegiPanjang extends Bangundatar{
    double luas, keliling;
    public void hitungLuas(){
        luas = a*b;
    }public void hitungKeliling(){
        keliling = 2*(a+b);
    }
    public double getLuas(){
        return luas;
    }public double getKeliling(){
        return keliling;
    }
    
}
