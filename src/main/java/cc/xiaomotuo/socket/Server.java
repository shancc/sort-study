package cc.xiaomotuo.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {


    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        ServerSocket serverSocket = new ServerSocket();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(10613);
        serverSocket.bind(inetSocketAddress);
        while (true) {
            final Socket socket = serverSocket.accept();
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    handle(socket);
                }
            });
        }
    }

    private static void handle(Socket socket)  {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            int len;
            byte[] bys = new byte[1024];
            while ((len = inputStream.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
            inputStream.close();
            socket.close();
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
