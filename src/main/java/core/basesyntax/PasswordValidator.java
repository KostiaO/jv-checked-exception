package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null
                || repeatPassword == null
                || !password.equals(repeatPassword)
                || password.length() + repeatPassword.length() < 20
        ) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
