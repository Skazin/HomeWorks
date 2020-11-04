package HomeWork4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer[] startNumbers = {45, null};
        DataContainer <Integer> data1 = new DataContainer<>(startNumbers);
        Comparator <Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

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
        System.out.println(data1.delete((Integer) 777));
        data1.print();
        System.out.println(data1.toString());
        data1.sort(comparator);
        data1.print();
    }
}
