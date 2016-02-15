
/*

Game created by Constantinos Constantinou
on the January of the 2016 

*/

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

	import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import java.lang.Object;
import java.awt.Robot;
	
	 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

/*

         TIC - TAC - TOE GAME .......

  rows -> columns
   
            ||
	    \/

   A -> A1 - A2 - A3

   B -> B1 - B2 - B3

   C -> C1 - C2 - C3
   
	    ||
	    \/

####################
 @          @            @            @
 @          @            @            @
 @          @            @            @
 ###################
 @          @            @            @
 @          @            @            @
 @          @            @            @
 ###################
 @          @            @            @
 @          @            @            @
 @          @            @            @
 ###################
 
 	    ||
	    \/
	    
player win cases : 
	    
   A1 - A2 - A3

  B1 - B2 - B3

   C1 - C2 - C3
   
   A1 - B1 - C1
   
   A2 - B2  - C2 
   
  A3 - B3 - C3
  
 A1  - B2  - C3
 
 A3 - B2  - C1 
 
  [ player integer : 1 ]
	    
robot win cases : 
	    
A1 - A2 - A3

  B1 - B2 - B3

   C1 - C2 - C3
   
   A1 - B1 - C1
   
   A2 - B2  - C2 
   
  A3 - B3 - C3
  
 A1  - B2  - C3
 
 A3 - B2  - C1 
 
 [ robot integer : 2 ]
 
 else game result in a draw ..... 

*/

public class TicTacToe extends JFrame 
{
	
	private   JLabel StartGame;
	 private    JLabel ResetGame;
	  private   JLabel ProgramInstructions;
		private  JLabel  EXIT;  
	private  JLabel  programAuthor;
         	
	private   JLabel playerW;
	private   JLabel  tie;
	private   JLabel robotW;
	
		private   JLabel playerWint;
	private   JLabel  tieINT;
	private   JLabel robotWint;
	
	private  ImageIcon playerCircle= new ImageIcon("circle.jpg");
	private  ImageIcon robotDiagonalCross = new ImageIcon("diagonalCross.png");
	
	private  Color mycolor;
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
	
	private  JMenuBar KBMenuBar;
        private  JMenu MENU;
	 private  JMenu ABOUT;
	
	private  boolean exec,player,robot,TIE;
	
	private  int [][] array=new int[3][3];
	
	private  int [] score=new int[3];
	
	private  int gameTurns; 
	
	private  JPanel programMENU;  
	private  JPanel gameScore;
	private  JPanel R123Container;
	private  JPanel Container; 
	
	private  JButton R1C1;
	private  JButton R1C2;
	private  JButton R1C3;
	
	private  JButton R2C1;
	private  JButton R2C2;
	private  JButton R2C3;
	
	private  JButton R3C1;
	private  JButton R3C2;
	private  JButton R3C3;
	
	  private Random rand = new Random();
  
  private int  n, stch ; 
  
	private int isopalia=0;
  
