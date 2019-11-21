package cc.xiaomotuo.thread;

public class ThreadCaughtExceptionTest {

    public static void main(String[] args) throws InterruptedException {
        RandomStopThread randomStopThread = new RandomStopThread();
        randomStopThread.start();
        randomStopThread.join();
    }
}
