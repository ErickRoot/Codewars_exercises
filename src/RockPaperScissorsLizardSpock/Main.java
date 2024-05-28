package RockPaperScissorsLizardSpock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:
    Scissors cuts Paper
    Paper covers Rock
    Rock crushes Lizard
    Lizard poisons Spock
    Spock smashes Scissors
    Scissors decapitates Lizard
    Lizard eats Paper
    Paper disproves Spock
    Spock vaporizes Rock
    Rock crushes Scissors

    Inputs
                                        4       5           8          6        5
    Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".

    Task:

Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
*/
        Scanner scanner = new Scanner(System.in);
        String jugador1 = scanner.nextLine().toLowerCase();
        String jugador2 = scanner.nextLine().toLowerCase();

        System.out.println("Entrada Jugador 1: " + jugador1);
        System.out.println("Entrada Jugador 2: " + jugador2);

        String resultado = kata.rpsls(jugador1, jugador2);
        System.out.println(resultado);
    }

    public static class kata {
        public static String rpsls(String player1, String player2) {
            // System.out.println("Método rpsls llamado con: " + player1 + " vs " + player2);
            if (player1.equals(player2)) {
                return "Drawn";
            }
            switch (player1) { // piedra
                case "rock" -> { // player1
                    switch (player2) {
                        case "scissors" -> {
                            return "Player 1 Won!";
                        }
                        case "lizard" -> {
                            return "Player 1 Won!";
                        }
                        case "paper" -> {
                            return "Player 2 Won!";
                        }
                        case "spock" -> {
                            return "Player 2 Won!";
                        }
                    }
                }
                case "paper" -> {
                    switch (player2) {
                        case "rock" -> {
                            return "Player 1 Won!";
                        }
                        case "spock" -> {
                            return "Player 1 Won!";
                        }
                        case "scissors" -> {
                            return "Player 2 Won!";
                        }
                        case "lizard" -> {
                            return "Player 2 Won!";
                        }
                    }
                }
                case "scissors" -> {
                    switch (player2) {
                        case "paper" -> {
                            return "Player 1 Won!";
                        }
                        case "lizard" -> {
                            return "Player 1 Won!";
                        }
                        case "rock" -> {
                            return "Player 2 Won!";
                        }
                        case "spock" -> {
                            return "Player 2 Won!";
                        }
                    }
                }
                case "lizard" -> {
                    switch (player2) {
                        case "spock" -> {
                            return "Player 1 Won!";
                        }
                        case "paper" -> {
                            return "Player 1 Won!";
                        }
                        case "scissors" -> {
                            return "Player 2 Won!";
                        }
                        case "rock" -> {
                            return "Player 2 Won!";
                        }
                    }
                }
                case "spock" -> {
                    switch (player2) {
                        case "rock" -> {
                            return "Player 1 Won!";
                        }
                        case "scissors" -> {
                            return "Player 1 Won!";
                        }
                        case "paper" -> {
                            return "Player 2 Won!";
                        }
                        case "lizard" -> {
                            return "Player 2 Won!";
                        }
                    }
                }
            }
            return "";
        }
    }
}
