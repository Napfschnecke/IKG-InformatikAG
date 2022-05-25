package com.itag.oop.chess;

import java.util.List;

public interface IChessPiece {

    List<BoardPosition> moves();
    void printOptions();
}
