package Simulasi_Perkebunan;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private static ArrayList<Tanaman> tanamans = new ArrayList<>();
    private static ArrayList<Integer> lokasi = new ArrayList<>();

    public static void mulai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masa tanam (bulan): ");
        int masaTanamBulan = scanner.nextInt();

        // Konversi masa tanam dari bulan menjadi hari
        int masaTanamHari = masaTanamBulan * 30;

        // Menanam 3 tanaman di awal
        for (int i = 0; i < 3; i++) {
            menanam();
        }
        System.out.println("-------------------");
        System.out.println("PROSES PERKEMBANGAN");
        System.out.println("-------------------");
        System.out.println();
        // Proses perkembangan tanaman
        for (int i = 1; i <= masaTanamHari; i++) {
           // System.out.println("Hari ke-" + i);
           if (i % 90 == 0) {
            System.out.println("-------------------");
            System.out.println("DILAKUKAN PERAWATAN");
            System.out.println("-------------------");
            System.out.println();
          
        }
            for (int j = 0; j < tanamans.size(); j++) {
                Tanaman tanaman = tanamans.get(j);

                // Cek status tanaman
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                    if (i % 90 == 0) {
                        tanaman.treatment();
                    }
                } else {
                    if (!lokasi.contains(j)) {
                        lokasi.add(j);
                        System.out.println("Tanaman " + tanaman.getName() + " telah mati");
                        menanam();
                    }
                }
            }
        }
    }

    public static void menanam() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mau menanam apa?");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                Tanaman tomat = new Tomat();
                tanamans.add(tomat);
                System.out.println("Tomat berhasil ditanam.");
                break;
            case 2:
                Tanaman stroberi = new Stroberi();
                tanamans.add(stroberi);
                System.out.println("Stroberi berhasil ditanam.");
                break;
            case 3:
                Tanaman persik = new Persik();
                tanamans.add(persik);
                System.out.println("Persik berhasil ditanam.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        System.out.println();
    }

    public static void info() {
        System.out.println();
        System.out.println("------HASIL MENANAM------");
        System.out.println();
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("Tanaman buah ke-" + (i + 1));
            System.out.println(tanaman.toString());
            System.out.println();
        }
    }
}
