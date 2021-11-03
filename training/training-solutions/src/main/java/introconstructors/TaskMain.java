package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
        Task task = new Task("Részletesebben az osztályokról...", "Bevezetés a konstruktorok...");

        task.setDuration(60);
        task.start();

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getDuration());
        System.out.println(task.getStartDateTime());
    }
}
