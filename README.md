# ⏱️ Pemrograman Berorientasi Objek — Enkapsulasi di Java (StopWatch)

## 📌 Deskripsi
Program ini merupakan implementasi konsep **Enkapsulasi dalam Java** pada mata kuliah Pemrograman Berorientasi Objek.

Program digunakan untuk **mengukur waktu eksekusi pengurutan 100.000 data** menggunakan algoritma **Selection Sort** dengan pendekatan Object-Oriented Programming (OOP).

---

## Konsep yang Digunakan
- Class dan Object  
- Enkapsulasi (`private` & `public method`)  
- Atribut dan Method  
- Konstruktor  
- Algoritma Sorting (Selection Sort)  
- Pengukuran waktu eksekusi program  

---

## Struktur Program

### Class `StopWatch`
Class ini digunakan untuk mengukur waktu.

**Atribut:**
- `startTime` (private)  
- `endTime` (private)  

**Method:**
- `start()` → memulai waktu  
- `stop()` → menghentikan waktu  
- `getElapsedTime()` → menghitung selisih waktu  
- `getStartTime()` → mengambil waktu mulai  
- `getEndTime()` → mengambil waktu selesai  

---

### Class `StopWatchnew`
Class utama yang berisi method `main`.

**Fungsi:**
- Membuat array 100.000 data acak  
- Menjalankan algoritma selection sort  
- Mengukur waktu eksekusi menggunakan StopWatch  
- Menampilkan hasil ke layar  

---

## Cara Menjalankan Program

### 1. Compile
```bash
javac StopWatchnew.java
```

### 2. Run
```bash
java StopWatchnew
```

---

## Cara Kerja Program
1. Program membuat 100.000 angka acak  
2. Stopwatch dimulai dengan method `start()`  
3. Data diurutkan menggunakan **selection sort**  
4. Stopwatch dihentikan dengan method `stop()`  
5. Program menampilkan waktu eksekusi dalam milidetik  

---

## Contoh Output
```text
PROGRAM STOPWATCH 
Jumlah data yang diurutkan : 100000
Waktu mulai                : 172xxxxxxx
Waktu selesai              : 172xxxxxxx
Waktu eksekusi             : 5xxx ms
```

---

## Author
**Nama:** Anggia Dhini Hanifa  
**NIM:** 2401489  
**Kelas:** Pendidikan Ilmu Komputer - 4A  

---

## 🔗 Link Repository
https://github.com/namaNIM/tugaspertemuan7
