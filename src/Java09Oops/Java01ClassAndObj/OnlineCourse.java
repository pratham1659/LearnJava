package Java09Oops.Java01ClassAndObj;

class OnlineCourse {

    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    // Constructor
    OnlineCourse(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // Static method to set max capacity
    static void setMaxCapacity(int maxCapacity) {
        OnlineCourse.maxCapacity = maxCapacity;
    }

    // Method to enroll a student
    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " has been enrolled in " + courseName);
        } else {
            System.out.println("Enrollment failed. Maximum capacity reached!");
        }
    }

    // Method to unenroll a student
    void unEnrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                found = true;
                // Shift remaining students to fill the gap
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollments - 1] = null; // Remove last entry
                enrollments--;
                System.out.println(studentName + " has been unenrolled.");
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " is not enrolled in this course.");
        }
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("\nCourse Name: " + courseName);
        System.out.println("Total Enrollments: " + enrollments);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < enrollments; i++) {
            System.out.println("- " + enrolledStudents[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating an OnlineCourse object
        OnlineCourse oc = new OnlineCourse("Computer Science");

        // Enrolling students
        oc.enrollStudent("Aastha");
        oc.enrollStudent("John");
        oc.enrollStudent("Emily");

        // Display course details
        oc.displayCourseDetails();

        // Unenrolling a student
        oc.unEnrollStudent("John");

        // Display updated details
        oc.displayCourseDetails();
    }
}
