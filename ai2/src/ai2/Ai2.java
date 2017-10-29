 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ai2;
import java.util.Random;
/**
 *
 * @author GIN
 */
public class Ai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        double t = 10;
        double tmin = 0.000000000000001;
        double x1 = -10 + (10 - (-10)) * rand.nextDouble();
        double x2 = -10 + (10 - (-10)) * rand.nextDouble();
        double x3 = 0 + (1 - (0)) * rand.nextDouble();
        double delta;
        double oldRandom = ((4-(2.1*Math.pow(x1,2))+(Math.pow(x1,4)/3))*Math.pow(x1,2)+x1*x2+(-4+(4*Math.pow(x2,2)))*Math.pow(x2,2));
       
       //System.out.println("x1 awal = "+x1);
        //System.out.println("x2 awal= "+x2);
        //System.out.println("Hasil awal= "+oldRandom);
        while( t > tmin ){
            x1 = -10 + (10 - (-10)) * rand.nextDouble();
            x2 = -10 + (10 - (-10)) * rand.nextDouble();
            double newRandom = ((4-(2.1*Math.pow(x1,2))+(Math.pow(x1,4)/3))*Math.pow(x1,2)+x1*x2+(-4+(4*Math.pow(x2,2)))*Math.pow(x2,2));
            delta = oldRandom - newRandom;
            if (Math.pow(2.71828,(delta/t))> x3){
                oldRandom = newRandom;
            }
            t=0.9*t;
        };
        //System.out.println("x1 akhir= "+x1);
        //System.out.println("x2 akhir= "+x2);
        System.out.println("Hasil akhir= "+oldRandom);
       
    }
    
}
