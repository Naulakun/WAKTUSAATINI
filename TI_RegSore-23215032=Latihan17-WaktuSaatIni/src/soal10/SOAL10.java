/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal10;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : WAKTU SAAT INI
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SOAL10 {
    public static void main(String[] args) {
        // Membuat format tanggal dan waktu dengan hari dalam bahasa Indonesia
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Mendapatkan waktu saat ini
        Date waktuSaatIni = new Date();

        // Menampilkan hari dan waktu saat ini
        String hasil = formatTanggal.format(waktuSaatIni);
        System.out.println("Hari dan waktu saat ini: " + hasil);
    }
}
