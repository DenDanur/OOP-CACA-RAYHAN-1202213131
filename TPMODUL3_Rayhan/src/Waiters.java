public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 1000;

    public Waiters(int customerID,int orderQty){
        this.customerID=customerID;
        this.orderQty=orderQty;
    }

    @Override
    public void run() {
        while (true){
            getFood();
            try{
                Thread.sleep(20000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("===============");
        System.out.println("CUSTOMER ID :"+this.customerID);
        System.out.println("NOMER PESANAN :"+this.orderQty);
        System.out.println("TOTAL :"+this.orderQty*foodPrice);
        System.out.println("================");
    }
public void getFood(){
    synchronized(Restaurant.getLock()){
        System.out.println("WAITER : Pesanan siap diantar");
        Restaurant restaurant = new Restaurant();
        restaurant.setWaitingforPickup(false);

        if (Restaurant.getFoodNumber()== this.orderQty+1){
            orderInfo();
            System.exit(0);
        }
        Restaurant.getLock().notifyAll();
        System.out.println("Waiter :Menghubungi restoran untuk menerima pesanan lain");
    }
}
}
