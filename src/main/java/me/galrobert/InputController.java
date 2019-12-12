package me.galrobert;

import java.util.Scanner;

public class InputController {
    private String input;
    private boolean running;
    ConsoleBuilder cb = new ConsoleBuilder();
    private String[] helpCommands ={"add", "remove", "race", "exit"};

    public InputController() {
        handleInput();
    }

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
        switch (input) {
            case "help":
//                clearConsole(50);
//                System.out.println("You can use the following commands:");
//                System.out.println("add");
//                System.out.println("remove");
//                System.out.println("race");
//                System.out.println("exit");
                cb.list("help", helpCommands, "You can use the following commands:");
                break;
            case "race":
                System.out.println("Starting a race...");
                break;
            case "exit":
                System.out.println("See you next time!");
                System.exit(0);
        }
    }

    private void clearConsole(int lines) {
        for (int i = 0; i <= lines; i++) {
            System.out.println(" ");
        }
    }
}
