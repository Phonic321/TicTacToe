
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TTT {
    private JFrame window;
    private JTextField firstNameInput;
    private JTextField secondNameInput;
    private JLabel Wins1;
    private JLabel Wins2;
    private JLabel amountOfWins1;
    private JLabel amountOfWins2;
    private JLabel Losses1;
    private JLabel Losses2;
    private JLabel amountOfLosses1;
    private JLabel amountOfLosses2;
    private int numWins1 = 0;
    private int numWins2 = 0;
    private int numLoss1 = 0;
    private int numLoss2 = 0;
    private JLabel Player1;
    private JLabel Player2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton newGame;
    private JButton reset;
    private JButton exit;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private int playerTurn = 0;

    public TTT() {
        this.window = new JFrame();
        this.window.setTitle("Tic-Tac-Toe");
        this.window.setSize(400, 400);
        this.window.setDefaultCloseOperation(3);
        buildPanel1();
        buildMidGrid();
        BuildBottomGrid();
        this.window.add(this.panel1, "North");
        this.window.add(this.panel3, "Center");
        this.window.add(this.panel2, "South");
        this.window.setVisible(true);
        StartGame();
    }

    private void buildPanel1() {
        this.Player1 = new JLabel("Player1:");
        this.firstNameInput = new JTextField(7);
        this.Wins1 = new JLabel("Wins");
        this.Losses1 = new JLabel("Losses");
        this.amountOfWins1 = new JLabel(Integer.toString(this.numWins1));
        this.amountOfLosses1 = new JLabel(Integer.toString(this.numLoss1));
        this.Player2 = new JLabel("Player2:");
        this.secondNameInput = new JTextField(7);
        this.Wins2 = new JLabel("Wins");
        this.Losses2 = new JLabel("Losses");
        this.amountOfWins2 = new JLabel(Integer.toString(this.numWins2));
        this.amountOfLosses2 = new JLabel(Integer.toString(this.numLoss2));
        this.panel1 = new JPanel();
        this.panel1.setLayout(new GridLayout(3, 4));
        this.panel1.add(this.Player1);
        this.panel1.add(this.firstNameInput);
        this.panel1.add(this.Player2);
        this.panel1.add(this.secondNameInput);
        this.panel1.add(this.Wins1);
        this.panel1.add(this.amountOfWins1);
        this.panel1.add(this.Wins2);
        this.panel1.add(this.amountOfWins2);
        this.panel1.add(this.Losses1);
        this.panel1.add(this.amountOfLosses1);
        this.panel1.add(this.Losses2);
        this.panel1.add(this.amountOfLosses2);
    }

    private void buildMidGrid() {
        this.panel3 = new JPanel();
        this.panel3.setLayout(new GridLayout(3, 3));
        this.button1 = new JButton("");
        this.button2 = new JButton("");
        this.button3 = new JButton("");
        this.button4 = new JButton("");
        this.button5 = new JButton("");
        this.button6 = new JButton("");
        this.button7 = new JButton("");
        this.button8 = new JButton("");
        this.button9 = new JButton("");
        this.button1.addActionListener(new ButtonListener());
        this.button2.addActionListener(new ButtonListener());
        this.button3.addActionListener(new ButtonListener());
        this.button4.addActionListener(new ButtonListener());
        this.button5.addActionListener(new ButtonListener());
        this.button6.addActionListener(new ButtonListener());
        this.button7.addActionListener(new ButtonListener());
        this.button8.addActionListener(new ButtonListener());
        this.button9.addActionListener(new ButtonListener());
        this.panel3.add(this.button1);
        this.panel3.add(this.button2);
        this.panel3.add(this.button3);
        this.panel3.add(this.button4);
        this.panel3.add(this.button5);
        this.panel3.add(this.button6);
        this.panel3.add(this.button7);
        this.panel3.add(this.button8);
        this.panel3.add(this.button9);
    }

    private void BuildBottomGrid() {
        this.panel2 = new JPanel();
        this.panel2.setLayout(new GridLayout(1, 3));
        this.newGame = new JButton("New Game");
        this.reset = new JButton("Reset");
        this.exit = new JButton("Exit");
        this.newGame.addActionListener(new NewGameListener());
        this.reset.addActionListener(new ResetListener());
        this.exit.addActionListener(new ExitListener());
        this.panel2.add(this.newGame);
        this.panel2.add(this.reset);
        this.panel2.add(this.exit);
    }

    public void WinGameCheck() {
        if (this.playerTurn == 0) {
            if (this.button1.getText() == "X" && this.button2.getText() == "X" && this.button3.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button1.getText() == "X" && this.button4.getText() == "X" && this.button7.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button2.getText() == "X" && this.button5.getText() == "X" && this.button8.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button3.getText() == "X" && this.button6.getText() == "X" && this.button9.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button1.getText() == "X" && this.button5.getText() == "X" && this.button9.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button3.getText() == "X" && this.button5.getText() == "X" && this.button7.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button4.getText() == "X" && this.button5.getText() == "X" && this.button6.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
            if (this.button7.getText() == "X" && this.button8.getText() == "X" && this.button9.getText() == "X") {
                JOptionPane.showMessageDialog(this.window, "Player 1 Wins");
                this.numWins1++;
                this.numLoss2++;
                this.amountOfWins1.setText(Integer.toString(this.numWins1));
                this.amountOfLosses2.setText(Integer.toString(this.numLoss2));
                resetBoard();
            }
        }
        if (this.playerTurn == 1) {
            if (this.button1.getText() == "O" && this.button2.getText() == "O" && this.button3.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button1.getText() == "O" && this.button4.getText() == "O" && this.button7.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button2.getText() == "O" && this.button5.getText() == "O" && this.button8.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button3.getText() == "O" && this.button6.getText() == "O" && this.button9.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button1.getText() == "O" && this.button5.getText() == "O" && this.button9.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button3.getText() == "O" && this.button5.getText() == "O" && this.button7.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button4.getText() == "O" && this.button5.getText() == "O" && this.button6.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
            if (this.button7.getText() == "O" && this.button8.getText() == "O" && this.button9.getText() == "O") {
                JOptionPane.showMessageDialog(this.window, "Player 2 Wins");
                this.numWins2++;
                this.numLoss1++;
                this.amountOfWins2.setText(Integer.toString(this.numWins2));
                this.amountOfLosses1.setText(Integer.toString(this.numLoss1));
                resetBoard();
            }
        }
        if (this.button1.getText() != "" && this.button2.getText() != "" && this.button3.getText() != "" && this.button4.getText() != "" && this.button5.getText() != "" && this.button6.getText() != "" && this.button7.getText() != "" && this.button8.getText() != "" && this.button9.getText() != "") {
            JOptionPane.showMessageDialog(this.window, "No one wins.");
            resetBoard();
        }
    }

    private void resetBoard() {
        this.button1.setText("");
        this.button2.setText("");
        this.button3.setText("");
        this.button4.setText("");
        this.button5.setText("");
        this.button6.setText("");
        this.button7.setText("");
        this.button8.setText("");
        this.button9.setText("");
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (TTT.this.playerTurn == 0) {
                JButton buttonClicked = (JButton)e.getSource();
                buttonClicked.setText("X");
                TTT.this.WinGameCheck();
                TTT.this.playerTurn = 1;
            } else {
                JButton buttonClicked = (JButton)e.getSource();
                buttonClicked.setText("O");
                TTT.this.WinGameCheck();
                TTT.this.playerTurn = 0;
            }
        }
    }

    private class NewGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TTT.this.button1.setText("");
            TTT.this.button2.setText("");
            TTT.this.button3.setText("");
            TTT.this.button4.setText("");
            TTT.this.button5.setText("");
            TTT.this.button6.setText("");
            TTT.this.button7.setText("");
            TTT.this.button8.setText("");
            TTT.this.button9.setText("");
        }
    }

    private class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TTT.this.numWins1 = 0;
            TTT.this.numWins2 = 0;
            TTT.this.numLoss1 = 0;
            TTT.this.numLoss2 = 0;
            TTT.this.amountOfWins1.setText(Integer.toString(TTT.this.numWins1));
            TTT.this.amountOfLosses1.setText(Integer.toString(TTT.this.numLoss1));
            TTT.this.amountOfWins2.setText(Integer.toString(TTT.this.numWins2));
            TTT.this.amountOfLosses2.setText(Integer.toString(TTT.this.numLoss2));
        }
    }

    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TTT.this.window.dispose();
        }
    }

    private void StartGame() {
        Random turn = new Random();
        this.playerTurn = Math.abs(turn.nextInt() % 2) + 1;
        JOptionPane.showMessageDialog(this.window, "Player " + this.playerTurn + " goes first");
        this.firstNameInput.setText(JOptionPane.showInputDialog("Player 1 enter your name"));
        this.secondNameInput.setText(JOptionPane.showInputDialog("Player 2 enter your name"));
    }

    public static void main(String[] args) {
        new TTT();
    }
}
