package br.com.igorfersantos;

import br.com.igorfersantos.model.Board;
import br.com.igorfersantos.model.Space;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static br.com.igorfersantos.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static int BOARD_LIMIT = 9;
    private static Board board;

    public static void main(String[] args) {
        final Map<String, String> positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1])
                );
        int option = -1;
        while (true) {
            System.out.println("Select one of the options below:");
            System.out.println("1 - Start a new game");
            System.out.println("2 - Put a new number");
            System.out.println("3 - Remove a number");
            System.out.println("4 - Visualize current game");
            System.out.println("5 - Verify the game status");
            System.out.println("6 - Clear game");
            System.out.println("7 - End game");
            System.out.println("8 - Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione uma das opções do menu");
            }
        }
    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)) {
            System.out.println("The game has already been started");
            return;
        }
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                String positionConfig = positions.get("%s,%s".formatted(i, j));
                int expected = Integer.parseInt(positionConfig.split(",")[0]);
                boolean fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                Space space = new Space(expected, fixed);
                spaces.get(i).add(space);
            }
        }

        board = new Board(spaces);
        System.out.println("The game is ready to start.");

    }

    private static void inputNumber() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }

        System.out.println("Enter the column where the number will be inserted:");
        int col = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        System.out.println("Enter the row where the number will be inserted:");
        int row = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        System.out.printf("Enter the value for the position [%s,%s]:\n", col, row);
        int value = runUntilGetValidNumber(1, 9);
        if (!board.changeValue(col, row, value)) {
            System.out.printf("The position [%s,%s] has a fixed value.\n", col, row);
        }
    }

    private static void removeNumber() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }

        System.out.println("Enter the column where the number will be inserted:");
        int col = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        System.out.println("Enter the row where the number will be inserted:");
        int row = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        if (!board.clearValue(col, row)) {
            System.out.printf("The position [%s,%s] has a fixed value.\n", col, row);
        }
    }

    private static void showCurrentGame() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }

        // col * row (9*9) is the default
        Object[] args = new Object[BOARD_LIMIT * BOARD_LIMIT];
        var argPos = 0;
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col : board.getSpaces()) {
                Integer actual = col.get(i).getActual();
                args[argPos++] = " " + (isNull(actual) ? " " : actual);
            }
        }
        System.out.println("The current game as of now is:");
        //noinspection RedundantStringFormatCall
        System.out.println(BOARD_TEMPLATE.formatted(args));
    }

    private static void showGameStatus() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }

        System.out.printf("The game status currently is: %s\n", board.getStatus().getLabel());
        if (board.hasErrors()) {
            System.out.println("The game currently has errors");
        } else {
            System.out.println("Well done! Your game doesn't have errors!");
        }
    }

    private static void clearGame() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }
        System.out.println("Are you sure you want to clear your game?(Y/N):");
        String confirm = scanner.next();
        //noinspection ConstantValue
        while (!confirm.equalsIgnoreCase("y") && !confirm.equalsIgnoreCase("n")) {
            System.out.println("Inform Y(Yes) or N(No):");
            confirm = scanner.next();
        }

        if (confirm.equalsIgnoreCase("y")) {
            board.reset();
        }
    }

    private static void finishGame() {
        if (isNull(board)) {
            System.out.println("The game has not been started yet.");
            return;
        }

        if (board.gameIsFinished()) {
            System.out.println("Congratulations! You finished the game! :D");
            showCurrentGame();
            board = null;
        } else if (board.hasErrors()) {
            System.out.println("Your game contains erros, fix it before so it can finished!");
        } else {
            System.out.println("There are spaces that still need to be filled");
        }
    }


    private static int runUntilGetValidNumber(final int min, final int max) {
        int current;

        try {
            current = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.printf("Illegal number. You should provide a number between %s and %s.\n", min, max);
            return runUntilGetValidNumber(min, max);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        while (current < min || current > max) {
            System.out.printf("Enter a valid number between %s and %s\n", min, max);
            current = scanner.nextInt();
        }

        return current;
    }

}