package com.jose.BudgetPlanner;

import static com.jose.BudgetPlanner.BudgetPlanner.Username;
import static com.jose.BudgetPlanner.BudgetPlanner.frame;
import static com.jose.BudgetPlanner.BudgetPlanner.mnthlybudgetIn;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
public class Preference {
    public void SetPreference(){
        JButton submit = new JButton("Submit");
        JPanel north = new JPanel();
        JLabel username = new JLabel("Username");
        JLabel mnthlyBdget = new JLabel("Monthly Budget");
        
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
                if(jTextFieldUsrNmeIn.equals("") || jTextFieldMnthlyBdgetIn.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill in all of the forms","Budget Planner™",JOptionPane.ERROR_MESSAGE);
                }
                else{
                Username = jTextFieldUsrNmeIn.getText();
                mnthlybudgetIn = Double.parseDouble(jTextFieldMnthlyBdgetIn.getText()); 
                new Conf().GetConfig();
                dialog.dispose();
                }
                
            }
        });
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridwidth = gbc.REMAINDER;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(username,gbc);       
        panel.add(jTextFieldUsrNmeIn, gbc);
        panel.add(mnthlyBdget,gbc);
        panel.add(jTextFieldMnthlyBdgetIn, gbc);  
        panel.add(submit,gbc);
        dialog.getContentPane().add(north, "North");
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocation(525,200);
        dialog.setSize(300,300);
        dialog.setResizable(false);
        dialog.setTitle("Budget Planner™");
        dialog.setVisible(true);
    }
}
