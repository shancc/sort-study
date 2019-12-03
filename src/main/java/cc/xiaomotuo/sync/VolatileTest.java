package cc.xiaomotuo.sync;

public class VolatileTest {

    private static volatile Integer num = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0;i<1000;i++){
                    increment();
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0;i<1000;i++){
                    increment();
                }
            }
        };
        thread1.start();
        thread2.start();
        Thread.sleep(10000);
        System.out.println(num);

    }

    static void increment(){
        num++;
    }
}
