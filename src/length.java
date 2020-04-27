import java.util.Scanner;
public class length {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу 1: ");
        String phrase1 = scanner.nextLine();
        System.out.print("Введите фразу 2: ");
        String phrase2 = scanner.nextLine();
        int len1=phrase1.length();
        int len2=phrase2.length();
       if (len1>len2)
       {
           System.out.print("Большая строка: " + phrase1);
       }
       else if (len1<len2)
       {
           System.out.print("Большая строка: " + phrase2);
       }
       else System.out.print("Строки равны");

    }

}

