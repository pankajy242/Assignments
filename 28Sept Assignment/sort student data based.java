import java.util.Arrays;

public class Student {
	
	private int studentId;
	private String studentName;
	private int[] marks;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + Arrays.toString(marks)
				+ "]";
	}
	
	

}
Serialization Program - 

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Data {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setStudentId(10101);
		student1.setStudentName("Alex");
		int marksS1[] = {43,43,34,29,39};
		student1.setMarks(marksS1);
		
		Student student2 = new Student();
		student2.setStudentId(10101);
		student2.setStudentName("Brian");
		int marksS2[] = {43,43,34,29,39};
		student2.setMarks(marksS2);
		
		Student student3 = new Student();
		student3.setStudentId(10101);
		student3.setStudentName("Alex");
		int marksS3[] = {43,43,34,29,39};
		student3.setMarks(marksS3);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student2);

		
		
		try(
				OutputStream os=new FileOutputStream("D:\\JavaTrainingIO\\sudent.dat");
				ObjectOutputStream oos=new ObjectOutputStream(os);
						
				){
					oos.writeObject(studentList);
					
				}catch(IOException ex) {
				 ex.printStackTrace();
				}
			}
	}

}


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class GetSData {

	public static void main(String[] args) {
		
		try(
				InputStream is=new FileInputStream("D:\\JavaTrainingIO\\student.dat");
				ObjectInputStream ois=new ObjectInputStream(is);
				){
					Student s=(Student)ois.readObject();
					System.out.println(s);
					
				}catch(IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}

	}

}