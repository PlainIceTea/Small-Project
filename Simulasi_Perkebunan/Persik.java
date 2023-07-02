package Simulasi_Perkebunan;

public class Persik extends Tanaman implements Treatment {
    public Persik() {
        super("Persik",180, 250, 0.15);
    }

    @Override
    public void berkembang() {
        double prosesBerbuah = getProsesBerbuah();
        int berbuah = getBerbuah();

        prosesBerbuah += getPerkembangan()*berbuah;
        setProsesBerbuah(prosesBerbuah);

        if (prosesBerbuah >= berbuah) {
            setBuah(getBuah() + 1);
            if (prosesBerbuah == berbuah) {
                setProsesBerbuah(0);
            } else {
                setProsesBerbuah(prosesBerbuah - berbuah);
            }
        }

        setLamaHidup(getLamaHidup() + 1);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masa hidup\t: ").append(getMasaHidup()).append(" hari\n");
        sb.append("Umur tanaman\t: ").append(getLamaHidup()).append(" hari\n");
        sb.append("Menghasilkan\t: ").append(getBuah()).append(" buah Persik\n");
        sb.append("Status\t\t: ").append(status());
        return sb.toString();
    }
    

    @Override
    public void treatment() {
        // Menambahkan nilai perkembangan sebesar 2.5%
        setPerkembangan(getPerkembangan() + 0.025);
    }

   
}
