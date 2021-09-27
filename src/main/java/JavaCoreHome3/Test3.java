package JavaCoreHome3;

import JavaCoreHome3.Apple;
import JavaCoreHome3.Box;
import JavaCoreHome3.Orange;

public class Test3 {
    public static void main(String[] args) {
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }
}
