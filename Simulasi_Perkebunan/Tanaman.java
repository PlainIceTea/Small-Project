package Simulasi_Perkebunan;

public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private double prosesBerbuah;
    private double perkembangan;
    private int buah;
    private int berbuah;
    private String nama;

    public Tanaman(String nama,int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
        this.lamaHidup = 0;
        this.buah = 0;
        this.nama = nama;
    }
    public String getName (){
        return nama;
    }
    abstract public void berkembang() ;

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    @Override
    public String toString() {
        return "Masa Hidup: " + masaHidup + " hari, Lama Hidup: " + lamaHidup + " hari, Buah: " + buah + ", Status: " + status();
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public void setBerbuah(int buah) {
        this.berbuah = buah;
    }
    public int getBerbuah(){
        return berbuah;
    }
    public void treatment() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
