package affinecipher;

import javax.swing.*;


public class AffineCipher {

    public static void main(String[] args) {
        AffineCipherFrame frame = new AffineCipherFrame();
        frame.setVisible(true);
        
        
        ImageIcon image = new ImageIcon("C:\\Users\\mohdr\\Documents\\NetBeansProjects\\AffineCipher\\src\\affinecipher\\icon.jpeg"); //depends on your path
        frame.setIconImage(image.getImage());//setting the image icon
    }
    
}
