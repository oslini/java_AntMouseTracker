# java_AntMouseTracker

In this lab, we will create a class that represents an ant.

Your Ant class should have two private instance variables used to store an x-coordinate and a y-coordinate

Your Ant class should have one constructor. This constructor should have two parameters, an x-coordinate and a y-coordinate. These parameters should be used to initialize the ant's two private instance variables.

Your Ant class should have two other methods:

A draw() method which will draw an Ant as an circle with radius of 3 at its current x- and y-location.
A move(targetX, targetY) method that has two parameters, an x-coordinate and a y-coordinate. These two coordinates represent a target for the ant to more towards. The ant's coordinates should be updated using the following formulas:
            xCoord = xCoord + 0.03 * (targetX  - xCoord)
            yCoord = yCoord + 0.03 * (targetY - yCoord)

Note that in these formulas xCoord and yCoord are the ant's coordinates and targetX and targetY are the two parameters to the move method.

Your driver program should:

Set the size and scale of the StdDraw canvas.    
Create an array of 100 ants. The initial x- and y-coordinate should be generated randomly. Each ant's initial position should be on the canvas.
Determine a target.
Loop until the program exits (i.e. until the StdDraw window is closed). Your loop should clear the canvas and then call the move and draw method for each ant object.
Initially, test your program with a hard-coded target, for example the center of the canvas or one corner of the canvas. Make sure all your ants converge on this target. Then try changing your target so your ants follow the mouse. In other words, your target should be the mouse's current position. You can access the mouse's current position using the methods StdDraw.mouseX() and StdDraw.mouseY().
