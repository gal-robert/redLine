package me.galrobert;

import java.util.Scanner;

public class InputController {
    private String input;
    private boolean running;
    ConsoleBuilder cb = new ConsoleBuilder();
    private String[] helpCommands ={"add", "remove", "race", "exit"};

    public void handleInput() {
        System.out.print("::");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        commandHelp(input);

        if (input.contains("add")) {
            if (input.contains("help")) {
                System.out.println("The commands you can use: \n   add vehicle\n   add player\n   add track");
            } else {
                cb.color("Invalid command. For more information use: ", "error");
                cb.color("add help", "h_command");
                System.out.println(" ");
            }
        }
    }

    private void commandHelp(String input) {
        input = input.toLowerCase();
        switch (input) {
            case "help":
                cb.list("help", helpCommands, "You can use the following commands:");
                break;
            case "race":
                System.out.println("Starting a race...");
                break;
            case "about":
                System.out.println("This is a game made to explore the wonderful world of Java. Enjoy it.");
                System.out.println("Link to the repo: https://github.com/gal-robert/redLine/");
                break;
            case "exit":
                cb.color("It's sad seeing you go! :'(", "h_error");
                System.exit(0);
            default:
                cb.color("Invalid command. To see all the commands use ", "error");
                cb.color("help", "h_command");
                System.out.println(" ");
        }
    }

    private void clearConsole(int lines) {
        for (int i = 0; i <= lines; i++) {
            System.out.println(" ");
        }
    }
}
