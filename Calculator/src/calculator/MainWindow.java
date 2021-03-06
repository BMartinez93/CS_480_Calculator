package calculator;

import java.util.*;

/**
 * ConvertToPostfix.java
 * CS 480 - Vajda 
 * Lab 3 
 * Last Update: 3 November 2016
 * @author Bryan Martinez
 */
public class MainWindow extends javax.swing.JFrame {

    private ArrayList<String> exp = new ArrayList();
    
     //string to output
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        allowOps(false);
    }
    
    private String outputString(ArrayList<String> strList){
        StringBuilder out = new StringBuilder();
        for(String next : strList)
            out.append(next);
        return out.toString();
    }
    
    private static double evaluate(String prefix){
        ArrayList<String> postfix = ConvertToPostfix.convertToPostfix(prefix);
        double result = CalculatePostfix.evaluateExpression(postfix);
        return result;
    }
    
    private void allowOps(boolean bln){
        minusButton.setEnabled(bln);
        plusButton.setEnabled(bln);
        divButton.setEnabled(bln);
        multButton.setEnabled(bln);
        powButton.setEnabled(bln);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        powButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        leftParthButton = new javax.swing.JButton();
        rightParthButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bryan's Best Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        outputLabel.setBackground(new java.awt.Color(255, 255, 255));
        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clearButton.setText("C");
        clearButton.setPreferredSize(new java.awt.Dimension(80, 60));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        deleteButton.setText("DE");
        deleteButton.setPreferredSize(new java.awt.Dimension(80, 60));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        powButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        powButton.setText("^");
        powButton.setPreferredSize(new java.awt.Dimension(80, 60));
        powButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powButtonActionPerformed(evt);
            }
        });

        divButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        divButton.setText("/");
        divButton.setPreferredSize(new java.awt.Dimension(80, 60));
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        multButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        multButton.setText("*");
        multButton.setPreferredSize(new java.awt.Dimension(80, 60));
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        nineButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nineButton.setText("9");
        nineButton.setPreferredSize(new java.awt.Dimension(80, 60));
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        eightButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        eightButton.setText("8");
        eightButton.setPreferredSize(new java.awt.Dimension(80, 60));
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        sevenButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        sevenButton.setText("7");
        sevenButton.setPreferredSize(new java.awt.Dimension(80, 60));
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        fourButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fourButton.setText("4");
        fourButton.setPreferredSize(new java.awt.Dimension(80, 60));
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        fiveButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fiveButton.setText("5");
        fiveButton.setPreferredSize(new java.awt.Dimension(80, 60));
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        sixButton.setText("6");
        sixButton.setPreferredSize(new java.awt.Dimension(80, 60));
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        plusButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        plusButton.setText("+");
        plusButton.setPreferredSize(new java.awt.Dimension(80, 60));
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        minusButton.setText("-");
        minusButton.setPreferredSize(new java.awt.Dimension(80, 60));
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        threeButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        threeButton.setText("3");
        threeButton.setPreferredSize(new java.awt.Dimension(80, 60));
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        twoButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        twoButton.setText("2");
        twoButton.setPreferredSize(new java.awt.Dimension(80, 60));
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        oneButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        oneButton.setText("1");
        oneButton.setPreferredSize(new java.awt.Dimension(80, 60));
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        zeroButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        zeroButton.setText("0");
        zeroButton.setPreferredSize(new java.awt.Dimension(80, 60));
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        leftParthButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        leftParthButton.setText("(");
        leftParthButton.setPreferredSize(new java.awt.Dimension(80, 60));
        leftParthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftParthButtonActionPerformed(evt);
            }
        });

        rightParthButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rightParthButton.setText(")");
        rightParthButton.setPreferredSize(new java.awt.Dimension(80, 60));
        rightParthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightParthButtonActionPerformed(evt);
            }
        });

        equalsButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        equalsButton.setText("=");
        equalsButton.setPreferredSize(new java.awt.Dimension(80, 60));
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(powButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(leftParthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightParthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftParthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightParthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        exp.clear();
        outputLabel.setText(outputString(exp));
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (exp.size() != 0)
            exp.remove(exp.size()-1);
        outputLabel.setText(outputString(exp));
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void powButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powButtonActionPerformed
        exp.add("^");
        outputLabel.setText(outputString(exp));
        allowOps(false);
    }//GEN-LAST:event_powButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        exp.add("/");
        outputLabel.setText(outputString(exp));
        allowOps(false);
    }//GEN-LAST:event_divButtonActionPerformed

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButtonActionPerformed
        exp.add("*");
        outputLabel.setText(outputString(exp));
        allowOps(false);
    }//GEN-LAST:event_multButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        exp.add("9");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_nineButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        exp.add("8");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_eightButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        exp.add("7");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        exp.add("4");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        exp.add("5");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        exp.add("6");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_sixButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        exp.add("+");
        outputLabel.setText(outputString(exp));
        allowOps(false);
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        exp.add("-");
        outputLabel.setText(outputString(exp));
        allowOps(false);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        exp.add("3");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_threeButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        exp.add("2");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_twoButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        exp.add("1");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_oneButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        exp.add("0");
        outputLabel.setText(outputString(exp));
        allowOps(true);
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void leftParthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftParthButtonActionPerformed
        exp.add("(");
        outputLabel.setText(outputString(exp));
    }//GEN-LAST:event_leftParthButtonActionPerformed

    private void rightParthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightParthButtonActionPerformed
        exp.add(")");
        outputLabel.setText(outputString(exp));
    }//GEN-LAST:event_rightParthButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        StringBuilder newExp = new StringBuilder();
        StringBuilder tempNum = new StringBuilder();

        for (int i = 0; i < exp.size(); i++) {
            newExp.append(exp.get(i) + " ");  
        }

        try {
            double result = evaluate(newExp.toString());
            outputLabel.setText(Double.toString(result));
        } catch (EmptyStackException e) {
            outputLabel.setText("Unequal paranthesis");
        }

        //check for division by 0
        if (outputLabel.toString().contains("Infinity")
                || outputLabel.toString().contains("NaN")) {
            outputLabel.setText("Division by 0");
            exp.clear();
        } else {
            //suround result with parenthesis if user wishes to use again
            exp.add(0, "(");
            exp.add(exp.size(), ")");
        }

    }//GEN-LAST:event_equalsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton leftParthButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton powButton;
    private javax.swing.JButton rightParthButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
