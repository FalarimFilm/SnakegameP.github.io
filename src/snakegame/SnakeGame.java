package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game");
        Board board = new Board();
        add(board);
        pack();

        setLocationRelativeTo(null);
        setResizable(false);
        
        // Set up a Timer to update the title with the score
        Timer timer = new Timer(100, e -> setTitle("Snake Game - Score: " + board.getScore()));
        timer.start();
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
