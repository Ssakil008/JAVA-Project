package List;
import java.util.LinkedList;
public class StudentDemo {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<Student>();
		
		Student s1 = new Student(101,"Ssakil","CSE");
		Student s2 = new Student(102,"Polash","Math");
		Student s3 = new Student(103,"Sagar","MBBS");
		Student s4 = new Student(104,"Tahin","CSE");
		Student s5 = new Student(105,"Tasim","Nine");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(Student x : list) {
			System.out.println(x.id+" "+x.name+" "+x.className);
		}
		

	}

}
