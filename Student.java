import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Student {
private String name;
private Date dateOfBirth;
public Student(String name, String dob) throws ParseException {
this.name = name;
SimpleDateFormat sdf = new SimpleDateFormat(&quot;dd-MM-yyyy&quot;); // Change format as
needed
this.dateOfBirth = sdf.parse(dob);
}
public void displayDetails() {
System.out.println(&quot;Student Name: &quot; + name);
System.out.println(&quot;Age: &quot; + calculateAge() + &quot; years&quot;);
}
private int calculateAge() {
Date currentDate = new Date();
long diff = currentDate.getTime() - dateOfBirth.getTime();

return (int) (diff / (1000L * 60 * 60 * 24 * 365));
}
public static void main(String[] args) throws ParseException {
// Creating a new student
Student student = new Student(&quot;Amit&quot;, &quot;24-03-2004&quot;);
// Displaying student details
student.displayDetails();
StudentCourses studentCourses = new StudentCourses();
// Adding courses and marks
studentCourses.addCourseMark(&quot;C++&quot;, 90);
studentCourses.addCourseMark(&quot;Java&quot;, 85);
studentCourses.addCourseMark(&quot;C#&quot;, 88);
// Displaying courses and marks
studentCourses.displayCoursesAndMarks();
}
}