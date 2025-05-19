package lesson09.code.studentWithGroup;

public class Group {

    private String groupName;
    private String startDate;
    private int studentCount;


    public Group(String groupName, String startDate, int studentCount) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "Группа: " + groupName + ", \n" +
                "начало обучения: " + startDate + ", \n" +
                "количество студентов: " + studentCount +
                '}';
    }
}
