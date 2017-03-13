package cn.loraServer.uestc.RedisDao;
import cn.loraServer.uestc.jsonform.InfoForm; 



public interface RedisBase {
	

	public void SaveData(InfoForm info);
	
	public void Query(String str);
	
	
}
