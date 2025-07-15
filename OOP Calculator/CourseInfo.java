package final_assignment_codes;

public class CourseInfo {
    private String courseName;
    private String courseMark;
    private int courseHours;
    CourseInfo()
    {
    
    }
    public CourseInfo(String courseName, String courseMark, int courseHours) {
        this.courseName = courseName;
        this.courseMark = courseMark;
        this.courseHours = courseHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseMark() {
        return courseMark;
    }

    public void setCourseMark(String courseMark) {
        this.courseMark = courseMark;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }
    public void print()
    {
    	System.out.print("=");
    }
  //writen by student yanal bataineh
  	//instructor : Dania Al Said
  	//HTU university
  	//prigramming course section 10 
}
