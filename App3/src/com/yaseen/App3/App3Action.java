/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yaseen.App3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "com.yaseen.App3.App3Action"
)
@ActionRegistration(
        displayName = "#CTL_App3Action"
)
@ActionReference(path = "Menu/Help", position = 1850, separatorBefore = 1800)
@Messages("CTL_App3Action=App3")
public final class App3Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "New plugin App3 Version 1.0", "App3", JOptionPane.INFORMATION_MESSAGE);
    }
}
