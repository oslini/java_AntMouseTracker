/**
* Author: Angela Burns
* October, 31 2018
* * Lab 13
*/
package ant;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;


public class AntDriver {

	public static final int CANVAS_SIZE = 400;
	
	public static void main(String[] args) {
		
		//set up canvas
		StdDraw.setCanvasSize(CANVAS_SIZE,  CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
        StdDraw.setYscale(0, CANVAS_SIZE);
		Random rand = new Random();
		
		//declare and object and arrays
		
	
		Ant [] ant = new Ant[100];
		
		
			
			for ( int i =0; i < 100; i++)
			{	
				int xCord = rand.nextInt(399); 
				int yCord = rand.nextInt(399);
				ant[i]= new Ant(xCord, yCord);	
			}

			while (true)
			{
				StdDraw.enableDoubleBuffering();
				StdDraw.clear();
				for ( int i =0; i < 100; i++)
				{
					ant[i].move(StdDraw.mouseX(), StdDraw.mouseY());	
					ant[i].draw();
			}
				StdDraw.show();
				StdDraw.pause(15);
			}
        
	}

}
