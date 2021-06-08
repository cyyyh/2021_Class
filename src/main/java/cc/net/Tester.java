package cc.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        //TELNET, RFC 854
        try{
            Socket socket = new Socket("ptt.cc", 23);
            InputStream is = socket.getInputStream();
            int data = is.read();
            System.out.println(data);
            //72 的 ASCII碼 ？
            data = is.read();
            System.out.println(data);
            data = is.read();
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
