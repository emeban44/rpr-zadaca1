package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void desnoNaprijed() {
        Bishop p = new Bishop("C1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("E3")
        );
    }

    @Test
    void lijevoNaprijed() {
        Bishop p = new Bishop("C1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("B2")
        );
    }

    @Test
    void lijevoNazad() {
        Bishop p = new Bishop("F8", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("C5")
        );
    }

    @Test
    void desnoNazad() {
        Bishop p = new Bishop("C8", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> p.move("H3")
        );
    }

    @Test
    void ilegalanPotez() {
        Bishop p = new Bishop("C8", ChessPiece.Color.WHITE);
        assertThrows( IllegalChessMoveException.class,
                () -> p.move("A1")
        );
    }
}