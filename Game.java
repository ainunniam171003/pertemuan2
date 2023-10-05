/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author User
 */
public class Game {
    public static void main (String[] args){
   Player petani = new Player();
   
   petani.name = "Niam";
   petani.speed = 70;
   petani.healthPoin = 50;
   
   petani.run();
   
   if (petani.isDead() ){
       System.out.println("Game over!");
   }
  }
}
