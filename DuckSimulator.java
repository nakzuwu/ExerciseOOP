/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DuckSimulator{
    
    public static void main(String[] args) {
        Scanner udin = new Scanner(System.in);

        FlyBehavior cantFly = ()-> System.out.println("i can't fly");
        QuackBehavior squeak = ()-> System.out.println("squeak");
        

        Duck model = new ModelDuck();
        DecoyDuck decoy = new DecoyDuck();
        MallardDuck mallard = new MallardDuck();
        RedHeadDuck redhead = new RedHeadDuck();
        RubberDuck rubberDuckie = new RubberDuck(cantFly,squeak);

        System.out.println("Choose your fighter, i mean duck :");
        System.out.println("1. Udin The Model Duck");
        System.out.println("2. Jamal The Decoy Duck");
        System.out.println("3. Cahyo The Mallard Duck");
        System.out.println("4. Wahyu The Rubber Duck");
        System.out.println("5. Agus The Red Head Duck");

        int jamal = udin.nextInt();

        switch (jamal){
            case 1:
                model.performQuack();
                model.performFly();
                break;
            case 2:
                decoy.performQuack();
                decoy.performFly();
                break;
            case 3:
                mallard.performQuack();
                mallard.performFly();
                break;
            case 4:
                rubberDuckie.performQuack();
                rubberDuckie.performFly();
                break;
            case 5:
                redhead.performQuack();
                redhead.performFly();
                break;
            default:
                System.out.println("Wrong!");
                break;

        }
        
    }
    
}
