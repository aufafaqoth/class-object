public class Titik {
    private double x;
    private double y;

    public Titik(){
        x=0;
        y=0;
    }
    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Sukses");
    }
    public void tampilTitik(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("Titik X dan Y adalah: ("+x+ " , " +y+")");
    }
    public void perkalianSkalar(int skalar){
        System.out.println("Perkalian skalar dengan X : " + (x*skalar));
        System.out.println("Perkalian skalar dengan Y : " + (y*skalar));
    }
    public void pencerminanSumbuX(){
        System.out.println("Sebelum dicermin: ("+ x + "," + y +")");
        System.out.println("Setelah dicermin: " + x + " , " + (y *= -1));
    }
    public void pencerminanSumbuY(){
        System.out.println("Sebelum dicermin: ("+ x + "," + y +")");
        System.out.println("Setelah dicermin: " + (x *= -1) + " , " + y);
    }
    public static double jarak(Titik t1, Titik t2){
        double jarakX = t1.x - t2.x;
        double jarakY = t1.y - t2.y;
        return Math.sqrt((jarakX * jarakX) + (jarakY * jarakY));
    }
}
