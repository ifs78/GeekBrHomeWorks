import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Java2Graph extends JFrame {
    Java2Graph() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 400, 400);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        bottomPanel.setBackground(Color.yellow);

        bottomPanel.setPreferredSize(new Dimension(1, 40));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        centerPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JTextArea jta = new JTextArea();
        jta.setBackground(Color.gray);
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        centerPanel.add(jsp, BorderLayout.CENTER);

        JTextField jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(300, 30));
        JButton jb = new JButton("Send");
        bottomPanel.add(jtf);
        bottomPanel.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(jtf.getText() + "\n");
                jtf.setText(null);
                jtf.grabFocus();
            }
        });

        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    jta.append(jtf.getText() + "\n");
                    jtf.setText(null);
                    jtf.grabFocus();
                }
                super.keyReleased(e);
            }
        });
        setVisible(true);
    }
}

class MainChat {
    public static void main(String[] args) {
        new Java2Graph();
    }
}