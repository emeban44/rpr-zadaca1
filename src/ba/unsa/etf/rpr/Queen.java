package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class Queen extends ChessPiece{

    Queen(String pozicija, Color boja) {
        super(pozicija, boja);
    }



    @Override
    public void move(String position) {
        if (!ValidnostPozicije(position)) throw new IllegalArgumentException();
    }


}
