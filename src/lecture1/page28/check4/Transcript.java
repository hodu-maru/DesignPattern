package lecture1.page28.check4;

import java.util.LinkedList;
import java.util.Queue;

public class Transcript {
    Queue students = new LinkedList();
    Queue courses = new LinkedList();

    public void addCourse(Student student,Course course){
        students.add(student);
        courses.add(course);
    }
}
