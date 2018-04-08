import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class App extends  JFrame {
    private JComboBox comboBox1;
    private JPanel rootPanel;
    private JComboBox comboBox2;

    //static JFrame frame;

    static String fileName = "SOB.LAS";

    public App() {

        // TO CO W KOMENTARZU TO BEZ USTAWIANIA LAYOUTU!



//        setTitle("Wykres");
//        setLayout(null);

        super("Wykresiki2");

       String arr[] = {"SOB.LAS", "K.las","W.LAS"};

        comboBox1.addItem("SOB.LAS");
        comboBox1.addItem("K.las");
        comboBox1.addItem("W.LAS");


       setContentPane(rootPanel);
       pack();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 800);

        //comboBox1 = new JComboBox(arr);


        //comboBox1.setPreferredSize(new Dimension(10,10));
        //comboBox1.setLayout(null);

//        comboBox1.setBounds(10, 10, 100, 20);
//        add(comboBox1);
        setVisible(true);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fileName = (String) comboBox1.getSelectedItem();
                System.out.println(fileName);

                setReader();

                for(String s : Reader.parameters )
                {
                    comboBox2.addItem(s);
                }

            }
        });


        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("dupa");

            }
        });
    }



    public void setReader()
    {
        Reader reader = new Reader();

        reader.ReadFromFile(fileName);


//        for(String s : reader.parameters)
//            System.out.println(s);
    }

}





