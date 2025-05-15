package lesson08.code.practice.catExample;

public class CatService {

    public void catBirthday(Cat localCat){
        System.out.println("Сегодня у мое питомца день рождения!");
        localCat.setAge(localCat.getAge() + 1);

    }
}
