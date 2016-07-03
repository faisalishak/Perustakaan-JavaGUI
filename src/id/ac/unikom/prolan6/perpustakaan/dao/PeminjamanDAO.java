
package id.ac.unikom.prolan6.perpustakaan.dao;


import id.ac.unikom.prolan6.perpustakaan.enitiy.Peminjaman;
import java.util.ArrayList;
import java.util.Calendar;


public interface PeminjamanDAO {
  
    ArrayList<Peminjaman> getPeminjaman();
    boolean pinjam(int idAnggota, Calendar tglPinjam, Calendar tglKembali, int harga);
    
    // proses pengembalian
    boolean kembali(int idPinjam, Calendar tglKembali, float harga);
    int getIdPeminjaman();
}
