package com.itag.oop.chess;

import java.util.List;
import java.util.stream.Collectors;

public class Pawn extends ChessPiece{

    public Pawn(BoardPosition pos) {
        super(pos);
    }

    @Override
    public List<BoardPosition> calculateMoves() {
        int x = getPosition().getX();
        int y = getPosition().getY();
        List<BoardPosition> options = new java.util.ArrayList<>(List.of(
                new BoardPosition(x, y + 1),
                new BoardPosition(x - 1, y + 1),
                new BoardPosition(x + 1, y + 1)
        ));
        if (y == 2) {
            options.add(new BoardPosition(x, y + 2));
        }
        return options.stream().filter((boardPosition -> boardPosition.getX() > 0 && boardPosition.getX() < 9
                && boardPosition.getY() > 0 && boardPosition.getY() < 9)).collect(Collectors.toList());
    }

    @Override
    public void printOptions() {
        for (int i = 1; i < 9; i++) {
            for (int k = 1; k < 9; k++) {
                int finalI = i;
                int finalK = k;
                boolean isOption = calculateMoves().stream().anyMatch(bp -> bp.getX() == finalK && bp.getY() == 9 - finalI);
                if (isOption) {
                    if (k != getPosition().getX()) {
                        System.out.print(ANSI_BLUE + " ■ " + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_GREEN + " ■ " + ANSI_RESET);
                    }
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
