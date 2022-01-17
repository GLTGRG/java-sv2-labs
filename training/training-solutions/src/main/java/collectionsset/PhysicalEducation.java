package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> orderInLessons = new TreeSet<>();
        for (Student student : students) {
            orderInLessons.add(student.getHeight());
        }
        return orderInLessons;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Soma Demeter", 153));
        students.add(new Student("Erik Léna", 165));
        students.add(new Student("Sarolta Rudi", 152));
        students.add(new Student("Dénes Lénárd", 172));
        students.add(new Student("Melinda Kelemen", 170));

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
