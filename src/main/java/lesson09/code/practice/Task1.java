package lesson09.code.practice;

public class Task1 {

        public static void main(String[] args) {
            // Создаем категории товаров
            Category electronics = new Category("Электроника", "Устройства и гаджеты");
            Category clothing = new Category("Одежда", "Одежда и аксессуары");

            // Создаем товары
            Product phone = new Product("Смартфон", electronics, 499.99, 20);
            Product laptop = new Product("Ноутбук", electronics, 999.99, 15);
            Product tShirt = new Product("Футболка", clothing, 19.99, 50);

            // Вывод информации о товарах
            phone.printProductInfo();
            laptop.printProductInfo();
            tShirt.printProductInfo();
        }
    }

