package JavaCoreHome3;

public class Box<T>{
        private boolean isFree = true;
        float maxWeight = 100.0f;
        float currentWeight = 0;
        ArrayList<T> arrayList;

        void addFruit(T fruit) {
            if (currentWeight + 1 <= maxWeight) {
                arrayList.add(fruit);
                currentWeight++;
                if (arrayList.size() < 1)
                    isFree = false;
            } else
                System.out.println("Коробка заполнена");}

        float getWeight(Fruit f) {
            return arrayList.size() * f.weigth;}

        boolean compare(Fruit f1, Fruit f2) {
            if (getWeight(f1) == getWeight(f2)) {
                return true;
            } else return false;}

        public boolean compare(Box box) {
            if (currentWeight == box.currentWeight)
                return true;
            return false;
        }
    }
