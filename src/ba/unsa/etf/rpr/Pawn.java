package ba.unsa.etf.rpr;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pawn extends ChessPiece {
    Pawn(String pozicija, Color boja) {
        super(pozicija, boja);
    }



    @Override
    public void move(String position) throws IllegalChessMoveException {
        super.move(position);
        //if (!ValidnostPozicije(position)) throw new IllegalArgumentException();
        position=position.toUpperCase();
        boolean provjera=false;
        //pomjeranje crne figure naprijed kad je prvi potez
        //pomjeranje bijele figure naprijed kad je prvi potez
        if (PrviPotez == false){
            if (this.position.charAt(0) == position.charAt(0) && this.position.charAt(1)-2 == position.charAt(1) && this.getColor()==Color.BLACK){
                this.position=position;
                PrviPotez=true;
                provjera=true;
            }
            if (this.position.charAt(0) == position.charAt(0) && this.position.charAt(1)+2 == position.charAt(1) && this.getColor()==Color.WHITE){
                this.position=position;
                PrviPotez=true;
                provjera=true;
            }
        }


        //pomjeranje crne figure naprijed 1
              if (this.position.charAt(0) == position.charAt(0) && this.position.charAt(1) - 1 == position.charAt(1) && this.getColor() == Color.BLACK) {
                this.position = position;
                provjera=true;
                if (PrviPotez == false) PrviPotez = true;
            }

        //pomjeranje bijele figure naprijed 1
           if (this.position.charAt(0) == position.charAt(0) && this.position.charAt(1) + 1 == position.charAt(1) && this.getColor() == Color.WHITE) {
                this.position = position;
                provjera=true;
                if (PrviPotez == false) PrviPotez = true;
            }

           //pomjeranje dijagonalno
           else if (this.position.charAt(0)==position.charAt(0)+1 && this.position.charAt(1)==position.charAt(1)+1 && this.getColor() == Color.BLACK){
               this.position=position; PrviPotez = true; provjera=true;
           }
           else if (this.position.charAt(0)+1==position.charAt(0) && this.position.charAt(1)==position.charAt(1)+1 && this.getColor() == Color.BLACK){
               this.position=position; PrviPotez = true; provjera=true;
           }
           else if (this.position.charAt(0)==position.charAt(0)-1 && this.position.charAt(1)==position.charAt(1)-1 && this.getColor() == Color.WHITE){
               this.position=position; PrviPotez = true; provjera=true;
           }
           else if (this.position.charAt(0)==position.charAt(0)+1 && this.position.charAt(1)==position.charAt(1)-1 && this.getColor() == Color.WHITE){
               this.position=position; PrviPotez = true; provjera=true;
           }

        if (!provjera) throw new IllegalChessMoveException();
    }


}
