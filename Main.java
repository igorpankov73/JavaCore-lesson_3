package JavaCore2022.lesson_3;

public class Main {
    public static void main(String[] args) throws BoxException {
        //Задание №1 Написать метод, который меняет два элемента массива местами.
//        static void swapObj(Object[] array, int firstIndex, int secondIndex) {
//            Object oneVal = array[firstIndex];
//            array[firstIndex] = array[secondIndex];
//            array[secondIndex] = oneVal;
//        }

        //Задание 2
        System.out.println("Создаем коробку №1");
        // создаем коробку №1
        Box box1 = new Box();
        //кладем в нее 3 яблока
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        // проверяем сколько весит коробка №1
        System.out.println("Вес коробки №1: " + box1.getWeight());

        System.out.println("Создаем коробку №2");
        // Создаем коробку №2
        Box box2 = new Box();
        //кладем в нее 3 апельсина
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        // проверяем сколько весит коробка
        System.out.println("Вес коробки №2: " + box2.getWeight());

        System.out.println("Сравниваем две коробки");
        // сравним две коробки
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        // Проверка, а какие фрукты хранятся в каждой коробке
        System.out.println("В коробке Box1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        System.out.println("В коробке Box2 хранятся " + box2.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Создаем дополнительно коробку с яблоками №3");
        // создаем дополнительно еще одну коробку с яблоками
        Box box3 = new Box();
        //кладем в нее 5 яблока
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("В коробке Box3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        // проверяем сколько весит коробка
        System.out.println("Вес коробки №3: " + box3.getWeight());
        // пересыпаем яблоки из коробки №1 в коробку №3
        box1.shiftSingleItem(box3);

        System.out.println("Вес коробки №1 и коробки №3");
        // проверяем сколько весит коробки №1 и №3
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());
        // попытаемся положить несколько апельсинов в коробку с яблоками

        System.out.println("Добавляем несколько апельсинов в коробку");
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());

        System.out.println("Всё работает");
        // все работает
    }
}
