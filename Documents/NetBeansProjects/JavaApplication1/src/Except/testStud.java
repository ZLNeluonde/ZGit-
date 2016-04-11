package Except;

	
	/* 
	 * @author Zanel
	 * Students registration System
	 */

	import java.io.BufferedReader;
	//import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	//import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.List;

	public class testStud 
	{

	    public static void main(String[] args) throws IOException 
	    {

	    String name = null  ;
	    int age = 0;
	    int year = 0;
	    String studentNum;

	    List<Student> studentsList = new ArrayList<>(); 

	    for (int i = 0; i < 2; i++) 
	    {

	    int studentNumber = (i + 1);

	    System.out.println("");
	    System.out.println("Please enter " + "data for student " + studentNumber);

	    InputStreamReader converter = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(converter);

	    System.out.println("Enter Student "+ studentNumber + " Name:"); 
	    try {
			name = in.readLine();
		} catch (IOException e2) {
		}

	    System.out.println("Enter Student " + studentNumber + " Age (Integer):");
	    try {
			age = Integer.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e1) {
		}
                // TODO Auto-generated catch block

	    System.out.println("Enter Student " + studentNumber + " Year (Integer):");
	    try {
			year = Integer.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
		}
                // TODO Auto-generated catch block

	    System.out.println("Enter Student " + studentNumber + " Student Number:"); 
	    studentNum = in.readLine();

	    Student student = new Student(name, age, year, studentNum);

	    studentsList.add(student); // add student
	    }

	    for (int j = 0; j < studentsList.size(); j++)
	    {

	        Student st = studentsList.get(j);

	        System.out.println("Student : " + (j + 1));
	        System.out.println("Name: " + st.getName() + " - Age: " + st.getAge() + " - Year: " + st.getYear() + " - Student Number: " + st.getstudentNum());
	    }

	    }

	    }

	



