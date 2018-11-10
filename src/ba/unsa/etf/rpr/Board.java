package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Objects;

public class Board {

    protected ChessPiece[][] board = new ChessPiece[8][8];

    Board(){
        // Topovi
        board[0][0] = new Rook("A1", ChessPiece.Color.WHITE);
        board[0][7] = new Rook("A8", ChessPiece.Color.BLACK);
        board[7][0] = new Rook("H1", ChessPiece.Color.WHITE);
        board[7][7] = new Rook("H8", ChessPiece.Color.BLACK);

        // Vitezovi
        board[0][1] = new Knight("B1", ChessPiece.Color.WHITE);
        board[0][6] = new Knight("G1", ChessPiece.Color.WHITE);
        board[7][1] = new Knight( "B8", ChessPiece.Color.BLACK);
        board[7][6] = new Knight( "G8", ChessPiece.Color.BLACK);

        // Lovci
        board[0][2] = new Bishop( "C1", ChessPiece.Color.WHITE);
        board[0][5] = new Bishop( "F1", ChessPiece.Color.WHITE);
        board[7][2] = new Bishop( "C8", ChessPiece.Color.BLACK);
        board[7][5] = new Bishop( "F8", ChessPiece.Color.BLACK);

        // Kraljice
        board[0][3] = new Queen("D1", ChessPiece.Color.WHITE);
        board[7][3] = new Queen("D8", ChessPiece.Color.BLACK);

        // Kraljevi
        board[0][4] = new King( "E1", ChessPiece.Color.WHITE);
        board[7][4] = new King( "E8", ChessPiece.Color.BLACK);

        // Pijuni
        board[1][0] = new Pawn( "A2", ChessPiece.Color.WHITE);
        board[1][1] = new Pawn( "B2", ChessPiece.Color.WHITE);
        board[1][2] = new Pawn( "C2", ChessPiece.Color.WHITE);
        board[1][3] = new Pawn( "D2", ChessPiece.Color.WHITE);
        board[1][4] = new Pawn( "E2", ChessPiece.Color.WHITE);
        board[1][5] = new Pawn( "F2", ChessPiece.Color.WHITE);
        board[1][6] = new Pawn( "G2", ChessPiece.Color.WHITE);
        board[1][7] = new Pawn( "H2", ChessPiece.Color.WHITE);
        board[6][0] = new Pawn( "A7", ChessPiece.Color.BLACK);
        board[6][1] = new Pawn( "B7", ChessPiece.Color.BLACK);
        board[6][2] = new Pawn( "C7", ChessPiece.Color.BLACK);
        board[6][3] = new Pawn( "D7", ChessPiece.Color.BLACK);
        board[6][4] = new Pawn( "E7", ChessPiece.Color.BLACK);
        board[6][5] = new Pawn( "F7", ChessPiece.Color.BLACK);
        board[6][6] = new Pawn( "G7", ChessPiece.Color.BLACK);
        board[6][7] = new Pawn( "H7", ChessPiece.Color.BLACK);

        // Prazna mjesta
        for (int i = 0; i<8; i++){
            board[2][i]= null;
            board[3][i]= null;
            board[4][i]= null;
            board[5][i]= null;
        }

    }


