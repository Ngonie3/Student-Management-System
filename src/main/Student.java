package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngoni
 */
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Student() {
        super("Students");
        initComponents();
        conn = dataBaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mothersName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        updateStudents = new javax.swing.JButton();
        addStudentBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        studentsSearch = new javax.swing.JButton();
        studentsDelete = new javax.swing.JButton();
        studentClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), " Students ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(429, 585));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Mother's Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Phone number");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Course");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        updateStudents.setBackground(new java.awt.Color(0, 0, 0));
        updateStudents.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateStudents.setForeground(new java.awt.Color(0, 153, 204));
        updateStudents.setIcon(new javax.swing.ImageIcon("C:\\Users\\ngoni\\OneDrive\\Documents\\Downloads\\Student\\src\\png files\\submit.png")); // NOI18N
        updateStudents.setText("Update");
        updateStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentsActionPerformed(evt);
            }
        });

        addStudentBack.setBackground(new java.awt.Color(0, 0, 0));
        addStudentBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addStudentBack.setForeground(new java.awt.Color(0, 153, 204));
        addStudentBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\ngoni\\OneDrive\\Documents\\Downloads\\Student\\src\\png files\\back.png")); // NOI18N
        addStudentBack.setText("Back");
        addStudentBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Student ID");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        studentsSearch.setBackground(new java.awt.Color(0, 0, 0));
        studentsSearch.setForeground(new java.awt.Color(0, 153, 204));
        studentsSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\ngoni\\OneDrive\\Documents\\Downloads\\Student\\src\\png files\\loupe.png")); // NOI18N
        studentsSearch.setText("Search");
        studentsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsSearchActionPerformed(evt);
            }
        });

        studentsDelete.setBackground(new java.awt.Color(0, 0, 0));
        studentsDelete.setForeground(new java.awt.Color(0, 153, 204));
        studentsDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ngoni\\OneDrive\\Documents\\Downloads\\Student\\src\\png files\\cancel1.png")); // NOI18N
        studentsDelete.setText("Delete");
        studentsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsDeleteActionPerformed(evt);
            }
        });

        studentClear.setBackground(new java.awt.Color(0, 0, 0));
        studentClear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        studentClear.setForeground(new java.awt.Color(0, 153, 204));
        studentClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png files/clear.png"))); // NOI18N
        studentClear.setText("Clear");
        studentClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(updateStudents)
                        .addGap(32, 32, 32)
                        .addComponent(studentsDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mothersName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudentBack)
                    .addComponent(studentsSearch))
                .addGap(18, 18, 18)
                .addComponent(studentClear)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsSearch)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(studentClear))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mothersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateStudents)
                            .addComponent(studentsDelete)
                            .addComponent(addStudentBack))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png files/home.png"))); // NOI18N

        homeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        homeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png files/home.png"))); // NOI18N
        homeMenuItem.setText("Home");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(homeMenuItem);

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logoutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png files/logout.png"))); // NOI18N
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 595, 686);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuItemActionPerformed
        
        setVisible(false);
        home obj = new home();
        obj.setVisible(true);
    }//GEN-LAST:event_homeMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        
        setVisible(false);
        login obj = new login();
        obj.setVisible(true);

    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void updateStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentsActionPerformed
        
        try {
            stmt = conn.createStatement();
            int studentId = Integer.parseInt(id.getText());
            String studentName = name.getText();
            String studentAge = age.getText();
            String studentMother = mothersName.getText();
            String studentCity = city.getText();
            String studentPhone = phoneNumber.getText();
            String studentCourse = course.getText();

            String sql = "UPDATE STUDENT SET student_name ='" + studentName + "', student_mothers_name = '" + studentMother + "', student_age = '" + studentAge + "', "
                    + "student_city = '" + studentCity + "', student_phone = '" + studentPhone + "', student_course = '" + studentCourse + "' WHERE student_ID = '" + studentId + "'";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data is sucessfully updated");
            clearStudent();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateStudentsActionPerformed

    private void clearStudent() {
        id.setText(null);
        name.setText(null);
        age.setText(null);
        mothersName.setText(null);
        city.setText(null);
        phoneNumber.setText(null);
        course.setText(null);
    }

    private void clearStudentSettings() {
        name.setText(null);
        age.setText(null);
        mothersName.setText(null);
        city.setText(null);
        phoneNumber.setText(null);
        course.setText(null);
    }

    private void addStudentBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBackActionPerformed
        
        setVisible(false);
        home obj = new home();
        obj.setVisible(true);
    }//GEN-LAST:event_addStudentBackActionPerformed

    private void studentsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsSearchActionPerformed
        
        try {
            stmt = conn.createStatement();

            int studentId = Integer.parseInt(id.getText());

            String sql = "SELECT * FROM STUDENT WHERE student_ID = '" + studentId + "'";

            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                name.setText(rs.getString("student_name"));
                mothersName.setText(rs.getString("student_mothers_name"));
                phoneNumber.setText(rs.getString("student_phone"));
                age.setText(rs.getString("student_age"));
                city.setText(rs.getString("student_city"));
                course.setText(rs.getString("student_course"));

            } else {
                JOptionPane.showMessageDialog(null, "Record not found");
                clearStudentSettings();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_studentsSearchActionPerformed

    private void studentsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsDeleteActionPerformed

        try {
            stmt = conn.createStatement();
            int studentId = Integer.parseInt(id.getText());
            String sql = "DELETE FROM student WHERE student_ID ='" + studentId + "'";
            stmt.executeUpdate(sql);

            setVisible(false);
            showStudents obj = new showStudents();
            obj.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_studentsDeleteActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                stmt = conn.createStatement();

                int studentId = Integer.parseInt(id.getText());

                String sql = "SELECT * FROM STUDENT WHERE student_ID = '" + studentId + "'";

                rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    name.setText(rs.getString("student_name"));
                    mothersName.setText(rs.getString("student_mothers_name"));
                    phoneNumber.setText(rs.getString("student_phone"));
                    age.setText(rs.getString("student_age"));
                    city.setText(rs.getString("student_city"));
                    course.setText(rs.getString("student_course"));

                } else {
                    JOptionPane.showMessageDialog(null, "Record not found");
                    clearStudentSettings();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_idKeyPressed

    private void studentClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentClearActionPerformed
        
        id.setText(null);
        name.setText(null);
        age.setText(null);
        mothersName.setText(null);
        city.setText(null);
        phoneNumber.setText(null);
        course.setText(null);
    }//GEN-LAST:event_studentClearActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBack;
    private javax.swing.JTextField age;
    private javax.swing.JTextField city;
    private javax.swing.JTextField course;
    private javax.swing.JMenuItem homeMenuItem;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JTextField mothersName;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton studentClear;
    private javax.swing.JButton studentsDelete;
    private javax.swing.JButton studentsSearch;
    private javax.swing.JButton updateStudents;
    // End of variables declaration//GEN-END:variables
}