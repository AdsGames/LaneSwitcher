package net.adsgames.laneswitcher;

import java.awt.*;

public class gascan{
   private int x;
   private int y;
   private Image picture;
   
   public gascan(int carX, int carY, Image carImage) {
      x = carX;
      y = carY;
      picture = carImage;
   }
   
   public Image getImage(){
     return picture;
   }
   
   public int getX(){
     return x;
   }
   
   public int getY(){
     return y;
   }
   
   public void setX(int newX){
     x = newX;
   }
   
   public void setY(int newY){
     y = newY;
   }
   
   public void setImage(Image newImage){
     picture = newImage;
   }
}