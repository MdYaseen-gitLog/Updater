/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yaseen.App2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "com.yaseen.App2.ActionApp2"
)
@ActionRegistration(
        displayName = "#CTL_ActionApp2"
)
@ActionReference(path = "Menu/Help", position = 1750, separatorBefore = 1700)
@Messages("CTL_ActionApp2=App2")
public final class ActionApp2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Version 2.0.", "App2", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Plugin Updated", "Plugin updated successfully...", JOptionPane.INFORMATION_MESSAGE);
    }
}
