import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Нурмухаммед", "Медетов", "муж", LocalDate.of(2021, 9, 1), new University("КГТУ", "Кыргызстан", LocalDate.of(1972, 1, 5)));
        Student student2 = new Student("Нуркамил", "Камчыбеков", "муж", LocalDate.of(2022, 9, 2), new School("СШ", "Кыргызстан", LocalDate.of(1972, 1, 5)));
        Student student3 = new Student("Нурислам", "Тойгонбаев", "муж", LocalDate.of(2020, 9, 3), new College("КГТУ", "Корея", LocalDate.of(1972, 1, 5)));
        Student student4 = new Student("Нур", "Алибеков", "муж", LocalDate.of(2022, 9, 1), new School("Сапат", "Турция", LocalDate.of(1972, 1, 5)));
        Student student5 = new Student("Нурбек", "Кутчубаев", "муж", LocalDate.of(2023, 9, 4), new School("Кут Билим", "Кыргызстан", LocalDate.of(1972, 1, 5)));
        Student student6 = new Student("Нуржан", "Шайдылдаева", "муж", LocalDate.of(2019, 9, 1), new University("Auca", "Америка", LocalDate.of(1972, 1, 5)));
        Student student7 = new Student("Айзат", "Тендикова", "жен", LocalDate.of(2022, 9, 15), new University("Ala-Too", "Кыргызстан", LocalDate.of(1972, 1, 5)));
        Student student8 = new Student("Айбек", "Турдакунов", "муж", LocalDate.of(2023, 9, 1), new College("МУК", "Россия", LocalDate.of(1972, 1, 5)));
        Student student9 = new Student("Ажыбек", "Садыбакасов", "муж", LocalDate.of(2019, 9, 13), new School("LG", "Казакстан", LocalDate.of(1972, 1, 5)));
        Student student10 = new Student("Искакбек", "Турдумамбетов", "муж", LocalDate.of(2018, 9, 1), new School("КГТУ", "Кыргызстан", LocalDate.of(1972, 1, 5)));
        Student[] students = {student1, student2, student3, student6, student4, student5, student7, student8, student9, student10};

        student1.getStudentsEducationCenter();
        student2.getStudentsEducationCenter();
        student3.getStudentsEducationCenter();
        student4.getStudentsEducationCenter();
        student5.getStudentsEducationCenter();
        student6.getStudentsEducationCenter();
        student7.getStudentsEducationCenter();
        student8.getStudentsEducationCenter();
        student9.getStudentsEducationCenter();
        student10.getStudentsEducationCenter();
        System.out.println("_-----------------------------------------------------------------------------------");
        student1.getStudentsStudyingYear();
        student2.getStudentsStudyingYear();
        student3.getStudentsStudyingYear();
        student4.getStudentsStudyingYear();
        student5.getStudentsStudyingYear();
        student6.getStudentsStudyingYear();
        student7.getStudentsStudyingYear();
        student8.getStudentsStudyingYear();
        student9.getStudentsStudyingYear();
        student10.getStudentsStudyingYear();
        System.out.println("------------------------------------------------------------------");
        getinfo(students);


    }

    public static void getinfo(Student[] students) {
        for (Student student : students) {
            System.out.println(Arrays.toString(students));

        }

    }
}
