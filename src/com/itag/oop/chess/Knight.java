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
}
