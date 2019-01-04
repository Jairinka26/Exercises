/*
 * Copyright (c) 1997-2013 InfoReach, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * InfoReach ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with InfoReach.
 *
 * CopyrightVersion 2.0
 */
package Sockets.Client.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public class Main {
    public static void main(String[] args) throws IOException {
        init();
    }
    private static int PORT = 7777;

    static void init() throws IOException {
        ServerSocket serverSocket= new ServerSocket(PORT);
        System.out.println("Сервер запущен");
        Socket socket = serverSocket.accept();
        System.out.println("Соединение установлено ");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while(true) {
            str = in.readLine();
            if (!str.equals("null")) {
                System.out.println("Получено сообщение от клиента: " + str);
            }
        }
    }
}
