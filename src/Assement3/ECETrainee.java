package Assement3;


public class ECETrainee extends Trainee {
	
	String deviceUsed;

	public String getDeviceUsed() {
		return deviceUsed;
	}

	public void setDeviceUsed(String deviceUsed) {
		this.deviceUsed = deviceUsed;
	}

	public ECETrainee(int id, String name,String deviceUsed) {
		super(id, name);
		this.deviceUsed=deviceUsed;
	}

}

