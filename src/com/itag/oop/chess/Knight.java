package com.itag.oop.chess;

import java.util.List;
import java.util.stream.Collectors;

public class Knight extends ChessPiece{

    public Knight(BoardPosition pos) {
        super(pos);
    }

    @Override
    public List<BoardPosition> calculateMoves() {
        int x = getPosition().getX();
        int y = getPosition().getY();
        List<BoardPosition> options = List.of(
                new BoardPosition(x + 2, y + 1),
                new BoardPosition(x + 2, y - 1),
                new BoardPosition(x - 2, y + 1),
                new BoardPosition(x - 2, y - 1),
                new BoardPosition(x + 1, y + 2),
                new BoardPosition(x - 1, y + 2),
                new BoardPosition(x + 1, y - 2),
                new BoardPosition(x - 1, y - 2)
        );
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
