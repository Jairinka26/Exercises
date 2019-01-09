package Sockets.Client.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;

public class Server {
    private static int PORT = 7777;
    ArrayList<ClientConnection> clientsList = new ArrayList();

    Server() throws IOException {
        ServerSocket serverSocket= new ServerSocket(PORT);
        System.out.println("Сервер запущен");

        while(true) {
            clientsList.add(new ClientConnection(serverSocket.accept()));
            clientsList.get(clientsList.size() - 1).listener(clientsList.get(clientsList.size()-1).name);
        }
        }
    }

