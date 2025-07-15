package final_assignment_codes;

public class StudentGpaCalculator extends CourseInfo {
	 StudentGpaCalculator()
	 {
		 
	 }
    StudentGpaCalculator(String courseName, String courseMark ,int courseHours) {
        super(courseName, courseMark, courseHours);
    }

     double calculateTheGpa(CourseInfo[] courseInfoArray) {
        double totalMarks = 0;
        int totalHours = 0;

        for (CourseInfo courseInfo : courseInfoArray) {
            double marksInNumbers = 0;

            if (courseInfo.getCourseMark().equalsIgnoreCase("u")) {
                marksInNumbers = 1.6;
            } else if (courseInfo.getCourseMark().equalsIgnoreCase("p")) {
                marksInNumbers = 2.4;
            } else if (courseInfo.getCourseMark().equalsIgnoreCase("m")) {
                marksInNumbers = 3.2;
            } else if (courseInfo.getCourseMark().equalsIgnoreCase("d")) {
                marksInNumbers = 4.0;
            }

            totalMarks += marksInNumbers * courseInfo.getCourseHours();
            totalHours += courseInfo.getCourseHours();
        }

        if (totalHours > 0) {
            return totalMarks / totalHours;
        } else {
            return 0;
        }
    }
     public void print()
     {
    	 System.out.print("your gpa");
     }
  //writen by student yanal bataineh
  	//instructor : Dania Al Said
  	//HTU university
  	//prigramming course section 10 
}
