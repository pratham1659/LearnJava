package Java08Oops.JavaClass;


class OnlineCourse {

    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    OnlineCourse(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        OnlineCourse.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unEnrollStudents(String studentName){
        System.out.println("Students Removed");
        enrollments--;
    }
}
