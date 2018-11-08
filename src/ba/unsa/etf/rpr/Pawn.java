package ba.unsa.etf.rpr;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pawn extends ChessPiece {
    Pawn(String pozicija, Color boja) {
        super(pozicija, boja);
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void move(String position) {
        if (!ValidnostPozicije(position)) throw new IllegalArgumentException();
    }


}
