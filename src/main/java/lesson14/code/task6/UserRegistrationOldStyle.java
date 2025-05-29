package lesson14.code.task6;

import lesson11.code.ifStatement.UserInputStatic;

public class UserRegistrationOldStyle {
    public static void main(String[] args) {
        /*
        Предположим, что мы пишем код для регистрации пользователя
        и запрашиваем у него данные:
        - username
        - password
        - email
        - description

        Используя введенные данные - создать объект для их хранения

        Перед созданием экземпляра класса необходимо произвести проверку
        (валидацию) полученных данных:
        - имя пользователя не может быть пустым и не короче 3х символов
        - пароль не пустой и его длина от 8 символов и больше
        - email не пустой и обязательно содержит символ '@' и '.' причем '@' должен быть раньше
        - длина description не более 25 символов
         */

        System.out.println("Регистрация пользователя: ");

        String username = UserInputStatic.inputText("Введите имя пользователя: ");

        String password = UserInputStatic.inputText("Введите ваш пароль: ");

        String email = UserInputStatic.inputText("Введите ваш email: ");

        String description = UserInputStatic.inputText("Введите описание: ");

        User user = new User(username,password,email,description);

        System.out.println(user);
    }
}
