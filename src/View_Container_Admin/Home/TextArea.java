
package View_Container_Admin.Home;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JTextArea;

public class TextArea extends JTextArea{
    
    public TextArea(){
        setEditable(false);
        setFocusable(false);
        setWrapStyleWord(true);
        setLineWrap(true);
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
    }

    @Override
    public void addNotify() {
    }
    

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
    }
    
}
