package edu.bsuir.clientfx.client;

import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket clientSocket;
    private static BufferedReader in;
    private static BufferedWriter out;

    public void connectionCreate(String host, int port) throws IOException {
        clientSocket = new Socket(host, port);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        System.out.println("Введите строку для обработки сервером:");
    }

    public String dataSenderAndTake(String data) throws IOException {
        out.write(data + "\n");
        out.flush();
        String serverWord = in.readLine();
        return serverWord;
    }

    public void streamsClose() throws IOException {
        System.out.println("Сеанс завершен...");
        clientSocket.close();
        in.close();
        out.close();
    }






}
