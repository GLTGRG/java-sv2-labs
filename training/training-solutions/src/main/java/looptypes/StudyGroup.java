package looptypes;

import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students){
        for (String names: students){
            if (names.length() <= 10){
                System.out.println(names + " group 1!");
            } else {
                System.out.println(names + " group 2!");
            }
        }
    }

}
