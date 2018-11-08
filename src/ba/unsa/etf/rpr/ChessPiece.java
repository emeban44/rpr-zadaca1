package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public abstract class ChessPiece {

        String position;

        public static enum Color{
            WHITE,
            BLACK
        }

        Color color;

        public abstract String getPosition();

        public abstract Color getColor();

        public abstract void move(String position) throws IllegalChessMoveException, IllegalArgumentException;

            ChessPiece(String pozicija, Color boja)  {
                if (!ValidnostPozicije(pozicija)) throw new IllegalArgumentException();
            this.position=pozicija;
            this.color=boja;
        }
    public boolean ValidnostPozicije(String position){
        if (position.length() != 2) {
            return false;
        }
        char prvaoznaka = position.charAt(0);
        List<Character> prvihoznakalista = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H');
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
