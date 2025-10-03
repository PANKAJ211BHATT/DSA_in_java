import java.awt.*;
import java.awt.event.*;

public class LayoutDemo extends Frame {
    public LayoutDemo() {
        // ----- FlowLayout -----
        setLayout(new FlowLayout());
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));

        // ----- BorderLayout -----
        Frame borderFrame = new Frame("BorderLayout Example");
        borderFrame.setLayout(new BorderLayout());
        borderFrame.add(new Button("North"), BorderLayout.NORTH);
        borderFrame.add(new Button("South"), BorderLayout.SOUTH);
        borderFrame.add(new Button("East"), BorderLayout.EAST);
        borderFrame.add(new Button("West"), BorderLayout.WEST);
        borderFrame.add(new Button("Center"), BorderLayout.CENTER);
        borderFrame.setSize(300, 200);
        borderFrame.setVisible(true);

        // ----- GridLayout -----
        Frame gridFrame = new Frame("GridLayout Example");
        gridFrame.setLayout(new GridLayout(2, 3)); // 2 rows, 3 cols
        for (int i = 1; i <= 6; i++) {
            gridFrame.add(new Button("B" + i));
        }
        gridFrame.setSize(300, 200);
        gridFrame.setVisible(true);

        // ----- Window Closing -----
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LayoutDemo f = new LayoutDemo();
        f.setSize(300, 200);
        f.setTitle("FlowLayout Example");
        f.setVisible(true);
    }
}
