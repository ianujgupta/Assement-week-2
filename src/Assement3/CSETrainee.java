package Assement3;


public class CSETrainee extends Trainee {
	int languages;
	
	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages = languages;
	}

	public  CSETrainee(int id, String name,int languages) {
	super(id,name);
	this.languages=languages;	
	}

	
}

