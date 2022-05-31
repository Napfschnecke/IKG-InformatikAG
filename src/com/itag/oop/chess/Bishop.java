package com.itag.oop.chess;

import java.util.List;
import java.util.stream.Collectors;

public class Bishop extends ChessPiece{

    public Bishop(BoardPosition pos) {
        super(pos);
    }

    @Override
    public List<BoardPosition> calculateMoves() {
        int x = getPosition().getX();
        int y = getPosition().getY();
        List<BoardPosition> options = new java.util.ArrayList<>(List.of());

        for (int i = 1; i < 9; i++) {
            options.add(new BoardPosition(x + i, y + i));
            options.add(new BoardPosition(x + i, y - i));
            options.add(new BoardPosition(x - i, y + i));
            options.add(new BoardPosition(x - i, y - i));
        }
        return options.stream().filter((boardPosition -> boardPosition.getX() > 0 && boardPosition.getX() < 9
                && boardPosition.getY() > 0 && boardPosition.getY() < 9)).collect(Collectors.toList());
    }
}
