package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Main class of the Alpaca Emblem game.
 *
 * @author Ignacio Slater Muño<
 * @version 3.0b1
 * @since 3.0
 */
public class AlpacaEmblem extends JFrame {

  /**
   * Creates the game's graphic interface
   */
  public AlpacaEmblem() {
    Board board = new Board();
    add(board);

    setTitle("Alpaca Emblem");

    final int OFFSET = 30;
    setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(AlpacaEmblem::run);
  }

  private static void run() {
    AlpacaEmblem game = new AlpacaEmblem();
    game.setVisible(true);
  }
}