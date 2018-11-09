package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class Knight extends ChessPiece {
    Knight(String pozicija, Color boja) {
        super(pozicija, boja);
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void move(String position) throws IllegalChessMoveException {
        if (!ValidnostPozicije(position)) throw new IllegalArgumentException();

        //pomjeranje desno horizontalno naprijed
        if (this.position.charAt(0) == position.charAt(0)+2 && this.position.charAt(1) == position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje desno vertikalno naprijed
        if (this.position.charAt(0) == position.charAt(0)+1 && this.position.charAt(1) == position.charAt(1)+2){
            this.position=position;
        }

        //pomjeranje desno horizontalno nazad
        if (this.position.charAt(0) == position.charAt(0)-2 && this.position.charAt(1) == position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje lijevo horizontalno naprijed
        if (this.position.charAt(0) == position.charAt(0)-2 && this.position.charAt(1) == position.charAt(1)+1){
            this.position=position;
        }

        //pomjeranje lijevo horizontalno nazad
        if (this.position.charAt(0) == position.charAt(0)-2 && this.position.charAt(1) == position.charAt(1)-1){
            this.position=position;
        }

        //pomjeranje desno vertikalno nazad
        if (this.position.charAt(0) == position.charAt(0)+1 && this.position.charAt(1) == position.charAt(1)-2){
            this.position=position;
        }

        //pomjeranje lijevo vertikalno naprijed
        if (this.position.charAt(0) == position.charAt(0)-1 && this.position.charAt(1) == position.charAt(1)+2){
            this.position=position;
        }

        //pomjeranje lijevo vertikalno nazad
        if (this.position.charAt(0) == position.charAt(0)-1 && this.position.charAt(1) == position.charAt(1)-2){
            this.position=position;
        }

        else throw new IllegalChessMoveException();
    }


}
