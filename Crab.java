import greenfoot.*;

/**
 * This class defines a crab. Crab is the user. Crabs live on the beach, are moved by user input, turn at edges
 * and are eaten by lobsters which ends the game.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    // Always place fields first in the class.
    

    // After the fields place the behaviors

    public void act()
    {
        checkKeyPress();
        checkCrabDeath();
        turnAtEdge();
    }
    
    private void checkKeyPress()
    {
        int moveSpeed = 1;
        
        if (Greenfoot.isKeyDown("up"))
        {
            moveSpeed+=3;
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            move(-moveSpeed);
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            move(moveSpeed);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(1);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-1);
        }
    }
    
    private void checkCrabDeath()
    {
        if (isTouching(Lobster.class))
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(180);
        }
    }
}


