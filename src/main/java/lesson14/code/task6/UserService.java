package lesson14.code.task6;

import lesson11.code.ifStatement.UserInputStatic;

public class UserService {

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

        while (!checkResult) {
            userdata = UserInputStatic.inputText("Введите " + fieldName + ":");

            switch (fieldName) {
                case "имя пользователя":
                    checkResult = checkUsername(userdata);
                    break;
                case "пароль":
                    checkResult = checkPassword(userdata);
                    break;
                case "email":
                    checkResult = checkEmail(userdata);
                    break;
                case "описание":
                    checkResult = checkDescription(userdata);
                    break;
            }

            if (!checkResult) {
                System.out.println("Введенное " + fieldName + " не соответствует формату. Повторите ввод.");
            }
        }

        return userdata;

    }

    private boolean checkUsername(String username) {

        if (username.isBlank() || username.length() < 3) {
            return false;
        }

        return true;
    }

    private boolean checkPassword(String password) {

        if (password.isBlank() || password.length() < 8) {
            return false;
        }

        return true;
    }

    private boolean checkEmail(String email) {
        // проверяем, что строка не пустая
        if (email.isBlank()) {
            return false;
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

        boolean checkResult = atIndex > 0 && dotIndex > atIndex +1 && dotIndex < email.length() - 1;

        return checkResult;

    }

    private boolean checkDescription(String description) {

        if (description.length() > 25) {
            return false;
        }

        return true;
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
