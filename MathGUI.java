package mathgrouping;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.GradientPaint;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

public class MathGUI extends JFrame {

	public JFrame frame;
	private JPanel contentPane;
	private JButton  getProblemButton1;
	private JButton  getProblemButton2;
	private JLabel  hundredsLabel;
    private JTextField  hundredsField;
    private JLabel  tensLabel;
    private JTextField  tensField;
    private JLabel  onesLabel;
    private JTextField  onesField;
    private JLabel  guessLabel;
    private JTextField guessField;
    private JLabel  nameLabel;
    private JTextArea resultsTextArea;
    private JButton solveButton;
    private JButton quitButton;
    private JButton helpButton;
    private JButton scoreButton;
    private JButton resetButton;
    private JTextField  nameField;
	private Grouping g = new Grouping();

	/**
	 * Create the frame.
	 */
	public MathGUI() {
		frame = new JFrame ("Math Grouping Exercise");
		
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 627);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 210, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getProblemButton1 = new JButton("New Problem 0 - 9");
		getProblemButton1.setBounds(12, 13, 180, 25);
		contentPane.add(getProblemButton1);
		
		getProblemButton2 = new JButton("New Problem 0 - 15");
		getProblemButton2.setBounds(240, 13, 180, 25);
		contentPane.add(getProblemButton2);
		
		hundredsLabel = new JLabel("number of HUNDREDS");
		hundredsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		hundredsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hundredsLabel.setBounds(12, 75, 180, 16);
		contentPane.add(hundredsLabel);
		
		tensLabel = new JLabel("number of TENS");
		tensLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		tensLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tensLabel.setBounds(12, 125, 180, 16);
		contentPane.add(tensLabel);
		
		onesLabel = new JLabel("number of ONES");
		onesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		onesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		onesLabel.setBounds(12, 175, 180, 16);
		contentPane.add(onesLabel);
		
		hundredsField = new JTextField();
		hundredsField.setFont(new Font("Tahoma", Font.BOLD, 20));
		hundredsField.setBounds(240, 72, 180, 30);
		hundredsField.setHorizontalAlignment(SwingConstants.CENTER);
		hundredsField.setEditable(false);
		contentPane.add(hundredsField);
		hundredsField.setColumns(10);
		
		tensField = new JTextField();
		tensField.setFont(new Font("Tahoma", Font.BOLD, 20));
		tensField.setColumns(10);
		tensField.setBounds(240, 122, 180, 30);
		tensField.setHorizontalAlignment(SwingConstants.CENTER);
		tensField.setEditable(false);
		contentPane.add(tensField);
		
		onesField = new JTextField();
		onesField.setFont(new Font("Tahoma", Font.BOLD, 20));
		onesField.setColumns(10);
		onesField.setBounds(240, 172, 180, 30);
		onesField.setHorizontalAlignment(SwingConstants.CENTER);
		onesField.setEditable(false);
		contentPane.add(onesField);
		
		guessLabel = new JLabel("enter your guess here");
		guessLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		guessLabel.setHorizontalAlignment(SwingConstants.CENTER);
		guessLabel.setBounds(12, 240, 180, 46);
		contentPane.add(guessLabel);
		
		guessField = new JTextField();
		guessField.setFont(new Font("Tahoma", Font.BOLD, 20));
		guessField.setColumns(10);
		guessField.setBounds(240, 247, 180, 30);
		guessField.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(guessField);
		
