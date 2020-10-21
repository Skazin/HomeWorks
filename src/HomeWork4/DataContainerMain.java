package HomeWork4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer <Object> data1 = new DataContainer<>();

        data1.add(33);
        data1.add(null);
        data1.add(39);
        data1.add(39);
        data1.add(34);
        data1.add(36);
        data1.add(777);
        data1.add(38);
        data1.add(40);
        data1.print();
        System.out.println(data1.get(2));
        System.out.println(data1.delete((Object) 777));
        data1.print();
        System.out.println(data1.toString());
    }
}
