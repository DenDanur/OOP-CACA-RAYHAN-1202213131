public class HP extends Perangkat {
    boolean fingerprint;

    HP(String Nama,String drive,int RAM,float prosesor,boolean fingerprint){
        super(Nama,drive,RAM,prosesor);
        this.fingerprint=fingerprint;
    }
    void display(){
        super.display();
        System.out.println("FINGERPRINT :"+this.fingerprint);
    }
    void telpon(int no_hp){
        System.out.println("Memanggil "+ no_hp);
    }
    void sms(int no_hp){
        System.out.println("Mengirim Pesan Ke"+no_hp);
    }
    void sms(int no_hp,int no_hp1){
        System.out.println("Mengirim Pesan Ke"+no_hp);
        System.out.println("Mengirim Pesan Ke"+no_hp1);
    }
}
