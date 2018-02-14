import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
     
               
import javax.swing.JPanel;
     
     
public class BlokusPanel  extends JPanel  implements MouseListener,MouseMotionListener, KeyListener{
    BlokusGame blokus = new BlokusGame();
    private double mouseX;
    private double mouseY;
    private double startX=-1;
    private double startY=-1;
    private double deltaX=0;
    private double deltaY=0;
    private int size=15;
    private int fixer=0;
    private int fixer2=0;
    private int oldFixer=-1;
    private int oldFixer2=-1;
    ArrayList<Integer> fixers = new ArrayList<>();
    private boolean dragging=false;
    public BlokusPanel()
    {
        //create the panel
        super();
                          
        //sets the size of the panel
        setSize(1010,600);
                                 
           try
           {
           //
           }
           catch(Exception e)
           {
           System.out.println("Error Loading Images: " + e.getMessage());
           e.printStackTrace();
           }
                                 
                addKeyListener(this);
                addMouseListener(this); 
                addMouseMotionListener(this); 
                             
                             
                              
                             
    }
         
    public void paint(Graphics g)
    {
        g.setColor(Color.GRAY);
        g.fillRect(0,0, 1010, 600);
        g.setColor(new Color(211,211,211,211));
        g.fillRect(200,0, 602, 600);
        for(int i=0; i<=14;i++)
        {
            g.setColor(Color.BLACK);
            if(i>0 && i<14)
            g.drawLine(200+i*43, 0,200+i*43, 600);
            g.drawLine(200, i*43,800, i*43);
        }
             
       
             int x= 0;
             int y=0;
             do
             {
                 if(x<4)
                 {
                     for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                     {
                     for (int i=0; i<blokus.p1.get(x).colA; i++)
                     {
                               
                       if(blokus.p1.get(x).getSquare(j,i)==1)
                        {
                        g.setColor(Color.ORANGE);
                        g.fillRect(i*blokus.p1.get(x).getSize()+(20*(x+1))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(20)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                        g.setColor(Color.BLACK);
                        g.drawRect(i*blokus.p1.get(x).getSize()+(20*(x+1))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(20)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                         }
                       }
                    }
                 }
                 else if(x>=4 && x<8)
                 {
                      for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                      {
                      for (int i=0; i<blokus.p1.get(x).colA; i++)
                      {
                                
                        if(blokus.p1.get(x).getSquare(j,i)==1)
                         {
                           g.setColor(Color.ORANGE);
                            if(x<6)
                             {
                                 g.fillRect(i*blokus.p1.get(x).getSize()+(20*(x-3))+blokus.p1.get(x).getDeltaX(),j*(blokus.p1.get(x).getSize())+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), blokus.p1.get(x).getSize());
                             g.setColor(Color.BLACK);
                             g.drawRect(i*blokus.p1.get(x).getSize()+(20*(x-3))+blokus.p1.get(x).getDeltaX(),j*(blokus.p1.get(x).getSize())+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), (blokus.p1.get(x).getSize()));
                             }
                             else if(x==6)
                             {
                                 g.fillRect(i*(blokus.p1.get(x).getSize())+(30*(x-3))+blokus.p1.get(x).getDeltaX(),j*(blokus.p1.get(x).getSize())+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), (blokus.p1.get(x).getSize()));
                                 g.setColor(Color.BLACK);
                                 g.drawRect(i*(blokus.p1.get(x).getSize())+(30*(x-3))+blokus.p1.get(x).getDeltaX(),j*(blokus.p1.get(x).getSize())+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), (blokus.p1.get(x).getSize()));
                             }
                             else if(x>6)
                             {
                                 g.fillRect(i*(blokus.p1.get(x).getSize())+(32*(x-3))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), (blokus.p1.get(x).getSize()));
                                 g.setColor(Color.BLACK);
                                 g.drawRect(i*(blokus.p1.get(x).getSize())+(32*(x-3))+blokus.p1.get(x).getDeltaX(),j*(blokus.p1.get(x).getSize())+(80)+blokus.p1.get(x).getDeltaY(), (blokus.p1.get(x).getSize()), (blokus.p1.get(x).getSize()));
                             }
                          }
                        }
                     }
                         
                 }
                 else if(x>7 && x<12)
                 { 
                  if(x==8)
                     y=0;
                      for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                       {
                       for (int i=0; i<blokus.p1.get(x).colA; i++)
                          {
                            if(blokus.p1.get(x).getSquare(j,i)==1)
                            {
                                g.setColor(Color.ORANGE);
                                g.fillRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(150)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                                g.setColor(Color.BLACK);
                                g.drawRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(150)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                            }
                           }
                        }
                 }
                 else if(x>11 && x<16)
                 {
                     if(x==12)
                         y=0;
                     for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                     {
                     for (int i=0; i<blokus.p1.get(x).colA; i++)
                        {
                          if(blokus.p1.get(x).getSquare(j,i)==1)
                            {
                                g.setColor(Color.ORANGE);
                                g.fillRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(230)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                                g.setColor(Color.BLACK);
                                g.drawRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(230)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                            }
                         }
                      }
                 }
                 else if(x>15 && x<20)
                 {
                     if(x==16)
                         y=0;
                      for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                      {
                      for (int i=0; i<blokus.p1.get(x).colA; i++)
                         {
                           if(blokus.p1.get(x).getSquare(j,i)==1)
                            {
                                g.setColor(Color.ORANGE);
                                g.fillRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(300)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                                g.setColor(Color.BLACK);
                                g.drawRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX(),j*blokus.p1.get(x).getSize()+(300)+blokus.p1.get(x).getDeltaY(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                            }
                          }
                       }
                 }
                 else if(x==20)
                 {
                     y=0;
                     for(int j=0; j<blokus.p1.get(x).rowA;j++) 
                     {
                     for (int i=0; i<blokus.p1.get(x).colA; i++)
                        {
                          if(blokus.p1.get(x).getSquare(j,i)==1)
                            {
                                g.setColor(Color.ORANGE);
                                g.fillRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX()+blokus.p1.get(x).getDiff(),j*blokus.p1.get(x).getSize()+(350)+blokus.p1.get(x).getDeltaY()+blokus.p1.get(x).getDiffy(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                                g.setColor(Color.BLACK);
                                g.drawRect(i*blokus.p1.get(x).getSize()+(50*(y))+blokus.p1.get(x).getDeltaX()+blokus.p1.get(x).getDiff(),j*blokus.p1.get(x).getSize()+(350)+blokus.p1.get(x).getDeltaY()+blokus.p1.get(x).getDiffy(), blokus.p1.get(x).getSize(), blokus.p1.get(x).getSize());
                            }
                         }
                      }
                 }
                 x++;
                 y++;
             }while(x<blokus.p1.size());
                   
                  x=0;
                  y=0;
           do
           {    
               if(x<4)
               {
                   for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                  {
                   for (int i=0; i<blokus.p2.get(x).colA; i++)
                   {
                             
                        if(blokus.p2.get(x).getSquare(j,i)==1)
                      {
                      g.setColor(Color.MAGENTA);
                      g.fillRect(i*blokus.p2.get(x).getSize()+(50*(x+1)+760)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(20)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                      g.setColor(Color.BLACK);
                      g.drawRect(i*blokus.p2.get(x).getSize()+(50*(x+1)+760)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(20)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                   }
                 }
               }
              }
               else if(x>3 && x<8)
               {
                    
                 for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                 {
                      for (int i=0; i<blokus.p2.get(x).colA; i++)
                      {
                             
                        if(blokus.p2.get(x).getSquare(j,i)==1)
                         {
                              g.setColor(Color.MAGENTA);
                              g.fillRect(i*blokus.p2.get(x).getSize()+(50*(x+1)+560)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(80)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                              g.setColor(Color.BLACK);
                              g.drawRect(i*blokus.p2.get(x).getSize()+(50*(x+1)+560)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(80)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                         }
                   }
                 }
               }
               else if(x>7 && x<12)
               { 
                if(x==8)
                 y=0;
                  for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                     {
                       for (int i=0; i<blokus.p2.get(x).colA; i++)
                          {
                          if(blokus.p2.get(x).getSquare(j,i)==1)
                            {
                                g.setColor(Color.MAGENTA);
                                g.fillRect(i*blokus.p2.get(x).getSize()+(50*(y)+820)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(150)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                                g.setColor(Color.BLACK);
                                g.drawRect(i*blokus.p2.get(x).getSize()+(50*(y)+820)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(150)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                            }
                         }
                      }
               }
               else if(x>11 && x<16)
               {
                 if(x==12)
                     y=0;
                 for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                   {
                   for (int i=0; i<blokus.p2.get(x).colA; i++)
                      {
                        if(blokus.p2.get(x).getSquare(j,i)==1)
                        {
                            g.setColor(Color.MAGENTA);
                            g.fillRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(230)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                            g.setColor(Color.BLACK);
                            g.drawRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(230)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                        }
                       }
                    }
               }
               else if(x>15 && x<20)
               {
                 if(x==16)
                     y=0;
                  for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                    {
                    for (int i=0; i<blokus.p2.get(x).colA; i++)
                       {
                         if(blokus.p2.get(x).getSquare(j,i)==1)
                        {
                            g.setColor(Color.MAGENTA);
                            g.fillRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(300)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                            g.setColor(Color.BLACK);
                            g.drawRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(300)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                        }
                        }
                     }
               }
               else if(x==20)
               {
                 y=0;
                 for(int j=0; j<blokus.p2.get(x).rowA;j++) 
                   {
                   for (int i=0; i<blokus.p2.get(x).colA; i++)
                      {
                        if(blokus.p2.get(x).getSquare(j,i)==1)
                        {
                            g.setColor(Color.MAGENTA);
                            g.fillRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(350)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                            g.setColor(Color.BLACK);
                            g.drawRect(i*blokus.p2.get(x).getSize()+(50*(y)+810)+blokus.p2.get(x).getDeltaX(),j*blokus.p2.get(x).getSize()+(350)+blokus.p2.get(x).getDeltaY(), blokus.p2.get(x).getSize(), blokus.p2.get(x).getSize());
                        }
                       }
                    }
               }
                     
               x++;
               y++;
           }while(x<blokus.p2.size());
            
              
         //    System.out.println(+blokus.p1.get(20).getDeltaX());
    }
    public void update()
    {
             
        blokus.update();
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
              
    }
         
    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
                 
    }
         
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyChar() == 'r')
        {
         // blokus.p2.get(i).rotate();
                                   
        }
    }
     
    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
             
    }
     
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
             
    }
     
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
             
    }
     
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        mouseX=e.getX();
        mouseY= e.getY();
            
         
                //    ;
        Point point = e.getPoint();
            
          //System.out.println("mousePressed at " + point);
           
          startX = point.x;
     //
         startY = point.y;
          
          dragging = true;
               
          if(blokus.turn==1)
                 for(int i=0; i<blokus.p1.size();i++)
                 {
                     if(fixers.size()>0)
                     {
                     for(int j=0; j<fixers.size(); j++)
                     if(checkArea1(i) && i!=fixers.get(j))
                         {
                         fixer=i;
                         break;
                         }
                     }
                     else if(checkArea1(i))
                     {
                         fixer=i;
                         break; 
                     }
                 }
                
          else if(blokus.turn==2)
                for(int i=0; i<blokus.p2.size();i++)
                {
                  if(checkArea2(i))
                      {
                      fixer2=i;
                      break;
                      }
                }
              
       
        repaint();
             
    }
     
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    	System.out.println(+blokus.p1.get(20).getDeltaX());
        if(mouseX<200 || mouseX<1 || mouseX>800)
        { 
            if(blokus.turn==1)
            {
                blokus.p1.get(fixer).setDeltaX(0);
             blokus.p1.get(fixer).setDeltaY(0);
            }
         else if(blokus.turn==2)
          {
              blokus.p2.get(fixer2).setDeltaX(0);
             blokus.p2.get(fixer2).setDeltaY(0);
          }
                    
              
        }
        else
        {
            if(blokus.turn==1) 
                    {
                if(fixer==20)
                {
                    enlarge1(fixer);
                }
                int I=0;
                int J=0;
                for(J=0; J<blokus.p1.get(20).rowA ;J++)
                	for(I=0; I<blokus.p1.get(20).rowA ;I++)
                	{
                		 if(blokus.p1.get(20).getSquare(J,I)==1)
                         {
                			 break;
                         }
                	}
                int diff=0;
                int diffy=0;
                 for(int r=0; r<blokus.b.board.length;r++)
                   for(int c=0; c<blokus.b.board[0].length; c++)
                   {
                	   //System.out.println(r*43-I*43+blokus.p1.get(20).getDeltaX());
                	   
                       if(r==0 && c==0)
                       {
                           diff=r*43+200-I*43+blokus.p1.get(20).getDeltaX();
                           diffy=c*43-J*43+350+blokus.p1.get(20).getDeltaY();
                       }
                       else
                       {
                            if(Math.abs(r*43+200-I*43+blokus.p1.get(20).getDeltaX())< Math.abs(diff))
                           {
                            diff=r*43+200-I*43+blokus.p1.get(20).getDeltaX();
                           }
                            if(Math.abs(c*43-J*43+350+blokus.p1.get(20).getDeltaY())< Math.abs(diffy))
                           {
                                diffy=c*43-J*43+350+blokus.p1.get(20).getDeltaY();
                           }
                       }
                    
                   }
                   
                 blokus.p1.get(20).setDiff(diff);
                 blokus.p1.get(20).setDiffy(diffy);
                // x and y 
                    //chain.add(oldFixer);
                     oldFixer=fixer;
                     blokus.turn=2;
                    }
            else if(blokus.turn==2)
                 {oldFixer2= fixer2;blokus.turn=1;}
            //System.out.println(blokus.turn);
          
        }
            
         dragging=false;
             
         repaint();
    }
     
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub 
        Point p = e.getPoint();
                
               //System.out.println("mouse Dragged to " + p);
               mouseX=p.x;
               mouseY=p.getY();
                  
         if(dragging)
         { 
            if(blokus.turn==1)
            {
                 if(checkArea1(fixer))
                 {
                   
                     blokus.p1.get(fixer).setDeltaX((int)(mouseX-startX));
                     blokus.p1.get(fixer).setDeltaY((int)(mouseY-startY));
                //deltaX=mouseX-startX;
                //deltaY=mouseY-startY;
                    /*if(mouseX> 200 && mouseX<800)
                    {
                        enlarge1(fixer);
                    }
                    else
                    {
                        shrink1(fixer);
                    }*/  repaint();
                 }
            }
              
            else if(blokus.turn==2)
            {
                if(checkArea2(fixer2)&& fixer2!=oldFixer2)
                {
                    blokus.p2.get(fixer2).setDeltaX((int)(mouseX-startX));
                    blokus.p2.get(fixer2).setDeltaY((int)(mouseY-startY));
                }
                repaint();
            }
             //System.out.println(mouseX-startX);
             
    
         }
    }
     
    @Override
    public void mouseMoved(MouseEvent arg0) {
        // TODO Auto-generated method stub
             
    }
       
    public boolean enlarge1(int i)
    {
        blokus.p1.get(i).setterSize(43);
        return true;
    }
    public boolean shrink1(int i)
    {
        blokus.p1.get(i).setterSize(15);
        return true;
    }
    public boolean enlarge2(int i)
    { 
        blokus.p2.get(i).setterSize(43);
        return true;
    }
    public boolean shrink2(int i)
    {
        blokus.p2.get(i).setterSize(15);
        return true;
    }
    public boolean checkArea2(int index)
    {
        boolean z=false;
        int placing=-1;
        int spacing=-1;
        int fixing =50;
        int Xspacing=-1;
        if(index>-1 && index<4)
        {
            spacing=20;
            placing=1;
            Xspacing=760;
        }
        else if(index>3 && index<8)
        {
            spacing=80;
            placing=1;
            Xspacing=560;
        }
        else if(index>7 && index<12)
        {
            spacing=150;
            placing=-index+index-8;
            Xspacing=820;
        }
        else if(index>11 && index<16)
        {
            spacing= 230;
            placing=-index+index-12;
            Xspacing=810;
        }
        else if(index>15 && index<20)
        {
            spacing= 300;
            placing=-index+index-16;
            Xspacing=810;
        }
        else if(index==20)
        {
            spacing= 350;
            placing=-index;
            Xspacing=810;
        }
            
        for(int j=0; j<blokus.p2.get(index).rowA;j++) 
        {
        for (int i=0; i<blokus.p2.get(index).colA; i++)
        {
                  
          if(blokus.p2.get(index).getSquare(j,i)==1)
           {
              Rectangle r= new Rectangle(i*blokus.p2.get(index).getSize()+(fixing*(index+(placing))+Xspacing)+blokus.p2.get(index).getDeltaX(),j*blokus.p2.get(index).getSize()+(spacing)+blokus.p2.get(index).getDeltaY(), blokus.p2.get(index).getSize(), blokus.p2.get(index).getSize());
              //System.out.println(i*15+(fixing*(index+(placing))));
                   
             z= r.contains(new Point((int)mouseX,(int)mouseY));
             //System.out.println(mouseX);
                
             if(z)
                 return true;
            }
          }
       }
            
     return z;
    }
    public boolean checkArea1(int index)
    {
        boolean z=false;
        int placing=-1;
        int spacing=-1;
        int fixing =50;
        if(index>-1 && index<4)
        {
            fixing=20;
            spacing=20;
            placing=1;
        }
        else if(index>3 && index<6)
        {
            fixing=20;
         spacing =80;
         placing=-3;
        }
        else if(index==6)
        {
            fixing=30;
            spacing=80;
            placing=-3;
        }
        else if(index==7)
        {
            fixing=32;
            spacing=80;
            placing=-3;
        }
        else if(index>7 && index<12)
        {
            fixing =50;
            spacing= 150;
            placing=-index+index-8;
        }
        else if(index>11 && index<16)
        {
            fixing =50;
            spacing= 230;
            placing=-index+index-12;
        }
        else if(index>15 && index<20)
        {
            fixing =50;
            spacing= 300;
            placing=-index+index-16;
        }
        else if(index==20)
        {
            fixing =50;
            spacing= 350;
            placing=-index;
        }
         for(int j=0; j<blokus.p1.get(index).rowA;j++) 
         {
         for (int i=0; i<blokus.p1.get(index).colA; i++)
         {
                   
           if(blokus.p1.get(index).getSquare(j,i)==1)
            {
               Rectangle r= new Rectangle((i*blokus.p1.get(index).getSize()+(fixing*(index+(placing)))+blokus.p1.get(index).getDeltaX()),j*blokus.p1.get(index).getSize()+(spacing)+blokus.p1.get(index).getDeltaY(), blokus.p1.get(index).getSize(), blokus.p1.get(index).getSize());
              // System.out.println(i*15+(fixing*(index+(placing))));
                    
              z= r.contains(new Point((int)mouseX,(int)mouseY));
                 
              if(z)
                  return true;
             }
           }
        }
             
      return z;
    }
        
}