/*
 * Created by: Maria Temu
 * Created on: 10-March-2020
 * Created for: ICS4U
 * Day #15 (Student ADT)
 * This program holds student information in an array or list
 */
package com.company.studentADT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentADT {
    private JLabel lblFirstName;
    private JLabel lblSecondName;
    private JLabel lblMiddleName;
    private JSpinner spnGrades;
    private JTextField txtMiddleName;
    private JTextField txtSecondName;
    private JTextField txtFirstName;
    private JCheckBox chkIdentified;
    private JButton btnEnter;
    private JLabel lblidentified;
    private JLabel lblGrades;
    private JPanel Panel;


    public static void studentADT(String[] args) {
        JFrame panel = new JFrame("studentADT");
        panel.setContentPane(new studentADT().Panel);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.pack();
        panel.setVisible(true);

    }

    private void NewInfo(Main studentInfo) {
        JOptionPane.showMessageDialog(null, studentInfo.StudentInfo());
    }

    public studentADT() {
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Getting student information
                Main student = new Main

                        (txtFirstName.getText(),

                        txtSecondName.getText(),

                        txtMiddleName.getText(),

                        (int) spnGrades.getValue(),

                        chkIdentified.isSelected());

                //new student info
                NewInfo(student);

            }
        });
    }

}
