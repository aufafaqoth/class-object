public class Bank {
    private int saldo;
    private int simpanUang;
    private int ambilUang;

    public Bank(int saldo){
        this.saldo=saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
    public void simpanUang(int simpanUang){
        saldo += simpanUang;
        System.out.println("\nSimpan Uang : Rp. "+ simpanUang);
        System.out.println("Saldo saat ini : Rp. " +saldo);
    }
    public void ambilUang(int ambilUang){
        saldo -= ambilUang;
        System.out.println("\nAmbil Uang : Rp. "+ ambilUang);
        System.out.println("Saldo saat ini : Rp. " +saldo);
        
    }
    public int getSaldo(){
        return saldo;
    }
}
