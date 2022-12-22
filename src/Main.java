import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("rock-paper-scissors");

        frame.setSize(1000,1000);
        frame.setVisible(true);

        JButton startBtn = new JButton("Play");
        frame.add(startBtn);
        startBtn.setBounds(450,700,100,100);

        startBtn.addActionListener(e -> {
            startBtn.setVisible(false);

            JButton paper = new JButton("paper");
            JButton scissors = new JButton("scissors");
            JButton rock = new JButton("rock");

            frame.add(paper);
            frame.add(scissors);
            frame.add(rock);

            paper.setBounds(200,700,100,100);
            scissors.setBounds(400,700,100,100);
            rock.setBounds(400,500,100,100);

            paper.setVisible(true);
            scissors.setVisible(true);
            rock.setVisible(true);
        });
    }
}