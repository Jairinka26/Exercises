package Sockets.Client.Server;

import java.io.*;
import java.net.Socket;

public class ClientConnection {
    Socket socket;
    String name;
    String inMessage;
    DataInputStream in;
    DataOutputStream out;

    ClientConnection(Socket socket) throws IOException {
        this.socket = socket;
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Назовите ваше имя");
        this.name = in.readUTF();
    }

    public void listener(String name) throws IOException {
        out.writeUTF("Вы залогинились под ником " + name);
        out.flush();

        while (!socket.isClosed()) {
            inMessage = in.readUTF();
            System.out.println("Получено сообщение от клиента: " + inMessage);
            out.writeUTF("Сообщение получено");
            out.flush();
        }
    }
}

