package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class King extends ChessPiece{


    King(String pozicija, Color boja) {
        super(pozicija, boja);
    }

    @Override
    public String getPosition() {
        return null;
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
