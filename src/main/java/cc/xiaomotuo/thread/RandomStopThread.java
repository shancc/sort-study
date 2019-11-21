package cc.xiaomotuo.thread;

import java.util.Random;

public class RandomStopThread extends Thread {

    @Override
    public void run() {
        randomQuit();
    }

    /**
     * 每隔2秒钟随机一个数字，随机数为1抛出异常
     */
    private void randomThrowRuntimeException() {
        while (true) {
            try {
                Thread.sleep(2000);
                int randomNum = new Random().nextInt(5);
                System.out.println("random:" + randomNum);
                if (randomNum == 1) {
                    throw new RuntimeException("get it");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    private void randomStop() {
        while (true) {
            try {
                Thread.sleep(2000);
                int randomNum = new Random().nextInt(5);
                System.out.println("random:" + randomNum);
                if (randomNum == 1) {
                    Thread.currentThread().stop();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    private void randomInterrupt() {
        while (true) {
            try {
                Thread.sleep(2000);
                int randomNum = new Random().nextInt(5);
                System.out.println("random:" + randomNum);
                if (randomNum == 1) {
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
               throw new RuntimeException();
            }
        }
    }

    private void randomDestroy() {
        while (true) {
            try {
                Thread.sleep(2000);
                int randomNum = new Random().nextInt(5);
                System.out.println("random:" + randomNum);
                if (randomNum == 1) {
                    Thread.currentThread().destroy();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    private void randomQuit() {
        while (true) {
            try {
                Thread.sleep(2000);
                int randomNum = new Random().nextInt(5);
                System.out.println("random:" + randomNum);
                if (randomNum == 1) {
                    return;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
