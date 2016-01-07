/**
 * 
 */
package com.parking;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Administrator
 *
 */
public class MyFrame extends JFrame{
	MyListener listener = new MyListener();
	public MyFrame(){
		setSize(300, 300);
		setLayout(new FlowLayout());
		JButton b = new JButton("OK"); 
		JButton a = new JButton("Fail"); 
		 
		
		a.addActionListener(listener);
 
		add(a);
		 
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(sum(12,33));	
				
			}
		});
		add(b);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	public int sum(int a,int b){
		 
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
		
	}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Ha ..."+arg0);
			
		}
		
	}
}
