package com.java8;

import java.util.Arrays;
import java.util.List;

public class StudentBuilder {
	private int rollNo;
	private String firstName;
	private String lastName;
	private int sem1Marks;
	private int sem2Marks;
	private int sem3Marks;

	public StudentBuilder() {
	}

	private StudentBuilder(StudentBuilder.Builder builder) {
		this.rollNo = builder.rollNo;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.sem1Marks = builder.sem1Marks;
		this.sem2Marks = builder.sem2Marks;
		this.sem3Marks = builder.sem3Marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSem1Marks() {
		return sem1Marks;
	}

	public void setSem1Marks(int sem1Marks) {
		this.sem1Marks = sem1Marks;
	}

	public int getSem2Marks() {
		return sem2Marks;
	}

	public void setSem2Marks(int sem2Marks) {
		this.sem2Marks = sem2Marks;
	}

	public int getSem3Marks() {
		return sem3Marks;
	}

	public void setSem3Marks(int sem3Marks) {
		this.sem3Marks = sem3Marks;
	}

	private static class Builder {
		private int rollNo;
		private String firstName;
		private String lastName;
		private int sem1Marks;
		private int sem2Marks;
		private int sem3Marks;

		public Builder() {
			// TODO Auto-generated constructor stub
		}

		public Builder setRollNo(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setlastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setSem1Marks(int sem1Marks) {
			this.sem1Marks = sem1Marks;
			return this;
		}

		public Builder setSem2Marks(int sem2Marks) {
			this.sem2Marks = sem2Marks;
			return this;
		}

		public Builder setSem3Marks(int sem3Marks) {
			this.sem3Marks = sem3Marks;
			return this;
		}

		public StudentBuilder build() {
			return new StudentBuilder(this);
		}
	}

	public static List<StudentBuilder> getStudentList() {
		return Arrays.asList(
				new StudentBuilder.Builder().setRollNo(1).setFirstName("John").setlastName("cena").setSem1Marks(57)
						.setSem2Marks(69).setSem3Marks(96).build(),

				new StudentBuilder.Builder().setRollNo(2).setFirstName("Chris").setlastName("gayle").setSem1Marks(85)
						.setSem2Marks(81).setSem3Marks(79).build(),

				new StudentBuilder.Builder().setRollNo(3).setFirstName("Rohit").setlastName("Sharma").setSem1Marks(98)
						.setSem2Marks(95).setSem3Marks(94).build());
	}

	@Override
	public String toString() {
		return "StudentBuilder [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", sem1Marks=" + sem1Marks + ", sem2Marks=" + sem2Marks + ", sem3Marks=" + sem3Marks + "]";
	}

}