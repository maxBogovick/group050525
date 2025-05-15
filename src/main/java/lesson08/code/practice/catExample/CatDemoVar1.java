package lesson08.code.practice.catExample;

public class CatDemoVar1 {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Barsik",4);

        System.out.println(catBarsik);

        System.out.println("Сегодня у мое питомца день рождения!");
        // с помощью setter для поля age обновим (запишем новое) значение
        catBarsik.setAge(catBarsik.getAge() + 1);
        // абсолютно аналогично действию:
//        int catAge = catBarsik.getAge();
//        catBarsik.setAge(catAge + 1);


        System.out.println(catBarsik);


        Cat catMurzik = new Cat("Murzik",2);
        System.out.println(catMurzik);

        System.out.println("Сегодня у мое питомца день рождения!");

        catMurzik.setAge(catMurzik.getAge() + 1);

        System.out.println(catMurzik);
    }
}
