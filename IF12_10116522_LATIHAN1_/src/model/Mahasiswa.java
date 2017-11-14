/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AsusPC
 */
public class Mahasiswa {
     public String nim;
    public String nama;
    
    public Mahasiswa(String nim, String nama){
            this.nim=nim;
            this.nama=nama;
}
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    
}
