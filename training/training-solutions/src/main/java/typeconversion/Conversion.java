package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number){
        int intNumber = (int) number;
        double doubleNumber = intNumber;
        return doubleNumber;
    }

    public byte[] convertIntArrayToByteArray(int[] number){
        byte[] bytes = new byte[number.length];
        for (int i = 0; i < number.length; i++){
            if (number[i] > 0 && number[i] < 127) {
                bytes[i]=(byte) number[i];
            } else {
                bytes[i]=-1;
            }
        }
        return bytes;
    }

    public double getFirstDecimal(double number){
        int intNumber = (int)number;
        int firstDecimal = (int)((number-intNumber)*10);
        return firstDecimal;
    }
}
