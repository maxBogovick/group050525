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

            switch (fieldName) {
                case "имя пользователя":
                    validationResult = InputDataValidation.checkUsername(userdata);
                    break;
                case "пароль":
                    validationResult = InputDataValidation.checkPassword(userdata);
                    break;
                case "email":
                    validationResult = InputDataValidation.checkEmail(userdata);
                    break;
                case "описание":
                    validationResult = InputDataValidation.checkDescription(userdata);
                    break;
            }

            if (validationResult.getCodeError() == 200) {
                checkResult = true;
            } else {
                System.out.println("Введенное " + fieldName + " не соответствует формату.");
                System.out.println(validationResult.getErrorDescription() + " Повторите ввод данных.");
            }
        }

        return userdata;

    }

}
