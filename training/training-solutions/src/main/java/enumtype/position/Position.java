package enumtype.position;

public enum Position {

    SENIORMANGER(1_500_000,"car, laptop, phone"), MANAGER(1_000_000, "car, laptop, phone"),
    TEAMLEADER(500_000, "laptop, phone"), EMPLOYEE(250_000, "phone");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
