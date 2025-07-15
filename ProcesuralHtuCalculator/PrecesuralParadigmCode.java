package MidTerm;

import java.util.Scanner;

public class PrecesuralParadigmCode {

	public static void main(String[] args) {
		System.out.println(
				"choose the number of what you want:\n1-check if number is prime\n2- number system converter\n3- gpa calculator(pearson system)  ");
		// here we are printing the choices
		Scanner sc = new Scanner(System.in);
		int chooseWhatYouWant = sc.nextInt();
		sc.nextLine();
		// scanning which choice we want

		if (chooseWhatYouWant == 1) {
			System.out.println("enter the number you want to check if it is prime");
			int checkIfItIsPrime = sc.nextInt();
			sc.nextLine();
			// here we ask the use to enter a number to check if it is prime
			if (checker(checkIfItIsPrime) == true) {
				System.out.println("the number is prime");
			} else {
				System.out.println("the number is not prime");

			}
			// here if the method return true the number is prime
			// if the method return false the number is not prime

		}
		
		else if (chooseWhatYouWant == 2) {
			String theRes = "";
			System.out.println("enter decimal number you want to convert");
			int numYouWantToConvert = sc.nextInt();
			sc.nextLine();
			// here we ask the user to enter decimal number to convert it
			System.out.println("enter what number system you want to convert to:\n1-binary\n2-octal\n3-hexadecimal");
			int convertor = sc.nextInt();
			sc.nextLine();
			// here we ask the user to enter the system he want to covert the number to
			if (convertor == 1) {
				conversionToBinary(numYouWantToConvert, convertor, theRes);
				// if the user enter 1 the number will convert to binary
				System.out.println(conversionToBinary(numYouWantToConvert, convertor, theRes));
				//printing the return value from the method
			}
			if (convertor == 2) {
				conversionToOctal(numYouWantToConvert, convertor, theRes);
				// if the user enter 1 the number will convert to octal
				System.out.println(conversionToOctal(numYouWantToConvert, convertor, theRes));
				//printing the return value from the method
			}
			if (convertor == 3) {
				conversionToHexa(numYouWantToConvert, convertor, theRes);
				// if the user enter 1 the number will convert to hexa
				System.out.println(conversionToHexa(numYouWantToConvert, convertor, theRes));
				//printing the return value from the method

			}
			

		}

		else if (chooseWhatYouWant == 3) {
			// if statement for the first choice
			System.out.println("enter how many university course did you add this Semester ");
			try {
			int enterCoursesNumber = sc.nextInt();
			sc.nextLine();
			// here I am asking the user to enter how many course did he add this semester
		
			String coursesName[] = new String[7];
			String coursesMarks[] = new String[7];
			int coursesHoursArray[] = new int[7];
			 double result = 0;
			// here I am declaring three arrays to save all the names and marks each course
			// hours in them
			// and i make the size of the array the same size of the courses numbers because
			// i wont need more than that

			for (int i = 0; i < enterCoursesNumber; i++) {
				// here i did a loop to get the courses names and marks and hours and each info
				// in different variable with different array index
				System.out.println("enter course number " + (i + 1) + " name");
				String courseName = sc.nextLine();
				coursesName[i] = courseName;
				// here we ask the user to enter the name of the course
				System.out.println("enter your mark symbol in this course(U - P - M -D):\nremember\nu = 1.6\np=2.4\nm=3.2\nd=4");
				String markSymbol = sc.nextLine();
				coursesMarks[i] = markSymbol;
				// here we ask the user to enter a the mark he got on the course he named before

				System.out.print("enter the number of this course hours:");
				int courseHours = sc.nextInt();
				coursesHoursArray[i] = courseHours;
				sc.nextLine();
				// now we get the number of hours of the course
			}

			 
			System.out.println("your gpa is: " + gpaCalc(coursesHoursArray, coursesMarks));
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("you are out of the limit of cources");
			}		
			//printing the return value from the function
		}
	
	
	}

	static boolean checker(int checkIfItIsPrime) {
		if (checkIfItIsPrime < 2) {
			return false;
		}

		for (int i = 2; i < checkIfItIsPrime; i++) {
			if (checkIfItIsPrime % i == 0) {
				return false;

			}

		}
		return true;
	}
	//fuction that check if number is prime

	static String conversionToBinary(int NumYouWantToConvert, int convertor, String theRes) {
		theRes = Integer.toBinaryString(NumYouWantToConvert);
		return theRes;

	}

	static String conversionToOctal(int NumYouWantToConvert, int convertor, String theRes) {
		theRes = Integer.toOctalString(NumYouWantToConvert);
		return theRes;
	}

	static String conversionToHexa(int NumYouWantToConvert, int convertor, String theRes) {
		theRes = Integer.toHexString(NumYouWantToConvert);
		return theRes;
	}
	//function that helps you convert to numbers system
	static double gpaCalc(int[] coursesHoursArray, String[] coursesMarks) {
	    double totMarks = 0;
	    int totHours = 0;
	    double theGpa = 0;
	    double marksInArray = 0;

	  
	        for (int v = 0; v < coursesMarks.length; v++) {
	            double marksInNumbers = 0;
	            if (coursesMarks[v].equalsIgnoreCase("u")) {
	                marksInNumbers = 1.6;
	            }
	            if (coursesMarks[v].equalsIgnoreCase("p")) {
	                marksInNumbers = 2.4;
	            }
	            if (coursesMarks[v].equalsIgnoreCase("m")) {
	                marksInNumbers = 3.2;
	            }
	            if (coursesMarks[v].equalsIgnoreCase("d")) {
	                marksInNumbers = 4.0;
	            }
	            totMarks = totMarks + (marksInNumbers * coursesHoursArray[v]);
	            totHours = totHours + coursesHoursArray[v];
	        }

	        if (totHours != 0) {
	            return totMarks / totHours;
	        }
	        else
	        {
	        	return 0;
	        }
	        
	   //function that calculate the gpa and return it
	    

	}

	// writen by student yanal bataineh
	// instructor : Dania Al Said
	// HTU university
	// prigramming course section 10
}