		solveButton = new JButton("CHECK YOUR ANSWER");
		solveButton.setBounds(120, 300, 180, 25);
		contentPane.add(solveButton);
        solveButton.registerKeyboardAction(solveButton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
		
		resultsTextArea = new JTextArea();
		resultsTextArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultsTextArea.setBackground(new Color(224, 255, 255));
		resultsTextArea.setBounds(200, 345, 232, 244);
		resultsTextArea.setEditable(false);
		contentPane.add(resultsTextArea);
		
		nameLabel = new JLabel("enter your name below");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nameLabel.setBounds(12, 360, 180, 46);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 16));
		nameField.setColumns(10);
		nameField.setBounds(12, 400, 160, 30);
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(nameField);
		
		scoreButton = new JButton("See Your Score");
		scoreButton.setBounds(12, 450, 160, 25);
		contentPane.add(scoreButton);
		
		resetButton = new JButton("Reset Your Score");
		resetButton.setBounds(12, 500, 160, 25);
		contentPane.add(resetButton);
		
		quitButton = new JButton("QUIT");
		quitButton.setBounds(12, 550, 66, 25);
		contentPane.add(quitButton);
		
		helpButton = new JButton("?");
		helpButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		helpButton.setBounds(100, 550, 44, 25);
		contentPane.add(helpButton);
		
		setVisible(true);
		guessField.requestFocus();
		addListeners();
	}
	
	private int value(String numberString)
	{
		int numValue = 0;
		int [] numbers = 
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		String [] words = 
			{"zero","one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen"};
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].equals(numberString))
			{
				numValue = numbers[i];
			}
		}
		return numValue;
	}
	
	private void addListeners()
    {
    	getProblemButton1.addActionListener(
    	new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			hundredsField.setText(g.getNumberString(1));
            	tensField.setText(g.getNumberString(1));
            	onesField.setText(g.getNumberString(1));
            	guessField.setText("");
            	resultsTextArea.setText("");
            	guessField.requestFocus();
    		}
    	}
    	);
		
		getProblemButton2.addActionListener(
    	new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			hundredsField.setText(g.getNumberString(2));
            	tensField.setText(g.getNumberString(2));
            	onesField.setText(g.getNumberString(2));
            	guessField.setText("");
            	resultsTextArea.setText("");
            	guessField.requestFocus();
    		}
    	}
    	);
    	
    	solveButton.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	int hundreds = value(hundredsField.getText());
            	int tens = value(tensField.getText());
            	int ones = value(onesField.getText());
            	int sum = (hundreds * 100) + (tens * 10) + (ones);
            	String sumString = "" + sum;
            	String answer = guessField.getText();
            	answer = answer.replaceAll(",", "");
            	
            	for (int i=0; i<answer.length(); i++)
            	{
            		if (answer.charAt(0) == '0')
            		{
            			answer = answer.substring(1,answer.length());
            		}
            	}
            	if (answer.equals(sumString))
            	{
            		resultsTextArea.setText("YOU ARE CORRECT" + "\n\n" +
            				hundreds + " HUNDREDS = " + (hundreds * 100) + "\n\n" +
            				tens + " TENS = " + (tens * 10) + "\n\n" +
            				ones + " ONES = " + (ones) + "\n\n" +
            				(hundreds * 100) + " + " + (tens * 10) + " + " + 
            				(ones) + " = " + sum);
            		Grouping.incrementNumRight();
            	}
            	else
            	{
            		resultsTextArea.setText("YOU ARE NOT CORRECT" + "\n\n" +
            				"You guessed " + answer + "\n\n" +
            				hundreds + " HUNDREDS = " + (hundreds * 100) + "\n\n" +
            				tens + " TENS = " + (tens * 10) + "\n\n" +
            				ones + " ONES = " + (ones) + "\n\n" +
            				(hundreds * 100) + " + " + (tens * 10) + " + " + 
            				(ones) + " = " + sum);
            		Grouping.incrementNumWrong();
            	}
            }
        }
        );
    	
        scoreButton.addActionListener(
        new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		int right = Grouping.getNumRight();
        		int wrong = Grouping.getNumWrong();
        		int total = right + wrong;
        		String name = nameField.getText();
        		if (name.length() == 0)
        		{
        			name = "Mystery Math Student";
        		}
        		double average = ((double)right / (double)total);
        		resultsTextArea.setText(name + "," + "\n" + "You got " + right 
        								+ " right out of " + (right+wrong) 
        								+ "." + "\n");
        		if (average == 1)
        		{
        			resultsTextArea.append("WOW That's Perfect!!!!");
        		}
        		else if (average >= 0.75)
        		{
        			resultsTextArea.append("Great Job!!!!!!");
        		}
        		else if (average >= 0.5)
        		{
        			resultsTextArea.append("Doing Good!");
        		}
        		else
        		{
        			resultsTextArea.append("Getting Close." + "\n"
        									+ "Keep Practicing :)");
        		}
            }
        }
        );
        
        resetButton.addActionListener(
        new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		Grouping.resetNumRight();
        		Grouping.resetNumWrong();
        		resultsTextArea.setText("");
        		hundredsField.setText("");
        		tensField.setText("");
        		onesField.setText("");
        		guessField.setText("");
        		nameField.setText("");
            }
        }
        );
    	
        helpButton.addActionListener(
                new ActionListener()
                {
                	public void actionPerformed(ActionEvent e)
                	{
                		MathHelpGUI hGui = new MathHelpGUI();
                    }
                }
                );
        
        quitButton.addActionListener(
        new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		System.exit(0);
            }
        }
        );
    }
}
