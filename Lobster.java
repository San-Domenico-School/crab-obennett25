import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a lobster. Lobsters are the enemy. Lobsters move randomly and turn at edges.
 * 
 * @author Oliver Bennett 
 * @version 10/2/24
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Greenfoot.setSpeed(50);
        rotateRandomly();
        move(3);
        turnAtEdge();
    }
    
    private void rotateRandomly()
    {
        // Sets probability of turning to 5%
        if (Math.random() < .05) 
        {
            turn((int)(100 * Math.random() - 50));
        } 
    }
    
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(90);
        }
    }
}
