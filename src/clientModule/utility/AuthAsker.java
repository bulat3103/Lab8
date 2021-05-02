package clientModule.utility;

import common.exceptions.NotDeclaredValueException;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AuthAsker {
    private Scanner scanner;
    public static final String USERNAME_REGEXP = "[0-9A-Za-z]{3,12}";
    public static final String PASSWORD_REGEXP = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*]{6,30}";

    public AuthAsker(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askLogin() {
        String login;
        while (true) {
            try {
                System.out.println("Введите логин:");
                System.out.print("> ");
                String s = "";
                if (scanner.hasNext()) {
                    s = scanner.nextLine().trim();
                } else {
                    System.out.println("Прекращаю ввод и завершаю работу!");
                    System.exit(0);
                }
                boolean match = Pattern.matches(USERNAME_REGEXP, s);
                if (!match) throw new NotDeclaredValueException();
                String s1[] = s.split(" ");
                if (s1.length != 1) throw new NotDeclaredValueException();
                login = s.trim();
                if (login.equals("")) throw new NotDeclaredValueException();
                break;
            } catch (NotDeclaredValueException e) {
                System.out.println("Проверьте правильность ввода пароля: логин не может быть пустым," +
                        "не может быть пробелов и кириллицы!");
            }
        }
        return login;
    }

    public String askPassword() {
        String password;
        while (true) {
            try {
                System.out.println("Введите пароль:");
                System.out.print("> ");
                Console console = System.console();
                char [] c = console.readPassword();
                if (c == null) {
                    System.out.println("Прекращаю ввод и завершаю работу!");
                    System.exit(0);
                }
                String psw = String.valueOf(c).trim();
                boolean match = Pattern.matches(USERNAME_REGEXP, psw);
                if (!match) throw new NotDeclaredValueException();
                String s1[] = psw.split(" ");
                if (s1.length != 1) throw new NotDeclaredValueException();
                password = psw;
                if (password.equals("")) throw new NotDeclaredValueException();
                break;
            } catch (NotDeclaredValueException e) {
                System.out.println("Логин не может быть пустым!");
            }
        }
        return password;
    }

    public boolean askQuestion(String question) {
        String finalQuestion = question + " (+/-):";
        String answer;
        while (true) {
            try {
                System.out.println(finalQuestion);
                System.out.print("> ");
                answer = scanner.nextLine().trim();
                if (!answer.equals("+") && !answer.equals("-")) throw new NotDeclaredValueException();
                break;
            } catch (NotDeclaredValueException e) {
                System.out.println("Ответ должен быть либо '+', либо '-'!");
            }
        }
        return answer.equals("+");
    }
}
