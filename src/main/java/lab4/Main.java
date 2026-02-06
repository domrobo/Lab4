package lab4;
import java.util.Arrays;
import java.util.Comparator;
import typesPackage.*;


public class Main {
    public static void main(String[] args) {
        Furniture[] items = new Furniture[] {
            new Furniture(new Word("Стіл"), new Word("Дуб"), 2500.0, 15, new Word("Коричневий")),
            new Furniture(new Word("Стілець"), new Word("Power and Motivation"), 500.0, 3, new Word("Білий")),
            new Furniture(new Word("Шафа"), new Word("МДФ"), 8000.0, 45, new Word("Чорний"))
        };

        Arrays.sort(items,Comparator.comparingDouble(Furniture::getPrice));
        linesOut(items);

        System.out.println("Reverse sorted: ");

        Arrays.sort(items, Comparator.comparing(Furniture::getName).reversed());


        linesOut(items);

        Furniture neededObj = new Furniture(new Word("Стілець"),
                new Word("Power and Motivation"),
                500.0, 3, new Word("Білий"));
        for (Furniture item: items){
            if (neededObj.equals(item))
                System.out.println(item + "is equal to " + "\n" + neededObj);
        }

    }
    public static void linesOut(Furniture[] items){
        for (Furniture f : items) {
            System.out.println(f);
        }
    }
}
