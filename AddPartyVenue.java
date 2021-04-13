/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class AddPartyVenue extends javax.swing.JFrame {
    ArrayList<PartyVenue> partyVenue;

    /**
     * Creates new form AddPartyVenue
     */
    /**
     * Creates new form AddSportsVenue
     */



    /**
     * Creates new form AddTrainingVenue
     */
    public AddPartyVenue() {
        initComponents();
        partyVenue = new ArrayList<PartyVenue>();
        poplulateArryList();
    }
    public void poplulateArryList(){
        try{
            FileInputStream file = new FileInputStream("PartyVenue.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;

            while (!endOfFile){
                try{
                    partyVenue.add((PartyVenue) inputFile.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;

                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null,f.getMessage());

                }
            }
            inputFile.close();


        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }
    public void saveVenueToFile(){
        try{
            FileOutputStream file = new FileOutputStream("PartyVenue.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            for(int i=0; i<partyVenue.size(); i++){
                outputFile.writeObject(partyVenue.get(i));

            }
            outputFile.close();
            JOptionPane.showMessageDialog(null,"File Successfully Save");
            this.dispose();

        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        VenueNameLabel = new javax.swing.JLabel();
        VenueSizeLabel = new javax.swing.JLabel();
        StageAreaLabel = new javax.swing.JLabel();
        BarAreaLabel = new javax.swing.JLabel();
        FoodAreaLabel = new javax.swing.JLabel();
        NumSecurityLabel = new javax.swing.JLabel();
        BasePriceLabel = new javax.swing.JLabel();
        LevelLabel = new javax.swing.JLabel();
        VenueNameEntry = new javax.swing.JTextField();
        VenueSizeEntry = new javax.swing.JTextField();
        VenueStageAreaEntry = new javax.swing.JTextField();
        BarAreaEntry = new javax.swing.JTextField();
        VenueFoodAreaEntry = new javax.swing.JTextField();
        NumSecurityEntry = new javax.swing.JTextField();
        BasePriceEntry = new javax.swing.JTextField();
        LevelEntry = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Party Venue Information ");

        VenueNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VenueNameLabel.setText("Venue Name");

        VenueSizeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VenueSizeLabel.setText("Venue Size ");

        StageAreaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StageAreaLabel.setText("Size of Stage Area");

        BarAreaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BarAreaLabel.setText("Size of Bar Area");

        FoodAreaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FoodAreaLabel.setText("Size of Food Area");

        NumSecurityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NumSecurityLabel.setText("Number of Security");

        BasePriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BasePriceLabel.setText("Base Price");

        LevelLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LevelLabel.setText("Level");

        VenueNameEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenueNameEntryActionPerformed(evt);
            }
        });

        BarAreaEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarAreaEntryActionPerformed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/save.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/exit.png"))); // NOI18N
        ExitButton.setText("Close");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(VenueSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(StageAreaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(BarAreaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(FoodAreaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(NumSecurityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(BasePriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(LevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(VenueNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(VenueNameEntry)
                                                                        .addComponent(VenueSizeEntry)
                                                                        .addComponent(VenueStageAreaEntry)
                                                                        .addComponent(BarAreaEntry)
                                                                        .addComponent(VenueFoodAreaEntry)
                                                                        .addComponent(NumSecurityEntry)
                                                                        .addComponent(BasePriceEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                                                        .addComponent(LevelEntry)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(107, 107, 107)
                                                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(115, 115, 115)
                                                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(22, 22, 22)))
                                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(VenueNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VenueNameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(VenueSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VenueSizeEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StageAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VenueStageAreaEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BarAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BarAreaEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FoodAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VenueFoodAreaEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NumSecurityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NumSecurityEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BasePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BasePriceEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LevelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>

    private void VenueNameEntryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(VenueNameEntry.getText().isEmpty() ||
                VenueSizeEntry.getText().isEmpty() ||
                VenueStageAreaEntry.getText().isEmpty() ||
                BarAreaEntry.getText().isEmpty() ||
                BasePriceEntry.getText().isEmpty() ||
                VenueFoodAreaEntry.getText().isEmpty()||
                NumSecurityEntry.getText().isEmpty()||
                LevelEntry.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please Enter All Fields");
        }
        else{
            String VenueName = VenueNameEntry.getText().trim();
            String VenueSize = VenueSizeEntry.getText().trim();
            String VenuePrice = BasePriceEntry.getText().trim();
            String VennueLevel = LevelEntry.getText().trim();
            String BarArea = BarAreaEntry.getText().trim();
            String VenueFoodArea = VenueFoodAreaEntry.getText().trim();
            String VenueStageArea = VenueStageAreaEntry.getText().trim();
            String NumSecurity = NumSecurityEntry.getText().trim();




            PartyVenue NewVenue = new PartyVenue(VenueName,
                    Double.parseDouble(BarArea),
                    Double.parseDouble(VenueFoodArea),Double.parseDouble(VenueStageArea),Integer.parseInt(NumSecurity),Double.parseDouble(VenuePrice),
                    Integer.parseInt(VennueLevel));

            partyVenue.add(NewVenue);

            saveVenueToFile();
        }

    }

    private void BarAreaEntryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(AddPartyVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPartyVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPartyVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPartyVenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPartyVenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField BarAreaEntry;
    private javax.swing.JLabel BarAreaLabel;
    private javax.swing.JTextField BasePriceEntry;
    private javax.swing.JLabel BasePriceLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel FoodAreaLabel;
    private javax.swing.JTextField LevelEntry;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JTextField NumSecurityEntry;
    private javax.swing.JLabel NumSecurityLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel StageAreaLabel;
    private javax.swing.JTextField VenueFoodAreaEntry;
    private javax.swing.JTextField VenueNameEntry;
    private javax.swing.JLabel VenueNameLabel;
    private javax.swing.JTextField VenueSizeEntry;
    private javax.swing.JLabel VenueSizeLabel;
    private javax.swing.JTextField VenueStageAreaEntry;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}