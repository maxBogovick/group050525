package lesson14.code.task7;

import lesson11.code.ifStatement.UserInputStatic;

public class UserServiceWithValidationResult {

    public User createNewUser() {

        String username = inputUserData("имя пользователя");
        String password = inputUserData("пароль");
        String email = inputUserData("email");
        String description = inputUserData("описание");

        return new User(username, password, email, description);

    }


    private String inputUserData(String fieldName) {

        boolean checkResult = false;
        String userdata = "";
        ValidationResult validationResult = null;

        while (!checkResult) {
            userdata = UserInputStatic.inputText("Введите " + fieldName + ":");

           validationResult = validate(fieldName,userdata);

            if (validationResult.getCodeError() == 200) {
                checkResult = true;
            } else {
                System.out.println("Введенное " + fieldName + " не соответствует формату.");
                System.out.println(validationResult.getErrorDescription() + " Повторите ввод данных.");
            }
        }

        return userdata;

    }

    private ValidationResult validate(String fieldName, String userdata){

        switch (fieldName) {
            case "имя пользователя":
                return InputDataValidation.checkUsername(userdata);
            case "пароль":
                return InputDataValidation.checkPassword(userdata);
            case "email":
                return InputDataValidation.checkEmail(userdata);
            case "описание":
                return InputDataValidation.checkDescription(userdata);
        }
        return null;
    }
}
