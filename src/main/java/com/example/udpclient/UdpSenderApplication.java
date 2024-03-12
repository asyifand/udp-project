package com.example.udpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdpSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdpSenderApplication.class, args);
		new Thread(new UdpSender("10110001"+"00001000"+"0000000000011100"+"00000011"+"0000011110000000"+
				"01011000"+"00001000"+"00000000"+"10110001"+ "00000011"+ "00000111"+ "10000000"+ "00000000"+
				"01010110"+ "10100011"+ "00111100"+ "00100110"+
				"01011011"+"00001111"+"00100101"+ "10111100"+
				"00001111"+"00100111"+"11000110"+"11010010", "localhost", 5555)).start();
	}

}
