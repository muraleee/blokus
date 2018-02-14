import java.util.ArrayList;
 
public class Piece {
     
    private ArrayList<String> p = new ArrayList<>();
    private String piece;
   public Piece(String piece)
   {
       this.piece=piece;
   }
   public String add(String o) {
       // TODO Auto-generated method stub
       p.add(o);
       return o;
   }
   public void adder(String s)
   {
        
   }
   public String toString()
   { String k=p.toString();
       return k;
   }
   public String toString2(int i)
   { String k=p.get(i).toString();
       return k;
   }
   public ArrayList<String> getArrayList()
   {
       return p;
   }
}