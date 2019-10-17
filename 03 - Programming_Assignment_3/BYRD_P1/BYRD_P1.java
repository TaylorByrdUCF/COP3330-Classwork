import java.util.Scanner;
import java.security.SecureRandom;

public class BYRD_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        SecureRandom Rand = new SecureRandom();
        int bound;
        while (repeat) {
            int correct_answers = 0;

            System.out.printf("Select your difficult level from Easy to Hard: (1 - 4)\n");
            int difficulty = in.nextInt();
            switch (difficulty){
                case 1:
                    bound = 10;
                    break;
                case 2:
                    bound = 100;
                    break;
                case 3:
                    bound = 1000;
                    break;
                case 4:
                    bound = 10000;
                    break;
                default:
                    System.out.printf("Input invalid. Setting Difficulty to 1.\n");
                    bound = 10;
                    break;
            }
            System.out.printf("Pick a number for a method of study: \n1. Addition \n2. Multiplication \n3. Subtraction\n4. Division \n5. All\n");
            int method = in.nextInt();
            System.out.printf("Questions: \n");

            for (int counter = 0; counter < 10; counter++) {
                int n1, n2;
                n1 = Rand.nextInt( bound ) + 1;
                n2 = Rand.nextInt( bound ) + 1;
                switch (method){
                    case 1:
                        if(addition(n1, n2)){
                            correct_answers++;
                        }
                        break;
                    case 2:
                        if(multiplication(n1, n2)){
                            correct_answers++;
                        }
                        break;
                    case 3:
                        if(subtraction(n1, n2)){
                            correct_answers++;
                        };
                        break;
                    case 4:
                        if(division(n1, n2)){
                            correct_answers++;
                        };
                        break;
                    case 5:
                        int random_method = Rand.nextInt(4 + 1 );
                        switch (random_method){
                            case 1:
                                if(addition(n1, n2)){
                                    correct_answers++;
                                }
                                break;
                            case 2:
                                if(multiplication(n1, n2)){
                                    correct_answers++;
                                }
                                break;
                            case 3:
                                if(subtraction(n1, n2)){
                                    correct_answers++;
                                }
                                break;
                            case 4:
                                if(division(n1, n2)){
                                    correct_answers++;
                                }
                                break;
                        }
                        break;
                }
            }




            Results(correct_answers, 10);

            System.out.println("Would you like to do this again? (Y/N)");
            char yn = in.next().charAt(0);
            repeat = (yn == 'y' || yn == 'Y') ? true : false;

        }
    }

    private static void Results(int correct_answers, int Problems) {

        double Percentage = ((double)correct_answers / Problems) * 100 ;
        System.out.printf("[------------Results------------]\n");
        System.out.printf(" Answers Correct: %9d \n Total Questions: %9d \n Percentage Correct: %2.2f%%\n\n", correct_answers, Problems, Percentage);

        if (Percentage < 75.00){
            System.out.printf("Please ask your teacher for extra help.\n");
        }
        else{
            System.out.printf("Congratulations, you are ready to go to the next level!\n\n");
        }
    }

    public static String Response(boolean correct, int type) {
        String a = "";
        if(correct) {
            switch (type) {
                case 1:
                    a = "Very good!";
                    break;
                case 2:
                    a = "Excellent!";
                    break;
                case 3:
                    a = "Nice work!";
                    break;
                case 4:
                    a = "Keep up the good work!";
                    break;
            }
        }
        else {
            switch (type){
                case 1:
                    a = "No. Please try again.";
                    break;
                case 2:
                    a = "Wrong. Try once more.";
                    break;
                case 3:
                    a = "Don't give up!";
                    break;
                case 4:
                    a = "No. Keep trying.";
                    break;
            }
        }
        return a;
    }

    public static boolean addition(int number1, int number2){
        java.util.Scanner in = new java.util.Scanner(System.in);
        java.security.SecureRandom Rand = new java.security.SecureRandom();
        System.out.printf("How much is %d plus %d?\n", number1, number2);
        double answer = in.nextDouble();
        if(Math.abs(answer - (number1 + number2)) < 0.001){
            System.out.println(Response(true, Rand.nextInt(4) + 1));
            return(true);
        }
        else{
            System.out.println(Response(false, Rand.nextInt(4) + 1));
            return(false);
        }

    }

    public static boolean multiplication(int number1, int number2){
        java.util.Scanner in = new java.util.Scanner(System.in);
        java.security.SecureRandom Rand = new java.security.SecureRandom();
        System.out.printf("How much is %d times %d?\n", number1, number2);
        double answer = in.nextDouble();
        if(Math.abs(answer - (number1 * number2)) < 0.001){
            System.out.println( Response(true, Rand.nextInt(4) + 1));
            return(true);
        }
        else{
            System.out.println(Response(false, Rand.nextInt() + 1));
            return(false);
        }
    }

    public static boolean subtraction(int number1, int number2){
        java.util.Scanner in = new java.util.Scanner(System.in);
        java.security.SecureRandom Rand = new java.security.SecureRandom();
        System.out.printf("How much is %d minus %d?\n", number1, number2);
        double answer = in.nextDouble();
        if(Math.abs(answer - (number1 - number2)) < 0.001){
            System.out.println(Response(true, Rand.nextInt(4) + 1));
            return(true);
        }
        else{
            System.out.println(Response(false, Rand.nextInt(4) + 1));
            return(false);
        }
    }

    public static boolean division(double number1, double number2){
        java.util.Scanner in = new java.util.Scanner(System.in);
        java.security.SecureRandom Rand = new java.security.SecureRandom();
        System.out.printf("How much is %.0f divided %.0f?\n", number1, number2);
        double answer = in.nextDouble();
        if(Math.abs(answer - (number1 / number2)) < 0.001){
            System.out.println(Response(true, Rand.nextInt(4) + 1));
            return(true);
        }
        else{
            System.out.println(Response(false, Rand.nextInt(4) + 1));
            return(false);
        }
    }
}


