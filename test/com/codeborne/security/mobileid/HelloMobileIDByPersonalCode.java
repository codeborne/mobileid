package com.codeborne.security.mobileid;

import com.codeborne.security.AuthenticationException;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * You can use the following test phone numbers:
 * https://www.id.ee/?id=36373
 */
public class HelloMobileIDByPersonalCode {
  private static final String TEST_DIGIDOC_SERVICE_URL = "https://tsp.demo.sk.ee/";
  private MobileIDAuthenticator mid;
  private JFrame frame;
  private JTextField personalCode;
  private JLabel message;

  public static void main(String[] args) {
    System.setProperty("javax.net.ssl.trustStore", "test/keystore.jks");
    HelloMobileIDByPersonalCode app = new HelloMobileIDByPersonalCode();
    app.mid = new MobileIDAuthenticator(TEST_DIGIDOC_SERVICE_URL);
    app.create();
  }

  private void login(String personalCode) {
    try {
      final MobileIDSession mobileIDSession = mid.startLogin(personalCode, "EE");
      showMessage("<br>Challenge: " + mobileIDSession.challenge + "<br>You will get SMS in few seconds.<br>Please accept it to login.<br>");

      mid.waitForLogin(mobileIDSession);
      showMessage("You have logged in." +
          "<br>First name: " + mobileIDSession.firstName +
          "<br>Last name: " + mobileIDSession.lastName +
          "<br>Personal code: " + mobileIDSession.personalCode);
    } catch (AuthenticationException e) {
      e.printStackTrace();
      showMessage("<br><br>" + e.getMessage() + "<br><br><br>");
    }
  }

  private void showMessage(final String message) {
    SwingUtilities.invokeLater(() -> {
      HelloMobileIDByPersonalCode.this.message.setText("<html>" + message + "</html>");
      frame.pack();
    });
  }

  private void create() {
    frame = new JFrame("Hello MobileID world");
    frame.setContentPane(createContent());

    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setMinimumSize(new Dimension(300, 100));
    frame.setPreferredSize(new Dimension(400, 200));
    frame.pack();
    frame.setVisible(true);
  }

  private JComponent createContent() {
    JButton button = new JButton("Login with MobileID");
    button.addActionListener(e -> new Thread(() -> {
      showMessage("<br><br>Connecting to MobileID server...<br><br><br>");
      login(personalCode.getText());
    }).start());

    message = new JLabel("<html><br><br>Enter your personal code<br><br><br></html>");
    personalCode = new JTextField("", 30);
    personalCode.setMaximumSize(new Dimension(50, 20));

    JPanel panel = new JPanel(new FlowLayout());
    panel.add(message);
    panel.add(personalCode);
    panel.add(button);
    return panel;
  }
}
