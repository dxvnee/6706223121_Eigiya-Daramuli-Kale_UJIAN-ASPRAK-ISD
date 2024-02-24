//POJO
public class Pegawai {
    private String nama;
    private int nim;
    private String divisi;

    //CONSTRUCTOR
    public Pegawai(String nama, int nim, String divisi) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = divisi;
    }

    //PRINT
    @Override
    public String toString() {
        return "Pegawai [nama=" + nama + ", nim=" + nim + ", divisi=" + divisi + "]";
    }

    

}
