public class Sampan extends Transportasiair {
    protected int layar;

    Sampan(int jumlahkursi,int biaya,int layar){
        super(jumlahkursi, biaya);
        this.layar = layar;
    }
    @Override
    void informasi(){
        
        System.out.println("INFORMASI TRANSPORTASI AIR");
        System.out.println("NAMA         :SAMPAN");
        System.out.println("JUMLAH KURSI    :"+this.jumlahkursi);
        System.out.println("BIAYA           :"+this.biaya);
        System.out.println("LAYAR           :"+this.layar);
    }
    @Override
    void berlayar(){
        
        System.out.println("TRANSPORTASI AIR JENIS SAMPAN SEDANG BERLAYAR ");
    }
    @Override
    void berlabuh(){
        
        System.out.println("TRANSPORTASI AIR JENIS SAMPAN SUDAH BERLABUH");
    }
    void berlabuh(int jangkar){
        System.out.println("SAMPAN BERLABUH DENGAN " +jangkar+ "  Jangkar");
    }
}
