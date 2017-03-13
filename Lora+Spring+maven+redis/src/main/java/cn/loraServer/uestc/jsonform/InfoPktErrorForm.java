package cn.loraServer.uestc.jsonform;

public class InfoPktErrorForm implements InfoForm{

	public int error;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;	
	}

	public void saveData() {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	public byte[] getData() {
		// TODO Auto-generated method stub
		return null;
	}
	

}