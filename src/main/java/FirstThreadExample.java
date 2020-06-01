class Take extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Take");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Care extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Care");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}


public class FirstThreadExample {

    public static void main(String[] args) {
        Take take = new Take();
        Care care = new Care();
        take.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        care.start();


    }
}
