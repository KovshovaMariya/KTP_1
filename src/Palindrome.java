import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //объявляем сканнер
        System.out.println("Input word:");
        String n = scan.next(); //считываем введённую строку
        if (n.equals(reverseString(n))) //сравниваем введённую и обратную введённой строки
            System.out.println("Palindrome");
        else
            System.out.println("Isn`t palindrome");
    }
    public static String reverseString(String s1){//функция получения обратной строки ля введённой
        String s2 = "";
    for (int i = 0; i < s1.length(); i++){
        s2 += s1.charAt(s1.length()-i-1);
    }
    return s2;
    }
}