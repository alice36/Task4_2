import java.util.Scanner;

public class MathQuiz {
    Scanner input = new Scanner(System.in);
    boolean question1(){
        System.out.println("Podaj wynik mnozenia 3*5 ");
        int odp = input.nextInt();
        return odp ==15;
    }
    boolean question2(){
        System.out.println("Podaj pole kwadratu o boku 12 ");
        int odp = input.nextInt();
        return odp ==144;
    }
    boolean question3(){
        System.out.println("Podaj pierwiastek kwadratowy z liczby 15129 ");
        int odp = input.nextInt();
        return odp ==123;
    }
    void close(){
        input.close();
    }
}
