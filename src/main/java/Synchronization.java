public class Synchronization {

    int amount;

    public static void main(String[] args) throws Exception {

        Synchronization synchronization = new Synchronization();
        synchronization.display();


    }

    public void display() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    addition();

                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    addition();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        try {
            t2.join();
        } catch (Exception e) {
        }

        System.out.println("amount " + amount);


    }

    public synchronized void addition() {

        amount++;
    }


}



