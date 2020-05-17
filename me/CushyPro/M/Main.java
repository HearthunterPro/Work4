package me.CushyPro.M;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static JFrame window;

	public static void main(String[] args) {
		window = new JFrame("โปรแกรมหาพื่นที");
		window.setUndecorated(false);
		window.pack();

		window.setSize(400, 300);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(null);
		setFrist(panel);
		window.setContentPane(panel);
	}

	public static void setFrist(JPanel panel) {
		panel.removeAll();
		int xs = (int) (window.getWidth() / 2) - 50;
		if (true) {
			JLabel button = new JLabel("เลือกสูตรที่ต้องการ");
			button.setForeground(Color.GREEN);
			button.setBounds(xs - 5, 0, 200, 50);
			panel.add(button);
		}
		if (true) {
			JButton button = new JButton("สามเหลียม");
			button.setBounds(xs, 60, 100, 50);
			button.setBackground(Color.BLACK);
			button.setForeground(Color.GREEN);
			panel.add(button);
			button.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent e) {
					CalPology.getPanelCal(panel, 1);
					window.update(window.getGraphics());
					super.mouseReleased(e);
				}

			});
		}
		if (true) {
			JButton button = new JButton("สี่เหลียม");
			button.setBounds(xs, 110, 100, 50);
			button.setBackground(Color.BLACK);
			button.setForeground(Color.GREEN);
			panel.add(button);
			button.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent e) {
					CalPology.getPanelCal(panel, 2);
					window.update(window.getGraphics());
					super.mouseReleased(e);
				}

			});
		}
		if (true) {
			JButton button = new JButton("วงกลม");
			button.setBounds(xs, 160, 100, 50);
			button.setBackground(Color.BLACK);
			button.setForeground(Color.GREEN);
			panel.add(button);
			button.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent e) {
					CalPology.getPanelCal(panel, 3);
					window.update(window.getGraphics());
					super.mouseReleased(e);
				}

			});
		}
	}

}
