import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GreetImage {

	public static void main(String[] args) throws MalformedURLException {
		URL imageLocation = new URL(
			"http://images.cubshq.com/stories/18/facebook/bryzzo_bats.JPG");
		JOptionPane.showMessageDialog(null, "Hello from the Cubs!", "Go Cubs Go", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}

}
