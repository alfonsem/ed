package Chess;

/**
 * 
 * @author Alfonso Esteve
 */
public class ChessPieceImplementation implements ChessPiece{

    Color color;
    Type type;
    boolean moved;
    
    public ChessPieceImplementation(){
    }
    
    public ChessPieceImplementation(ChessPiece.Color aColor, ChessPiece.Type aType){
        color = aColor;
        type = aType;
    }
    
    @Override
    public ChessPiece.Color getColor() {
        return color;
    }

    @Override
    public ChessPiece.Type getType() {
        return type;
    }

    @Override
    public void notifyMoved() {
        moved = true;
    }

    @Override
    public boolean wasMoved() {
        return moved;
    }

    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        switch(getType()){
            case PAWN:
                return ChessMovementManager.getAvailablePositionsOfPawn(this,aBoard); 
            case BISHOP:
                return ChessMovementManager.getAvailablePositionsOfBishop(this,aBoard);
            case KING:
                return ChessMovementManager.getAvailablePositionsOfKing(this, aBoard);
            case QUEEN:
                return ChessMovementManager.getAvailablePositionsOfQueen(this,aBoard);
            case KNIGHT:
                return ChessMovementManager.getAvailablePositionsOfKnight(this,aBoard);
            case ROOK:
                return ChessMovementManager.getAvailablePositionsOfRook(this,aBoard);
        }
        return null;
    }
    
}