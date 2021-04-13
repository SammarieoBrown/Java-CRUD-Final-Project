/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author user
 */

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        // Variables declaration - do not modify
        javax.swing.JMenuItem closeMenu = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem export = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
        javax.swing.JMenuItem generalVenueMenu = new javax.swing.JMenuItem();
        javax.swing.JMenuItem trainingVenueMenu = new javax.swing.JMenuItem();
        javax.swing.JMenuItem sportsVenueMenu = new javax.swing.JMenuItem();
        javax.swing.JMenuItem partyVenueMenu = new javax.swing.JMenuItem();
        javax.swing.JMenu editMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem PEditMenu = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/GettyImages-covid graphic.jpg")))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/folder.png")))); // NOI18N
        jMenu1.setText("File");

        closeMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/exit.png")))); // NOI18N
        closeMenu.setText("Exit");
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseMenuActionPerformed(evt);
            }
        });
        jMenu1.add(closeMenu);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/view.png")))); // NOI18N
        jMenuItem6.setText("View Promoter");
        jMenu1.add(jMenuItem6);


        export.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/view.png")))); // NOI18N
        export.setText("Export Data");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });
        jMenu1.add(export);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add.png")))); // NOI18N
        jMenu2.setText("Add Promoter ");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add person.png")))); // NOI18N
        jMenuItem2.setText("Add New Promoter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add.png")))); // NOI18N
        jMenu4.setText("Add Venue");

        generalVenueMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        generalVenueMenu.setText("Add General Venue");
        generalVenueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralVenueMenuActionPerformed(evt);
            }
        });
        jMenu4.add(generalVenueMenu);

        trainingVenueMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        trainingVenueMenu.setText("Add Training Venue");
        trainingVenueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainingVenueMenuActionPerformed(evt);
            }
        });
        jMenu4.add(trainingVenueMenu);

        sportsVenueMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        sportsVenueMenu.setText("Add Sports Venue");
        sportsVenueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsVenueMenuActionPerformed(evt);
            }
        });
        jMenu4.add(sportsVenueMenu);

        partyVenueMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        partyVenueMenu.setText("Add Party Venue");
        partyVenueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartyVenueMenuActionPerformed(evt);
            }
        });
        jMenu4.add(partyVenueMenu);

        jMenuBar1.add(jMenu4);

        editMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/edit.png")))); // NOI18N
        editMenu.setText("Edit Promoter");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenuActionPerformed(evt);
            }
        });

        PEditMenu.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/edit.png")))); // NOI18N
        PEditMenu.setText("Edit Promoter");
        PEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEditMenuActionPerformed(evt);
            }
        });
        editMenu.add(PEditMenu);

        jMenuBar1.add(editMenu);

        jMenu3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/edit.png")))); // NOI18N
        jMenu3.setText("Edit Venue Data");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        jMenuItem1.setText("General Venue");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        jMenuItem3.setText("Party Venue");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        jMenuItem4.setText("Sports Venue");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("Images/add venue.png")))); // NOI18N
        jMenuItem5.setText("Training Venue");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AddPromoter().setVisible(true);
    }

    private void CloseMenuActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void GeneralVenueMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AddVenue().setVisible(true);

    }

    private void TrainingVenueMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AddTrainingVenue().setVisible(true);
    }

    private void SportsVenueMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AddSportsVenue().setVisible(true);
    }

    private void PartyVenueMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new AddPartyVenue().setVisible(true);
    }

    private void PEditMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new EditPromoter().setVisible(true);
    }

    private void EditMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new EditVenue().setVisible(true);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new EditPartyVenue().setVisible(true);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new EditSportsVenue().setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new EditTrainingVenue().setVisible(true);
    }

    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ArrayList<Promoter> p;
        p = new ArrayList<Promoter>();
        try {
            FileOutputStream fos = new FileOutputStream("PromoterData.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p); // write MenuArray to ObjectOutputStream
            oos.close();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaulted="collapsed" desc=" Look and feel setting code (optional) ">
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // End of variables declaration
}