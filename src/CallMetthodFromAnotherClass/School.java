package CallMetthodFromAnotherClass;

import java.util.ArrayList;

public class School {

    private ArrayList<String> classrooms;
    private String classRoomName;
    private String teacherName;

    public School() {
        classrooms = new ArrayList<String>();
    }

    public void addClassroom(String newClassRoom, String theClassRoomName) {
        classrooms.add(newClassRoom);
        classRoomName = theClassRoomName;
    }
}
