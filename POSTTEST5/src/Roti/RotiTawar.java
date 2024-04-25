package Roti;

public class RotiTawar extends roti{
    protected String jenis;
  
    public RotiTawar(String nama, int harga, int stok, String jenis) {
      super(nama, harga, stok);
      this.jenis = jenis;
    }
  
    public String getJenis() {
      return jenis;
    }
  
    public void setJenis(String jenis) {
      this.jenis = jenis;
    }

    @Override
    public String getTipeRoti() {
        return "Manis";
    }
  
    @Override
    public String toString() {
      return super.toString() + " - Jenis: " + jenis;
    }
}




