package observer.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Observable {
    public ArrayList<Observer> clientHandlers = new ArrayList<>();
    private ServerSocket serverSocket;


    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    void readConsole() {
        new Thread (new Runnable(){

            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    try {
                        String message = scanner.nextLine();
                        notifyObservers(message);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void startServer() {
        try {
            readConsole();
            while (!serverSocket.isClosed()) {

                Socket socket = serverSocket.accept();
                System.out.println("A new Client has connected");
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandlers.add(clientHandler);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeServerSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);
        Server server = new Server(serverSocket);
        server.startServer();
    }

    @Override
    public void addObserver(Observer observer) {
        clientHandlers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        clientHandlers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) throws IOException {
        for (Observer observer : clientHandlers) {
            observer.update(message);
        }
    }
}
