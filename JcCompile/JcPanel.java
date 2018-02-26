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

  public void AddButton(String buttonName, String layoutPosition)
  {
    JButton button = new JButton(buttonName);
    _MainPanel.add(button, layoutPosition);
  }

  public void AddTextArea(String textAreaInitialValue, int rows, int columns, String layoutPosition)
  {
    JTextArea textArea = new JTextArea(textAreaInitialValue, rows, columns);
    _MainPanel.add(textArea, layoutPosition);
  }

  public void AddLabel(String lableName, String layoutPosition)
  {
    JLabel label = new JLabel(lableName);
    _MainPanel.add(label, layoutPosition);
  }



  private JPanel _MainPanel;
  private BorderLayout _Layout;
}
