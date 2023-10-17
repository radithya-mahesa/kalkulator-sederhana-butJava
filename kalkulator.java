import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        // namakelas variable = new namaKelas();
        Scanner input = new Scanner(System.in);

        // scanner operasi matematika kalkulator sederhana
        Scanner bilangan1 = new Scanner(System.in);
        Scanner bilangan2 = new Scanner(System.in);
    
        System.out.println("kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Pilih : ");
        // variable ClassScanner.next
        var pilihan = input.next();
        switch (pilihan) {
            case "1":
                System.out.println("----->Operasi Penjumlahan<-----");
                System.out.println();
                System.out.print("Masukan bilangan1 = ");
                var bil1 = bilangan1.nextInt();
                System.out.print("Masukan bilangan2 = ");
                var bil2 = bilangan2.nextInt();

                int hasil = bil1 + bil2;
                System.out.println(bil1 + " + " + bil2 + " = " + hasil);
        }

        switch (pilihan) {
            case "2":
                System.out.println("----->Operasi Pengurangan<-----");
                System.out.println();
                System.out.print("Masukan bilangan1 = ");
                var bil1 = bilangan1.nextInt();
                System.out.print("Masukan bilangan2 = ");
                var bil2 = bilangan2.nextInt();

                int hasil = bil1 - bil2;
                System.out.println(bil1 + " - " + bil2 + " = " + hasil);
        }

        switch (pilihan) {
            case "3":
                System.out.println("----->Operasi Perkalian<----");
                System.out.println();
                System.out.print("Masukan bilangan1 = ");
                var bil1 = bilangan1.nextInt();
                System.out.print("Masukan bilangan2 = ");
                var bil2 = bilangan2.nextInt();

                var hasil = bil1 * bil2;
                System.out.println(bil1 + " x " + bil2 + " = " + hasil);
        }

        switch (pilihan) {
            case "4":
                System.out.println("----->Operasi Pembagian<-----");
                System.out.println();
                System.out.print("Masukan bilangan1 = ");
                var bil1 = bilangan1.nextInt();
                System.out.print("Masukan bilangan2 = ");
                var bil2 = bilangan2.nextInt();

                float hasil = (float) bil1 / bil2;
                System.out.println(bil1 + " : " + bil2 + " = " + hasil);
        }

        switch (pilihan) {
            case "5":
                System.out.println("----->Operasi Modulus<-----");
                System.out.println();
                System.out.print("Masukan bilangan1 = ");
                var bil1 = bilangan1.nextInt();
                System.out.print("Masukan bilangan2 = ");
                var bil2 = bilangan2.nextInt();

                int hasil = bil1 % bil2;
                System.out.println(bil1 + " % " + bil2 + " = " + hasil);
        }
    }
}
