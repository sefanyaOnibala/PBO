package Roti;

public class RotiManis extends roti {
    protected String rasa;
  
    public RotiManis(String nama, int harga, int stok, String rasa) {
      super(nama, harga, stok);
      this.rasa = rasa;
    }
  
    public String getRasa() {
      return rasa;
    }
  
    public void setRasa(String rasa) {
      this.rasa = rasa;
    }
  
    @Override
    public String toString() {
      return super.toString() + " - Rasa: " + rasa;
    }

}


