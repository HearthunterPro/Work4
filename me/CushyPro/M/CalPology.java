package me.CushyPro.M;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalPology {

	private static double var1 = 0;
	private static double var2 = 0;

	public static void getPanelCal(JPanel panel, int i) {
		panel.removeAll();
		JLabel ssx = new JLabel();
		ssx.setBounds(0, 130, 400, 50);
		ssx.setFont(new Font(null, 0, 20));
		ssx.setBackground(Color.BLACK);
		ssx.setForeground(Color.GREEN);
		panel.add(ssx);
		JLabel labelresult = new JLabel();
		labelresult.setBounds(0, 180, 400, 50);
		labelresult.setFont(new Font(null, 0, 20));
		labelresult.setBackground(Color.BLACK);
		labelresult.setForeground(Color.GREEN);
		panel.add(labelresult);
		if (i == 1) {
			ssx.setText("สูตร: 1/2 x ฐาน x สูง");
			labelresult.setText("คำตอบ: " + triangle(var1, var2));
			if (true) {
				JLabel label = new JLabel("ฐาน");
				label.setBounds(0, 0, 50, 50);
				label.setFont(new Font(null, 0, 20));
				label.setBackground(Color.BLACK);
				label.setForeground(Color.GREEN);
				panel.add(label);
				JTextField tf = new JTextField();
				tf.setFont(new Font(null, 0, 20));
				tf.setBounds(50, 0, 200, 50);
				tf.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
						try {
							var1 = Double.parseDouble(tf.getText());
						} catch (Exception e2) {
							var1 = 0;
						}
						labelresult.setText("คำตอบ: " + triangle(var1, var2));
					}

				});
				panel.add(tf);
			}
			if (true) {
				JLabel label = new JLabel("สูง");
				label.setBounds(0, 60, 50, 50);
				label.setFont(new Font(null, 0, 20));
				label.setBackground(Color.BLACK);
				label.setForeground(Color.GREEN);
				panel.add(label);
				JTextField tf = new JTextField();
				tf.setFont(new Font(null, 0, 20));
				tf.setBounds(50, 60, 200, 50);
				tf.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
						try {
							var2 = Double.parseDouble(tf.getText());
						} catch (Exception e2) {
							var2 = 0;
						}
						labelresult.setText("คำตอบ: " + triangle(var1, var2));
					}

				});
				panel.add(tf);
			}
		} else if (i == 2) {
			ssx.setText("สูตร: กว้าง x ยาว");
			labelresult.setText("คำตอบ: " + square(var1, var2));
			if (true) {
				JLabel label = new JLabel("กว้าง");
				label.setBounds(0, 0, 50, 50);
				label.setFont(new Font(null, 0, 20));
				label.setBackground(Color.BLACK);
				label.setForeground(Color.GREEN);
				panel.add(label);
				JTextField tf = new JTextField();
				tf.setFont(new Font(null, 0, 20));
				tf.setBounds(50, 0, 200, 50);
				tf.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
						try {
							var1 = Double.parseDouble(tf.getText());
						} catch (Exception e2) {
							var1 = 0;
						}
						labelresult.setText("คำตอบ: " + square(var1, var2));
					}

				});
				panel.add(tf);
			}
			if (true) {
				JLabel label = new JLabel("ยาว");
				label.setBounds(0, 60, 50, 50);
				label.setFont(new Font(null, 0, 20));
				label.setBackground(Color.BLACK);
				label.setForeground(Color.GREEN);
				panel.add(label);
				JTextField tf = new JTextField();
				tf.setFont(new Font(null, 0, 20));
				tf.setBounds(50, 60, 200, 50);
				tf.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
						try {
							var2 = Double.parseDouble(tf.getText());
						} catch (Exception e2) {
							var2 = 0;
						}
						labelresult.setText("คำตอบ: " + square(var1, var2));
					}

				});
				panel.add(tf);
			}
		} else if (i == 3) {
			ssx.setText("สูตร: 2 x " + Math.PI + " x รัศมี");
			labelresult.setText("คำตอบ: " + circle(var1));
			if (true) {
				JLabel label = new JLabel("รัศมี");
				label.setBounds(0, 0, 50, 50);
				label.setFont(new Font(null, 0, 20));
				label.setBackground(Color.BLACK);
				label.setForeground(Color.GREEN);
				panel.add(label);
				JTextField tf = new JTextField();
				tf.setFont(new Font(null, 0, 20));
				tf.setBounds(50, 0, 200, 50);
				tf.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
						try {
							var1 = Double.parseDouble(tf.getText());
						} catch (Exception e2) {
							var1 = 0;
						}
						labelresult.setText("คำตอบ: " + circle(var1));
					}

				});
				panel.add(tf);
			}
		}
		if (true) {
			JButton button = new JButton("กลับไปเลือกสูตรใหม่");
			button.setBounds(0, Main.window.getHeight() - 80, 200, 50);
			button.setBackground(Color.BLACK);
			button.setForeground(Color.GREEN);
			panel.add(button);
			button.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent e) {
					Main.setFrist(panel);
					Main.window.update(Main.window.getGraphics());
					super.mouseReleased(e);
				}

			});
		}
	}

	public static double triangle(double l, double m) {
		return 1.0 / 2.0 * m * l;
	}

	public static double square(double w, double h) {
		return w * h;
	}

	public static double circle(double r) {
		return 2 * Math.PI * r;
	}

}
