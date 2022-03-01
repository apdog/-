import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sr();
    }

    public static void Sr () {
        Scanner in = new Scanner(System.in);
        String name1 = "Влад Топалов";
        String name2 = in.nextLine();
        while (name1.equalsIgnoreCase(name2)) {
            System.out.println("Имя занято! Введите другое имя.");
            name2 = in.nextLine();
        }
        System.out.println("Поздравляю с присвоением имени! \nВаше имя имеет длину в " + name2.length() + " символов(а).");
    }

}
