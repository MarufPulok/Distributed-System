package MessageDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static DataOutputStream dataOutputStream =null;
    private static DataInputStream dataInputStream = null;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localHost",5000);
            dataInputStream=new DataInputStream(socket.getInputStream());
            dataOutputStream=new DataOutputStream(socket.getOutputStream());

            while(true){
                System.out.println("input> ");
                String message = scanner.nextLine();
                dataOutputStream.writeUTF(message);
                if(message.equalsIgnoreCase("_stop")){
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
