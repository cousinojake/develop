import java.awt.*;
import javax.swing.*;

public class JcPanel
{
  public JcPanel()
  {
    _MainPanel = new JPanel();
    _Layout = new BorderLayout();
    _MainPanel.setLayout(_Layout);
  }

  public BorderLayout Layout() {  return _Layout; }
  public JPanel Panel() { return _MainPanel; }

  public void AddButton(JButton button, String layoutPosition)
  {
    _MainPanel.add(button, layoutPosition);
  }

  public void AddTextField(JTextField textfield)
  {
    _MainPanel.add(textfield);
  }



  private JPanel _MainPanel;
  private BorderLayout _Layout;
}
