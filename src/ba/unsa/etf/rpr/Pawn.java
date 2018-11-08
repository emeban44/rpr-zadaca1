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

    public boolean ValidnostPozicije(String position){
        if (position.length() != 2) {
            return false;
        }
        char prvaoznaka = position.charAt(0);
        List<Character> prvihoznakalista = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
        if (!prvihoznakalista.contains(prvaoznaka)){
            return false;
        }
        char drugaoznaka = position.charAt(1);
        List<Character> drugihoznakalista = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8');
        if (!drugihoznakalista.contains(drugaoznaka)){
            return false;
        }
        return true;
    }
}