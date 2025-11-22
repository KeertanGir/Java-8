package Lacture;

public class threadDemo {
    public static void main(String[] args) {

        Runnable thread1 = ()->{
//            this is the Body  of Thread
//            here we put Thread Stuff
            for (int i = 0; i < 10 ; i++) {
                System.out.println("This is Number : "+ (i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(thread1);
        t1.setName("JOHN");
        t1.start();


        Runnable thread2 = ()->{
            for (int i = 0; i < 10 ; i++) {
                System.out.println((i+1)*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(thread2);
        t2.start();


    }
}
