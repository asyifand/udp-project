package com.example.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiver implements Runnable {
    private int port;

    public UdpReceiver(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        try (DatagramSocket socket = new DatagramSocket(port)) {
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while (true) {
                socket.receive(packet);
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + received);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
