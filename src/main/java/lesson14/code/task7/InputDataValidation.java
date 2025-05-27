package lesson14.code.task7;

public class InputDataValidation {


    static ValidationResult checkUsername(String username) {

        int errorCode = 200;
        String errorDescription = "";

        if (username.isBlank()) {
            errorCode = 400;
            errorDescription = errorDescription + "Имя пользователя не может быть пустым или состоять только из пробелов \n";
        }

        if (username.length() < 5) {
            errorCode = 400;
            errorDescription = errorDescription + "Имя пользователя не может быть менее пяти символов\n";
        }

        if (checkStringContainsSpaces(username)) {
            errorCode = 400;
            errorDescription = errorDescription + "Имя пользователя не может содержать пробелы\n";
        }

        return new ValidationResult(errorCode, errorDescription);
    }

    static ValidationResult checkPassword(String password) {
        int errorCode = 200;
        String errorDescription = "";

        if (password.isBlank()) {
            errorCode = 400;
            errorDescription = errorDescription + "Пароль не может быть пустым или состоять только из пробелов \n";}

        if (password.length() < 8) {
            errorCode = 400;
            errorDescription = errorDescription + "Пароль не может быть менее восьми символов \n";
        }

        if (checkStringContainsSpaces(password)) {
            errorCode = 400;
            errorDescription = errorDescription + "Пароль не может содержать пробелы\n";
        }

        return new ValidationResult(errorCode, errorDescription);
    }

    static ValidationResult checkEmail(String email) {
        int errorCode = 200;
        String errorDescription = "";

        // проверяем, что строка не пустая
        if (email.isBlank()) {
            errorCode = 400;
            errorDescription = errorDescription + "Email не может быть пустым или состоять только из пробелов/n";
        }

        if (checkStringContainsSpaces(email)) {
            errorCode = 400;
            errorDescription = errorDescription + "Email не может содержать пробелы \n";
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
            errorCode = 400;
            errorDescription = errorDescription + "Формат введенных данных не соответствует стандарту адреса электронной почты name@company.com\n";
        }


        return new ValidationResult(errorCode,errorDescription);

    }

    static ValidationResult checkDescription(String description) {

        if (description.length() > 25) {
            return new ValidationResult(400,"Длина описания не должна превышать 25 символов");
        }

        return new ValidationResult(200,"");
    }

    private static boolean checkStringContainsSpaces(String stringForCheck) {
        return stringForCheck.contains(" ");
    }





}
