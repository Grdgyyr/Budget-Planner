package com.jose.BudgetPlanner;

import static com.jose.BudgetPlanner.BudgetPlanner.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
public class About {
    public void GetAbout(){
        JButton submit = new JButton("Submit");
        JPanel north = new JPanel();
        JTextArea about = new JTextArea("        Developers: \n"
                + "  Occeña, Ampatuan, \n          Henarios \n" +
                " All Rights Reserved");
        about.setEditable(false);
        
        
        
        
        final JTextField
            jTextFieldUsrNmeIn = new JTextField(12),
            jTextFieldMnthlyBdgetIn = new JTextField(12);
        
        final JDialog dialog = new JDialog(frame, true);
        
        ImageIcon img = new ImageIcon("icon.png");
        dialog.setIconImage(img.getImage());
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dialog.dispose();
            }
        });
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridwidth = gbc.REMAINDER;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(about,gbc);       
        
        
        dialog.getContentPane().add(north, "North");
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocation(525,200);
        dialog.setSize(200,200);
        dialog.setResizable(false);
        dialog.setTitle("Budget Planner™");
        dialog.setVisible(true);
    }
}
