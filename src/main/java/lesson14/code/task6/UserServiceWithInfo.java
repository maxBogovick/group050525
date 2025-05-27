package lesson14.code.task6;

import lesson11.code.ifStatement.UserInputStatic;

public class UserServiceWithInfo {

    /*
      необходимо произвести проверку (валидацию) полученных данных:
        - имя пользователя не может быть пустым и не короче 3х символов
        - пароль не пустой и его длина от 8 символов и больше
        - email не пустой и обязательно содержит символ '@' и '.' причем '@' должен быть раньше
        - длина description не более 25 символов

     */

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
                    checkResultInfo = checkUsername(userdata);
                    break;
                case "пароль":
                    checkResultInfo = checkPassword(userdata);
                    break;
                case "email":
                    checkResultInfo = checkEmail(userdata);
                    break;
                case "описание":
                    checkResultInfo = checkDescription(userdata);
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

    private String checkUsername(String username) {

        if (username.isBlank()) {
            return "Имя пользователя не может быть пустым или состоять только из пробелов";
        }


        if (username.length() < 3) {
            return "Имя пользователя не может быть менее трех символов";
        }

        if (checkStringContainsSpaces(username)) {
            return "Имя пользователя не может содержать пробелы";
        }

        return "Ok";
    }

    private String checkPassword(String password) {

        if (password.isBlank()) return "Пароль не может быть пустым или состоять только из пробелов";

        if (password.length() < 8) return "Пароль не может быть менее трех символов";

        if (checkStringContainsSpaces(password)) {
            return "Пароль не может содержать пробелы";
        }

        return "Ok";
    }

    private String checkEmail(String email) {
        // проверяем, что строка не пустая
        if (email.isBlank()) return "Email не может быть пустым или состоять только из пробелов";

        if (checkStringContainsSpaces(email)) {
            return "Email не может содержать пробелы";
        }


        // находим позицию (индекс) символа '@'
        int atIndex = email.indexOf('@');

        // находим позицию (индекс) символа '.'
        int dotIndex = email.indexOf('.');

        // если индексы > 0 - это означает что эти символы присутствуют в строке
        // если этих символов нет, то метод indexOf() возвратит -1

        // проверяем: '@' не в начале (индекс > 0)
        // проверяем: между '@' и '.' есть хотя бы один символ
        // проверяем: '.' не в сомом конце (его индекс не последний)
        // при одновременном соблюдении ВСЕХ этих условий возвращаем true

        if ((atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) == false) {
            return "Формат введенных данных не соответствует стандарту адреса электронной почты name@company.com";
        }

        return "Ok";

    }

    private String checkDescription(String description) {

        if (description.length() > 25) {
            return "Длина описания не должна превышать 25 символов";
        }

        return "Ok";
    }

    private boolean checkStringContainsSpaces(String stringForCheck) {
        return stringForCheck.contains(" ");
    }

//    private String inputUsername(){
//
//        boolean checkResult = false;
//        String username = "";
//
//        while (!checkResult) {
//            username = UserInputStatic.inputText("Введите имя пользователя:");
//            checkResult = checkUsername(username);
//            if (!checkResult) {
//                System.out.println("Введенное имя пользователя не соответствует формату. Повторите ввод.");
//            }
//        }
//
//        return username;
//

//    }
//
//    private String inputPassword() {
//        boolean checkResult = false;
//        String password = "";
//
//        while (!checkResult) {
//            password = UserInputStatic.inputText("Введите имя пользователя:");
//            checkResult = checkPassword(password);
//            if (!checkResult) {
//                System.out.println("Введенное имя пользователя не соответствует формату. Повторите ввод.");
//            }
//        }
//
//        return password;

//    }


}
