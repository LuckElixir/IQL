package personal.luckelixir.iql;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput;

        do {
            System.out.print(">>");
            userInput = new Scanner(System.in).next();
        } while (!Objects.equals(userInput, "exit"));


    }
}