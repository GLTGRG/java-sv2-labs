package operators;


public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.numberInBinary(13));

        System.out.println(operators.isEven(13));

        System.out.println(operators.getResultOfDivision(5,2));

        System.out.println(operators.isNull(""));
        System.out.println(operators.isNull(null));

        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty("null"));
    }
}
