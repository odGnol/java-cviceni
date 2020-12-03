package CallMetthodFromAnotherClass;

public class Classroom {

    private String classRoomName;
    private String teacherName;

    public void setClassRoomName(String classRoomName) {
        classRoomName = classRoomName;
    }

    public String returnClassroomName() {
        return classRoomName;
    }

    public void setTeacherName(String newTeacherName) {
        teacherName = newTeacherName;
    }

    public String teacherName() {
        return teacherName();
    }
}
