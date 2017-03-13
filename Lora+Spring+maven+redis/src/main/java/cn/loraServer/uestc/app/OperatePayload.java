package cn.loraServer.uestc.app;

public interface OperatePayload {

	public  byte[] Send(byte[] macPayload);
	
	public void Recv();
	
}
