import java.awt.*;

public class JcPanel
{
  public JcPanel()
  {
    _MainPanel = new JPanel();
    _Layout = new BorderLayout();
    _MainPanel.SetLayout(_Layout);
  }

  public BorderLayout Layout() {  return _Layout; }

  public void AddButton(JButton button, string layoutPosition)
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
