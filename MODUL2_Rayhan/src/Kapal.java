public class Kapal extends Transportasiair {
    protected String mesin;

    Kapal(int jumlahkursi,int biaya,String mesin){
        super(jumlahkursi,biaya);
        this.mesin=mesin;
    }
    @Override
    void informasi(){
        System.out.println("INFORMASI TRANSPORTASI AIR");
        System.out.println("NAMA         :KAPAL");
        System.out.println("JUMLAH KURSI    :"+this.jumlahkursi);
        System.out.println("BIAYA           :"+this.biaya);
        System.out.println("MESIN           :"+this.mesin);
    }
    @Override
    void berlayar(){
        System.out.println("TRANSPORTASI AIR JENIS Kapal SEDANG Berlayar ");
    }
    void berlayar(int kecepatan){
        System.out.println("Kapal Berlayar dengan Kecepatan :"+kecepatan);
    }
    @Override
    void berlabuh(){
        System.out.println(" TRANSPORTASI AIR JENIS Kapal SUDAH Berlabuh ");
    }
}
