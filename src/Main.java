import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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

    public static void playSportQuiz(int score) throws FileNotFoundException {
        File quiz = new File("\\Users\\deroc\\Desktop\\proekt\\project\\sportEng.csv");
        Scanner scanner1 = new Scanner(quiz);
        String quiz1 = "";
        String wrong1 = "";
        String wrong2 = "";
        String wrong3 = "";
        String correct = "";
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        ArrayList<Integer> randomList1 = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        for (int i = 0; i < 10; i++) {
            quiz1 = quiz1 + (scanner1.nextLine());
        }
        Random random = new Random();
        String[] questions = quiz1.split(",");
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(9) + 1;
            for (int j = 0; j < randomList.size(); j++) {
              if (randomList.get(j)==randomNum){
                    randomNum=random.nextInt(9)+1;
                }
            }
            System.out.println(questions[randomNum * 5]);
            for (int k = 0; k < 4; k++) {
                int randomNum1 = random.nextInt(3) + 1;
                for (int j = 0; j < randomList1.size(); j++) {
                    if (randomList1.get(j)==randomNum1){
                        randomNum1=random.nextInt(3)+1;
                    }
                }
                correct = questions[(randomNum * 5) + 1];
                wrong1 = questions[(randomNum * 5) + 2];
                wrong2 = questions[(randomNum * 5) + 3];
                wrong3 = questions[(randomNum * 5) + 4];
                switch (randomNum1) {
                    case 1:
                        System.out.println(correct);
                        randomList1.add(randomNum1);
                        break;
                    case 2:
                        System.out.println(wrong1);
                        randomList1.add(randomNum1);
                        break;
                    case 3:
                        System.out.println(wrong2);
                        randomList1.add(randomNum1);
                        break;
                    case 4:
                        System.out.println(wrong3);
                        randomList1.add(randomNum1);
                        break;
                }

            }
            randomList.add(randomNum);
            randomList1.clear();
            answer = scanner.nextLine();
            if (!(answer.equals(correct))) break;
            score++;
        }
        System.out.println("Good Job! Your score was:" + score + "/10");
    }

    public static void playHistoryQuiz(int score) {

    }

    public static void playVideoGamesQuiz(int score) {

    }

    public static void playPCHardwareQuiz(int score) {

    }

    public static void playGeneralKnowledgeQuiz(int score) {

    }

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
