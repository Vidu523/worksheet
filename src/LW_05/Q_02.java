package LW_05;
import java.util.ArrayList;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Degree: " + name +
                ", Students: " + numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        System.out.println("Courses offered by " + name + ":");
        for (Course c : coursesOffering) {
            c.displayInfo();
        }
    }
}


class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        coursesOffering = new ArrayList<>();
        lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null)
            departmentHead.displayInfo();
        else
            System.out.println("No department head assigned.");
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}


class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void displayInfo() {
        System.out.println("Course: " + name +
                ", Type: " + enrollType +
                ", Enrolled: " + numberOfStudentsEnrolled);
    }

    public String getName() {
        return name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public Integer getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge() {
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }
}


class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        coursesTeaching = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer: " + getName() +
                ", Position: " + position);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo() {
        if (department != null)
            department.displayInfo();
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        System.out.println("Courses teaching by " + getName() + ":");
        for (Course c : coursesTeaching) {
            c.displayInfo();
        }
    }
}

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        coursesEnrolled = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() +
                ", ID: " + studentID +
                ", Year: " + year);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getYear() {
        return year;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null)
            degree.displayInfo();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course c : coursesEnrolled) {
            c.displayInfo();
        }
    }
}

/* ================= MAIN ================= */
public class Q_02 {
    public static void main(String[] args) {

        Department seDept = new Department("Software Engineering");
        Degree csDegree = new Degree("Computer Science", 200);
        Course oop = new Course("Object-Oriented Programming", "Compulsory", 150);

        Lecturer lec = new Lecturer("Dr. Perera", "Senior Lecturer", seDept);
        Student stu = new Student("Kamal Silva", "SE2023001", "2nd Year");

        seDept.addLecturer(lec);
        seDept.appointDepartmentHead(lec);
        seDept.offerCourse(oop);

        csDegree.offerCourse(oop);
        oop.addDegreeBelongsTo(csDegree);
        oop.addLecturerInCharge(lec);

        lec.addCourse(oop);

        stu.registerDegree(csDegree);
        stu.enrollCourse(oop);

        System.out.println("\n--- Lecturer Info ---");
        lec.displayInfo();
        lec.displayDepartmentInfo();
        lec.listCoursesTeaching();

        System.out.println("\n--- Student Info ---");
        stu.displayInfo();
        stu.displayDegreeInfo();
        stu.listCoursesEnrolled();

        System.out.println("\n--- Department Info ---");
        seDept.displayInfo();
        seDept.displayDepartmentHeadInfo();

        System.out.println("\n--- Course Info ---");
        oop.displayInfo();

        System.out.println("\n--- Degree Info ---");
        csDegree.displayInfo();
        csDegree.listCoursesOffering();
    }
}
