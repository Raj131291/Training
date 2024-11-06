public class BishopReach {
    public static String canReachBishop(int bishopRow, int bishopCol, int pieceRow, int pieceCol) {
      
        if (bishopRow == pieceRow && bishopCol == pieceCol) {
            return "YES, 0";
        }

        
        if ((bishopRow + bishopCol) % 2 != (pieceRow + pieceCol) % 2) {
            return "NO"; 
        }
        if (Math.abs(bishopRow - pieceRow) == Math.abs(bishopCol - pieceCol)) {
            return "YES, 1"; 
        }

        return "YES, 2"; 
    }
    public static void main(String[] args) {
        System.out.println(canReachBishop(1, 1, 3, 3)); 
        System.out.println(canReachBishop(1, 1, 2, 2)); 
        System.out.println(canReachBishop(1, 1, 4, 4)); 
        System.out.println(canReachBishop(1, 1, 2, 3)); 
        System.out.println(canReachBishop(1, 1, 1, 1)); 
    }
}