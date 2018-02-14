import java.awt.Rectangle;
import java.util.ArrayList;
       
public class BlokusGame {
    public static final int PLAYING=0;
    public static final int P1_TURN=1;
    public static final int P2_TURN=2;
    private int status;
    int turn=1;   
      ArrayList<Shapes> p1 = new ArrayList<>();
      ArrayList<Shapes> p2 = new ArrayList<>();
      BlokusBoard b= new BlokusBoard();
  public BlokusGame()
  {
      status = PLAYING;
//      p1 = new P(590, 160);
  //    p2 = new Paddle(0, 160); 
       createShapes1();
       createShapes2();
  }
  public void update()
  {
           
           
  }
    
  public void createShapes1()
  {
          p1.add(new Shapes(1,1));
      p1.get(0).setSquare(0, 0, 1);
     //System.out.println(p1.get(0).toString2(0,0));
     p1.add(new Shapes(2,1));
     p1.get(1).setSquare(0, 0, 1);
     p1.get(1).setSquare(1, 0, 1);
  //   System.out.println(p1.get(1).toString2(1,0));
          
     p1.add(new Shapes(3,1));
     p1.get(2).setSquare(0, 0, 1);
     p1.get(2).setSquare(1, 0, 1);
     p1.get(2).setSquare(2, 0, 1);
     //System.out.println(p1.get(2).toString2(1,0));
     p1.add(new Shapes(2,2));
     p1.get(3).setSquare(0, 0, 1);
     p1.get(3).setSquare(1, 0, 1);
     p1.get(3).setSquare(0, 1, 0);
     p1.get(3).setSquare(1, 1, 1);
          
     p1.add(new Shapes(4,1));
     p1.get(4).setSquare(0, 0, 1);
     p1.get(4).setSquare(1, 0, 1);
     p1.get(4).setSquare(2, 0, 1);
     p1.get(4).setSquare(3, 0, 1);
         
     p1.add(new Shapes(3,2));
     p1.get(5).setSquare(0, 0, 0);
     p1.get(5).setSquare(1, 0, 0);
     p1.get(5).setSquare(2, 0, 1);
     p1.get(5).setSquare(0, 1, 1);
     p1.get(5).setSquare(1, 1, 1);
     p1.get(5).setSquare(2, 1, 1);
         
     p1.add(new Shapes(3,2));
     p1.get(6).setSquare(0, 0, 1);
     p1.get(6).setSquare(1, 0, 1);
     p1.get(6).setSquare(2, 0, 1);
     p1.get(6).setSquare(0, 1, 0);
     p1.get(6).setSquare(1, 1, 1);
     p1.get(6).setSquare(2, 1, 0);
         
     p1.add(new Shapes(2,2));
     p1.get(7).setSquare(0, 0, 1);
     p1.get(7).setSquare(1, 0, 1);
     p1.get(7).setSquare(0, 1, 1);
     p1.get(7).setSquare(1, 1, 1);
         
     p1.add(new Shapes(2,3));
     p1.get(8).setSquare(0, 0, 1);
     p1.get(8).setSquare(1, 0, 0);
     p1.get(8).setSquare(0, 1, 1);
     p1.get(8).setSquare(1, 1, 1);
     p1.get(8).setSquare(0, 2, 0);
     p1.get(8).setSquare(1, 2, 1);
         
     p1.add(new Shapes(5,1));
     p1.get(9).setSquare(0, 0, 1);
     p1.get(9).setSquare(1, 0, 1);
     p1.get(9).setSquare(2, 0, 1);
     p1.get(9).setSquare(3, 0, 1);
     p1.get(9).setSquare(4, 0, 1);
         
     p1.add(new Shapes(4,2));
     p1.get(10).setSquare(0, 0, 0);
     p1.get(10).setSquare(1, 0, 0);
     p1.get(10).setSquare(2, 0, 0);
     p1.get(10).setSquare(3, 0, 1);
     p1.get(10).setSquare(0, 1, 1);
     p1.get(10).setSquare(1, 1, 1);
     p1.get(10).setSquare(2, 1, 1);
     p1.get(10).setSquare(3, 1, 1);
         
     p1.add(new Shapes(4,2));
     p1.get(11).setSquare(0, 0, 0);
     p1.get(11).setSquare(1, 0, 0);
     p1.get(11).setSquare(2, 0, 1);
     p1.get(11).setSquare(3, 0, 1);
     p1.get(11).setSquare(0, 1, 1);
     p1.get(11).setSquare(1, 1, 1);
     p1.get(11).setSquare(2, 1, 1);
     p1.get(11).setSquare(3, 1, 0);
         
     p1.add(new Shapes(3,2));
     p1.get(12).setSquare(0, 0, 0);
     p1.get(12).setSquare(1, 0, 1);
     p1.get(12).setSquare(2, 0, 1);
     p1.get(12).setSquare(0, 1, 1);
     p1.get(12).setSquare(1, 1, 1);
     p1.get(12).setSquare(2, 1, 1);
         
     p1.add(new Shapes(3,2));
     p1.get(13).setSquare(0, 0, 1);
     p1.get(13).setSquare(1, 0, 0);
     p1.get(13).setSquare(2, 0, 1);
     p1.get(13).setSquare(0, 1, 1);
     p1.get(13).setSquare(1, 1, 1);
     p1.get(13).setSquare(2, 1, 1);
         
     p1.add(new Shapes(4,2));
     p1.get(14).setSquare(0, 0, 1);
     p1.get(14).setSquare(1, 0, 1);
     p1.get(14).setSquare(2, 0, 1);
     p1.get(14).setSquare(3, 0, 1);
     p1.get(14).setSquare(0, 1, 0);
     p1.get(14).setSquare(1, 1, 1);
     p1.get(14).setSquare(2, 1, 0);
     p1.get(14).setSquare(3, 1, 0);
         
     p1.add(new Shapes(3,3));
     p1.get(15).setSquare(0, 0, 0);
     p1.get(15).setSquare(1, 0, 0);
     p1.get(15).setSquare(2, 0, 1);
     p1.get(15).setSquare(0, 1, 1);
     p1.get(15).setSquare(1, 1, 1);
     p1.get(15).setSquare(2, 1, 1);
     p1.get(15).setSquare(0, 2, 0);
     p1.get(15).setSquare(1, 2, 0);
     p1.get(15).setSquare(2, 2, 1);
         
     p1.add(new Shapes(3,3));
     p1.get(16).setSquare(0, 0, 1);
     p1.get(16).setSquare(1, 0, 1);
     p1.get(16).setSquare(2, 0, 1);
     p1.get(16).setSquare(0, 1, 0);
     p1.get(16).setSquare(1, 1, 0);
     p1.get(16).setSquare(2, 1, 1);
     p1.get(16).setSquare(0, 2, 0);
     p1.get(16).setSquare(1, 2, 0);
     p1.get(16).setSquare(2, 2, 1);
         
     p1.add(new Shapes(3,3));
     p1.get(17).setSquare(0, 0, 1);
     p1.get(17).setSquare(1, 0, 0);
     p1.get(17).setSquare(2, 0, 0);
     p1.get(17).setSquare(0, 1, 1);
     p1.get(17).setSquare(1, 1, 1);
     p1.get(17).setSquare(2, 1, 0);
     p1.get(17).setSquare(0, 2, 0);
     p1.get(17).setSquare(1, 2, 1);
     p1.get(17).setSquare(2, 2, 1);
         
     p1.add(new Shapes(3,3));
     p1.get(18).setSquare(0, 0, 1);
     p1.get(18).setSquare(1, 0, 1);
     p1.get(18).setSquare(2, 0, 0);
     p1.get(18).setSquare(0, 1, 0);
     p1.get(18).setSquare(1, 1, 1);
     p1.get(18).setSquare(2, 1, 0);
     p1.get(18).setSquare(0, 2, 0);
     p1.get(18).setSquare(1, 2, 1);
     p1.get(18).setSquare(2, 2, 1);
         
     p1.add(new Shapes(3,3));
     p1.get(19).setSquare(0, 0, 1);
     p1.get(19).setSquare(1, 0, 1);
     p1.get(19).setSquare(2, 0, 0);
     p1.get(19).setSquare(0, 1, 0);
     p1.get(19).setSquare(1, 1, 1);
     p1.get(19).setSquare(2, 1, 1);
     p1.get(19).setSquare(0, 2, 0);
     p1.get(19).setSquare(1, 2, 1);
     p1.get(19).setSquare(2, 2, 0);
         
     p1.add(new Shapes(3,3));
     p1.get(20).setSquare(0, 0, 0);
     p1.get(20).setSquare(1, 0, 1);
     p1.get(20).setSquare(2, 0, 0);
     p1.get(20).setSquare(0, 1, 1);
     p1.get(20).setSquare(1, 1, 1);
     p1.get(20).setSquare(2, 1, 1);
     p1.get(20).setSquare(0, 2, 0);
     p1.get(20).setSquare(1, 2, 1);
     p1.get(20).setSquare(2, 2, 0);
  }
  public void createShapes2()
  {
          p2.add(new Shapes(1,1));
          p2.get(0).setSquare(0, 0, 1);
     //System.out.println(p1.get(0).toString2(0,0));
          p2.add(new Shapes(2,1));
          p2.get(1).setSquare(0, 0, 1);
          p2.get(1).setSquare(1, 0, 1);
  //   System.out.println(p1.get(1).toString2(1,0));
          
          p2.add(new Shapes(3,1));
          p2.get(2).setSquare(0, 0, 1);
          p2.get(2).setSquare(1, 0, 1);
          p2.get(2).setSquare(2, 0, 1);
     //System.out.println(p1.get(2).toString2(1,0));
          p2.add(new Shapes(2,2));
          p2.get(3).setSquare(0, 0, 1);
          p2.get(3).setSquare(1, 0, 1);
          p2.get(3).setSquare(0, 1, 0);
          p2.get(3).setSquare(1, 1, 1);
          
          p2.add(new Shapes(4,1));
          p2.get(4).setSquare(0, 0, 1);
          p2.get(4).setSquare(1, 0, 1);
          p2.get(4).setSquare(2, 0, 1);
          p2.get(4).setSquare(3, 0, 1);
         
          p2.add(new Shapes(3,2));
          p2.get(5).setSquare(0, 0, 0);
          p2.get(5).setSquare(1, 0, 0);
          p2.get(5).setSquare(2, 0, 1);
          p2.get(5).setSquare(0, 1, 1);
          p2.get(5).setSquare(1, 1, 1);
          p2.get(5).setSquare(2, 1, 1);
         
          p2.add(new Shapes(3,2));
          p2.get(6).setSquare(0, 0, 1);
          p2.get(6).setSquare(1, 0, 1);
          p2.get(6).setSquare(2, 0, 1);
          p2.get(6).setSquare(0, 1, 0);
          p2.get(6).setSquare(1, 1, 1);
          p2.get(6).setSquare(2, 1, 0);
         
          p2.add(new Shapes(2,2));
     p2.get(7).setSquare(0, 0, 1);
     p2.get(7).setSquare(1, 0, 1);
     p2.get(7).setSquare(0, 1, 1);
     p2.get(7).setSquare(1, 1, 1);
         
     p2.add(new Shapes(2,3));
     p2.get(8).setSquare(0, 0, 1);
     p2.get(8).setSquare(1, 0, 0);
     p2.get(8).setSquare(0, 1, 1);
     p2.get(8).setSquare(1, 1, 1);
     p2.get(8).setSquare(0, 2, 0);
     p2.get(8).setSquare(1, 2, 1);
         
     p2.add(new Shapes(5,1));
     p2.get(9).setSquare(0, 0, 1);
     p2.get(9).setSquare(1, 0, 1);
     p2.get(9).setSquare(2, 0, 1);
     p2.get(9).setSquare(3, 0, 1);
     p2.get(9).setSquare(4, 0, 1);
         
     p2.add(new Shapes(4,2));
     p2.get(10).setSquare(0, 0, 0);
     p2.get(10).setSquare(1, 0, 0);
     p2.get(10).setSquare(2, 0, 0);
     p2.get(10).setSquare(3, 0, 1);
     p2.get(10).setSquare(0, 1, 1);
     p2.get(10).setSquare(1, 1, 1);
     p2.get(10).setSquare(2, 1, 1);
     p2.get(10).setSquare(3, 1, 1);
         
     p2.add(new Shapes(4,2));
     p2.get(11).setSquare(0, 0, 0);
     p2.get(11).setSquare(1, 0, 0);
     p2.get(11).setSquare(2, 0, 1);
     p2.get(11).setSquare(3, 0, 1);
     p2.get(11).setSquare(0, 1, 1);
     p2.get(11).setSquare(1, 1, 1);
     p2.get(11).setSquare(2, 1, 1);
     p2.get(11).setSquare(3, 1, 0);
         
     p2.add(new Shapes(3,2));
     p2.get(12).setSquare(0, 0, 0);
     p2.get(12).setSquare(1, 0, 1);
     p2.get(12).setSquare(2, 0, 1);
     p2.get(12).setSquare(0, 1, 1);
     p2.get(12).setSquare(1, 1, 1);
     p2.get(12).setSquare(2, 1, 1);
         
     p2.add(new Shapes(3,2));
     p2.get(13).setSquare(0, 0, 1);
     p2.get(13).setSquare(1, 0, 0);
     p2.get(13).setSquare(2, 0, 1);
     p2.get(13).setSquare(0, 1, 1);
     p2.get(13).setSquare(1, 1, 1);
     p2.get(13).setSquare(2, 1, 1);
         
     p2.add(new Shapes(4,2));
     p2.get(14).setSquare(0, 0, 1);
     p2.get(14).setSquare(1, 0, 1);
     p2.get(14).setSquare(2, 0, 1);
     p2.get(14).setSquare(3, 0, 1);
     p2.get(14).setSquare(0, 1, 0);
     p2.get(14).setSquare(1, 1, 1);
     p2.get(14).setSquare(2, 1, 0);
     p2.get(14).setSquare(3, 1, 0);
         
     p2.add(new Shapes(3,3));
     p2.get(15).setSquare(0, 0, 0);
     p2.get(15).setSquare(1, 0, 0);
     p2.get(15).setSquare(2, 0, 1);
     p2.get(15).setSquare(0, 1, 1);
     p2.get(15).setSquare(1, 1, 1);
     p2.get(15).setSquare(2, 1, 1);
     p2.get(15).setSquare(0, 2, 0);
     p2.get(15).setSquare(1, 2, 0);
     p2.get(15).setSquare(2, 2, 1);
         
     p2.add(new Shapes(3,3));
     p2.get(16).setSquare(0, 0, 1);
     p2.get(16).setSquare(1, 0, 1);
     p2.get(16).setSquare(2, 0, 1);
     p2.get(16).setSquare(0, 1, 0);
     p2.get(16).setSquare(1, 1, 0);
     p2.get(16).setSquare(2, 1, 1);
     p2.get(16).setSquare(0, 2, 0);
     p2.get(16).setSquare(1, 2, 0);
     p2.get(16).setSquare(2, 2, 1);
         
     p2.add(new Shapes(3,3));
     p2.get(17).setSquare(0, 0, 1);
     p2.get(17).setSquare(1, 0, 0);
     p2.get(17).setSquare(2, 0, 0);
     p2.get(17).setSquare(0, 1, 1);
     p2.get(17).setSquare(1, 1, 1);
     p2.get(17).setSquare(2, 1, 0);
     p2.get(17).setSquare(0, 2, 0);
     p2.get(17).setSquare(1, 2, 1);
     p2.get(17).setSquare(2, 2, 1);
         
     p2.add(new Shapes(3,3));
     p2.get(18).setSquare(0, 0, 1);
     p2.get(18).setSquare(1, 0, 1);
     p2.get(18).setSquare(2, 0, 0);
     p2.get(18).setSquare(0, 1, 0);
     p2.get(18).setSquare(1, 1, 1);
     p2.get(18).setSquare(2, 1, 0);
     p2.get(18).setSquare(0, 2, 0);
     p2.get(18).setSquare(1, 2, 1);
     p2.get(18).setSquare(2, 2, 1);
         
     p2.add(new Shapes(3,3));
     p2.get(19).setSquare(0, 0, 1);
     p2.get(19).setSquare(1, 0, 1);
     p2.get(19).setSquare(2, 0, 0);
     p2.get(19).setSquare(0, 1, 0);
     p2.get(19).setSquare(1, 1, 1);
     p2.get(19).setSquare(2, 1, 1);
     p2.get(19).setSquare(0, 2, 0);
     p2.get(19).setSquare(1, 2, 1);
     p2.get(19).setSquare(2, 2, 0);
         
     p2.add(new Shapes(3,3));
     p2.get(20).setSquare(0, 0, 0);
     p2.get(20).setSquare(1, 0, 1);
     p2.get(20).setSquare(2, 0, 0);
     p2.get(20).setSquare(0, 1, 1);
     p2.get(20).setSquare(1, 1, 1);
     p2.get(20).setSquare(2, 1, 1);
     p2.get(20).setSquare(0, 2, 0);
     p2.get(20).setSquare(1, 2, 1);
     p2.get(20).setSquare(2, 2, 0);
  }
}