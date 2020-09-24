package mirea.ru;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private int milan = 0;
    private int real = 0;
    private JButton button = new JButton("Real Madrid");
    private JButton button2 = new JButton("AC Milan");
    private JLabel lastScorer = new JLabel("Last Scorer N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JLabel result = new JLabel("Result: ");

    public SimpleGUI() {
        super("Example");
        this.setBounds(300, 300, 350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 8, 8, 2));
        container.add(lastScorer);
        container.add(winner);
        button.addActionListener(new ButtonEventListener());
        button2.addActionListener(new ButtonEventListener2());
        container.add(button);
        container.add(button2);
        container.add(result);
    }


    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            milan++;
            result.setText("Result: " + milan + "X" + real);
            if (milan > real) {
                winner.setText("Winner: Milan");
            } else if (real > milan) {
                winner.setText("Winner: Real");
            } else {
                winner.setText("Winner: DRAW");
            }
            lastScorer.setText("Last Scorer Milan");
        }

    }

    class ButtonEventListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            real++;
            result.setText("Result: " + milan + "X" + real);
            if (milan > real) {
                winner.setText("Winner: Milan");
            } else if (real > milan) {
                winner.setText("Winner: Real");
            } else {
                winner.setText("Winner: DRAW");
            }
            lastScorer.setText("Last Scorer Real");

        }

    }

}
