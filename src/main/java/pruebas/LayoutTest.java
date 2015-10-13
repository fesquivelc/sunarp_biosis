/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.*;
import javax.swing.*;
  
public class LayoutTest
{
    public LayoutTest()
    {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);
        //gbc.weighty = 1.0;                 // allows vertical dispersion
        addComponents(new JLabel("Name"),    new JTextField(12), panel, gbc);
        addComponents(new JLabel("Address"), new JTextField(12), panel, gbc);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(panel);
        f.setSize(300,200);
        f.setLocation(200,200);
        f.setVisible(true);
    }
  
    private void addComponents(JLabel label, JTextField tf, JPanel p,
                               GridBagConstraints gbc)
    {
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        p.add(label, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        p.add(tf, gbc);
    }
  
    public static void main(String[] args)
    {
        new LayoutTest();
    }
}
