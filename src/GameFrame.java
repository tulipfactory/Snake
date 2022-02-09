import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){  //the framing for our game!
		
		this.add(new GamePanel()); //object creation
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

}
}
