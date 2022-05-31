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
}
