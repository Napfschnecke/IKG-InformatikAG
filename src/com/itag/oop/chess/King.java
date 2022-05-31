package com.itag.oop.chess;

import java.util.List;
import java.util.stream.Collectors;

public class King extends ChessPiece{

    public King(BoardPosition pos) {
        super(pos);
    }

    @Override
    public List<BoardPosition> calculateMoves() {
        int x = getPosition().getX();
        int y = getPosition().getY();
        List<BoardPosition> options = new java.util.ArrayList<>(List.of());

        for (int i = -1; i <= 1; i++) {
            for (int k = -1; k <= 1; k++) {
                if (x != x + i || y != y + k) {
                    options.add(new BoardPosition(x + i, y + k));
                }
            }
        }
        return options.stream().filter((boardPosition -> boardPosition.getX() > 0 && boardPosition.getX() < 9
                && boardPosition.getY() > 0 && boardPosition.getY() < 9)).collect(Collectors.toList());
    }
}
