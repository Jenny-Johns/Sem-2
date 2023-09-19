import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents {
    public static void main(String[] args) {
        System.out.println("Press any key. Press 'q' to quit.");

        // Create a KeyListener instance and add it to the System.in (standard input) stream
        KeyListener keyListener = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                System.out.println("Key Typed: " + keyChar);
            }
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
            }
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));

                if (e.getKeyChar() == 'q') {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        };

        // Add the keyListener to the standard input stream
        //System.in.addKeyListener(keyListener);

        // Keep the program running until 'q' is pressed
        try {
            while (true) {
                Thread.sleep(100); // Small delay to avoid high CPU usage
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
