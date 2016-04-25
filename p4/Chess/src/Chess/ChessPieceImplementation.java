package Chess;

/**
 * 
 * @author Alfonso Esteve
 */
public class ChessPieceImplementation implements ChessPiece{
    Color color;
    Type type;
    ChessPiece piece;
    ChessBoard aBoard; 
    PiecePosition[] positions;

    /**
     * 
     * @param color
     * @param type 
     */
    ChessPieceImplementation(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    /**
     * 
     * @return 
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * 
     * @return 
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * 
     */
    @Override
    public void notifyMoved() {
        
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean wasMoved() {
        return true;
    }

    /**
     * 
     * @param aBoard
     * @return 
     */
    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        switch (piece.getType()){
            case KING:
                positions = ChessMovementManager.getAvailablePositionsOfKing(piece, aBoard);
                break;
            case QUEEN:
                positions = ChessMovementManager.getAvailablePositionsOfQueen(piece, aBoard);
                break;
            case ROOK:
                positions = ChessMovementManager.getAvailablePositionsOfRook(piece, aBoard);
                break;
            case BISHOP:
                positions = ChessMovementManager.getAvailablePositionsOfBishop(piece, aBoard);
                break;
            case KNIGHT:
                positions = ChessMovementManager.getAvailablePositionsOfKnight(piece, aBoard);
                break;
            case PAWN:
                positions = ChessMovementManager.getAvailablePositionsOfPawn(piece, aBoard);
                break;
        }
        return positions;
    }
    
}