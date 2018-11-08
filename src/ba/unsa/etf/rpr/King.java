package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class King extends ChessPiece{


    King(String pozicija, Color boja) {
        super(pozicija,boja);


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
    public void move(String position) throws IllegalChessMoveException {
        if (!ValidnostPozicije(position)) throw new IllegalArgumentException();

        //pomjeranje udesno
        if (this.position.charAt(0)==position.charAt(0)+1 && this.position.charAt(1)==position.charAt(1)){
            this.position=position;
        }

        //pomjeranje unaprijed
        else if (this.position.charAt(0)==position.charAt(0) && this.position.charAt(1)==position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje unazad
        else if (this.position.charAt(0)==position.charAt(0) && this.position.charAt(1)==position.charAt(1)-1){
            this.position=position;
        }

        //pomjeranje ulijevo
        else if (this.position.charAt(0)==position.charAt(0)-1 && this.position.charAt(1)==position.charAt(1)){
            this.position=position;
        }

        else throw new IllegalChessMoveException();

    }


}
