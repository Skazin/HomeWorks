package HomeWork4;


import java.util.*;

public class DataContainer <T> {

    private T[] data;

    public DataContainer (T[] data){
        this.data = data;
    }

    public T[] getItems() {
        return data;
    }

    /**
     * метод добавляет данные в первую свободную ячейку массива
     * @param item значение передаваемое в массив для хранения
     * @return возвращает позицию, на которую был добавлен item
     */
    public int add(T item) {
        int a = 0;
        if (item == null)
            return -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }

        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        a = data.length - 1;

        return a;}
    
    public T get(int index){
        if(index >= data.length)
            return null;
        return data[index];
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                System.out.print("null; ");
            } else{
                System.out.print(data[i].toString() + "; ");
            }
        }
        System.out.println("");
    }

    /**
     * метод удаляет указанную ячейку
     * @param index номер ячейки
     * @return true, если ячейка удалена успешно, false, если нет
     */
    public boolean delete(int index) {
        if(index >= data.length || index < 0) return false;
        List<T> data1 = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            data1.add(data[i]);
        }
        data1.remove(index);
        for (int j = 0; j < data1.size(); j++) {
            data[j] = data1.get(j);
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    /**
     * метод удаляет указанную ячейку
     * @param item содержимое ячейки
     * @return true, если ячейка удалена успешно, false, если нет
     */
    public boolean delete(T item) {
        if(item == null) return false;
        for (int i = 0; i < data.length; i++) {
            if(item.equals(data[i])) return delete(i);
        }
        return false;
    }



    @Override
    public String toString() {
        String newString = "\"";
        boolean comma = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null){
                if (comma) newString += ", ";
                else comma = true;
                newString += data[i].toString();
            }

        }
        newString += "\"";
        return newString;
    }

    public void sort (Comparator <T> comparator){
        for (int out = data.length - 1; out >= 1; out--) {

            for (int in = 0; in < out; in++) {

                if (comparator.compare(data[in], data[in + 1]) > 0) {
                    T p = data[in];
                    data[in] = data[in + 1];
                    data[in + 1] = p;
                }
            }
        }
    }
}