  public void result(int gameTurns, int [][] array, JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3, int [] score )
  {
	  
	  // pressed jbuttons positioning array - player & robot - .... 
		  
		  //
		  // player cases 
		  //
		  
		  // player case A1 - A2 - A3
		  if(   array[0][0]==1 && array[0][1]==1 && array[0][2]==1  )
		  {
                         			  
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
			  score[0]++;
			  			  
			  playerWint.setText(Integer.toString(score[0]));
			  
			  player=true;
			  
			  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			  			
		}
		  
		  // player case   B1 - B2 - B3
		  else if  ( array[1][0]==1 && array[1][1]==1 && array[1][2]==1  )
			  {
			  
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			 
				  score[0]++;
				  
			 playerWint.setText(Integer.toString(score[0]));
				  
				 player=true; 
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
				  		
		}
		  
		  // player case    C1 - C2 - C3
		  else if(    array[2][0]==1 && array[2][1]==1 && array[2][2]==1  )
			  {
			
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[0]++;
				  
			playerWint.setText(Integer.toString(score[0]));
				  
				  player=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
				  			
		}
		  
		  // player case A1 - B1 - C1
		 else if(     array[0][0]==1 && array[1][0]==1 && array[2][0]==1  )
			 {
			 
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			 
				 score[0]++;
				 
				  playerWint.setText(Integer.toString(score[0]));
			
				 player=true;
				 
				 frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		  // player case   A2 - B2  - C2 
		  else if(      array[0][1]==1 && array[1][1]==1 && array[2][1]==1  )
			  {
			 
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			 
				  score[0]++;
				  
				   playerWint.setText(Integer.toString(score[0]));
			  
				player=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		  // player case  A3 - B3 - C3
		  else if(      array[0][2]==1 && array[1][2]==1 && array[2][2]==1  )
			  {
			  
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[0]++;
				  
				   playerWint.setText(Integer.toString(score[0]));
			   
				  player=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			 
			}
		  
		  // player case  A1  - B2  - C3
		  else if(      array[0][0]==1 && array[1][1]==1 && array[2][2]==1  )
			  {
			  
		  JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[0]++;
				  
				  playerWint.setText(Integer.toString(score[0]));
			   
				 player=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		  // player case A3 - B2  - C1 
		  else if(      array[0][2]==1 && array[1][1]==1 && array[2][0]==1  )
			  {
			 
		    	JOptionPane.showMessageDialog(null, "Game result is : Player wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[0]++;
				  
			 playerWint.setText(Integer.toString(score[0]));
			  
				 player=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		//
		// robot cases 
		 // 
		  
		  // robot case A1 - A2 - A3
		else if(    array[0][0]==2 && array[0][1]==2 && array[0][2]==2 )
			{
			   	
		JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			
				score[2]++;
				
				robotWint.setText(Integer.toString(score[2]));
		
				robot=true;
				
				frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
				
			}
		
		 // robot case   B1 - B2 - B3
		  else if(   array[1][0]==2 && array[1][1]==2 && array[1][2]==2  )
			  {
			  
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[2]++;
				  
				 robotWint.setText(Integer.toString(score[2]));
			
				  robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		   // robot case    C1 - C2 - C3
		  else if(      array[2][0]==2 && array[2][1]==2 && array[2][2]==2 )
			  {
			  
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			 
				  score[2]++;
				  
				 robotWint.setText(Integer.toString(score[2]));
			  
				 robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		   // robot case  A1 - B1 - C1
		  else if(       array[0][0]==2 && array[1][0]==2 && array[2][0]==2  )
			  {
				  
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			
				  score[2]++;
				  
			robotWint.setText(Integer.toString(score[2]));
			
				  robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
				  }
		  
		  // robot case   A2 - B2  - C2 
		  else if(       array[0][1]==2 && array[1][1]==2 && array[2][1]==2  )
			  {
			 
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
		   
				  score[2]++;
				  
			robotWint.setText(Integer.toString(score[2]));
			  
				robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
		
			}
		  
		  // robot case  A3 - B3 - C3
		  else if(      array[0][2]==2 && array[1][2]==2 && array[2][2]==2  )
			  {
			  
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			 
				  score[2]++;
				  
			robotWint.setText(Integer.toString(score[2]));
			 
				    robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
			}
		  
		   // robot case  A1  - B2  - C3
		  else if(       array[0][0]==2 && array[1][1]==2 && array[2][2]==2  )
			  {
			  
		    	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
			  
				  score[2]++;
				  
			robotWint.setText(Integer.toString(score[2]));
				  
				robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
				  				  
				}
		  
		   // robot case A3 - B2  - C1 
		  else if(       array[0][2]==2 && array[1][1]==2 && array[2][0]==2 )
			  {
			  
		  	JOptionPane.showMessageDialog(null, "Game result is : Robot wins", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
		  
				  score[2]++;
				  
			robotWint.setText(Integer.toString(score[2]));
			  			
			 robot=true;
				  
				  frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
			
				}
		  
		  //
		   // switch(.......) statement default case  ::: game tie case 
		  //
		  
		
		else if (isopalia==9)
			{		  
				
	JOptionPane.showMessageDialog(null, "Game result is : Tie( Neither the  Player or the Robot have won the game . )", "INFORMATION MESSAGE !!!", JOptionPane.INFORMATION_MESSAGE);
		
				score[1]++;
				
				tieINT.setText(Integer.toString(score[1]));
				
				TIE=true;
				
				frozenButtons( R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3);
				
		}
			
}
  
  public void playerTurn( int stch, JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3, ImageIcon playerCircle )
  {
	  
	  
	switch(stch)
	{
	  
	  case 1:
		  
	  isopalia++;
		  
		  array[0][0] = 1 ;
		R1C1.setIcon(playerCircle);
		R1C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	
	  case 2:
		  
	   isopalia++;
		  
		  array[0][1] = 1 ;
		R1C2.setIcon(playerCircle);
		R1C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break; 
	  
	  case 3:
		  
	   isopalia++;
		  
		  array[0][2] = 1 ;
		R1C3.setIcon(playerCircle);
		R1C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	  
	   case 4:
		   
	    isopalia++;
		  
		  array[1][0] = 1 ;
		R2C1.setIcon(playerCircle);
		R2C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	   
	case 5:
		
	 isopalia++;
		  
		  array[1][1] = 1 ;
		R2C2.setIcon(playerCircle);
		R2C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	
	case 6:
		
	 isopalia++;
		  
		  array[1][2] = 1 ;
		R2C3.setIcon(playerCircle);
		R2C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	
	  case 7:
		  
	   isopalia++;
		  
		  array[2][0] = 1 ;
		R3C1.setIcon(playerCircle);
		R3C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	  
	case 8:
		
	 isopalia++;
		
		  
		  array[2][1] = 1 ;
		R3C2.setIcon(playerCircle);
		R3C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	
	 case 9:
		 
	  isopalia++;
		  
		  array[2][2] = 1 ;
		R3C3.setIcon(playerCircle);
		R3C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  
	  break;
	  
	 default:
		 
		 // do nothing ..... 
	 
	 break;
	 
         }
	  
  }
  
  


  
  public void robotTurn(int [][] array, int gameTurns, boolean exec,  JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3, ImageIcon robotDiagonalCross )
  {
	  
	
	  
         exec=false;
	  
	  while(exec == false)
	  {
		  n  = rand.nextInt(10) ;
		  
	  switch(n)
	{
		  
	  case 1:
		  
	  R1C1.setBackground(Color.DARK_GRAY);
		  
	  if(array[0][0] !=1 &&  array[0][0] !=2 && array[0][0] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[0][0] = 2 ;
		R1C1.setIcon(robotDiagonalCross);
		R1C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  else{
		exec = false;
		}
		
		R1C1.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 2:
		  
	  R1C2.setBackground(Color.DARK_GRAY);
		  
	    if(array[0][1] !=1 &&  array[0][1] !=2 && array[0][1] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[0][1] = 2 ;
		R1C2.setIcon(robotDiagonalCross);
		R1C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }	 
	  else{exec = false;}
	  
	  R1C2.setBackground(Color.WHITE);

		  
	  break;
	  
	  case 3:
		  
	  R1C3.setBackground(Color.DARK_GRAY);
		  
	    if(array[0][2] !=1 &&  array[0][2] !=2 && array[0][2] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[0][2] = 2 ;
		R1C3.setIcon(robotDiagonalCross);
		R1C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}
		  
		  R1C3.setBackground(Color.WHITE);

		  
	  break;
	  
	  case 4:
		  
	  R2C1.setBackground(Color.DARK_GRAY);
		  
	    if(array[1][0] !=1 &&  array[1][0] !=2 && array[1][0] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[1][0] = 2 ;
		R2C1.setIcon(robotDiagonalCross);
		R2C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}

		  R2C1.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 5:
		  
	  R2C2.setBackground(Color.DARK_GRAY);
		  
	    if(array[1][1] !=1 &&  array[1][1] !=2 && array[1][1] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[1][1] = 2 ;
		R2C2.setIcon(robotDiagonalCross);
		R2C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}

		  R2C2.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 6:
		  
	R2C3.setBackground(Color.DARK_GRAY);	  
		  
	    if(array[1][2] !=1 &&  array[1][2] !=2 && array[1][2] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[1][2] = 2 ;
		R2C3.setIcon(robotDiagonalCross);
		R2C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}

		  R2C3.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 7:
		  
	  R3C1.setBackground(Color.DARK_GRAY);
		  
	    if(array[2][0] !=1 &&  array[2][0] !=2 && array[2][0] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[2][0] = 2 ;
		R3C1.setIcon(robotDiagonalCross);
		R3C1.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}

		  R3C1.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 8:
		  
	  R3C2.setBackground(Color.DARK_GRAY);
		  
	    if(array[2][1] !=1 &&  array[2][1] !=2 && array[2][1] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[2][1] = 2 ;
		R3C2.setIcon(robotDiagonalCross);
		R3C2.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}

		  R3C2.setBackground(Color.WHITE);
		  
	  break;
	  
	  case 9:
		  
	  R3C3.setBackground(Color.DARK_GRAY);
		  
	    if(array[2][2] !=1 &&  array[2][2] !=2 && array[2][2] ==0 )
	  {
		  
		   isopalia++;
		  
		  array[2][2] = 2 ;
		R3C3.setIcon(robotDiagonalCross);
		R3C3.setEnabled(false);
		  
		  	   result(  gameTurns,    array,  
			R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  
			score);
		  
		  exec = true;
		  
	  }
	  	  else{exec = false;}
		  
                 R3C3.setBackground(Color.WHITE);
		  
		  
	  break;
	  
	  default:
		  
		  // some code .... 	
	  
	  exec = false;

	  break;
	 
	} 
	
	
     } 
	
	  
  }
  
     //  
 
   public void frozenButtons(JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3)
  {
	  
	  				//
				
	 R1C1.setEnabled(false);
		
	  R1C2.setEnabled(false);
		
	  R1C3.setEnabled(false);
		
	
	  R2C1.setEnabled(false);
		
	  R2C2.setEnabled(false);
		
	  R2C3.setEnabled(false);
		
	
	  R3C1.setEnabled(false);
	
	  R3C2.setEnabled(false);
	
	  R3C3.setEnabled(false);
	  
				//
				
	JOptionPane.showMessageDialog(null," \n Please choose Menu -> start a new game \n in order for you to start a new game. \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);

		  //
	  
  }
  
  //  
  
	public void clear(int gameTurns, int [][] array, JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3 )
	{
		
		//
		
		TIE=false;
		player=false;
		robot=false;
		
		//
		
		 isopalia=0;
		
				//
				
	 R1C1.setEnabled(true);
		R1C1.setIcon(null);
	  R1C2.setEnabled(true);
		R1C2.setIcon(null);
	  R1C3.setEnabled(true);
		R1C3.setIcon(null);
	
	  R2C1.setEnabled(true);
		R2C1.setIcon(null);
	  R2C2.setEnabled(true);
		R2C2.setIcon(null);
	  R2C3.setEnabled(true);
		R2C3.setIcon(null);
	
	  R3C1.setEnabled(true);
		R3C1.setIcon(null);
	  R3C2.setEnabled(true);
		R3C2.setIcon(null);
	  R3C3.setEnabled(true);
	  R3C3.setIcon(null);
		
				//
		
		gameTurns=0; // player start ..... 
		
		//
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=0;
			}
		}
		
		//
		
		exec=false;
		
		//
		
	}
	
	public void newGame( int gameTurns,  int [][] array, JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3 )
	{
		
		clear( gameTurns, array,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3 );
		JOptionPane.showMessageDialog(null," \n Robot starts first !!! ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
		robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
	}
	
	public  void resetGame( int gameTurns,  int [][] array,  JButton R1C1, JButton R1C2, JButton R1C3, JButton R2C1, JButton R2C2, JButton R2C3, JButton R3C1, JButton R3C2, JButton R3C3 )
	{
		
			//
		
		TIE=false;
		player=false;
		robot=false;
		
		//
		
		 isopalia=0;
		
				//
				
	 R1C1.setEnabled(false);
		R1C1.setIcon(null);
	  R1C2.setEnabled(false);
		R1C2.setIcon(null);
	  R1C3.setEnabled(false);
		R1C3.setIcon(null);
	
	  R2C1.setEnabled(false);
		R2C1.setIcon(null);
	  R2C2.setEnabled(false);
		R2C2.setIcon(null);
	  R2C3.setEnabled(false);
		R2C3.setIcon(null);
	
	  R3C1.setEnabled(false);
		R3C1.setIcon(null);
	  R3C2.setEnabled(false);
		R3C2.setIcon(null);
	  R3C3.setEnabled(false);
	  R3C3.setIcon(null);
		
				//
		
		gameTurns=0; // player start ..... 
		
		//
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=0;
			}
		}
		
		//
		
		exec=false;
		
				//
		
			JOptionPane.showMessageDialog(null," \n Please choose Menu -> start a new game \n in order for you to start a new game. \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);

                      //
		
	}
	
			 		      //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
	
	public TicTacToe()
	{
		 		      //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=0;
			}
		}
		
		//
		
		 // right integer - player , left integer - robot  
		for(int i=0;i<3;i++)
		{
			score[i]=0;
		}
		
		//
		
		player=false; // final  player initialization
		robot=false; // final  robot initialization
		
		//
		
		gameTurns=0;
		
		//
		
		JFrame frame=new JFrame("Tic Tac Toe Game Version 1.10");
		
		
		// initialize program jpanels
		
			
		
		 programMENU=new JPanel(); // program menu 
	 JPanel gameScore=new JPanel(); // program menu 
	 JPanel R123Container=new JPanel(); // curries the JPanels 1 to 3 ... use gridlayout(3X3) 
	 JPanel Container=new JPanel(); // carries the JPanel MENU along with the JPanel R123Container  and the JPanel gameScore 
		
		
		
		// initialize program layout
		
		programMENU.setLayout(new FlowLayout(FlowLayout.LEFT));
		programMENU.setBackground(Color.ORANGE);
		programMENU.setSize(new Dimension(100, 150));
		  programMENU.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		   
		gameScore.setLayout(new FlowLayout(FlowLayout.CENTER));
		gameScore.setBackground(Color.WHITE);
		gameScore.setSize(new Dimension(100, 150));
		  gameScore.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		R123Container.setLayout(new GridLayout(3,3,5,5));
		R123Container.setBackground(Color.CYAN);
		R123Container.setSize(new Dimension(350, 350));
		  R123Container.setBorder(BorderFactory.createLineBorder(Color.RED));
		  
		  Container.setLayout((new BoxLayout( Container, BoxLayout.Y_AXIS)));
		Container.setBackground(Color.RED);
		
				// initialize program layout
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////////			
		//
		// Program Menu  
		//    Create the menu bar   
		
        KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
        MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	StartGame=new JLabel("start a new game");
	  StartGame.setBackground(Color.WHITE);
	   StartGame.setForeground(Color.BLACK);
	 StartGame.setEnabled(true);
	StartGame.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =StartGame.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           StartGame.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          StartGame.setForeground(oldcolor);
         }
      }
      );
	StartGame.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
				
		 		try
				{
         newGame(  gameTurns,   array,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3 );             
                          	}
				catch(NullPointerException NullPointerException)
				{
					NullPointerException.getStackTrace();
				}
				
                       }
		
      }
      );
	 MENU.add(StartGame);
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	ResetGame=new JLabel("reset the current game");
	  ResetGame.setBackground(Color.WHITE);
	   ResetGame.setForeground(Color.BLACK);
	 ResetGame.setEnabled(true);
	ResetGame.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =ResetGame.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           ResetGame.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          ResetGame.setForeground(oldcolor);
         }
      }
      );
	ResetGame.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
				
		 		try
				{
					
				resetGame(  gameTurns,    array,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3 );
					
				}
				catch(NullPointerException NullPointerException)
				{
					NullPointerException.getStackTrace();
				}
				
                       }
		
      }
      );
	 MENU.add(ResetGame);
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
				
	EXIT=new JLabel("exit the tic tac toe game");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 	System.exit(0);
		 		
        }
		
      }
      );
	 MENU.add(EXIT);		
				
				 //
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
				//
		
		 programAuthor=new JLabel("game creator");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 		try {
    	
        File file = new File("E:/Scientific Arithmetic Calculator Version 1.20/creator.pdf");
    if (file.toString().endsWith(".pdf")) 
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
    else {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);
}
        
    } 
    	catch (IOException ex) 
    	{
    		
	JOptionPane.showMessageDialog(null," \n Game created by: \n Constantinos < tinoC23 /> Constantinou \n @ 09/01/2016 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
    }
		 		
        }
		
      }
      );
      ABOUT.add(programAuthor);
      
      //
      
      		programMENU.add(KBMenuBar);

      
		// initialize the program jbuttons 
		
				// initialize the scores panel
      
	  		
	playerW=new JLabel(" || Player Wins : ");
	playerW.setForeground(Color.BLACK);
	playerW.setFont(f);
	 gameScore.add(playerW);
	 
	 	playerWint=new JLabel(Integer.toString(score[0]));
	playerWint.setForeground(Color.BLACK);
	playerWint.setFont(f);
	 gameScore.add(playerWint);
	
	tie=new JLabel(" || Ties : ");
	tie.setForeground(Color.LIGHT_GRAY);
	tie.setFont(f);
	 gameScore.add(tie);
	 
	 	tieINT=new JLabel(Integer.toString(score[1]));
	tieINT.setForeground(Color.LIGHT_GRAY);
	tieINT.setFont(f);
	 gameScore.add(tieINT);
	
	
	robotW=new JLabel(" || Robot Wins: ");
	robotW.setForeground(Color.red);
	robotW.setFont(f);
	 gameScore.add(robotW);
	 
	 	robotWint=new JLabel(Integer.toString(score[2])+" || ");
	robotWint.setForeground(Color.red);
	robotWint.setFont(f);
	 gameScore.add(robotWint);
	 
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		
	R1C1=new JButton("");
		R1C1.setPreferredSize(new Dimension(100, 100));
		R1C1.setBackground(Color.WHITE);
		R1C1.setEnabled(false);
		R1C1.setToolTipText("");
		R1C1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
					stch=1;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	
					
				gameTurns++;
				
					
					
				}
				if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}	
				
					
			}
		});
		R123Container.add(R1C1);
		
	 R1C2=new JButton("");
		R1C2.setPreferredSize(new Dimension(100, 100));
		R1C2.setBackground(Color.WHITE);
			R1C2.setEnabled(false);
		R1C2.setToolTipText("");
		R1C2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=2;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	
				gameTurns++;
					
		
					       
				}
				 if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}	
					
					
			}
		});
		R123Container.add(R1C2);
		
	  R1C3=new JButton("");
		R1C3.setPreferredSize(new Dimension(100, 100));
		R1C3.setBackground(Color.WHITE);
			R1C3.setEnabled(false);
		R1C3.setToolTipText("");
		R1C3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=3;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	
		
					
				gameTurns++;
			
					
				}
				if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}	
				
					
			}
		});
		R123Container.add(R1C3);
	
	 R2C1=new JButton("");
		R2C1.setPreferredSize(new Dimension(100, 100));
		R2C1.setBackground(Color.WHITE);
			R2C1.setEnabled(false);
		R2C1.setToolTipText("");
		R2C1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=4;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	

				 gameTurns++;
				
				}
				 if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}

				
		}
			
			
		});
		R123Container.add(R2C1);
		
	 R2C2=new JButton("");
		R2C2.setPreferredSize(new Dimension(100, 100));
		R2C2.setBackground(Color.WHITE);
			R2C2.setEnabled(false);
		R2C2.setToolTipText("");
		R2C2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=5;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
				
				gameTurns++;	
						
				}
				if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}

					
			}
		});
		R123Container.add(R2C2);
		
	 R2C3=new JButton("");
		R2C3.setPreferredSize(new Dimension(100, 100));
		R2C3.setBackground(Color.WHITE);
			R2C3.setEnabled(false);
		R2C3.setToolTipText("");
		R2C3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=6;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
						
					 
				gameTurns++;
					
				}
				 if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}

					
			}
		});
		R123Container.add(R2C3);
	
	 R3C1=new JButton("");
		R3C1.setPreferredSize(new Dimension(100, 100));
		R3C1.setBackground(Color.WHITE);
			R3C1.setEnabled(false);
		R3C1.setToolTipText("");
		R3C1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=7;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	
				
				gameTurns++;
				
					
					
				}
				 if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}

				
			}
		});
		R123Container.add(R3C1);
		
	 R3C2=new JButton("");
		R3C2.setPreferredSize(new Dimension(100, 100));
		R3C2.setBackground(Color.WHITE);
			R3C2.setEnabled(false);
		R3C2.setToolTipText("");
		R3C2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
				if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=8;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
		
									
				gameTurns++;
	
				}
				 if( player != true && TIE != true && robot != true )	
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}

					
			}
		});
		R123Container.add(R3C2);
		
	 R3C3=new JButton("");
		R3C3.setPreferredSize(new Dimension(100, 100));
		R3C3.setBackground(Color.WHITE);
			R3C3.setEnabled(false);
		R3C3.setToolTipText("");
		R3C3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				gameTurns++;
				
					if( (gameTurns%2) !=0 )
				{
					
					// player turn ...
					
						
					stch=9;
					
					playerTurn(  stch,  R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  playerCircle );
	
				
			gameTurns++;
				
					
				}
				 if( player != true && TIE != true && robot != true )		
				{
					
				exec = false;
				
	robotTurn(  array, gameTurns,  exec,   R1C1,  R1C2,  R1C3,  R2C1,  R2C2,  R2C3,  R3C1,  R3C2,  R3C3,  robotDiagonalCross );	
					
				}
				

				
			}
		});
		R123Container.add(R3C3);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// additional code goes here .... [jpanels] 
		
		Container.add(programMENU);
		   Container.add(gameScore);
		   Container.add(R123Container);
		
		frame.add(Container);
		
		// additional code goes here .... [jpanels] 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
		
			JOptionPane.showMessageDialog(null," \n Please choose Menu -> start a new game \n in order for you to start a new game. \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);

                      //
	}
	
	// accessing the main method ... 
	
	public static void main(String [] args)
	{
		
		new TicTacToe();
		
	}
	
	// accessing the main method ... 
	
}
