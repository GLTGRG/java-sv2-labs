package chars;

public class LettersAndDigits {

        public void printLetterOrDigit(String text){
            for (char c : text.toCharArray()){
                if (Character.isAlphabetic(c)){
                    System.out.println(c + " it's a letter");
                } else if (Character.isDigit(c)){
                    System.out.println(c  + " it's a number");
                } else {
                    System.out.println(c +" other");
                }
            }
        }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        String text = "Glt92!";
        lettersAndDigits.printLetterOrDigit(text);
    }
}
