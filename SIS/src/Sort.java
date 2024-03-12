import java.util.Collections;
import java.util.Scanner;

public class Sort {
	
	public static void run()
	{
		System.out.println("Sort Students:");
		System.out.println("1) sort by last name");
		System.out.println("2) sort by GPA");
		System.out.println("3) sort by period");
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		if(option == 1)
		{
			lastName();
		}
		else if(option == 2)
		{
			GPA();
		}
		else if(option == 3)
		{
			period();
		}
	}
	
	public static void lastName()
	{
		int[] students = new int[StudentList.studentList.size()];
		for(int i=0; i<StudentList.studentList.size(); i++)
		{
			students[i] = Integer.parseInt(StudentList.studentList.get(i).getLastName().substring(0,1));
		}
		
		for (int i = 0; i < students.length-1; i++)
 		{
			int minIndex = i;
			for (int j = i + 1; j < students.length; j++)
 			{
				if (students[j] < students[minIndex])
				{
					minIndex = j;
 				}
 			}
			int temp = students[i];
			students[i] = students[minIndex];
			students[minIndex] = temp;
 		}
		
		for(int i=0; i<StudentList.studentList.size(); i++)
		{
			System.out.println(students[i]);
		}

		 
		
	}
	
	public static void GPA()
	{
		System.out.println("GPA");
	}
	
	public static void period()
	{
		System.out.println("period");
	}

}
