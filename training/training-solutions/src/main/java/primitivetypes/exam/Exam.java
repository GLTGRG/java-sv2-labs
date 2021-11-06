package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> alreadyApplied = new ArrayList<>();

    public List<Person> getAlreadyApplied() {
        return alreadyApplied;
    }

    public void addPerson(Person person){
        alreadyApplied.add(person);
    }
}
