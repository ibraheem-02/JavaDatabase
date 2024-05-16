 public class Student {
    private String name;
    private String rollNumber;
    private String yearOfStudying;
    private String course;

    public Student(String name, String rollNumber, String yearOfStudying, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.yearOfStudying = yearOfStudying;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getYearOfStudying() {
        return yearOfStudying;
    }

    public String getCourse() {
        return course;
    }
}