    void move(Class type, ChessPiece.Color color, String position) throws IllegalChessMoveException {
        boolean provjera=false;
        int slovo=0;
        int broj=0;
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if (provjera) break;
                if (board[i][j]==null) continue;
                if (board[i][j].getClass() == type && board[i][j].getColor() == color && !provjera){
   try{                 board[i][j].move(position); } catch(IllegalChessMoveException e){ continue; }
                    for (int k = 0; k<8; k++){
                        for (int y = 0; y<8; y++){
                            if (provjera) break;
                            if (i == k && j == y) continue;
                            else if (k == 7 && y == 7){
                                if (position.charAt(0) == 'A') slovo=0;
                                else if (position.charAt(0) == 'B') slovo=1;
                                else if (position.charAt(0) == 'C') slovo=2;
                                else if (position.charAt(0) == 'D') slovo=3;
                                else if (position.charAt(0) == 'E') slovo=4;
                                else if (position.charAt(0) == 'F') slovo=5;
                                else if (position.charAt(0) == 'G') slovo=6;
                                else if (position.charAt(0) == 'H') slovo=7;
                                if (position.charAt(1) == '1') broj=0;
                                else if (position.charAt(1) == '2') broj=1;
                                else if (position.charAt(1) == '3') broj=2;
                                else if (position.charAt(1) == '4') broj=3;
                                else if (position.charAt(1) == '5') broj=4;
                                else if (position.charAt(1) == '6') broj=5;
                                else if (position.charAt(1) == '7') broj=6;
                                else if (position.charAt(1) == '8') broj=7;
                                board[broj][slovo]=board[i][j];
                                board[i][j]=null;
                                provjera=true;
                                break;
                            }
                            if (board[k][y]==null) continue;
                            if (Objects.equals(board[k][y].getPosition(), position) && board[k][y].getColor() != color){
                                board[k][y]= board[i][j];
                                board[i][j]= null;
                                provjera=true;
                                break;
                            }
                            else if (Objects.equals(board[k][y].getPosition(), position) && board[k][y].getColor() == color){
                                throw new IllegalChessMoveException();
                            }

                        } if (provjera) break;
                    }
                }
            } if (provjera) break;
        }
        if (!provjera) throw new IllegalChessMoveException();
    }

    void move(String oldPosition, String newPosition) throws IllegalChessMoveException {
        boolean DaLiPostoji=false;
        Class type=null;
        ChessPiece.Color color=null;
        for ( int i = 0; i<8; i++){
            for ( int j = 0; j<8; j++){
                if (board[i][j] == null) continue;
                else if (Objects.equals(board[i][j].getPosition(), oldPosition)) {
                    DaLiPostoji=true;
                    type = board[i][j].getClass();
                    color = board[i][j].getColor();
                }
            }
        }

        if (!DaLiPostoji) throw new IllegalArgumentException();

        String position = newPosition;
        boolean provjera=false;
        int slovo=0;
        int broj=0;
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if (provjera) break;
                if (board[i][j]==null) continue;
                if (board[i][j].getClass() == type && board[i][j].getColor() == color && !provjera){
                    try{                 board[i][j].move(position); } catch(IllegalChessMoveException e){ continue; }
                    for (int k = 0; k<8; k++){
                        for (int y = 0; y<8; y++){
                            if (provjera) break;
                            if (i == k && j == y) continue;
                            else if (k == 7 && y == 7){
                                if (position.charAt(0) == 'A') slovo=0;
                                else if (position.charAt(0) == 'B') slovo=1;
                                else if (position.charAt(0) == 'C') slovo=2;
                                else if (position.charAt(0) == 'D') slovo=3;
                                else if (position.charAt(0) == 'E') slovo=4;
                                else if (position.charAt(0) == 'F') slovo=5;
                                else if (position.charAt(0) == 'G') slovo=6;
                                else if (position.charAt(0) == 'H') slovo=7;
                                if (position.charAt(1) == '1') broj=0;
                                else if (position.charAt(1) == '2') broj=1;
                                else if (position.charAt(1) == '3') broj=2;
                                else if (position.charAt(1) == '4') broj=3;
                                else if (position.charAt(1) == '5') broj=4;
                                else if (position.charAt(1) == '6') broj=5;
                                else if (position.charAt(1) == '7') broj=6;
                                else if (position.charAt(1) == '8') broj=7;
                                board[broj][slovo]=board[i][j];
                                board[i][j]=null;
                                provjera=true;
                                break;
                            }
                            if (board[k][y]==null) continue;
                            if (Objects.equals(board[k][y].getPosition(), position) && board[k][y].getColor() != color){
                                board[k][y]=null;
                                board[k][y]= board[i][j];
                                board[i][j]= null;
                                provjera=true;
                            }
                            else if (Objects.equals(board[k][y].getPosition(), position) && board[k][y].getColor() == color){
                                throw new IllegalChessMoveException();
                            }

                        }
                    }
                }
            } if (provjera) break;
        }
        if (!provjera) throw new IllegalChessMoveException();
    }

    boolean isCheck(ChessPiece.Color boja){


        for (int i = 0; i<8; i++){
            for ( int j = 0; j<8; j++){
                if(i == 0 || j==0) continue;
                if (board[i][j] != null && board[i][j].getClass() == King.class && board[i][j].getColor() == boja){
                    if ( board[i-1][j] != null && board[i-1][j].getColor() != boja ){
                        return true;
                    }
                    else if ( board[i][j-1]!= null && board[i][j-1].getColor() != boja){
                        return true;
                    }
                    else if ( board[i-1][j-1] != null && board[i-1][j-1].getColor() != boja){
                        return true;
                    }
                    else if (board[i][j+1] != null && board[i][j+1].getColor() != boja){
                        return true;
                    }
                    else if (board[i-1][j+1] != null && board[i-1][j+1].getColor() != boja){
                        return true;
                    }

                }
            }
        } return false;
    }
}
