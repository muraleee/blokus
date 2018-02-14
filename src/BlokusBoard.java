public class BlokusBoard {
   int[][] board;
    public BlokusBoard()
  {
      board= new int[14][14];
  }
    public double Area1()
    {
        double play1=0;
        for(int r=0; r<board.length; r++)
            for(int c=0; c<board[0].length; c++)
            {
                 if(board[r][c]==1)
                     play1++;
            }
        return play1/196*100;
    }
    public double Area2()
    {
        double play2=0;
        for(int r=0; r<board.length; r++)
            for(int c=0; c<board[0].length; c++)
            {
                 if(board[r][c]==2)
                     play2++;
            }
        return play2/196*100;
    }
}