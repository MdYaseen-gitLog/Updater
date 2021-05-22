/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yaseen.App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "yaseen",
        id = "org.yaseen.App.SomeAction"
)
@ActionRegistration(
        displayName = "#CTL_SomeAction"
)
@ActionReference(path = "Menu/Help", position = 1600, separatorBefore = 1550, separatorAfter = 1650)
@Messages("CTL_SomeAction=App1")
public final class SomeAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Version 2.0", "App1", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Plugin Updated", "Plugin updated successfully...", JOptionPane.INFORMATION_MESSAGE);
    }
}
