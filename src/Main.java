import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                        playSportQuiz();
                        break;
                    case 2:
                        playHistoryQuiz();
                        break;
                    case 3:
                        playVideoGamesQuiz();
                        break;
                    case 4:
                        playPCHardwareQuiz();
                        break;
                    case 5:
                        playGeneralKnowledgeQuiz();
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
                    playBulgarianSportQuiz();
                    break;
                case 2:
                    playBulgarianHistoryQuiz();
                    break;
                case 3:
                    playBulgarianVideoGamesQuiz();
                    break;
                case 4:
                    playBulgarianPCHardwareQuiz();
                    break;
                case 5:
                    playBulgarianGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else {
            System.out.println("Грешен език!");
        }
    }

    public static void playSportQuiz() {

    }

    public static void playHistoryQuiz() {

    }

    public static void playVideoGamesQuiz() {

    }

    public static void playPCHardwareQuiz() {

    }

    public static void playGeneralKnowledgeQuiz() {

    }

    ///////
    public static void playBulgarianSportQuiz() {

    }

    public static void playBulgarianHistoryQuiz() {

    }

    public static void playBulgarianPCHardwareQuiz() {

    }

    public static void playBulgarianVideoGamesQuiz() {

    }

    public static void playBulgarianGeneralKnowledgeQuiz() {

    }
}
