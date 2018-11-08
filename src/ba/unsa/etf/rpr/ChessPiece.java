package ba.unsa.etf.rpr;

public abstract class ChessPiece {

        String position;

        public static enum Color{
            WHITE,
            BLACK
        }

        Color color;

        public abstract String getPosition();

        public abstract Color getColor();

        public abstract void move(String position);

            ChessPiece(String pozicija, Color boja){
            this.position=pozicija;
            this.color=boja;
        }


}
