import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        persiapan();
}
    

    private void persiapan() {
    pesawat11 pertama = new pesawat11();
addObject(pertama, 97, 105);

    pesawat12 kedua = new pesawat12();
    addObject(kedua, 900, 800);
}
}






