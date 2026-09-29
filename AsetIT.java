public class AsetIT {
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
    
    //Construktor
    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi) {
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }    
    
     //Method untuk menampilkan informasi aset
    public void tampilkanInfoAset(){
        System.out.println(
            idAset + " | " + namaPerangkat + " | " + lokasi + " | " + statusKondisi);
        }
}
