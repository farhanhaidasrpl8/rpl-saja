public class MataPelajaranArray {
    public static void main(String[] args) {
        // Menyimpan 6 nama mata pelajaran dalam array
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "Bahasa Inggris", "Fisika", "Kimia", "Biologi"};
        
        // Menampilkan setiap nama mata pelajaran dengan nomor urut menggunakan perulangan for
        System.out.println("Daftar Mata Pelajaran:");
        for (int i = 0; i < mataPelajaran.length; i++) {
            System.out.println((i + 1) + ". " + mataPelajaran[i]);
        }
    }
}