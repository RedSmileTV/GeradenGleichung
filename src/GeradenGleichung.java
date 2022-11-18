import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.11.2022
 * @author 
 */

public class GeradenGleichung extends JFrame {
  // Anfang Attribute
  private JLabel formel = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JLabel lM = new JLabel();
  private JLabel lB = new JLabel();
  private JButton bBerechnefor1 = new JButton();
  private JButton bBerechnewhile = new JButton();
  private JTextArea jTextArea = new JTextArea();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jTextArea);
  // Ende Attribute
  
  public GeradenGleichung() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 400;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GeradenGleichung");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jList1ScrollPane.setBounds(40, 190, 200, 150);
    cp.add(jList1ScrollPane);
    bBerechnefor1.setBounds(65, 120, 150, 30);
    bBerechnefor1.setText("Berechne (for)");
    bBerechnefor1.setMargin(new Insets(2, 2, 2, 2));
    bBerechnefor1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBerechnefor1_ActionPerformed(evt);
      }
    });
    cp.add(bBerechnefor1);
    lB.setBounds(170, 75, 30, 20);
    lB.setText("b:");
    lB.setHorizontalAlignment(SwingConstants.CENTER);
    lB.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lB);
    lM.setBounds(6, 75, 30, 20);
    lM.setText("m:");
    lM.setHorizontalAlignment(SwingConstants.CENTER);
    lM.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lM);
    jTextField2.setBounds(210, 70, 60, 30);
    cp.add(jTextField2);
    jTextField1.setBounds(50, 70, 60, 30);
    cp.add(jTextField1);
    formel.setBounds(20, 15, 230, 33);
    formel.setText("y = mx+b");
    formel.setHorizontalTextPosition(SwingConstants.CENTER);
    formel.setHorizontalAlignment(SwingConstants.CENTER);
    formel.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(formel);
    
    bBerechnewhile.setBounds(65, 155, 150, 30);
    bBerechnewhile.setText("Berechne (while)");
    bBerechnewhile.setMargin(new Insets(2, 2, 2, 2));
    bBerechnewhile.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBerechnewhile_ActionPerformed(evt);
      }
    });
    cp.add(bBerechnewhile);
    // Ende Komponenten
    jTextField1.setText("0");
    jTextField2.setText("0");
    //jTextField3.setText("0");

    setVisible(true);
  }

  double m, b, x, y, z;
  
  public void bBerechnefor1_ActionPerformed(ActionEvent evt) {
    m = Double.parseDouble(jTextField1.getText());
    b = Double.parseDouble(jTextField2.getText());

    for (int i = 0; i < 10; i++) {
      y = m * i + b;
      System.out.println(y);
      jTextArea.append("y = " + y + "\n");
    }
  }
  public void bBerechnewhile_ActionPerformed(ActionEvent evt) {
    //z = Double.parseDouble(jTextField3);
    x = 1;
    while (x <= z) {
      y = m * x + b;
      System.out.println(y);
      jTextArea.append("y = " + y + "\n");
      x++;
    }
  }
}
