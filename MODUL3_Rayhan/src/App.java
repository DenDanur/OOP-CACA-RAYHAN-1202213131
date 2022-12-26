import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        int menu;
        Scanner input = new Scanner(System.in);
        Calculation Kalku = new Calculation();
        do{
            try{
                System.out.println("===== MENU =====");
                System.out.println("1. PERSEGI");
                System.out.println("2.LINGKARAN");
                System.out.println("3.TRAPESIUM");
                System.out.print("Masukkan pilihan menu:");
                menu = input.nextInt();
                switch(menu){
                    case 1:
                    System.out.print("Masukkan SISI :");
                    double side = input.nextInt();
                    kalku.setSquare(side);
                    System.out.println("LUAS :"+ kalku.getSquare());
                    break;
                    case 2:
                    System.out.println("Masukkan SISI:");
                    double radius = input.nextDouble();
                    kalku.setCircle(radius);
                    System.out.println("LUAS :"+kalku.getCircle());
                    break;
                    case 3:
                    System.out.println("Masukan SISI TINGGI LEBAR : ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double t = input.nextDouble();
                    kalku.setTrapezoid(a,b,t);
                    System.out.println("LUAS : "+kalku.getTrapezoid());
                




                }
    
            }

        }





        
    }
}
