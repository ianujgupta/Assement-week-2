import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	Map<String, Student> map = new HashMap<>();
	Set<Integer> setEven = new HashSet<>();
	Set<Integer> setOdd = new HashSet<>();
	List <String> rollno = new ArrayList<>();

	public static void main(String[] args) {
		StudentMain stud = new StudentMain();
		stud.runApp();
	}

	public void runApp() {
		Student student1 = new Student("123", "Anuj", 13);
		Student student2 = new Student("122", "Ayushi", 14);
		Student student3 = new Student("120", "Ankit", 15);
		Student student4 = new Student("121", "rahul", 16);

		map.put("1", student1);
		map.put("2", student2);
		map.put("3", student3);
		map.put("4", student4);
		display();
		
		/*
		List<Student> valueList = new ArrayList<Student>(map.values());
		// System.out.println("contents of the list holding values of the map ::" +
		// valueList);
		for (Student list1 : valueList) {
			System.out.println("List of Roll no. =  " + list1.getRollno());
		*/

	}
	

	void display() {
		Set<String> keys = map.keySet();
		System.out.println("Displaying Students");
		for (String k : keys) {
			
			Student fetch = map.get(k);
			int age = fetch.getAge();

			if (age % 2 == 0) {
				setEven.add(age);
				System.out.println("Age is even " + fetch.getAge());
			}
			if ((fetch.getAge()) % 2 == 1) {
				setOdd.add(fetch.getAge());
				System.out.println("Age is Odd " + fetch.getAge());
			}
			
			rollno.add(fetch.getRollno());
			System.out.println("Rollno "+rollno);
			

		}
	}

}
