package com.itag.oop.chess;

import java.util.List;

public abstract class ChessPiece{

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[94m";

    private BoardPosition position;

    public ChessPiece(BoardPosition pos) {
        position = pos;
    }

    public abstract List<BoardPosition> calculateMoves();

    public void printOptions() {
        for (int i = 1; i < 9; i++) {
            for (int k = 1; k < 9; k++) {
                int finalI = i;
                int finalK = k;
                boolean isOption = calculateMoves().stream().anyMatch(bp -> bp.getX() == finalK && bp.getY() == 9 - finalI);
                if (isOption) {
                    System.out.print(ANSI_GREEN + " ■ " + ANSI_RESET);
                } else if (k == getPosition().getX() && i == 9 - getPosition().getY()) {
                    System.out.print(ANSI_YELLOW + " ■ " + ANSI_RESET);
                } else if ((i + k) % 2 == 0) {
                    System.out.print(ANSI_WHITE + " ■ " + ANSI_RESET);
                } else {
                    System.out.print(ANSI_WHITE + " □ " + ANSI_RESET);
                }
            }
            System.out.println();
        }
    }

    public BoardPosition getPosition() {
        return position;
    }

    public void setPosition(BoardPosition position) {
        if (calculateMoves().stream().anyMatch(bp -> bp.getX() == position.getX() && bp.getY() == position.getY())) {
            this.position = position;
        } else {
            System.out.println("Invalid move.");
        }
    }
}
