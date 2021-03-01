/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar;

/**
 *
 * @author MOKLET-2
 */
public class New {
    double r;
    double hasil;
    
    void New (double r){
        this.r = r;
    }
    double r(){
        return r;
    }
    void Hitung(){
        hasil = r*r*3.14;
        System.out.println("Luas Lingkaran: "+hasil);
    }
    
}
