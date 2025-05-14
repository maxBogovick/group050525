package lesson07.code.privateAndPublic.usingPrivateModoficator;

public class SuperCalculator {

    public void methodForUser(){
        // метод который создан для того чтобы его могли вызвать пользователи и получить результат
        // НО поскольку наш метод очень сложный (больший и громоздкий код), то мы модем его разбить на части
        // и их вызывать тут для получения результата

        specMethod1();
        specMethod2();
        specMethod3();

    }

    public void specMethod1(){}
    public void specMethod2(){}
    public void specMethod3(){}
}
