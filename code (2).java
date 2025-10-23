public class HewanPeliharaanArray {
    public static void main(String[] args) {
        // Menyimpan 5 nama hewan peliharaan dalam array
        String[] hewan = {"Kucing", "Anjing", "Ikan", "Burung", "Hamster"};
        
        // Menampilkan nama hewan yang panjang hurufnya lebih dari 4 karakter menggunakan perulangan for
        System.out.println("Hewan Peliharaan dengan Panjang Nama > 4 Karakter:");
        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length() > 4) {
                System.out.println(hewan[i]);
            }
        }
    }
}