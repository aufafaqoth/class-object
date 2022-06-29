import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Titik baru = new Titik();

        Scanner input =  new Scanner(System.in);

        System.out.println("MENU OPERASI TITIK");
        System.out.println("1. INISIALISASI TITIK");
        System.out.println("2. TAMPIL TITIK");
        System.out.println("3. PERKALIHAN SKALAR TITIK");
        System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
        System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
        System.out.println("6. JARAK ANTARA DUA TITIK");
        System.out.println("7. KELUAR");

        while(true) {
            System.out.println("MASUKAN PILIHAN: ");
            int pil = input.nextInt();
            switch(pil) {
            case 1: 
                System.out.print("Masukkan nilai X : ");
                int nilaiX = input.nextInt();
                System.out.print("Masukkan nilai Y : ");
                int nilaiY = input.nextInt();
                baru.inisialisasiTitik(nilaiX, nilaiY);
                break;
            case 2 :
                baru.tampilTitik();
                break;
            case 3 :
                System.out.print("Masukkan nilai skalar : ");
                int skalar = input.nextInt();
                baru.perkalianSkalar(skalar);
                break;
            case 4 :
                baru.pencerminanSumbuX();
                break;
            case 5:
                baru.pencerminanSumbuY();
                break;
            case 6:
                Titik t1 = new Titik();
                System.out.print("Masukkan nilai X titik 1 : ");
                int x1 = input.nextInt();
                System.out.print("Masukkan nilai Y titik 1 : ");
                int y1 = input.nextInt();
                
                Titik t2 = new Titik();
                System.out.print("Masukkan nilai X titik 2 : ");
                int x2 = input.nextInt();
                System.out.print("Masukkan nilai Y titik 2 : ");
                int y2 = input.nextInt();
                
                System.out.println("Jarak kedua titik adalah : " + baru.jarak(t1,t2));
                break;
            case 7:
                break;
            default:
                break;
            }
        }
            
    }
}