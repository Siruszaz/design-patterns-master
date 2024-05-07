import java.util.HashMap;

public class PieceFactory {
    private HashMap PiecePoll=new HashMap();
    public APiece GerPiece(String key){
        if(!PiecePoll.containsKey(key)){
            APiece p=new OnePiece(key);
            PiecePoll.put(key,p);
            return p;
        }
        return (APiece) PiecePoll.get(key);
    }
    public int GetPieceCount(){
        return PiecePoll.size();
    }
}