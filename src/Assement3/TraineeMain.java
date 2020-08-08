package Assement3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {

	Map<Integer, Trainee> map = new HashMap<>();

	Set<CSETrainee> set1 = new HashSet<>();
	Set<ECETrainee> set2 = new HashSet<>();

	public static void main(String[] args) {
		TraineeMain train = new TraineeMain();
		train.display();
	}

	void runApp() {
		CSETrainee student1 = new CSETrainee(111, "mohan", 123);
		CSETrainee student2 = new CSETrainee(222, "sohan", 124);
		ECETrainee student3 = new ECETrainee(333, "rohan", "diode");
		ECETrainee student4 = new ECETrainee(444, "Gohan", "multimeter");

		map.put(1, student1);
		map.put(2, student2);
		map.put(3, student3);
		map.put(4, student4);
	}

	void display() {

		runApp();

		for (Trainee trainee : map.values()) {
			Trainee trainee1 = (Trainee) trainee;
			boolean isCSE = trainee1 instanceof CSETrainee;
			if (isCSE) {
				set1.add((CSETrainee) trainee1);
			} else {
				set2.add((ECETrainee) trainee1);
			}
		}

		for (CSETrainee cstraineeset : set1) {
			System.out.println("name of student =" + cstraineeset.getName() + " Id is =" + cstraineeset.getId()
					+ " Language =" + cstraineeset.getLanguages());
		}

		for (ECETrainee ecetraineeset : set2) {
			System.out.println("name of student= " + ecetraineeset.getName() + " Id is =" + ecetraineeset.getId()
					+ " devices=" + ecetraineeset.deviceUsed);
		}

	}
}