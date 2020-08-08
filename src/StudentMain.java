import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	Map<String, Student> map = new HashMap<>();

	public static void main(String[] args) {
		StudentMain s = new StudentMain();
		s.runApp();
	}

	public void runApp() {
		Student student1 = new Student("123", "Anuj", 13);
		Student student2 = new Student("122", "Ayushi", 14);
		Student student3 = new Student("120", "Ankit", 15);

		map.put("1", student1);
		map.put("2", student2);
		map.put("3", student3);
		
		List<Student> valueList = new ArrayList<Student>(map.values());
		//System.out.println("contents of the list holding values of the map ::" + valueList);
		for (Student list1 : valueList) {
			System.out.println("List of Roll no. =  " + list1.getRollno());
		}
		
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println("Displaying Students");
			Student fetch = map.get(k);
			
			System.out.println("Roll no  "+fetch.getRollno()+
					" Age is- " +fetch.getAge()+
					" Name is-  "+fetch.getName());
			
			if ((fetch.getAge()) % 2 == 0) {
				System.out.println("Age is Even " + fetch.getAge());
			}
			if ((fetch.getAge()) % 2 == 1) {
				System.out.println("Age is Odd " + fetch.getAge());
			}
			
		}
	}

}
