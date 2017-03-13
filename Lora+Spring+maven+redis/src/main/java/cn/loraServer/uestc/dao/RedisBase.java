package cn.loraServer.uestc.dao;

//import org.redisson.Config;  
//import org.redisson.Redisson;

import cn.loraServer.uestc.jsonform.InfoForm; 
public interface RedisBase {
	
public void SaveData(InfoForm info);
	
public void Query(String str);
	
}
