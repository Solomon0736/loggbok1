import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loggtable {
    private JPanel logg;
    private JButton button1;
    private JTextArea TextArea;
    private JTextField textField2;
    private JTextField textField1;

    // private void createUIComponents() {
        // TODO: place custom component creation code here
    public loggtable(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (getUser().equals("Magnus") && getText().equals("password")) {
                    TextArea.setText("Magnus skrev det här");
                }
                else {
                    TextArea.setText("du har fel användnamn eller lösenord");

                }
            }
        });
    }
    public JPanel getLogg()
    {
        return logg;
    }
    public void setLogg(JPanel logg)
    {
        this.logg = logg;
    }

    public String getText() {
        return textField1.getText();
    }

    public String getUser() {
        return textField2.getText();
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public int getTextArea() {
        return Integer.parseInt(TextArea.getText());
    }

    public void setTextArea(JTextArea textArea) {
        this.TextArea = textArea;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("loggtable");
        frame.setContentPane(new loggtable().logg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


