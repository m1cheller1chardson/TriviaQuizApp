package TriviaQuizApp;

import TriviaQuizApp.Models.Questions;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.logic();

    }
}

class Quiz{

    String incorrectAnswerFace = "(╯︿╰；)";
    String correctAnswerFace = "〵(^ o ^) /";

    //Nothing to see here
    String peekingCat = "\n" +
            "──────▄▀▄─────▄▀▄\n" +
            "─────▄█░░▀▀▀▀▀░░█▄\n" +
            "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
            "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█";

    String nyanCat = "\n" +
            "───────────────────────────────────────\n" +
            "───▐▀▄───────▄▀▌───▄▄▄▄▄▄▄─────────────\n" +
            "───▌▒▒▀▄▄▄▄▄▀▒▒▐▄▀▀▒██▒██▒▀▀▄──────────\n" +
            "──▐▒▒▒▒▀▒▀▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄────────\n" +
            "──▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▒▒▒▒▒▒▒▒▀▄──────\n" +
            "▀█▒▒▒█▌▒▒█▒▒▐█▒▒▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────\n" +
            "▀▌▒▒▒▒▒▒▀▒▀▒▒▒▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐───▄▄\n" +
            "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌▄█▒█\n" +
            "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒█▀─\n" +
            "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▀───\n" +
            "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌────\n" +
            "─▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐─────\n" +
            "─▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────\n" +
            "──▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐──────\n" +
            "──▐▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▌──────\n" +
            "────▀▄▄▀▀▀▀▀▄▄▀▀▀▀▀▀▀▄▄▀▀▀▀▀▄▄▀────────";
    Scanner scanner = new Scanner(System.in);

    public void logic(){

        //Create question objects and fill answers
        //Create map || KEY (question) VALUE (answers)
        //Questions
        Questions q1 = new Questions(" Which of these peppers is hotter than the rest?",
                "a) Habanero", "b) Carolina Reaper", "c) Scotch Bonnet");
        Questions q2 = new Questions(" What is the hottest planet in our solar system?",
                "a) Neptune", "b) Venus", "c) Mars");
        Questions q3 = new Questions(" Which is the first astrological sign in the zodiac?",
                "a) Pisces", "b) Aries", "c) Capricorn");
        Questions q4 = new Questions(" Which ingredient is not part of a McDonald's Big Mac?",
                "a) Onions", "b) Lettuce", "c) Tomato");
        Questions q5 = new Questions(" How many top friends could you have on MySpace?",
                "a) Six", "b) Eight", "c) Ten");
        Questions q6 = new Questions(" How many flats are in the key of c minor?",
                "a) 1", "b) 2", "c) 3");
        Questions q7 = new Questions(" Which of the following periodic elements is not real?",
                "a) Xenon", "b) Palladium", "c) Vibranium");
        Questions q8 = new Questions(" What family is Juliet from in 'Romeo & Juliet'?",
                "a) Malvolio", "b) Capulet", "c) Montague");
        Questions q9 = new Questions(" Which of the following does NOT grow on a tree?",
                "a) Eggplant", "b) Olive", "c) Avocado");
        Questions q10 = new Questions(" What are the string names on a viola? (pitch ascending)",
                "a) C G D A", "b) G C D A", "c) G D A E");

        //CHARACTERS - a) b) c) d)
        Map<Questions, Character> questionAnswerMap = new HashMap<>();
        questionAnswerMap.put(q1, 'b');
        questionAnswerMap.put(q2, 'b');
        questionAnswerMap.put(q3, 'b');
        questionAnswerMap.put(q4, 'c');
        questionAnswerMap.put(q5, 'b');
        questionAnswerMap.put(q6, 'c');
        questionAnswerMap.put(q7, 'c');
        questionAnswerMap.put(q8, 'b');
        questionAnswerMap.put(q9, 'a');
        questionAnswerMap.put(q10, 'a');

        //Score
        int totalScore = 0;

        //APP START
        //START quiz
        System.out.println(peekingCat);
        System.out.println("Welcome to the trivia quiz!");
        System.out.println("Press enter to begin.");
        String response = scanner.nextLine();

        //Loop through map to return every question and option to the user
        for(Map.Entry<Questions, Character> map :questionAnswerMap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());

            //SCANNER
            Character answer = scanner.next().charAt(0);

            //.compare - compares characters numerically
            int currentAnswer = Character.compare(answer, map.getValue());



            //RETURN answer
            System.out.println();
            System.out.println("Your answer: " + answer);
            System.out.println();

            //RETURN correct or incorrect
            if(currentAnswer == 0){
                System.out.println("-----------------------------------------");
                System.out.println("Correct!");
                System.out.println(correctAnswerFace);
                System.out.println();
                System.out.println("-----------------------------------------");
                //Add score if correct
                totalScore += 1;
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("Incorrect.");
                System.out.println(incorrectAnswerFace);
                System.out.println();
                System.out.println("The answer was: " + map.getValue());
                System.out.println();
                System.out.println("-----------------------------------------");
            }

        }
        //RETURN total score back to the user
        System.out.println(nyanCat);
        System.out.println("-----------------------------------------");
        System.out.println("Your score: " + totalScore + "/10");
        System.out.println("Great job!");
        System.out.println("-----------------------------------------");
    }

}