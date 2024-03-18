import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		System.out.println("What you you like to do?");
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
 
		if(option == 1)
		{
			System.out.println(1);
		}
		else if(option == 2)
		{
			System.out.println(2);
		}
		else if(option == 3)
		{
			System.out.println(3);
		}

	}

}
