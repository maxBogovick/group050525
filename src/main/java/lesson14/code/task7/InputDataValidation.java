package lesson14.code.task7;

public class InputDataValidation {


    static String checkUsername(String username) {

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

    static String checkPassword(String password) {

        if (password.isBlank()) return "Пароль не может быть пустым или состоять только из пробелов";

        if (password.length() < 8) return "Пароль не может быть менее трех символов";

        if (checkStringContainsSpaces(password)) {
            return "Пароль не может содержать пробелы";
        }

        return "Ok";
    }

    static String checkEmail(String email) {
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

    static String checkDescription(String description) {

        if (description.length() > 25) {
            return "Длина описания не должна превышать 25 символов";
        }

        return "Ok";
    }

    private static boolean checkStringContainsSpaces(String stringForCheck) {
        return stringForCheck.contains(" ");
    }





}
