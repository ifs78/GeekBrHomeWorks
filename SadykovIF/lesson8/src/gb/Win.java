package gb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Win extends JFrame {
    private int x1, y1, x2, y2;
    private Graphics g;
    public Win() {
        setBounds(500, 200, 800, 600);
        setTitle("GUI Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        JPanel[] jp = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            jp[i] = new JPanel();
            this.add(jp[i]);
            jp[i].setBackground(new Color(100 + i * 40, 100 + i * 40, 100 + i * 40));
        }


        jp[0].setLayout(new BorderLayout());
        JPanel jgp = new MyJPanel();
        MyMouseHandler handler = new MyMouseHandler();

        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
        jp[0].add(jgp);
        //g.setColor(Color.BLUE);
        //JTextArea jta = new JTextArea();
        //JScrollPane jsp = new JScrollPane(jta);
        //jp[0].repaint();


        jp[1].setLayout(new FlowLayout());
        JRadioButton[] jrb = new JRadioButton[4];
        ButtonGroup bgr = new ButtonGroup();
        ButtonGroup bgr2 = new ButtonGroup();
        ButtonGroup bgr3 = new ButtonGroup();
        for (int i = 0; i < jrb.length; i++) {
            jrb[i] = new JRadioButton("Option #" + i);
            if (i < 2) {
                bgr.add(jrb[i]);
            } else {
                bgr2.add(jrb[i]);
            }
            jp[1].add(jrb[i]);
        }
        JCheckBox[] jcb = new JCheckBox[4];
        for (int i = 0; i < jcb.length; i++) {
            jcb[i] = new JCheckBox("Check #" + i);
//            bgr3.add( jcb[i]);
            jp[1].add(jcb[i]);
        }


        jp[2].setLayout(new FlowLayout());
        String[] comboStr = {"Item #1", "Item #2", "Item #3", "Item #4"};
        JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<>(comboStr);
        jp[2].add(jcombo1);
        jp[2].add(jcombo2);

        jcombo1.addActionListener(e -> {
            jcombo2.setSelectedIndex(jcombo1.getSelectedIndex());
        });

//        jcombo1.addActionListener(e -> {System.out.println(jcombo1.getSelectedItem().toString() + "***");});
//        jcombo1.addActionListener(new ActionComBox());
//        jcombo1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(jcombo1.getSelectedItem().toString());
//            }
//        });


        jp[3].setLayout(null);
         JSlider js = new JSlider();
        JLabel jlab = new JLabel("Value: 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        jp[3].add(jlab);
        jp[3].add(js);
        js.addChangeListener(e -> jlab.setText("Value: " + js.getValue()));

//        js.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                jlab.setText("Value: " + js.getValue());
//            }
//        });
        jlab.setBounds(10, 10, 100, 20);
        js.setBounds(20, 40, 300, 100);
        js.setBackground(new Color(160, 255, 160));


        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");

        setJMenuBar(mainMenu);

        mainMenu.add(mFile);
        mainMenu.add(mEdit);

        mFile.add(miFileNew);
        mFile.addSeparator(); // разделительная линия
        mFile.add(miFileExit);

        miFileExit.addActionListener(e -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.out.println("BYE");
            }
        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click");
            }
        });

        setVisible(true);

    }
    private class MyMouseHandler extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();

            g = getGraphics();

            x2 = x1;
            y2 = y1;
        }

        public void mouseDragged(MouseEvent e) {
            int x1 = e.getX();
            y1 = e.getY();

            g.drawLine(x1, y1, x2, y2);

            x2 = x1;
            y2 = y1;
        }
    }

}
class MyJPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        setBackground(Color.white);
        setPreferredSize(new Dimension(300, 200));
    }
}
