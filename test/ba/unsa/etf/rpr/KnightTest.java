package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    @Test
    void move() {
        Knight k = new Knight("B1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("C3")
        );

    }

    @Test
    void move1() {
        Knight k = new Knight("B1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("D2")
        );

    }

    @Test
    void move2() {
        Knight k = new Knight("B1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("A3")
        );

    }

    @Test
    void move3() {
        Knight k = new Knight("B8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("D7")
        );

    }

    @Test
    void move4() {
        Knight k = new Knight("G1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("E2")
        );

    }

    @Test
    void move5() {
        Knight k = new Knight("G8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("E7")
        );

    }

    @Test
    void move6() {
        Knight k = new Knight("B8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("C6")
        );

    }

    @Test
    void move7() {
        Knight k = new Knight("B8", ChessPiece.Color.BLACK);
        assertDoesNotThrow(
                () -> k.move("A6")
        );

    }

    @Test
    void illegalmove() {
        Knight k = new Knight("B8", ChessPiece.Color.BLACK);
        assertThrows( IllegalChessMoveException.class,
                () -> k.move("H6")
        );

    }
}