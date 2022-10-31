/*class Database{
    String MenuMakanan;
    

    public void InsertMenu(String Add){
        System.out.println(Add+"Ditambahkan Ke menu");
        MenuMakanan += Add;
    }

    public void ShowMenu(){
        System.out.println(MenuMakanan);
    }

    public void SearchMenu(String Search){
        System.out.println(Search);
    }


}*/

class Menu{
    String Name;
    String Cate;
    int Price;

    Menu(String Name,String Cate,int Price){
        this.Name = Name;
        this.Cate = Cate;
        this.Price = Price;
    }

    void Insert(String Name,String Cate, int Price){
        System.out.println("Menu "+ Name + "Ditambahkan");
        System.out.println("Kategori :" + Cate );
        System.out.println("Harga : "+Price);
    }

    void ShowMenu(){
        System.out.println("MENU ");

    }

    void Search(String Name){
        System.out.println("MENCARI" + Name);
    }





}

class Server{
    void PilihMenu(){
        System.out.println("Silahkan Pilih MENU");
    }

    void Menu(){
        System.out.println("Menu");
    }

    void keluar(){
        System.out.println("Keluar");
    }

}

class User{
    String Nama;
    String HP;

    User(String Nama, String HP){
        this.Nama = Nama;
        this.HP = HP;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SELAMAT DATANG DI RESTORAN EAD");
        System.out.println("SILAHKAN REGISTER TERLEBIH DAHULU");

        User Mahasiswa1 = new User("Rayhan","1202213131");

        

        
    }
}
