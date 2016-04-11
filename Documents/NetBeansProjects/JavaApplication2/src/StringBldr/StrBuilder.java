package StringBldr;

/*
 * This programs contains the manipulation of Strings
 * StringBuilders,
 * the Arraylist and Lambda expression
 * @Author Zanel
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;




public class StrBuilder {
    public static void main(String[] args) {
        
    //Manipulating the String
   StringBuilder str = new StringBuilder("StrBuilder");
   System.out.println("string = " + str);
    
   // replace substring from index 5 to index 9
   str.replace(5, 9, "ilde");
  
   // prints the StringBuilder after replacing
   System.out.println("After replacing: " + str);
   System.out.println(" ");
        
        //String builder
       String anotherPalindrome = "Students Registered!"; 
       String Registered = anotherPalindrome.substring(11, 15);
        //data manipulation Registration
        System.out.println( "=================");
        String palindrome = "  yaD noitartsigeR";
        
       
        //initialising the variable
        StringBuilder sb = new StringBuilder(palindrome);
       
        
        sb.reverse();  // reverse it
        
        System.out.println(sb);
        System.out.println( "=================");
        z();
        
      
       
        }
      //Create and manipulate calendar data using classes from 
      //java.time.LocalDateTime, java.time.LocalDate, java.time.LocalTime,
      //java.time.format.DateTimeFormatter, java.time.Period 
              public static void z(){
             
             
             System.out.println(" ");
             LocalDate regDate =LocalDate.of(2016,12,06);
             LocalTime regTime=LocalTime.of(8,30);
             LocalDateTime Registration=LocalDateTime.of(regDate, regTime);
             LocalDateTime Due= Registration.plusHours(9).plusMinutes(30);
             System.out.print(Due.format(DateTimeFormatter.ofPattern("yyyy 12 dd 08:30")));
             System.out.println(" ");
             
             System.out.println(" ");
             ArrayList<Long> registration =new ArrayList<>();
             
             //Declare and use an ArrayList of a given type 
             
                System.out.println("Number of students to be registered per class ");
              
                 registration.add(new Long ("12345678910"));
                 
                 for (long i: registration){
                 System.out.print(i);
                 
                  System.out.println(" ");
                  
             }        System.out.println(" ");
                      SomeListener listener = () -> 
                      System.out.println("Registration will close at 05:30");

                       listener.action();

    }
}
                        interface SomeListener {

                         void action();

              }
    
 
    

