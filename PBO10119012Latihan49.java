
package pbo10119012latihan49;

import java.util.Locale;

/**
 *  NAMA   : DAMAI SAPUTRA LAOLI
 *  KELAS  : IF-1
 *  NIM    : 10119012
 */
public class PBO10119012Latihan49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double berat, harga, totalBayar;
        EmasKawin hendi = new EmasKawin(15.7,570000);

        berat = hendi.getBerat();
        harga = hendi.getHargaPerGram();
        totalBayar = hendi.totalPembayaran(berat,harga);
        System.out.printf("Berat Emas yang dibeli : %.1f gram%n", berat);
        System.out.printf(Locale.ITALY,"Harga Emas per gram : Rp. %,.0f%n", harga);
        System.out.printf(Locale.ITALY,"Harga yang harus dibayarkan adalah : Rp. %,.0f%n",totalBayar);
    }
}
