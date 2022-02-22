package MessageDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static DataInputStream dataInputStream = null;
    private static DataOutputStream dataOutputStream = null;

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server Started at Port : "+serverSocket.getLocalPort());
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client Connected");

            dataInputStream=new DataInputStream(clientSocket.getInputStream());
            dataOutputStream=new DataOutputStream(clientSocket.getOutputStream());

            String message;

            while(true){
                message=dataInputStream.readUTF();
                System.out.println("Client Says: "+message);

                if (message.equalsIgnoreCase("_stop")){
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
