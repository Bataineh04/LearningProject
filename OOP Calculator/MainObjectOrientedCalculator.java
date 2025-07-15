package final_assignment_codes;

import java.util.Scanner;

public class MainObjectOrientedCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("choose the number of what you want:\n1- gpa calculator(pearson system)\n2-check if number is prime \n3- number system converter  ");
		Scanner sc = new Scanner(System.in);
		int chooseGradinSystem = sc.nextInt();
		sc.nextLine();

		switch (chooseGradinSystem) {


		case 1: {
		    System.out.print("Enter how many university courses you added this semester: ");
		    int enterCoursesNumber = sc.nextInt();
		    sc.nextLine();

		    StudentGpaCalculator[] courseInfoArray = new StudentGpaCalculator[enterCoursesNumber];
		 

		    for (int i = 0; i < enterCoursesNumber; i++) {
		        System.out.print("Enter your course name: ");
		        String courseName = sc.nextLine();

		        System.out.print("Enter your course mark symbol: ");
		        String courseMark = sc.nextLine();

		        System.out.print("Enter the course hours: ");
		        int courseHours = sc.nextInt();
		        sc.nextLine();

		        courseInfoArray[i] = new StudentGpaCalculator(courseName, courseMark, courseHours);
		    }

		    StudentGpaCalculator emptyConstructor = new StudentGpaCalculator();
		    CourseInfo equal = new CourseInfo();
		    double gpa = emptyConstructor.calculateTheGpa(courseInfoArray);  
		    emptyConstructor.print();
		    equal.print();
		    System.out.println(gpa);
		    
		    break;
		}

		case 2:
		{
			System.out.println("enter the number you want to check if it is prime");
			int checkIfPrime = sc.nextInt();
			sc.nextLine();
			PrimeNumberChecker numChk = new PrimeNumberChecker();
			if (numChk.primeChecker(checkIfPrime) == true) {
				System.out.println("the number is prime");
			} else {
				System.out.println("the number is not prime");

			}
			
			break;
		}
		case 3:
		{
			String result= "";
			System.out.println("enter decimal number you want to convert");
			int numYouWantToConvert = sc.nextInt();
			sc.nextLine();
			System.out.println("enter what number system you want to convert to:\n1-binary\n2-octal\n3-hexadecimal");
			 int convertor = sc.nextInt();
			sc.nextLine();
			NumberConverterSystem NumConSys =new NumberConverterSystem();
			NumConSys.numConverter(numYouWantToConvert,convertor, result);
			break;
			
		}
	}

}
	//writen by student yanal bataineh
		//instructor : Dania Al Said
		//HTU university
		//prigramming course section 10 
}
