package cn.loraServer.uestc.RedisDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import cn.loraServer.uestc.jsonform.*;
import redis.clients.jedis.Jedis;
import redis.clients.util.Pool;

public class RedisBaseAction implements RedisBase{
	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
     @SuppressWarnings("unchecked")
	Pool<Jedis> jedisPool = (Pool<Jedis>)applicationContext.getBean("redisClient");
     Jedis jedis = jedisPool.getResource();
	
     
	public void SaveData(InfoForm info) {
		if(info instanceof InfoLoraModEndForm)
		{
			InfoLoraModEndForm frame = new InfoLoraModEndForm();
			String string = JSON.toJSONString(frame);
			jedis.set("LoraModFrame", string);
			String get = jedis.get("LoraModFrame");
			Object object = JSON.parseObject(get, InfoLoraModEndForm.class);
			System.out.println("=" + object);
		}
		else if(info instanceof InfoGateWayStatForm)
		{
			InfoGateWayStatForm frame = new InfoGateWayStatForm();
			String string = JSON.toJSONString(frame);
			jedis.set("GatewayStarFrame", string);
			String get = jedis.get("GatewayStarFrame");
			Object object = JSON.parseObject(get, InfoGateWayStatForm.class);
			System.out.println("=" + object);
		
		}
		else if(info instanceof InfoFSKModEndForm)
		{
			InfoFSKModEndForm frame = new InfoFSKModEndForm();
			String string = JSON.toJSONString(frame);
			jedis.set("FSKModFrame", string);
			String get = jedis.get("FSKModFrame");
			Object object = JSON.parseObject(get, InfoFSKModEndForm.class);
			System.out.println("=" + object);
			
		}
		else if(info instanceof InfoPktErrorForm)
		{
			InfoPktErrorForm frame = new InfoPktErrorForm();
			String string = JSON.toJSONString(frame);
			jedis.set("PktErrorFrame", string);
			String get = jedis.get("PktErrorFrame");
			Object object = JSON.parseObject(get, InfoPktErrorForm.class);
			System.out.println("=" + object);
			
		}
		else
		{
			System.out.println("Unrecognized data frames");
			
		}
		
	}

	public void Query(String str) {
		// TODO Auto-generated method stub
		
	}

}
