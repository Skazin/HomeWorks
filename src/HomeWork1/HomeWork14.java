package HomeWork1;

public class HomeWork14 {

    public static void main(String[] args) {

        sleepIn(true, false);

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            System.out.println("Спим дальше");
            return true;}
        else {
            System.out.println("Пора на работу");
            return false;}
    }

}