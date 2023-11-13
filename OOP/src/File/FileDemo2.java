package File;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {
		String id, name;
		
		try {
			Formatter formatter = new Formatter("/home/ssakil/eclipse-workspace/OOP/University/Student.txt");
			
			
			Scanner input = new Scanner(System.in);
			System.out.print("How many students : ");
			int num = input.nextInt();
			
			for(int i=1; i<=num; i++) {
				System.out.print("Enter student id and name : ");
				id = input.next();
				name = input.next();
				
				formatter.format("%s %s\n",id,name);
			}
			formatter.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
