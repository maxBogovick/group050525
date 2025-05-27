package lesson14.code.task7;

import lesson11.code.ifStatement.UserInputStatic;

public class UserServiceWithInfo {

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
        String checkResultInfo = "";

        while (!checkResult) {
            userdata = UserInputStatic.inputText("Введите " + fieldName + ":");

            switch (fieldName) {
                case "имя пользователя":
                    checkResultInfo = InputDataValidation.checkUsername(userdata);
                    break;
                case "пароль":
                    checkResultInfo = InputDataValidation.checkPassword(userdata);
                    break;
                case "email":
                    checkResultInfo = InputDataValidation.checkEmail(userdata);
                    break;
                case "описание":
                    checkResultInfo = InputDataValidation.checkDescription(userdata);
                    break;
            }

            if (checkResultInfo.equals("Ok")) {
                checkResult = true;
            } else {
                System.out.println("Введенное " + fieldName + " не соответствует формату.");
                System.out.println(checkResultInfo + " Повторите ввод данных.");
            }
        }

        return userdata;

    }

}
