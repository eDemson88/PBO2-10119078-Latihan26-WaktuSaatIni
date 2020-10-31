/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan waktu saat ini
 *
 */
package pboif2.pkg10119078.latihan26.waktusaatini;

import java.util.Date;
import java.text.*;


/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E',' dd.MM.yyyy hh.mm.ss");
        System.out.println("Hari ini adalah hari : " + ft.format(date));
    }
    
}
