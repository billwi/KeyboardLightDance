import java.awt.*;
import java.awt.event.KeyEvent;

public class Driver {
    private static int maxSeconds = 700;

    public static void main(String[] args)  {
        Runnable numLock = () -> {
            while (true) {
                Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, !Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_NUM_LOCK));
                try {
                    Thread.sleep((int) ((Math.random() * maxSeconds) + 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable capsLock = () -> {
            while (true) {
                Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, !Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK));
                try {
                    Thread.sleep((int) ((Math.random() * maxSeconds) + 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable scrollLock = () -> {
            while (true) {
                Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, !Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_SCROLL_LOCK));
                try {
                    Thread.sleep((int) ((Math.random() * maxSeconds) + 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(numLock).start();
        new Thread(capsLock).start();
        new Thread(scrollLock).start();
    }
}
