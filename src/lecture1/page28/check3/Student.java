package lecture1.page28.check3;

import java.util.LinkedList;
import java.util.Queue;

public class Student {
    Queue queue = new LinkedList();

    public void registerCourse(Course course){
        queue.add(course);
    }

    public void dropCourse(Course course){}
}
