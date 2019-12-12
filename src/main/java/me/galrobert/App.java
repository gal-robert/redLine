package me.galrobert;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        boolean gameRunning = true;

        System.out.println("To get you started use the following command: help");

        Util util = new Util();
        InputController controller = new InputController();

        //noinspection InfiniteLoopStatement
        while(true) {
            controller.handleInput();
        }
    }
}
