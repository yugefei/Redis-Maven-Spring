package cn.loraServer.uestc.main;

import cn.loraServer.uestc.socket.Server;

public class ServerMain {

	public static void main(String[] args)
	{
		
		Server server = new Server();
		
		new Thread(server,"nio-server").start();
		
	}
}
