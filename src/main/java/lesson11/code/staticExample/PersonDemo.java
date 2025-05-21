package lesson11.code.staticExample;

public class PersonDemo {

    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga = new Person();

        personPetr.name = "Petr";
        /*
        как только мы изменили в классе Person поле town на static - то значение в этом поле
        стало не "персональным" для экземпляра класса, а стало "общим" для ВСЕХ экземпляров этого класса

        то есть переменная с модификатором static - это переменная одна на весь класс
        и доступ к ней осуществляется через обращение по имени класса, а не через экземпляр класса

        обычная переменная (не static) - у каждого объекта своя

         */
        personPetr.town = "Berlin";

        System.out.println(" ======= PETR --------");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        personOlga.name = "Olga";
        personOlga.town = "Leipzig";

        System.out.println(" ======= OLGA   --------");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);


        System.out.println(" ======= PETR --------");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


    }
}
