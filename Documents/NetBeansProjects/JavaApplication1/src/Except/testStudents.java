package Except;

//import java.awt.List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class checkedUnchecked {
    
    String name;
    int age;
    int year;

    private static Object list;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
    PrintWriter out = null;

    try {
        System.out.println("Entering" + " try statement");

        out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < i; i++) {
            out.println("Value at: " + i + " = " + (i));
        }
    } catch (IndexOutOfBoundsException e) {
        System.err.println("Caught IndexOutOfBoundsException: "
                           +  e.getMessage());
                                 
    } catch (IOException e) {
        System.err.println("Caught IOException: " +  e.getMessage());
                                 
    } finally {
        if (out != null) {
            System.out.println("Closing PrintWriter");
            out.close();
        } 
        else {
            System.out.println("PrintWriter not open");
        }
    }
    
    for (int i = 0; i < 2; i++) 
	    {

	    int studentNumber = (i + 1);

	    System.out.println("");
	    System.out.println("Please enter " + "data for student " + studentNumber);

	    InputStreamReader converter = new InputStreamReader(System.in);
	    BufferedReader in = new BufferedReader(converter);

	    System.out.println("Enter Student "+ studentNumber + " Name:"); 
	    try {
                String name = in.readLine();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			
		}

	    System.out.println("Enter Student " + studentNumber + " Age (Integer):");
	    try {
                Integer age = Integer.valueOf(in.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			
		}

	    System.out.println("Enter Student " + studentNumber + " Year (Integer):");
	    try {
                Integer year = Integer.valueOf(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}

	    System.out.println("Enter Student " + studentNumber + " Student Number:"); 
        String studentNum = in.readLine();

	
        }
    }

    static class Student {

        public Student() {
        }
    }
}


