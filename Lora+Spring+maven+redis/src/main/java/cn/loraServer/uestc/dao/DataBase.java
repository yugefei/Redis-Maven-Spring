package cn.loraServer.uestc.dao;

import cn.loraServer.uestc.jsonform.*;

public interface DataBase {
	/**
	 * 
	 */
	String driver ="com.mysql.jdbc.Driver";
	
	/**
	 * 
	 */
	String dbUrl = "jdbc:mysql://localhost/lora";
	
	/**
	 * 
	 */
	String dbUser = "root";
	/**
	 * 
	 */
	String dbPwd = "root";
	
	
	public void SaveData(InfoForm info);
	
	public void Query(String str);
	
}
