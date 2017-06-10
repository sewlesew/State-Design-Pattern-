/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author USER
 */
public class Client extends JFrame implements ActionListener{
    
    JPanel panel;
    JPanel panelCenter;
    JTextArea textArea;
    JComboBox<String> stateList;
    DefaultComboBoxModel<String> stateModel=new DefaultComboBoxModel<String>();
    String[] states={"Select State","Regular","Gravel","Wet","Ice"};
    
    JButton leftBut,rightBut,accBut,brakeBut;
    JPanel buttonsPanel;
    CarDrivingContext context=new CarDrivingContext();
     RoadState state;
    
    
    public static void main(String[] args){
        new Client();
    }
    
    public Client(){
        
     
        panel=new JPanel();

        panel.setLayout(new BorderLayout());
        setContentPane(panel);
        
       JLabel lblTitle=new JLabel("State Pattern Design",SwingConstants.CENTER);
        lblTitle.setFont(new Font(Font.DIALOG,Font.BOLD,19));
        panel.add(lblTitle, BorderLayout.NORTH);
        
        
        panelCenter=new JPanel();        
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        
        
        
        
        textArea=new JTextArea();
        textArea.setRows(10);
        textArea.setColumns(20);
        textArea.setAlignmentX(LEFT_ALIGNMENT);
        textArea.setFont(new Font(Font.DIALOG,Font.PLAIN,18));
        
        
        
        initStateModel();
        stateList=new JComboBox<>(stateModel);
        
        
        
        panelCenter.add(textArea);
        panelCenter.add(stateList);
        panel.add(panelCenter,BorderLayout.CENTER);
        
        
        leftBut=new JButton("Left");
        rightBut=new JButton("Right");
        accBut=new JButton("Accelerate");
        brakeBut=new JButton("Brake");
        
        Dimension accButDim=accBut.getPreferredSize();
        
        
        leftBut.setPreferredSize(accButDim);
        rightBut.setPreferredSize(accButDim);
        brakeBut.setPreferredSize(accButDim);
        
        buttonsPanel=new JPanel();
        buttonsPanel.add(leftBut);       
        buttonsPanel.add(accBut);
         buttonsPanel.add(rightBut);
        buttonsPanel.add(brakeBut);
        
        panel.add(buttonsPanel,BorderLayout.SOUTH);
        
        leftBut.addActionListener(this);
        rightBut.addActionListener(this);
        accBut.addActionListener(this);
        brakeBut.addActionListener(this);
        
        
        
        setTitle("State Pattern Design");
        setSize(600,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setVisible(true);
    }
    
    private void initStateModel(){
        
        for(String state:states){
            stateModel.addElement(state);
        }
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object source=ae.getSource();
        
        if(source==leftBut){
            
           state=retrieveState();
           if(state==null){
               return;
           }
           
           context.setState(state);
           String out=context.left();
           textArea.setText(out);
           return;
            
        }
        
        if(source==rightBut){
          state=retrieveState();
           if(state==null){
               return;
           }
           
           context.setState(state);
           String out=context.right();
           textArea.setText(out);
           return;
            
        }
        
        if(source==accBut){
          state=retrieveState();
           if(state==null){
               return;
           }
           
           context.setState(state);
           String out=context.accel();
           textArea.setText(out);
           return;
            
        }
        
        if(source==brakeBut){
           state=retrieveState();
           if(state==null){
               return;
           }
           
           context.setState(state);
           String out=context.brake();
           textArea.setText(out);
           
            
        }

    }
    
    private RoadState retrieveState(){
        
        int isSelected=stateList.getSelectedIndex();
            
            if(isSelected==-1){
                return null ;
            }
            
            RoadState roadState=null;
            switch(isSelected){
                
                case 0:
                    roadState=null;
                    break;
                case 1:
                    roadState=new RegularState(context);
                    break;
                case 2:
                    roadState=new GravelState(context);
                    break;
                case 3:
                    roadState=new WetState(context);
                    break;
                case 4:
                    roadState=new IceState(context);
                    break;                   
                 }
            
            return roadState;
    }

   
    
}
