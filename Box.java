package JavaCore2022.lesson_3;

import java.util.ArrayList;
    public class Box {
        // для хранения фруктов внутри коробки использовуем ArrayList
        private ArrayList<Fruit> product = new ArrayList<>();

        public Box() {
            ArrayList<Fruit> product = new ArrayList<>();
        }

        // метод возвращает общий вес коробки
        public double getWeight() {
            double sumWeightProducts = 0.0f;
            for (Fruit e : product) {
                sumWeightProducts += e.getWeight();
            }
            return sumWeightProducts;
        }

        // предоставляется доступ к ArrayList продуктов которые в коробке
        public ArrayList<Fruit> getProduct() {

            return product;
        }

        // добавляем в коробку один элемент
        public void add(Fruit fruit) throws BoxException {
            if (product.size() > 1) {
                if (isProductsComparable(fruit)) {
                    throw new BoxException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
                }
            }
            product.add(0, fruit);
        }

        // сравневаем две коробоки по весу
        public boolean compare(Box other) {
            // согласно условия результат работы данного метода true - если массы равны false - если не равны.
            return Math.abs(getWeight() - other.getWeight()) < 0.0001;
        }

        public void shiftSingleItem(Box box2) throws BoxException {
            // проверка на сопоставимость наполнения коробок
            if (isProductsComparable(box2)) {
                throw new BoxException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
            }
            for (int i = product.size() - 1; i >= 0; i--) {
                box2.getProduct().add(product.get(i));
                product.remove(i);
            }
        }

        // определяем сопоставимы ли продукты по типу в коробке и вне ее.
        public boolean isProductsComparable(Box otherBox) {
            return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
        }

        // Перегруженный метод
        public boolean isProductsComparable(Fruit fruit) {
            return product.get(0).getClass() != fruit.getClass();
        }

    }
