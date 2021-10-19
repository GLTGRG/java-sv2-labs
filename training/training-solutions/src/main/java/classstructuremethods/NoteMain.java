package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Gergő Galát");
        note.setTopic("part of a lyrics");
        note.setText("We are getting old now but I do not feel it I say you are beautiful and I still mean it...");
        System.out.println(note.getNoteText());
    }
}
