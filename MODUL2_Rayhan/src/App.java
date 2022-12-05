public class App {
    public static void main(String[] args) throws Exception {
        Sampan SAMPAN1 = new Sampan(5, 20000, 3);
        Sampan SAMPAN2 = new Sampan(12,10000,5);
        Kapal KAPAL1 = new Kapal(30,50000,"MESIN JAHIT");
        Kapal KAPAL2 = new Kapal(12,9000,"MESIN BENSIN");




        SAMPAN1.informasi();
        System.out.println("");
        SAMPAN2.informasi();
        System.out.println("");
        KAPAL1.informasi();
        System.out.println("");
        KAPAL2.informasi();
        System.out.println();



        KAPAL2.berlayar(500);
        KAPAL1.berlabuh();
        System.out.println("");

        SAMPAN1.berlabuh(3);
        SAMPAN2.berlayar();

    }
    
}
