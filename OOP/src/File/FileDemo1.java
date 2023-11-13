package File;

import java.io.File;

public class FileDemo1 {
	
	public static void main(String[] args) {
		
		File dir = new File("University");
		
		dir.mkdir();
		
		String path = dir.getAbsolutePath();
		System.out.println(path);
		System.out.println(dir.getName());
		
		File file1 = new File(path+"/Student.txt");
		File file2 = new File(path+"/Teacher.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
		if(file1.exists()) {
			System.out.println("File exists");
		}
		file1.getAbsolutePath();
		

	}

}
