/**
 * Student
 */
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private double grade;
    private String fieldOfStudy;

    // Constructor
    public Student() {
        this.grade = 0; //grade should be zero when the object created because every student has diffrent grades
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() >= 7) { // id should be at least 7 digits
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
    public void printStudentInfo(Student obj) {
        System.out.println(obj.getFirstName() + " " + obj.getLastName() + "\nID: " + obj.getId() + "\nGrade: " +
                obj.getGrade() + "\nfield of study: " + obj.getFieldOfStudy());
        System.out.println("######################################");
    }
}