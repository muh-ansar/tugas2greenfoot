import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat12 extends Actor
{
    /**
     * Act - do whatever the pesawat12 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bergerak();
    }
    public void bergerak(){
        move(5);
        turn(1);
       
    }
      

}
