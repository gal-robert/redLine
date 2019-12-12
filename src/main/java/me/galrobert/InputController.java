package me.galrobert;

import java.util.Scanner;

public class InputController {
    private String input;
    private boolean running;

    public InputController() {
        handleInput();
    }

    public void handleInput() {
        System.out.print("::");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        if(input.equals("help")) {
            clearConsole(50);
            System.out.println("You can use the following commands:");
            System.out.println("add");
            System.out.println("remove");
            System.out.println("race");
            System.out.println("exit");
        } else if(input.equals("exit")) {
            System.exit(0);
        } else if(input == "race") {
            System.out.println("Starting a race...");
        }

        if(input.contains("add")) {
            if(input.contains("help")) {
                System.out.println("The commands you can use: \n   add vehicle\n   add player\n   add track");
            } else {
//                System.out.println("If you don't know how to use the command use: add help");
                new ConsoleBuilder("If you don't know how to use the command use:", 5, "newline");
                new ConsoleBuilder("add help", 1, "cont");
            }
        }
    }

    private void clearConsole(int lines) {
        for(int i = 0; i <= lines; i++) {
            System.out.println("");
        }
    }
}
