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
package Sockets.Client.Client1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public class Main {
    public static void main(String[] args) throws IOException {
        init();
    }

    static void init () throws IOException {
        Socket clientSocket = new Socket("localhost",7777);
        String inMessage;
        String outMessage;
        Scanner fromUser =new Scanner(System.in);

        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        System.out.println("Подключение...");

        if (in.readUTF().equals("Назовите ваше имя")) {
            out.writeUTF("Client2");
            out.flush();
        }

        while (!clientSocket.isInputShutdown()) {
            if (in.available() > 0) {
                inMessage = in.readUTF();
                System.out.println(inMessage);
            }

            if (fromUser.hasNextLine()) {
                outMessage = fromUser.nextLine();
                out.writeUTF(outMessage);
            }
//            Thread.sleep(50);
        }


     //   out.close();

    }
}
