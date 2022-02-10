import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; //how big are objects in this game
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75; //GAME SPEED
    final int x[] = new int[GAME_UNITS]; //holds all the body part coordinates
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6; //6 snake parts to start
    int applesEaten; //how many apples eaten
    int appleX; //random positioning of apple on the coordinates
	int appleY;
	char direction = 'R'; //snake begins going right
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel() {
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
	}
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		
	}
	public void draw(Graphics g) {
		
		for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
			g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
		}//size of the apple
		g.setColor(Color.red);
		g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
	}
	public void newApple() {
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
		//allows apple to be places evenly thruout the screen.
		//it will appear randomly each time
		
	}
	public void move() {
		
	}
	public void checkApple() {
		
	}
	public void checkCollisions() {
		
	}
	public void gameOver(Graphics g) {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
	}
}