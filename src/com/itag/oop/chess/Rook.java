package com.itag.oop.chess;

import java.util.List;

public class Rook extends ChessPiece{

    public Rook(BoardPosition pos) {
        super(pos);
    }

    @Override
    public List<BoardPosition> calculateMoves() {
        int x = getPosition().getX();
        int y = getPosition().getY();
        List<BoardPosition> options = new java.util.ArrayList<>(List.of());
        for (int i = 1; i < 9; i++) {
            if (i != y) {
                options.add(new BoardPosition(x, i));
            }
            if (i != x) {
                options.add(new BoardPosition(i, y));
            }
        }
        return options;
    }

    @Override
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
}
