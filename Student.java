/**
 * Student
 */
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private double grade;
    private String fieldOfStudy;

    // Constructor
    public Student(String firstName, String lastName, int id, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        // id should be at least 7
        this.id = id;
        this.grade = 0; //grade should be zero when the object created because every student has diffrent grades
        this.fieldOfStudy = fieldOfStudy;
    }
    // getters
    //setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 7) {
            this.id = id;
        }
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    // Methods
    public void printStudentInfo() {
        System.out.println(firstName + " " + lastName + "\nID: " + id + "\nGrade: " + grade);
    }
}