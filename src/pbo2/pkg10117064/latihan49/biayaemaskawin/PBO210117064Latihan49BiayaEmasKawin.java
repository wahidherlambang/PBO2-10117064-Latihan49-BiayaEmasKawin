/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan49.biayaemaskawin;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya 
 * emas kawin.
 */
public class PBO210117064Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmas bimas = new BiayaEmas();
        bimas.setEmasKawin(15.7);
        bimas.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + bimas.getEmasKawin() 
                + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " 
                + bimas.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = bimas.getEmasKawin();
        double harga_satu_gram = bimas.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " 
                + bimas.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
    }   
}