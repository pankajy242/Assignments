package com.yash.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empId;
	private String empFirstName;
	private String empLastName;
	private transient String empDob;
	private String empGender;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDob() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDob=" + empDob + ", empGender=" + empGender + "]";
	}
	
	

}

public class Manager extends Employee{
	
private int managerId;

public Manager(int managerId) {
    this.managerId=managerId;
	
}
}



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationPractice {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.setEmpId(10001);
		emp1.setEmpFirstName("Alex");
		emp1.setEmpLastName("Stuart");
		emp1.setEmpDob("21-12-1993");
		emp1.setEmpGender("Male");
		
		//Serialization
				try(
					OutputStream os=new FileOutputStream("D:\\JavaTrainingIO\\Manager.ser");
					ObjectOutputStream oos=new ObjectOutputStream(os);
				   ){
					
					Manager manager=new Manager(101101);
					oos.writeObject(manager);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				//De-Serialization
				try(
					InputStream is=new FileInputStream("D:\\\\JavaTrainingIO\\\\Manager.ser");
					ObjectInputStream ois=new ObjectInputStream(is);
				   ){
					
					Manager manager=(Manager)ois.readObject();
					System.out.println(manager);
					System.out.println(manager.getEmpId());
					System.out.println(manager.getEmpFirstName());
					System.out.println(manager.getEmpLastName());
					System.out.println(manager.getEmpGender());
					
				}catch(IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		
		
	}

}