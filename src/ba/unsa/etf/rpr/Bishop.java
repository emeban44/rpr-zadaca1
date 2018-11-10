package ba.unsa.etf.rpr;
import java.util.Arrays;
import java.util.List;
public class Bishop extends ChessPiece {
    Bishop(String pozicija, Color boja) {
        super(pozicija, boja);
    }



    @Override
    public void move(String position) throws IllegalChessMoveException {
        super.move(position);
        //  if (!ValidnostPozicije(position)) throw new IllegalArgumentException();
        position=position.toUpperCase();
        boolean provjera=false;
        for (int i = 1; i<=8; i++){

            //pomjeranje dijagonalno naprijed
            if (this.position.charAt(0)+i == position.charAt(0) && this.position.charAt(1)+i == position.charAt(1)) {
                this.position=position; provjera=true;
            }
            else if (this.position.charAt(0)-i == position.charAt(0) && this.position.charAt(1)+i == position.charAt(1)){
                this.position=position; provjera=true;
            }

            //pomjeranje dijagonalno nazad
            else if (this.position.charAt(0)-i == position.charAt(0) && this.position.charAt(1)-i == position.charAt(1)){
                this.position=position; provjera=true;
            }
            else if (this.position.charAt(0)+i == position.charAt(0) && this.position.charAt(1)-i == position.charAt(1)){
                this.position=position; provjera=true;
            }
        }
        if (!provjera)
            throw new IllegalChessMoveException();
    }



}
