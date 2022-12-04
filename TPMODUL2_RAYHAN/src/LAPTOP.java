public class LAPTOP extends Perangkat {
    boolean webcam;

    LAPTOP(String Nama,String drive,int RAM,float prosesor,boolean webcam){
        super(Nama,drive,RAM,prosesor);
        this.webcam=webcam;
    
    }
    void display(){
        super.display();
        System.out.println("WEBCAM :"+this.webcam);
    }
    void game(String nama_game){
        System.out.println(this.Nama +"Membuka Game  "+ nama_game);

    }
    void email(String email){
        System.out.println("Mengirim Email Ke :"+email);
    }
    void email(String email, String email1){
        System.out.println("Mengirim Email ke :"+email);
        System.out.println("Mengirim Email ke :"+email1);
    }
    
}
