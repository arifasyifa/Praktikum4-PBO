public class MainAset {
    public static void main(String[] args) {
        //Membuat objek ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();
        
        //Menambahkan 4 data aset IT
        manajemen.tambahAset(
                new AsetIT("A001", "Server", "Ruang Server", "Baik")
        );
        
        manajemen.tambahAset(
                new AsetIT("A002", "Router", "Ruang Jaringan", "Baik")
        );
        
        manajemen.tambahAset(
                new AsetIT("A003", "Switch", "Lab Komputer", "Baik")
        );
        
        manajemen.tambahAset(
                new AsetIT("A004", "PC", "Lab Komputer", "Baik")
        );
        
        //Menampilkan semua aset
        System.out.println("=== DATA ASET IT ===");
        
        manajemen.tampilkanSemuaAset();
        
        //Menghapus salah satu aset berdasarkan ID
        System.out.println("\n=== PROSES PENGHAPUSAN ===");
                
        manajemen.hapusAset("A003");

        //Menampilkan kembali data aset
        System.out.println("\n=== DATA ASET SETELAH PENGHAPUSAN ===");
        
        manajemen.tampilkanSemuaAset();
    }
}