public class Student {
   private String rollno;

   private String name;

   private int age;

   public Student(String rollno,String name, int age){
       this.rollno=rollno;
       this.age=age;
       this.name=name;
   }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
	public boolean equals(Object obj1) {
		if(this==obj1) {
			return true;
		}
		if(obj1==null || !(obj1 instanceof Student)){
			return false;
		}
		
		Student s =(Student)obj1;
		boolean isequal = this.age==s.age;
		return isequal;
	}

	@Override
	public int hashCode() {
		return age;
	}
}