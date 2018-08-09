/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MonitoringStation2 extends javax.swing.JFrame
{

    /**
     * Creates new form MonitoringStation2
     */
    public MonitoringStation2()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblMonitoringStation2 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblLanes = new javax.swing.JLabel();
        lblTotalVehicles = new javax.swing.JLabel();
        lblAvgVehicles = new javax.swing.JLabel();
        lblAvgVelocity = new javax.swing.JLabel();
        lblEnterYourReadingsAndClickSubmit = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtLanes = new javax.swing.JTextField();
        txtTotalVehicles = new javax.swing.JTextField();
        txtAvgVehicles = new javax.swing.JTextField();
        txtAvgVelocity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMonitoringStation2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMonitoringStation2.setText("Monitoring Station 2");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTime.setText("Time:");

        lblLocation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocation.setText("Location");

        lblLanes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLanes.setText("#Lanes:");

        lblTotalVehicles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalVehicles.setText("Total # Vehicles:");

        lblAvgVehicles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAvgVehicles.setText("Avg # Vehicles");

        lblAvgVelocity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAvgVelocity.setText("Avg Velocity:");

        lblEnterYourReadingsAndClickSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEnterYourReadingsAndClickSubmit.setText("Enter Your Readings And Click Submit");

        btnSubmit.setText("Submit");

        btnExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblMonitoringStation2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime)
                            .addComponent(lblLocation)
                            .addComponent(lblLanes)
                            .addComponent(lblTotalVehicles)
                            .addComponent(lblAvgVehicles)
                            .addComponent(lblAvgVelocity))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTime)
                            .addComponent(txtLocation)
                            .addComponent(txtLanes)
                            .addComponent(txtTotalVehicles)
                            .addComponent(txtAvgVehicles)
                            .addComponent(txtAvgVelocity, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnSubmit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lblEnterYourReadingsAndClickSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMonitoringStation2)
                .addGap(9, 9, 9)
                .addComponent(lblEnterYourReadingsAndClickSubmit)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanes)
                    .addComponent(txtLanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalVehicles)
                    .addComponent(txtTotalVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvgVehicles)
                    .addComponent(txtAvgVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvgVelocity)
                    .addComponent(txtAvgVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringStation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringStation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringStation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringStation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MonitoringStation2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAvgVehicles;
    private javax.swing.JLabel lblAvgVelocity;
    private javax.swing.JLabel lblEnterYourReadingsAndClickSubmit;
    private javax.swing.JLabel lblLanes;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMonitoringStation2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotalVehicles;
    private javax.swing.JTextField txtAvgVehicles;
    private javax.swing.JTextField txtAvgVelocity;
    private javax.swing.JTextField txtLanes;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTotalVehicles;
    // End of variables declaration//GEN-END:variables
}
