package cn.loraServer.uestc.main;

import cn.loraServer.uestc.socket.Socket_Server;

public class LoRaMain {

	public static void main(String[] args) {
		new Thread(new Socket_Server(1780)).start();
		//new Thread(new ServerToEndnodes()).start();
	}

}
