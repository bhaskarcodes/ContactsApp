
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Bhaskar
 */
public class ContactList extends javax.swing.JFrame {
private LogicManager myLogicManager;
    /**
     * Creates new form ContactList
     */
public ContactList() {
        initComponents();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(Color.RED);
        con.setBackground(new java.awt.Color(255,187,85));
        this.setTitle("Contacts");
        this.setLocationRelativeTo(null);
        searchbtn.setContentAreaFilled(false);
        searchbtn.setOpaque(true);
        searchbtn.setBackground(Color.yellow);
        addbtn.setContentAreaFilled(false);
        addbtn.setOpaque(true);
        addbtn.setBackground(new java.awt.Color(217, 251, 119));
        viewbtn.setContentAreaFilled(false);
        viewbtn.setOpaque(true);
        viewbtn.setBackground(new java.awt.Color(0, 217, 249));//));
        deletebtn.setContentAreaFilled(false);
        deletebtn.setOpaque(true);
        deletebtn.setBackground(new java.awt.Color(255, 115, 115));
        add.setLocationRelativeTo(null);
        add.setTitle("Add New Contact");
        Container con1 = add.getContentPane();
        add.setIconImage(new ImageIcon(getClass().getResource("contacts.png")).getImage());        
//con.setBackground(Color.RED);
        con1.setBackground(new java.awt.Color(255,187,85));
        submit.setContentAreaFilled(false);
        submit.setOpaque(true);
        submit.setBackground(new java.awt.Color(252, 60, 58));
        reset.setContentAreaFilled(false);
        reset.setOpaque(true);
        reset.setBackground(new java.awt.Color(252, 60, 58));
        goback.setContentAreaFilled(false);
        goback.setOpaque(true);
        goback.setBackground(new java.awt.Color(252, 60, 58));
       setDefaultCloseOperation(this.EXIT_ON_CLOSE);
       bday1.setEditable(false);
       bday1.setLineWrap(true);
       myLogicManager = new LogicManager();
       bday1.setText(myLogicManager.getBirthday());
       this.setIconImage(new ImageIcon(getClass().getResource("contacts.png")).getImage());
       pic.setVisible(true);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * egenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mobno = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        dd = new javax.swing.JComboBox<>();
        mm = new javax.swing.JComboBox<>();
        yyyy = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bday1 = new javax.swing.JTextArea();
        pic = new javax.swing.JLabel();

        this.setLocationRelativeTo(null);
        add.setMinimumSize(new java.awt.Dimension(400, 353));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mobile Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Email ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText(" Date of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        mobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnoActionPerformed(evt);
            }
        });
        mobno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobnoKeyTyped(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        goback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        goback.setText("GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        dd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yyyy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyyyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add.getContentPane());
        add.getContentPane().setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name)
                    .addComponent(mobno)
                    .addComponent(email)
                    .addComponent(address)
                    .addGroup(addLayout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addLayout.createSequentialGroup()
                        .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yyyy, 0, 89, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mm)
                    .addComponent(yyyy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goback, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setResizable(false);

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addbtn.setText("ADD CONTACT");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("SEARCH / UPDATE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewbtn.setText("VIEW ALL CONTACTS");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchbtn.setText("EXIT");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("NOTIFICATIONS : ");

        bday1.setColumns(20);
        bday1.setRows(5);
        jScrollPane1.setViewportView(bday1);

        pic.setIcon(new javax.swing.ImageIcon("C:\\Users\\bhaskar\\Desktop\\contacts.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
new Update(myLogicManager).setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        add.setVisible(true);
        this.dispose();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 1960; i <= year; i++) {
            yyyy.addItem(i + "");
        }

    }//GEN-LAST:event_addbtnActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String nm = name.getText();
        String mo = mobno.getText();
        String adr = address.getText();
        //date format yyyy-mm-dd
        String db = yyyy.getSelectedItem().toString() + "-" + mm.getSelectedItem().toString() + "-" + dd.getSelectedItem().toString();
        String em = email.getText();
        int r = myLogicManager.insert(nm, mo, adr, db, em,this);
        if(r==1){
            add.dispose();
            new ContactList().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void mobnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnoKeyTyped
  

        // TODO add your handling code here:
    }//GEN-LAST:event_mobnoKeyTyped

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed

        add.dispose();// TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_gobackActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
    new ShowAll(this,myLogicManager).setVisible(true);   
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_viewbtnActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        name.setText("");
        mobno.setText("");
        address.setText("");
        email.setText("");
        dd.setSelectedIndex(0);
        mm.setSelectedIndex(0);
        yyyy.setSelectedIndex(0);
    }//GEN-LAST:event_resetActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
int bp = JOptionPane.showConfirmDialog(this, "Do you want to Exit ?");
                if (bp == JOptionPane.YES_OPTION) {
                   JOptionPane.showMessageDialog(this, "ContactsApp(V1.1) Closed");
                    System.exit(0);
                }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void mobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnoActionPerformed

    private void mobnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnoKeyReleased
    myLogicManager.checkDigits(mobno,this);         // TODO add your handling code here:
    }//GEN-LAST:event_mobnoKeyReleased

    private void yyyyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyyyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yyyyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame add;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField address;
    private javax.swing.JTextArea bday1;
    private javax.swing.JComboBox<String> dd;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField email;
    private javax.swing.JButton goback;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mm;
    private javax.swing.JTextField mobno;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pic;
    private javax.swing.JButton reset;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton submit;
    private javax.swing.JButton viewbtn;
    private javax.swing.JComboBox<String> yyyy;
    // End of variables declaration//GEN-END:variables

}