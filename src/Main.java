import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int studentAge = 15;
//        double studentGpa = 3.14;
//        char firstName = 'M';
//        char lastName= 'K';
//        boolean hasPerfectAttendance = true;
//
//        String studentName = "Some Name ";
//
//        char studentFirstNameLetter = studentName.charAt(0);
//
//        char studentLastNameLetter = studentName.charAt(5);
//        System.out.println(studentFirstNameLetter);
//        System.out.println(studentLastNameLetter);
//
//        System.out.println(studentName + " has a gpa of:" + studentGpa);
//
//
//        System.out.println("please update your gpa here");
//        //get input from a user
//        Scanner input = new Scanner(System.in);
//        studentGpa = input.nextDouble();
//
//        System.out.println(studentName + " has now a gpa of:" + studentGpa);

        //second example fortune teller
//        System.out.println("Pick a number between 1 and 10 ");
//        Scanner scanner = new Scanner(System.in);
//        int inputtedNumber = scanner.nextInt();
//        if (inputtedNumber < 5 ){
//            System.out.println("Enjoy the good luck a friend brings you");
//        } else {
//            System.out.println("your show selection will make you very happy");
//        }


        //third example

//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while (isOnRepeat) {
//
//            System.out.println("playing current song");
//
//            System.out.println("would you like to take this song off repeat? If so, answer yes");
//            String userInput = input.next();
//
//            if (userInput.equals("yes")) {
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("playing next song");


        //challenge

        String question = "What does CSS stands for?";
        String answerOne = "Cosco salsa salsa";
        String answerTwo = "champion source soul";
        String answerThree = "Cascade style sheet";

        String correctAnswer = answerThree;

        //write a print statement asking a question
        //write a print statement giving the choices
        System.out.println(question);
        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);

//        have the user input an answer
//        retrieve the users input

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        System.out.println(userInput);

        if (correctAnswer.equals(userInput)){
            System.out.println("correct");
        } else {
            System.out.println("try again");
        }
    }
}
