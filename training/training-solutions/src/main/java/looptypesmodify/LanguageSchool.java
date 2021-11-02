package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Lisa Watson");
        Student student2 = new Student("Eric Perry");
        Student student3 = new Student("Richard Thompson");
        Student student4 = new Student("Scott Cooper");
        Student student5 = new Student("Louise Peterson");
        Student student6 = new Student("Henrietta Foster");
        Student student7 = new Student("Megan Lindsey");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        System.out.println(students.size());

        student1.setActive(false);
        student3.setActive(false);
        student5.setActive(false);
        student7.setActive(false);

        List<Student> graduatedStudents = new ArrayList<>();
        for (Student s : students){
            if (s.isActive() == false){
                graduatedStudents.add(s);
            }
        }
        students.removeAll(graduatedStudents);
        System.out.println(students.size());
    }
}

// megjegyzés magamnak: találj ki jobb elnevezéseket!