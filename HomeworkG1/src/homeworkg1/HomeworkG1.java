/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkg1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeworkG1 {    //Homework 1

    public static void main(String[] args) {
      JFrame H1 = new JFrame();
      String Z;
      int B;
      
      Z=JOptionPane.showInputDialog(null, "ENTER INT");
      B=Integer.parseInt(Z);
      
      if(B%2==0)
                    JOptionPane.showMessageDialog(null, "This num is EVEN"+"   "+B);
      else
                    JOptionPane.showMessageDialog(null, "This num is ODD"+"    "+B);
      
        int result= JOptionPane.showConfirmDialog(H1, "Do Another");
        
        System.exit(0);


    }
    
}
