public class MainScreen extends javax.swing.JFrame{
  public MainScreen() {
      initComponents();
  }

  private void initComponents() {

      lblMsg = new javax.swing.JLabel();
      btnClick = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      lblMsg.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
      lblMsg.setForeground(new java.awt.Color(255, 0, 51));
      lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblMsg.setText("Aqui vai aparecer sua Mensagem");
      lblMsg.setToolTipText("");

      btnClick.setText("Clique em Mim!");
      btnClick.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              btnClickActionPerformed(evt);
          }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                      .addGap(72, 72, 72)
                      .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                      .addGap(218, 218, 218)
                      .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addContainerGap(72, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addContainerGap(106, Short.MAX_VALUE)
              .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(82, 82, 82)
              .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(67, 67, 67))
      );

      pack();
  }                      

  private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {                                         
      lblMsg.setText("Olá, Mundo!");
  }                                        
  public static void main(String args[]) {
      try {
          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
              if ("Nimbus".equals(info.getName())) {
                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;
              }
          }
      } catch (ClassNotFoundException ex) {
          java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new MainScreen().setVisible(true);
          }
      });
  }                  
  private javax.swing.JButton btnClick;
  private javax.swing.JLabel lblMsg;                 
}