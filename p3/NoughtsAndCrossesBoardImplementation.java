package tresenraya;

import java.awt.Color;


public class NoughtsAndCrossesBoardImplementation implements NoughtsAndCrossesBoard{
    int fromX, fromY, toX, toY;
    NoughtsAndCrossesBoardImplementation.Color currentColor;
    String[][] miTablero;// = new String [3][3];
    
    public NoughtsAndCrossesBoardImplementation(){
        currentColor = Color.RED;
        miTablero = new String[3][3];
        miTablero[0][0] = " R ";
        miTablero[0][1] = " B ";
        miTablero[0][2] = " R ";
        miTablero[1][0] = " V ";
        miTablero[1][1] = " R ";
        miTablero[1][2] = " V ";
        miTablero[2][0] = " B ";
        miTablero[2][1] = " V ";              
        miTablero[2][2] = " B ";
    }
 
    @Override
    public boolean isGameOver() {
        if(miTablero[0][0]==miTablero[0][1]&&miTablero[0][0]==miTablero[0][2]&&miTablero[0][0]!="   "){
            return true;
        }else if(miTablero[1][0]==miTablero[1][1]&&miTablero[1][0]==miTablero[1][2]&&miTablero[1][0]!="   "){
            return true;
        }else if(miTablero[2][0]==miTablero[2][1]&&miTablero[2][0]==miTablero[2][2]&&miTablero[2][0]!="   "){
            return true;
        }else if(miTablero[0][0]==miTablero[1][0]&&miTablero[0][0]==miTablero[2][0]&&miTablero[0][0]!="   "){
            return true;
        }else if(miTablero[0][1]==miTablero[1][1]&&miTablero[0][1]==miTablero[2][1]&&miTablero[0][1]!="   "){
            return true;
        }else if(miTablero[0][2]==miTablero[1][2]&&miTablero[0][2]==miTablero[2][2]&&miTablero[0][2]!="   "){
            return true;
        }else if(miTablero[0][0]==miTablero[1][1]&&miTablero[0][0]==miTablero[2][2]&&miTablero[0][0]!="   "){
            return true;
        }else if(miTablero[0][2]==miTablero[1][1]&&miTablero[0][2]==miTablero[2][0]&&miTablero[0][2]!="   "){
            return true;
        }else
            return false;
    }

    @Override
    public boolean movePiece(int fromX, int fromY, int toX, int toY) {
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
        try{
            if((getPieceAt(toX, toY)==Color.VOID)&&(canMovePieceAt(fromX, fromY)==true)){
            miTablero[toX][toY] = miTablero[fromX][fromY];
            miTablero[fromX][fromY] = "   ";
            if(currentColor==Color.RED){
                currentColor=Color.WHITE;
            }else
                currentColor = Color.RED;
            return true;
        }else
            return false;
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public Color getPieceAt(int x, int y) {
        try{
            if(miTablero[x][y]==" R "){
            return Color.RED;
            }else if(miTablero[x][y]==" B "){
                return Color.WHITE;
                }else
                    return Color.VOID;
        }catch(Exception e){
            
        }
        return Color.VOID;
    }

    @Override
    public boolean canMovePieceAt(int x, int y) {
        try{
            if(currentColor == Color.RED){
            if(miTablero[x][y] == " R "){
                return true;
            }else
                return false;
        }else if(currentColor == Color.WHITE){
            if(miTablero[x][y] == " B "){
                return true;
            }else
                return false;
        }else
            return false;
        }catch(Exception e){
            
        }
        return false;
    }
}