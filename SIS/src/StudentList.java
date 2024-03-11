import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class StudentList {
	ArrayList<Student> studentList = new ArrayList<>();
	readFile();
    public static void readFile() {
    	Scanner studentFile = new Scanner(new File(“studentlist.txt”));
    	while(studentFile.hasNext())
    	{
    	String firstName = studentFile.next();
    	String lastName = studentFile.next();
    	double gpa = 0;
    	String firstClass = studentFile.next();
    	String firstGrade = studentFile.next();
    	String secondClass = studentFile.next();
    	String secondGrade = studentFile.next();
    	String thirdClass = studentFile.next();
    	String thirdGrade = studentFile.next();
    	studentList.add(new Student ) 
    	}

	}
    
	
}
