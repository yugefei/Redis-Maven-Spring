package cn.loraServer.uestc.mac;

public interface OperateMacPkt {
	
	MacPktForm MacParseData(byte[] data);
	
	MacPktForm MacConstructData(MacPktForm macpkt);
}
