package operators;

public class Operators {

    public String numberInBinary(int number){
        return Integer.toString(number,2);
    }

    public boolean isEven(int n){
        return n%2==0;
    }

    public String getResultOfDivision(int number, int divisor){
        return number + "/" + divisor + " = " + (number/divisor) +  " maradék: " + (number%divisor);
    }

    public String isNull(String s){
        return s==null? "Null értékű!":"NEM Null értékű!";
    }

    public boolean isEmpty(String s){
        return s==null||s.equals("");
    }
}
