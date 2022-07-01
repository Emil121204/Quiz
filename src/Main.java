import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String theme = "";
        System.out.println("Choose the quiz's language language/Избери езика на викторината:");
        String language = scanner.nextLine();
        if (language.equals("English") || language.equals("english")) {
            System.out.println("Choose the theme of the quiz by picking its' number:");
            System.out.println("1.Sport");
            System.out.println("2.World History");
            System.out.println("3.Video Games");
            System.out.println("4.PC Hardware");
            System.out.println("5.General Knowledge");
            byte numbTheme = scanner.nextByte();
            switch (numbTheme) {
                case 1: {
                    theme=("sportEng.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 2: {
                    theme=("HistoryEng.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 3: {
                    theme=("videoGamesEng.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 4: {
                    theme=("pcHardwareEng.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 5: {
                    theme=("generalKnowledgeEng.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                default:
                    System.out.println("Wrong input, enter a number between 1 and 5!");
                    break;
            }
        } else if (language.equals("Български") || language.equals("български")) {
            System.out.println("Избери темата на викторината като напишеш нейният номер:");
            System.out.println("1.Спорт");
            System.out.println("2.Българка История");
            System.out.println("3.Видеоигри");
            System.out.println("4.Компютърни Компоненти");
            System.out.println("5.Обща култура");
            byte numbTheme = scanner.nextByte();
            switch (numbTheme) {

                case 1: {
                    theme=("sportBg.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 2: {
                    theme=("historyBg.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 3: {
                    theme=("pcHardwareBg.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 4: {
                    theme=("videoGamesBg.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                case 5: {
                    theme=("generalKnowledgeBg.csv");
                    playQuiz(score, theme, language);
                    break;
                }
                default:
                    System.out.println("Въведена е грешна стойност, моля въведи число от 1 до 5!");
                    break;
            }
        } else {
            System.out.println("Грешен език!");
        }
    }

    public static void playQuiz(int score, String theme, String language) throws FileNotFoundException {
        String theme1 = "\\Users\\deroc\\Desktop\\proekt\\project\\".concat(theme);
        File quiz = new File(theme1);
        Scanner scanner1 = new Scanner(quiz);
        String quiz1 = "";
        String wrong1 = "";
        String wrong2 = "";
        String wrong3 = "";
        String correct = "";
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int[] questionArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        ArrayList<Integer> answersList = new ArrayList<>();
        int randomNum = 0;
        int randomNum1 = 0;
        for (int i = 0; i < 10; i++) {
            quiz1 = quiz1 + (scanner1.nextLine());
        }
        Random random = new Random();
        String[] questions = quiz1.split(",");
        randomNum = random.nextInt(9) + 1;
        for (int j = 0; j < questions.length; j++) {
            if (questionArr[randomNum] != -1) {
                randomNum = random.nextInt(10);
            } else {
                System.out.println(questions[(randomNum * 5)]);
                questionArr[randomNum] = 69;
                for (int k = 0; k < 4; ) {
                    randomNum1 = random.nextInt(4);
                    if ((answersList.contains(randomNum1))) {
                        randomNum1 = random.nextInt(3);
                        k--;
                    } else {
                        answersList.add(randomNum1);
                        correct = questions[(randomNum * 5) + 1];
                        wrong1 = questions[(randomNum * 5) + 2];
                        wrong2 = questions[(randomNum * 5) + 3];
                        wrong3 = questions[(randomNum * 5) + 4];
                        switch (randomNum1) {
                            case 0:
                                System.out.println(correct);
                                break;
                            case 1:
                                System.out.println(wrong1);
                                break;
                            case 2:
                                System.out.println(wrong2);
                                break;
                            case 3:
                                System.out.println(wrong3);
                                break;
                        }
                        k++;
                    }
                    if (answersList.size() == 4) break;
                }
                answer = scanner.nextLine();
                if (answer.equals(correct)) score++;
            }
            if (!(answer.equals(correct))) {
                printEnd(score, language);
                System.exit(0);
            }
            answersList.clear();
        }
        printEnd(score, language);
    }

    public static void printEnd(int score, String language) {
        if (language.equals("English") || language.equals("english")) {
            System.out.println("Good Job! Your score was:" + score + "/10");
        } else
            System.out.println("Добра работа! Резултатът ти е:" + score + "/10");
    }
}

