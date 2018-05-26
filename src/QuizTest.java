public class QuizTest {

    public static void main(String[] args) {
        int result = 0;
        MathQuiz mathQuiz = new MathQuiz();

        boolean answer1 = mathQuiz.question1();
        System.out.println(answer1);
        if (answer1 == true){result++;}

        boolean answer2 = mathQuiz.question2();
        System.out.println(answer2);
        if (answer2 == true){result++;}

        boolean answer3 = mathQuiz.question3();
        System.out.println(answer3);
        if (answer3 == true){result++;}

        mathQuiz.close();

        System.out.println("Twój wynik: " + result + "/3");
    }
}
