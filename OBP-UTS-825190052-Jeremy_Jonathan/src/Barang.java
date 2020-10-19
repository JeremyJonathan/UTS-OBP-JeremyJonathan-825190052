public class Barang {
    String kodebrg, namabrg;
    double harga, jumlah;

    String getNamabrg(){
        if (kodebrg.equalsIgnoreCase("B001")){
            namabrg = "TV LED 14 INCH";
        }else if (kodebrg.equalsIgnoreCase("B002")){
            namabrg = "Kulkas LG 2 Pintu";
        }else if (kodebrg.equalsIgnoreCase("B003")){
            namabrg = "Mesin Cuci LG";
        }
        return namabrg;
    }

    double getHarga(){
        if (kodebrg.equalsIgnoreCase("B001")){
            harga = 2000000;
        }else if (kodebrg.equalsIgnoreCase("B002")){
            harga = 4500000;
        }else if (kodebrg.equalsIgnoreCase("B003")){
            harga = 6000000;
        }
        return harga;
    }

    double getTotalBayar(){
        return getHarga() * jumlah;
    }

    void tampilData(){
        System.out.println("Kode Barang \t =" + kodebrg);
        System.out.println("Nama Barang \t =" + getNamabrg());
        System.out.println("Harga Barang \t =" + (int)getHarga());
        System.out.println("Jumlah Barang \t =" + jumlah);
        System.out.println("Total Bayar  \t =" + (int)getTotalBayar());
    }
}
