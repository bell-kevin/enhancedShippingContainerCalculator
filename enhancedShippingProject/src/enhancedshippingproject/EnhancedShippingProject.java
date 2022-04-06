/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedshippingproject;
import java.util.Scanner;
/**
 *
 * @author 4800590195
 */
public class EnhancedShippingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare variables
        Scanner stdIn = new Scanner(System.in);
        int shippingContainers, items, leftoverItems, itemsPerContainer, 
                packingBoxes, productBoxes, leftoverPackingBoxes, 
                leftoverProductBoxes, bouncyBalls;
        //prompt user input
        System.out.println("Shipping Report Calculator by Kevin Bell");
        System.out.print("How many bouncy balls do you need to ship? ");
        bouncyBalls = stdIn.nextInt();
        System.out.println();
        items = bouncyBalls;
        //do the work
        packingBoxes = bouncyBalls / 40;
        leftoverItems = bouncyBalls % 40;
        shippingContainers = packingBoxes / 20;
        leftoverPackingBoxes = packingBoxes % 20;
        //output
        System.out.println("Number of items to ship: " + items);
        System.out.println("Number of packing boxes: " + packingBoxes);
        System.out.println("Number of items that don't fit in "
                + "packing boxes: " + leftoverItems);
        System.out.println("Number of shipping containers: " + 
                shippingContainers);
        System.out.println("Number of packing boxes not packed in a "
                + "shipping container: " + leftoverPackingBoxes);
    }
    
}
