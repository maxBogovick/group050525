package lesson09.code.metodsWithReturnReference;

public class ManagerDemoWithReference {
    public static void main(String[] args) {

        ManagerService managerService = new ManagerService();

        Manager manager1 = managerService.createManager();

        System.out.println(manager1);

        Manager manager2 = managerService.createManager();

        System.out.println(manager2);


        Manager manager3 = managerService.createManager();

        System.out.println(manager3);



    }
}
