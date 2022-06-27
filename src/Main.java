import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Choose the quiz's language language/Избери езика на викторината:");
        String language = scanner.nextLine();
        if (language.equals("English") || language.equals("english")) {
            System.out.println("Choose the theme of the quiz by picking its' number:");
            System.out.println("1.Sport");
            System.out.println("2.World History");
            System.out.println("3.Video Games");
            System.out.println("4.PC Hardware");
            System.out.println("5.General Knowledge");
            byte theme = scanner.nextByte();
            {
                switch (theme) {
                    case 1:
                        playSportQuiz(score);
                        break;
                    case 2:
                        playHistoryQuiz(score);
                        break;
                    case 3:
                        playVideoGamesQuiz(score);
                        break;
                    case 4:
                        playPCHardwareQuiz(score);
                        break;
                    case 5:
                        playGeneralKnowledgeQuiz(score);
                        break;
                    default:
                        System.out.println("Wrong input, enter a number between 1 and 5!");
                        break;
                }
            }
        } else if (language.equals("Български") || language.equals("български")) {
            System.out.println("Избери темата на викторината като напишеш нейният номер:");
            System.out.println("1.Спорт");
            System.out.println("2.Българка История");
            System.out.println("3.Видеоигри");
            System.out.println("4.Компютърни Компоненти");
            System.out.println("5.Обща култура");
            byte theme = scanner.nextByte();
            switch (theme) {
                case 1:
                    playBulgarianSportQuiz(score);
                    break;
                case 2:
                    playBulgarianHistoryQuiz(score);
                    break;
                case 3:
                    playBulgarianVideoGamesQuiz(score);
                    break;
                case 4:
                    playBulgarianPCHardwareQuiz(score);
                    break;
                case 5:
                    playBulgarianGeneralKnowledgeQuiz(score);
                    break;
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else {
            System.out.println("Грешен език!");
        }
    }

    public static void playSportQuiz(int score) {
String correct ="";
Scanner scanner = new Scanner(System.in);
String path ="sportEng.csv";
Scanner read = new Scanner(path);
read.next();
String ans = "";
while(read.hasNext())
{
    while(ans.equals(correct)){
        Random random = new Random();
        int r = random.nextInt(4);
        String questions = read.next();
        String[] question = questions.split(",");
        correct = question[1];
        System.out.println(question[0]);
        Random random1 = new Random();
        int randomAns = random.nextInt(4);
        System.out.println(question[1]);
        System.out.println(question[2]);
        System.out.println(question[3]);
        System.out.println(question[4]);
        ans = scanner.nextLine();
        score++;
    }
    System.out.println("Your score was: "+score+"/10");
}
    }

    public static void playHistoryQuiz(int score) {

    }

    public static void playVideoGamesQuiz(int score) {

    }

    public static void playPCHardwareQuiz(int score) {

    }

    public static void playGeneralKnowledgeQuiz(int score) {

    }

    ///////
    public static void playBulgarianSportQuiz(int score) {

    }

    public static void playBulgarianHistoryQuiz(int score) {

    }

    public static void playBulgarianPCHardwareQuiz(int score) {

    }

    public static void playBulgarianVideoGamesQuiz(int score) {

    }

    public static void playBulgarianGeneralKnowledgeQuiz(int score) {

    }
}
