import java.util.HashMap;
import java.util.Map;
public class StudentCourses {
private Map&lt;String, Integer&gt; courseMarks = new HashMap&lt;&gt;();
public void addCourseMark(String courseName, int mark) {
courseMarks.put(courseName, mark);
}
public void displayCoursesAndMarks() {
System.out.println(&quot;Courses and Marks:&quot;);
for (Map.Entry&lt;String, Integer&gt; entry : courseMarks.entrySet()) {
System.out.println(&quot;Course: &quot; + entry.getKey() + &quot;, Marks: &quot; + entry.getValue());
}
}
}
