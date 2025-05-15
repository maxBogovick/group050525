package lesson08.code.practice.catExample;

public class CatDemoVar2 {
    public static void main(String[] args) {

        CatService catService = new CatService();

        //----------------------------


        Cat catBarsik = new Cat("Barsik",4);

        System.out.println(catBarsik);

        catService.catBirthday(catBarsik);


        System.out.println(catBarsik);

        // -------------------------

        Cat catMurzik = new Cat("Murzik",2);
        System.out.println(catMurzik);

        catService.catBirthday(catMurzik);
        System.out.println(catMurzik);
    }
}
