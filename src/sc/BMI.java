/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

/**
 *
 * @author user
 */
public class BMI {
    private float tinggi,berat,hasil;
    public void setTinggi(float x){
        this.tinggi=x;
    }
    public void setBerat(float x){
        this.berat=x;
    }
    public float getTinggi(){
        tinggi = tinggi/100;
        return tinggi;
    }
    public float getBerat(){
        return berat;
    }
    public void setHasil(){
        hasil = berat/(tinggi*tinggi);
        hasil=hasil;
    }
    public float getHasil() {
       return hasil;
    }
    void broca1(){
        double bbIdeal;
        bbIdeal=((tinggi-100)-(0.10*(tinggi-100)));
    }
    void broca2(){
        double bbIdeal;
        bbIdeal =((tinggi-100)-(0.10*(tinggi-100)));
    }
}
