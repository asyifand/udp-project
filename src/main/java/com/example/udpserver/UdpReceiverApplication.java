package com.example.udpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdpReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdpReceiverApplication.class, args);
		new Thread(new UdpReceiver(5555)).start();
	}

}
