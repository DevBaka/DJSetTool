/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author devbaka
 */
public class mainWindow extends JFrame implements ActionListener{
    
    private JButton cmdPlaylist;
    private JButton cmdMusikSort;
    private JButton cmdFileChooserl;
    private JTextArea txtFilesLeft;
    
    public mainWindow(){
        this.setTitle("DJ-SET-Tool");
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // local files
        /*File folder = new File("your/path");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());
          } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Directory " + listOfFiles[i].getName());
          }
        }*/
        
        JPanel panelLeft = new JPanel();
        panelLeft.setSize(10, 75);
        JPanel panelcmd1 = new JPanel();
        panelcmd1.setSize(10,10);
        cmdFileChooserl = new JButton("Ordner Auswählen");
        cmdFileChooserl.setSize(10, 10);
        cmdFileChooserl.addActionListener(this);
        txtFilesLeft = new JTextArea(3,15);
        panelLeft.setLayout(new GridLayout(2, 1));
        
        panelcmd1.add(cmdFileChooserl);
        panelLeft.add(panelcmd1);
        panelLeft.add(txtFilesLeft);
        
        JPanel panelRight = new JPanel();
        panelRight.setSize(10,75);
        
        
        this.getContentPane().add(panelLeft, BorderLayout.WEST);
        //this.add(panelLeft, BorderLayout.WEST);
        //this.add(cmdFileChooserl, BorderLayout.NORTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cmdFileChooserl){
            JFileChooser chooseFolder = new JFileChooser();
            int rueckgabeWert = chooseFolder.showOpenDialog(null);
            if(rueckgabeWert == JFileChooser.APPROVE_OPTION){
                System.out.println("file " + chooseFolder.getSelectedFile().getName());
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

  
}



