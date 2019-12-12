package me.galrobert;

public class ConsoleBuilder {
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String black = "\u001B[30m";
    private static final String red = "\u001B[31m";
    private static final String green = "\u001B[32m";
    private static final String yellow = "\u001B[33m";
    private static final String blue = "\u001B[34m";
    private static final String purple = "\u001B[35m";
    private static final String cyan = "\u001B[36m";
    private static final String white = "\u001B[37m";

    String type;
    String text;
    int level;

    public ConsoleBuilder( ) {
//        this.color = color;
//        this.text = text;
//        this.level = level;
//        this.type = type;
    }

    public void color(String text, int level, String type) {
        if(type.equals("cont")) {
            if (this.level == 5) {
                System.out.print(red + " " + text + " " + ANSI_RESET +"\n");
            } else if (this.level == 1) {
                System.out.print(ANSI_GREEN_BACKGROUND + black + " " + text + " " + ANSI_RESET + "\n");
            }
        } else if(type.equals("newline")) {
            if (this.level == 5) {
                System.out.print(red + " " + text + " " + ANSI_RESET + "");
            } else if (this.level == 1) {
                System.out.println(ANSI_GREEN_BACKGROUND + black + " " + text + " " + ANSI_RESET + "");
            }
        }
    }
}
