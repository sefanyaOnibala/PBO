package Roti;

public abstract class roti implements RotiInterface {
    protected int id;
    protected String nama;
    protected int harga;
    protected int stok;
    static int idCounter = 1; //variabel static untuk menghitung ID

    public roti(String nama, int harga, int stok) {
        this.id = idCounter++;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Implementasi dari interface RotiInterface
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
}



