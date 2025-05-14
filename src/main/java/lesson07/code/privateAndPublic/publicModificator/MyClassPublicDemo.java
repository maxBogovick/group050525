package lesson07.code.privateAndPublic.publicModificator;

import lesson07.code.privateAndPublic.publicModificator.nextLevelPackage.MyClassPublic;

public class MyClassPublicDemo {
    public static void main(String[] args) {
        MyClassPublic myClassPublic = new MyClassPublic();

        myClassPublic.field1 = "значение поля";

    }
}
