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

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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

    static void init () throws IOException {
        Socket clientSocket = new Socket("localhost",7777);

        OutputStreamWriter out = new OutputStreamWriter(clientSocket.getOutputStream());
        out.write("Привет, я Client1"+"\n");
        out.flush();
        out.close();
    }
}
