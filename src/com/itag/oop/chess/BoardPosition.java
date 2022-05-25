package com.itag.oop.chess;

public class BoardPosition {

    private int x;
    private int y;

    public BoardPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return Character.toString((char) x + 64) + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
