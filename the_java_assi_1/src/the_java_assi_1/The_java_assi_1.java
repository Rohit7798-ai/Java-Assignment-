/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_java_assi_1;

/**
 *
 * @author IMRD
 */
public class The_java_assi_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100 , y = 50 , sum = 0 , diff = 0 , multi = 0;
        float div = 0;
        
        System.out.println("Value of x:"  +x);
        System.out.println("Value of Y :"  +y);
        
        
        sum = x + y;
        System.out.println("Addition of the numbers : " +sum);
        
        diff = x - y ;
        System.out.println("Substraction Of Numbers :" +diff);
        
        multi = x * y;
        System.out.println("Multiplication of numbers : " + multi);
        
        div = x / y;
        System.out.println("Division of numbers :"  +div);
        
        if((sum == 150) && (diff == 50))
        {
            System.out.println("Both Are True");
        }
        else
        {
            System.out.println("Not True");
        }
        
            
        }
}

            
            
        
         
        // TODO code application logic here
    }
    
}
