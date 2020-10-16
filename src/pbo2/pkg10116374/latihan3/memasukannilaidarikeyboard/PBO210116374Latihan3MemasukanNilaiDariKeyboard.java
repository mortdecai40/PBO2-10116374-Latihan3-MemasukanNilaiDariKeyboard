package pbo2.pkg10116374.latihan3.memasukannilaidarikeyboard;
import java.util.Scanner;
/**
 * @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk memasukan nilai dari keyboard
 */
public class PBO210116374Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda :");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah\ts" +nama);
        
    }
    
}
