public class App {
    public static void main(String[] args) throws Exception {
        LAPTOP asus = new LAPTOP("ASUS", "Windows 11", 16, 2, true);
        HP samsung = new HP("SAMSUNG ","Android",4,2,true);



        asus.display();
        asus.game("TETRIS");
        asus.email("deni@gmail.com");


        samsung.display();
        samsung.telpon(621234);
        
    }
}
