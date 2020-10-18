package HomeWork1;

public class HomeWork14 {

    public static void main(String[] args) {

       boolean sleep = sleepIn(false, true);
       if (sleep) System.out.println("Спим дальше");
       else System.out.println("Пора на работу");

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;}
        else {
            return false;}
    }

}