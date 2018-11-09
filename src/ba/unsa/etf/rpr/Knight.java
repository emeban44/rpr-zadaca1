package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class Knight extends ChessPiece {
    Knight(String pozicija, Color boja) {
        super(pozicija, boja);
    }



    @Override
    public void move(String position) throws IllegalChessMoveException {
        if (!ValidnostPozicije(position)) throw new IllegalArgumentException();

        //pomjeranje desno horizontalno naprijed
        else if (this.position.charAt(0)+2 == position.charAt(0) && this.position.charAt(1)+1 == position.charAt(1)){
            this.position=position;
        }

        //pomjeranje desno vertikalno naprijed
        else if (this.position.charAt(0)+1 == position.charAt(0) && this.position.charAt(1)+2 == position.charAt(1)){
            this.position=position;
        }

        //pomjeranje desno horizontalno nazad
        else if (this.position.charAt(0) == position.charAt(0)-2 && this.position.charAt(1) == position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje lijevo horizontalno naprijed
        else if (this.position.charAt(0) == position.charAt(0)+2 && this.position.charAt(1)+1 == position.charAt(1)){
            this.position=position;
        }

        //pomjeranje lijevo horizontalno nazad
        else if (this.position.charAt(0) == position.charAt(0)+2 && this.position.charAt(1) == position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje desno vertikalno nazad
        else if (this.position.charAt(0) == position.charAt(0)-1 && this.position.charAt(1) == position.charAt(1)+2){
            this.position=position;
        }

        //pomjeranje lijevo vertikalno naprijed
        else if (this.position.charAt(0) == position.charAt(0)+1 && this.position.charAt(1)+2 == position.charAt(1)){
            this.position=position;
        }

        //pomjeranje lijevo vertikalno nazad
        else if (this.position.charAt(0) == position.charAt(0)+1 && this.position.charAt(1) == position.charAt(1)+2){
            this.position=position;
        }

        else throw new IllegalChessMoveException();
    }


}
