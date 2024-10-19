import java.util.ArrayList;

public class Lab {
    private ArrayList<Student> students;
    private String teacherName;
    // The day that class is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    // Constructor
    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        // we make an array in size of maxsize
        // every roo of the array represent a student
        students = new ArrayList<>();
    }
    // getters
    // setters
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
    public void countAvgOfClass(Lab obj, int currentSize) {
        double total = 0.0;
        for (int i = 0; i < currentSize; i++) {
            ArrayList<Student> st = obj.getStudents();
            Student stu = st.get(i);
            total += stu.getGrade();
        }
        obj.setAvgGrade(total/currentSize);
    }
    public void printLabInfo(double num, Lab obj, int currentSize) {
        if (num == 1.0) {
            obj.countAvgOfClass(obj, currentSize);
        }
        else {
            obj.setAvgGrade(num);
        }
        System.out.println("Teacher name: " + teacherName + "\nDay of class: " + dayOfWeek
                + "\nMax size: " + maxSize + "\nCurrent size: " + currentSize
                + "\n Average grade of class: " + avgGrade);
    }
    public void enrollStudent(Student obj, ArrayList students) {
        students.add(obj);
    }
}