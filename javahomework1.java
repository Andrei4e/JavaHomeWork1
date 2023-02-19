//Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;

public class javahomework1 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите целое число n: ");
        int n = scanner.nextInt();
        
        int result = triangularNumber(n);

        System.out.print(result);
        scanner.close(); 
    }

    //метод вычисления n-го члена треугольного числа
    static int triangularNumber(int n)
    {
        int result = n * (n + 1) / 2;
        return result;
    }
}