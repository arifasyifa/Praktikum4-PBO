import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenAset {
    //Simpan daftar aset
    ArrayList<AsetIT> daftarAset;
    
    //Constructor
    public ManajemenAset(){
        daftarAset = new ArrayList<>();
    }
    
    //Method untuk tambahkan aset
    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }
    
    //Method untuk tampilkan semua aset
    public void tampilkanSemuaAset(){
        for(AsetIT aset: daftarAset) {
            aset.tampilkanInfoAset();
        }
    }
    
    //Method untuk hapus aset berdasarkan ID
    public void hapusAset(String idAset) {
        Iterator<AsetIT> iterator = daftarAset.iterator();
        
        while (iterator.hasNext()){
            AsetIT aset = iterator.next();
            
            if(aset.idAset.equals(idAset)){
                iterator.remove();
                
                System.out.println(
                    "Aset dengan ID " + idAset + " berhasil dihapus.");
            return;
            }
        }
        
        System.out.println(
        "Aset dengan ID " + idAset + " tidak ditemukan.");
    }
}