/**
* Author: Angela Burns
* Lab 12
*/
package ant;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Ant {
	
	private double xCord;
	private double yCord;

	
	public Ant(int x,int  y)
	{
		xCord = x;
		yCord = y;
	}
	public void draw()
	{
		StdDraw.filledCircle(xCord, yCord, 3);
	}
	
	
	public void move (double targetX, double targetY)
	{
		  this.xCord = xCord + 0.03 * (targetX  - xCord);
		  this.yCord = yCord + 0.03 * (targetY - yCord);
	}
	
	
	

}
