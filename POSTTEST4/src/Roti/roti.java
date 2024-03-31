package Roti;

public class roti {
    protected int id;
    protected String nama;
    protected int harga;
    protected int stok;
    static int idCounter = 1;

    public roti(String nama, int harga, int stok) {
        this.id = idCounter++;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    //getter untuk ID (penerapan encapsulation)
    public int getId() {
        return id;
    }

    //getter untuk NAMA
    public String getNama() {
        return nama;
    }
    //getter untuk Harga
    public int getHarga() {
        return harga;
    }

    //getter untuk stok
    public int getStok() {
        return stok;
    }

    //setter untuk Nama (penerapan encapsulation)
    public void setNama(String nama) {
        this.nama = nama;
    }

    //setter untuk Harga
    public void setHarga(int harga) {
        this.harga = harga;
    }

    //setter untuk stok
    public void setStok(int stok) {
        this.stok = stok;
    }
}

