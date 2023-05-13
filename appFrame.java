package Duplicate;

import comp_decomp.compressor;
import comp_decomp.decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class appFrame extends JFrame{
    private JPanel Panelname;
    private JButton compressB;
    private JButton decompressB;
public appFrame() {

    this.setSize(400, 400);
    this.setContentPane(this.Panelname);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    compressB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == compressB){
                JFileChooser filechooser = new JFileChooser();
                int response = filechooser.showSaveDialog(null);
                if(response == JFileChooser.APPROVE_OPTION){
                    File file  = new File(filechooser.getSelectedFile().getAbsolutePath());
                    System.out.println(file);
                    try{
                        compressor.method(file);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null , ex.toString());
                    }
                }
            }


        }
    });


    decompressB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == decompressB){
                JFileChooser filechooser = new JFileChooser();
                int response = filechooser.showSaveDialog(null);
                if(response == JFileChooser.APPROVE_OPTION){
                    File file  = new File(filechooser.getSelectedFile().getAbsolutePath());
                    System.out.println(file);
                    try{
                        decompressor.method(file);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null , ex.toString());
                    }
                }
            }
        }
    });


//    this.add(compressButton);
//    this.add(decompressButton);


}

    public void setContentPane() {
    }
}
