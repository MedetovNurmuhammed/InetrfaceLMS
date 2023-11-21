import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private  String surename;
    private  String gender;
   private LocalDate dateofstart;
   EducationCenter educationCenter;

    public Student(String name, String surename, String gender, LocalDate dateofstart, EducationCenter educationCenter) {
        this.name = name;
        this.surename = surename;
        this.gender = gender;
        this.dateofstart = dateofstart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name+" "+surename+" "+educationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println(name+" "+ surename+" "+ dateofstart);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofstart=" + dateofstart +
                ", educationCenter=" + educationCenter +
                '}';
    }
}
