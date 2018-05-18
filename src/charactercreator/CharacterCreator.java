/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercreator;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Krzysztof Gwiżdż
 */
public class CharacterCreator {
    
    public class WindowFrame extends JFrame {
        public WindowFrame(){
            super("CCCreator");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable(){
           @Override
           public void run(){
               new WindowFrame();
           }
       });
    }
    
}
