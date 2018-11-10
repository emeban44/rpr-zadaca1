package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @org.junit.jupiter.api.Test
    void move1() {
        Pawn p = new Pawn("E2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("E4")
        );

    }

    @org.junit.jupiter.api.Test
    void prviPotezOdigran() {
        Pawn p = new Pawn("E2", ChessPiece.Color.WHITE);
        assertThrows( IllegalChessMoveException.class,
                () -> p.move("E4")
        );
        assertThrows( IllegalChessMoveException.class,
                () -> p.move("E6")
        );
    }

    @org.junit.jupiter.api.Test
    void move3() {
        Pawn p = new Pawn("A2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("A3")
        );

    }

    @org.junit.jupiter.api.Test
    void move4() {
        Pawn p = new Pawn("A7", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> p.move("A6")
        );

    }

    @org.junit.jupiter.api.Test
    void move5() {
        Pawn p = new Pawn("A7", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> p.move("B6")
        );

    }

    @org.junit.jupiter.api.Test
    void move6() {
        Pawn p = new Pawn("D2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("E3")
        );

    }

    @org.junit.jupiter.api.Test
    void move7() {
        Pawn p = new Pawn("D7", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> p.move("C6")
        );

    }

    @org.junit.jupiter.api.Test
    void move8() {
        Pawn p = new Pawn("G2", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("H3")
        );

    }

}