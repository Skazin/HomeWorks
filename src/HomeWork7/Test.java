package HomeWork7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        printRates(new NBRBLoader());

        String fileSeparator = File.separator;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь для сохранения:");
        String name = in.nextLine();
        in.close();
        String path = "";


        if(name.length() != 0){
            path = name;
        }else {
            path ="HomeWork" + fileSeparator + "src" + fileSeparator + "HomeWork7";
        }

        try {
            File file = new File(path + fileSeparator + "ExchangeRates.txt");
            String exchangeRate = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.EUR));
            String text = "Курс выбранной валюты (" + SiteLoader.Currency.EUR + ") = " + exchangeRate;

            if (!file.exists())
                file.createNewFile();

            FileWriter fw;
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));

    }
}
