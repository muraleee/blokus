import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
       
public class Shapes {
  private Piece p;
  int[][] shapes;
 //private ArrayList<> piece = new ArrayList<>();
    int rowA;
    int colA;
    private int size=15;
    private int deltaX=0;
    private int deltaY=0;
    private int diff=0;
    private int diffy=0;
    private boolean checks=false;
  public Shapes(int row, int col) {
      this.rowA=row;
      this.colA=col;
         
        shapes=new int[row][col];
           
      
       
  }
 /* public void translate()
  {
      int r=0;
    int c=0;
      for(int i =0; i<piece.size();i++)
      {
          r=piece.get(i).getArrayList().size();
          c=piece.get(i).getArrayList().get(0).length();
         System.out.println(r);
      }
         
           
  }*/
  public int getDiff()
  {
      return diff;
  }
  public void setDiff(int diff)
  {
       this.diff= diff;
  }
  public int getDiffy()
  {
      return diffy;
  }
  public void setDiffy(int diffy)
  {
       this.diffy= diffy;
  }
  public boolean getChecks()
  {
      return checks;
  }
  public void setChecks(boolean checks)
  {
       this.checks= checks;
  }
  public int getDeltaX()
  {
      return deltaX;
  }
  public void setDeltaX(int deltaX)
  {
       this.deltaX= deltaX;
  }
 
  public int getDeltaY()
  {
      return deltaY;
  }
  public void setDeltaY(int deltaY)
  {
       this.deltaY= deltaY;
  }
   public void setterSize(int size)
   {
       this.size= size;
   }
   public int getSize()
   {
       return size;
   }
  public void setSquare(int row2, int col2, int val)
  {
      shapes[row2][col2]=val;
  }
  public int getSquare(int row2, int col2)
  {
      return shapes[row2][col2];
  }
 /* public boolean ShapeT()
  {
      if(piece.get(0).toString2(0).charAt(0)=='*')
      {
          return true;
      }
      return false;
  }*/
    public void rotate() {
               
    }
    public String toString2(int i,int j)
    { String k=""+shapes[i][j];
        return k;
    }
  /*  public ArrayList<Piece> getPiece()
    {
        return piece;
    }*/
        
}