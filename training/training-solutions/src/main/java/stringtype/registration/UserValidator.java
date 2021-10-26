package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String userName){
        return !"".equals(userName);
    }
    public boolean isValidPassword(String password1, String password2){
        return password1.length() >= 8
                && password1.equals(password2);
    }

    public boolean isValidEmail(String email){

        int indexOfAt = email.indexOf("@");
        String domain = email.substring(indexOfAt);
        int indexOfDot = domain.indexOf(".");
        int emailLength = email.length();
        return indexOfAt > 0 && indexOfDot > 1 && indexOfDot < domain.length();


    }
}
