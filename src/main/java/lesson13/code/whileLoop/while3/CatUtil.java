package lesson13.code.whileLoop.while3;

import lesson11.code.ifStatement.UserInputStatic;

public class CatUtil {

    public Cat createCat(int catCounter){
        String catName = UserInputStatic.inputText("Введите имя кошки для регистрации в журнале под номером " + catCounter + " : ");
        Cat cat = new Cat(catName);
        return cat;
    }
}
