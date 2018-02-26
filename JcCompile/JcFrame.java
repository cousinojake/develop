import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class JcFrame extends JFrame implements ActionListener
{
  public JcFrame()
  {
    _Frame = new JFrame();

    _Frame.setLayout(new GridBagLayout());
    GridBagConstraints position = new GridBagConstraints();

    // Place a label
    position.gridx = 6;
    position.gridy = 0;
    _Frame.add(new JLabel("Compile Program"),position);

    //button
    position.gridx = 2;
    position.gridy = 0;
    compile = new JButton( "Compile" );
    _Frame.add(compile, position);
    compile.addActionListener(this);

    // FIX ME: add action listeners for each button
    //ants.addActionListener(this);

    setupMenus();

    _Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    _Frame.setTitle("App");
    _Frame.setSize(600,600);
    _Frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {

  }

  /*********************************************************************
  Set up the menu items
   *********************************************************************/
  private void setupMenus(){

      // create menu components
      fileMenu = new JMenu("File");
      quitItem = new JMenuItem("Quit");
      clearItem = new JMenuItem("Clear");

      // assign action listeners
      quitItem.addActionListener(this);
      clearItem.addActionListener(this);

      // display menu components
      fileMenu.add(clearItem);
      fileMenu.add(quitItem);
      menus = new JMenuBar();

      menus.add(fileMenu);
      setJMenuBar(menus);
  }

  private JFrame _Frame;
  private JcPanel _Panel;

  private JButton compile;
  private JMenuBar menus;
  private JMenu fileMenu;
  private JMenuItem quitItem;
  private JMenuItem clearItem;

}
