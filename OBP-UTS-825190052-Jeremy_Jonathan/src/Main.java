import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        Barang brg1 = new Barang();

        //Kode Barang = B001-B003

        System.out.print("Masukkan Kode Barang = ");
        brg1.kodebrg = br.readLine();

        System.out.print("Masukkan Jumlah Barang Yang Ingin Dibeli = ");
        brg1.jumlah = Integer.parseInt(br.readLine());

        System.out.print("");
        brg1.tampilData();
    }
}
