import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        for(int i = 2; i<100; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);//вывод простых чисел
            }
        }
    }
    public static boolean isPrime(int n) { //функция проверки для каждого i
        boolean a = true;
        for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    a = false;
                }
        }
        return a;
    }
}