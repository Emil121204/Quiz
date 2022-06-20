import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the quiz's language language/Избери езика на викторината:");
        String language = scanner.nextLine();
        if (language.equals("English") || language.equals("english")) {
            chooseDiff();
        } else if (language.equals("Български") || language.equals("български")) {
            chooseBulgarianDiff();
        } else {
            System.out.println("Грешен език!");
        }
    }

    public static void chooseDiff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your difficulty: ");
        System.out.println("Easy/Medium/Hard");
        String diff = scanner.nextLine();
        System.out.println("Choose the theme of the quiz:");
        System.out.println("1.Sport");
        System.out.println("2.World History");
        System.out.println("3.Video Games");
        System.out.println("4.PC Hardware");
        System.out.println("5.General Knowledge");
        byte theme = scanner.nextByte();
        if (diff.equals("Easy") || diff.equals("easy")) {
            switch (theme) {
                case 1:
                    playEasySportQuiz();
                    break;
                case 2:
                    playEasyHistoryQuiz();
                    break;
                case 3:
                    playEasyVideoGamesQuiz();
                    break;
                case 4:
                    playEasyPCHardwareQuiz();
                    break;
                case 5:
                    playEasyGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Wrong input, enter a number between 1 and 5!");
                    break;
            }
        } else if (diff.equals("Normal") || diff.equals("normal")) {
            switch (theme) {
                case 1:
                    playNormalSportQuiz();
                    break;
                case 2:
                    playNormalHistoryQuiz();
                    break;
                case 3:
                    playNormalVideoGamesQuiz();
                    break;
                case 4:
                    playNormalPCHardwareQuiz();
                    break;
                case 5:
                    playNormalGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Wrong input, enter a number between 1 and 5!");
                    break;
            }
        } else if (diff.equals("Hard") || diff.equals("hard")) {
            switch (theme) {
                case 1:
                    playHardSportQuiz();
                    break;
                case 2:
                    playHardHistoryQuiz();
                    break;
                case 3:
                    playHardVideoGamesQuiz();
                    break;
                case 4:
                    playHardPCHardwareQuiz();
                    break;
                case 5:
                    playHardGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Wrong input, enter a number between 1 and 5!");
                    break;
            }
        } else {
            System.out.println("Invalid difficulty!");
        }
    }

    public static void chooseBulgarianDiff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Избери трудността: ");
        System.out.println("Лесно/Нормално/Трудно");
        String diff1 = scanner.nextLine();
        System.out.println("Избери темата на викторината:");
        System.out.println("1.Спорт");
        System.out.println("2.Българка История");
        System.out.println("3.Видеоигри");
        System.out.println("4.Компютърни Компоненти");
        System.out.println("5.Обща култура");
        byte theme = scanner.nextByte();
        if (diff1.equals("Лесно") || diff1.equals("лесно")) {
            switch (theme) {
                case 1:
                    playEasyBulgarianSportQuiz();
                    break;
                case 2:
                    playEasyBulgarianHistoryQuiz();
                    break;
                case 3:
                    playEasyBulgarianVideoGamesQuiz();
                    break;
                case 4:
                    playEasyBulgarianPCHardwareQuiz();
                    break;
                case 5:
                    playEasyBulgarianGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else if (diff1.equals("Нормално") || diff1.equals("нормално")) {
            switch (theme) {
                case 1:
                    playNormalBulgarianSportQuiz();
                    break;
                case 2:
                    playNormalBulgarianHistoryQuiz();
                    break;
                case 3:
                    playNormalBulgarianVideoGamesQuiz();
                    break;
                case 4:
                    playNormalBulgarianPCHardwareQuiz();
                    break;
                case 5:
                    playNormalBulgarianGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else if (diff1.equals("Трудно") || diff1.equals("трудно")) {
            switch (theme) {
                case 1:
                    playHardBulgarianSportQuiz();
                    break;
                case 2:
                    playHardBulgarianHistoryQuiz();
                    break;
                case 3:
                    playHardBulgarianVideoGamesQuiz();
                    break;
                case 4:
                    playHardBulgarianPCHardwareQuiz();
                    break;
                case 5:
                    playHardBulgarianGeneralKnowledgeQuiz();
                    break;
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else {
            System.out.println("Грешно въведена трудност!!");
        }
    }

    public static void playEasySportQuiz() {

    }

    public static void playEasyHistoryQuiz() {

    }

    public static void playEasyVideoGamesQuiz() {

    }

    public static void playEasyPCHardwareQuiz() {

    }

    public static void playEasyGeneralKnowledgeQuiz() {

    }

    ///////
    public static void playNormalSportQuiz() {

    }

    public static void playNormalHistoryQuiz() {

    }

    public static void playNormalVideoGamesQuiz() {

    }

    public static void playNormalPCHardwareQuiz() {

    }

    public static void playNormalGeneralKnowledgeQuiz() {

    }

    /////////
    public static void playHardSportQuiz() {

    }

    public static void playHardHistoryQuiz() {

    }

    public static void playHardVideoGamesQuiz() {

    }

    public static void playHardPCHardwareQuiz() {

    }

    public static void playHardGeneralKnowledgeQuiz() {

    }

    ///////
    public static void playEasyBulgarianSportQuiz() {

    }

    public static void playEasyBulgarianHistoryQuiz() {

    }

    public static void playEasyBulgarianPCHardwareQuiz() {

    }

    public static void playEasyBulgarianVideoGamesQuiz() {

    }

    public static void playEasyBulgarianGeneralKnowledgeQuiz() {

    }

    /////////
    public static void playNormalBulgarianSportQuiz() {

    }

    public static void playNormalBulgarianHistoryQuiz() {

    }

    public static void playNormalBulgarianPCHardwareQuiz() {

    }

    public static void playNormalBulgarianVideoGamesQuiz() {

    }

    public static void playNormalBulgarianGeneralKnowledgeQuiz() {

    }

    //////////
    public static void playHardBulgarianSportQuiz() {

    }

    public static void playHardBulgarianHistoryQuiz() {

    }

    public static void playHardBulgarianPCHardwareQuiz() {

    }

    public static void playHardBulgarianVideoGamesQuiz() {

    }

    public static void playHardBulgarianGeneralKnowledgeQuiz() {

    }
}
