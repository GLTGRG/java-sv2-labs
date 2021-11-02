package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupMain {

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();

        List<String> students = new ArrayList(Arrays.asList("Red Roselyn", "Wren Zane", "Jasmin Charis", "Bryant Esta", "Will Dyan"));

        studyGroup.printStudyGroups(students);
    }
}
