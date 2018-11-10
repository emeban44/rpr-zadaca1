package ba.unsa.etf.rpr;

import java.util.List;

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

        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if (board[i][j].getClass() == type && board[i][j].getColor() == color){
                    board[i][j].move(position);
                    for (int k = 0; k<8; k++){
                        for (int y = 0; y<8; y++){
                            if (board[k][y].getPosition() == position){

                            }
                        }
                    }
                }
            }
        }
    }

    void move(String oldPosition, String newPosition){

    }

    boolean isCheck(ChessPiece.Color boja){
    return false;
    }
}
