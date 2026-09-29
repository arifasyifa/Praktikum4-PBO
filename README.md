# PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK

## Modul 4 - Array of Objects dan Java Collections

### Identitas
**Nama:** Arifa Syifaul Qulbi
**NIM:** L0325001
**Kelas:** 3A
**Mata Kuliah:** Pemrograman Berorientasi Objek

---

## Struktur Program
Program dibuat dalam package:
```text
praktikum4
```

Di dalam package tersebut terdapat tiga class:
```text
praktikum4
│
├── AsetIT.java
├── ManajemenAset.java
└── MainAset.java
```

`AsetIT` digunakan untuk membuat objek aset, `ManajemenAset` digunakan untuk mengelola kumpulan aset, sedangkan `MainAset` digunakan untuk menjalankan program.

---

# Source Code
## A. Class AsetIT
![image](https://github.com/arifasyifa/Praktikum4-PBO/blob/c02c09272d5bc7ce5fd516d8fd2d81517f901ec8/AsetIT.png)

### Penjelasan
Class `AsetIT` digunakan untuk menyimpan informasi dari setiap aset IT. Di dalam class terdapat empat atribut:
```java
String idAset;
String namaPerangkat;
String lokasi;
String statusKondisi;
```

Fungsi masing-masing atribut adalah:
* `idAset` → menyimpan ID atau identitas aset.
* `namaPerangkat` → menyimpan nama perangkat, seperti Server, Router, Switch, atau PC.
* `lokasi` → menyimpan lokasi aset.
* `statusKondisi` → menyimpan kondisi aset, seperti Baik atau Rusak.

Selanjutnya terdapat constructor:
```java
public AsetIT(String idAset, String namaPerangkat,
              String lokasi, String statusKondisi)
```

Constructor digunakan untuk mengisi nilai seluruh atribut ketika objek `AsetIT` dibuat.
Contohnya:
```java
new AsetIT("A001", "Server", "Ruang Server", "Baik")
```

Kode tersebut membuat satu objek aset dengan ID `A001`, perangkat `Server`, lokasi `Ruang Server`, dan kondisi `Baik`.
Kemudian terdapat method:
```java
tampilkanInfoAset()
```
Method ini digunakan untuk menampilkan informasi aset ke console.

---

## B. Class ManajemenAset
![image](https://github.com/arifasyifa/Praktikum4-PBO/blob/c02c09272d5bc7ce5fd516d8fd2d81517f901ec8/ManajemenAset.png)

### Penjelasan
Class `ManajemenAset` digunakan untuk mengelola kumpulan objek `AsetIT`.

Untuk menyimpan data aset digunakan:
```java
ArrayList<AsetIT> daftarAset;
```

`ArrayList` berfungsi sebagai tempat penyimpanan beberapa objek `AsetIT`. Dengan `ArrayList`, data dapat ditambahkan maupun dihapus selama program berjalan.

Pada constructor:
```java
public ManajemenAset() {
    daftarAset = new ArrayList<>();
}
```
dibuat objek `ArrayList` baru yang akan digunakan sebagai tempat menyimpan data aset.

### Method `tambahAset()`
```java
public void tambahAset(AsetIT asetbaru) {
    daftarAset.add(asetbaru);
}
```

Method `tambahAset()` digunakan untuk memasukkan objek aset baru ke dalam `daftarAset`.
Perintah:
```java
daftarAset.add(asetbaru);
```
berfungsi menambahkan objek `asetbaru` ke dalam `ArrayList`.

### Method `tampilkanSemuaAset()`
```java
public void tampilkanSemuaAset() {
    for (AsetIT aset : daftarAset) {
        aset.tampilkanInfoAset();
    }
}
```
Method ini digunakan untuk menampilkan seluruh data aset yang tersimpan.

Perulangan:
```java
for (AsetIT aset : daftarAset)
```
merupakan For-Each yang mengambil setiap objek `AsetIT` dari `daftarAset`.

Kemudian:
```java
aset.tampilkanInfoAset();
```
digunakan untuk menampilkan informasi dari setiap aset.

### Method `hapusAset()`
```java
public void hapusAset(String idAset)
```
Method ini digunakan untuk mencari dan menghapus aset berdasarkan ID.

Untuk menelusuri data digunakan `Iterator`:
```java
Iterator<AsetIT> iterator = daftarAset.iterator();
```

Kemudian:
```java
while (iterator.hasNext())
```
digunakan untuk mengecek apakah masih terdapat data yang dapat diperiksa.

Data yang sedang diperiksa diambil menggunakan:
```java
AsetIT aset = iterator.next();
```

Setelah itu, ID aset dibandingkan dengan ID yang dicari:
```java
if (aset.idAset.equals(idAset))
```

Jika ID sesuai, aset dihapus menggunakan:
```java
iterator.remove();
```
Jika tidak ada aset dengan ID tersebut, program menampilkan pesan bahwa aset tidak ditemukan.

---

## C. Class MainAset
![image](https://github.com/arifasyifa/Praktikum4-PBO/blob/c02c09272d5bc7ce5fd516d8fd2d81517f901ec8/MainAset.png)

### Penjelasan
Class `MainAset` merupakan class utama yang digunakan untuk menjalankan program.
Pertama, dibuat objek dari `ManajemenAset`:
```java
ManajemenAset manajemen = new ManajemenAset();
```
Objek tersebut digunakan untuk mengakses method yang terdapat pada class `ManajemenAset`.

Selanjutnya, program menambahkan empat data aset menggunakan:
```java
manajemen.tambahAset(...)
```

Data aset yang digunakan adalah:
```text
A001 - Server - Ruang Server - Baik
A002 - Router - Ruang Jaringan - Baik
A003 - Switch - Lab Komputer - Rusak
A004 - PC - Lab Komputer - Baik
```

Setelah semua data ditambahkan, program menjalankan:
```java
manajemen.tampilkanSemuaAset();
```
untuk menampilkan seluruh data aset.

Kemudian aset dengan ID `A003` dihapus menggunakan:
```java
manajemen.hapusAset("A003");
```

Setelah penghapusan, program kembali menjalankan:
```java
manajemen.tampilkanSemuaAset();
```
untuk memastikan bahwa aset dengan ID `A003` sudah tidak terdapat dalam daftar.

# Program menggunakan beberapa konsep yang dibahas pada modul, yaitu:
### 1. Class dan Object
`AsetIT` merupakan class yang digunakan sebagai cetakan untuk membuat objek aset.
Contohnya:
```java
AsetIT aset = new AsetIT(
    "A001",
    "Server",
    "Ruang Server",
    "Baik"
);
```
Kode tersebut membuat satu objek dari class `AsetIT`.

### 2. ArrayList
```java
ArrayList<AsetIT> daftarAset;
```
`ArrayList` digunakan untuk menyimpan kumpulan objek `AsetIT`. Berbeda dengan array biasa yang ukurannya tetap, `ArrayList` dapat menyesuaikan jumlah data selama program berjalan. Modul menjelaskan `ArrayList` sebagai bagian dari Java Collections Framework untuk mengelola kumpulan objek secara dinamis.

### 3. For-Each
```java
for (AsetIT aset : daftarAset)
```
For-Each digunakan untuk menelusuri setiap objek yang terdapat dalam `daftarAset` dan menampilkan informasinya.

### 4. Iterator
```java
Iterator<AsetIT> iterator = daftarAset.iterator();
```

Iterator digunakan untuk menelusuri objek dalam collection dan mencari aset berdasarkan ID. Jika ID ditemukan, objek dapat dihapus menggunakan:
```java
iterator.remove();
```
Penggunaan For-Each dan Iterator sesuai dengan materi modul mengenai proses iterasi pada collection.

### 5. CRUD
Program menerapkan beberapa operasi dasar CRUD:
* **Create** → menambahkan aset menggunakan `tambahAset()`.
* **Read** → menampilkan aset menggunakan `tampilkanSemuaAset()`.
* **Delete** → menghapus aset menggunakan `hapusAset()`.
* **Update** → belum diterapkan dalam program.

---

# Output Program
![image](https://github.com/arifasyifa/Praktikum4-PBO/blob/1916d4bd23d04992df57b28275910fce48533c53/Output.png)

Output pertama menampilkan seluruh aset yang telah ditambahkan.

Setelah aset dengan ID `A003` dihapus, output berikutnya menampilkan kembali daftar aset tanpa data `A003`. Hal tersebut menunjukkan bahwa proses penghapusan berhasil.
