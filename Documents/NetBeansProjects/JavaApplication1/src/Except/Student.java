package Except;

public class Student extends testStud
{

    private String name;
    private int age;
    private int year;
    private String studentNum;



    public Student(String name, int age, int year, String studentNum) 
    {

        this.name = name;
        this.age = age;
        this.year = year;
        this.studentNum = studentNum;
    }

    // Setters and getters (Name, Age, Year and Student Number)

    public String getName() // name
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() // age
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYear() // year
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getstudentNum() // studentNum
    {
    return studentNum;
    }

    public void setstudentNum(String studentNum) 
    {
        this.studentNum = studentNum;
    }

}