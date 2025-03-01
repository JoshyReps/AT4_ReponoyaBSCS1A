
package Login;

import javax.swing.JCheckBox;
import org.json.simple.JSONObject;

public class UpdateChanges extends javax.swing.JFrame {

    //as we can see in this constructor, we first get the `JSONobject` which refers
    //to the account in which we wanted the update to happen and the the cases from 
    //the UpdatePassword
    public UpdateChanges(JSONObject account, boolean case1, boolean case2, boolean case3, boolean case4) {
        
        //Similar to sign up, these methods will basically make our SignUp interface get all the componenets,
        //make it visible, unresizable, and be in the middle of our screen. The pack will basically make our JFrame 
        //fit the preferred size.
        initComponents();
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        //this nested class basically just holds the `checkResult` method since there's really no point in creating
        //the method nor the class outside of this constructor since it's only going to be used inside it.
        class HelperInput {
            
            //as we can see, this method is an instance method of the HelperInput, which takes 4
            //arguments a case value, key, type input, and a check box.
            public void checkResult(boolean caseValue, String key, String typeInput, JCheckBox checkBox) {

                //as we can see, we first get the value of the desingated `key` argument that we pass on this
                //method
                String keyValue = (String) account.get(key);
                
                //the next thing we did was check the `caseValue` of particular case, which indicates wheter
                //a particular key was updated or not
                if(caseValue){
                    
                    //if the caseValue or if the said key was true, then we basically want the check box to checked,
                    //which implies that the particular key was updated in the json file.
                    checkBox.setSelected(true);
                    
                    //now if the `key` equals to password, then we want to show the user the new value it was changed to.
                    if(!"password".equals(key)) checkBox.setText(typeInput + " Successfuly Changed to " + keyValue);
                }
                else {
                    
                    //Now, if the case value is false implying no change or update happened on the entry, then we basically
                    //want to uncheck the box.
                    checkBox.setSelected(false);
                    
                    //additionally, if the key is not password, then we basically want to show the kept value of the entry.
                    if(!"password".equals(key)) checkBox.setText(typeInput + " Remains " + keyValue);
                }
            }
        }
        
        //as we can see, we then created a new instance of the nested `HelperInput` class, so that
        //we can actually utilized the method.
        HelperInput helper = new HelperInput();
        
        //we then call the `checkResult` method to each fields of an account excluding the `username`/userID/
        helper.checkResult(case1, "firstName", "First Name", jCheckBox1);
        helper.checkResult(case2, "lastName", "Last Name", jCheckBox2);
        helper.checkResult(case3, "department", "Department", jCheckBox3);
        helper.checkResult(case4, "password", "Password", jCheckBox4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 229, 239));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText(" First Name");

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText(" Last Name");

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Department");

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Update Result :");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ok");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButton2)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this method is the `ok` method.
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //as we can see below, this will basically dispose the `UpdateChanges`
        //current instance or interface and create a new instnace of the welcome class.
        this.dispose();
        new welcome();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
