/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinalproject;

import java.util.Scanner;

/**
 *
 * 
 */
public class ReductionForm extends javax.swing.JFrame {

    /**
     * Creates new form ReductionForm
     */
    public ReductionForm() {
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    String x="";
public String Reduction3by3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33, double A1,double A2, double A3){
        Scanner input=new Scanner(System.in);

if(a11*a11<a21*a21 && a21*a21<a31*a31){
    double temp11=a11;
    a11=a31;
    a31=temp11;
     double temp12=a12;
    a12=a32;
    a32=temp12;
    double temp13=a13;
    a13=a33;
    a33=temp13;

    double temp1=A1;
    A1=A3;
    A3=temp1;
    x=("Here R1 is exchanged by R3")+"\n"+
      (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");
    
    }
    else if(a11*a11<a31*a31 && a31*a31<a21*a21){ //Exchanging Rows
        double temp11=a11;
    a11=a21;
    a21=temp11;
     double temp12=a12;
    a12=a22;
    a22=temp12;
    double temp13=a13;
    a13=a23;
    a23=temp13;
    
    double temp1=A1;
    A1=A2;
    A2=temp1;
    x=x+("Here R1 is exchanged by R2")+"\n"+
      (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");
    }
     
     
     if(a11==0 && a21==0 && a31==0){
         double aa_23,aa_33,A_2,A_3,AA_3;
         aa_23=a23-(a22/a12)*a13;
         aa_33=a33-(a32/a12)*a13;
         A_2=A2-(a22/a12)*A1;
         A_3=A3-(a32/a12)*A1;
         AA_3=A_3-(aa_33/aa_23)*A_2;
         x=x+("\nNew Form ")+"\n"+
         ("Mulitplying "+a22+"/"+a12+" by R1 and subtracting from R2")+"\n"+
                 (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3)+"\n"+
                 ("\nNew Form ")+"\n"+
                 ("Mulitplying "+a32+"/"+a12+" by R1 and subtracting from R3")+"\n"+
                 (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+aa_33
     +" | "+A_3)+"\n"+
                 ("\nHELLO Form ")+"\n"+("Mulitplying "+aa_33+"/"+aa_23+" by R2 and subtracting from R3 ")+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+0
     +" | "+AA_3+"\n");
        if(aa_23!=0){
        
           double var_3=A_2/aa_23;
           double var_2=(A1/a12)-a13*(A_2/aa_23);
           
           x=x+("\nvalue of Var3= "+var_3)+"\n"+("Value of Var2= "+var_2);
       }
       else if(aa_23==0){
       double var_2const=(A1/a12);
        double var_2 =-a13/a12;
        double var_3const=(A1/a13);
        double var_3=-a12/a13;
       
        x=x+("\nthere exists an infinite solution")+"\n"+
                ("\nVariable 2 in terms of var3 is \n var2= "+var_2const+" + ("+var_2+" var3)\n          OR ")+"\n"+
         ("\nVariable 3 in terms of var2 is \n var3= "+var_3const+" + "+var_3+" var2)");
       }
       else if(aa_23==0 && A_2!=0){
       
           x=x+("No Solution Exists");
       }
     }
         else
     
    
     { 
           double a_21=a21;
         if(a21!=0){
     double x1=(-1*a11)/a21;
     a21=(a21*x1)+a11;
     a22=(a22*x1)+a12;
     a23=(a23*x1)+a13;
     A2 =(A2*x1)+A1;
      x=x+("\nNew form:")+"\n"+
              ("Mulitplying R2 by "+-a11+"/"+a_21+" and adding in R1")+"\n"+
              (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");
     }
         
    
     if(a31!=0){
     double x2=(-1*a11)/a31;
     a31=(a31*x2)+a11;
     a32=(a32*x2)+a12;
     a33=(a33*x2)+a13;
     A3=(A3*x2)+A1;
     
     x=x+("\nNew form:")+"\n"+
             ("Mulitplying R2 by "+-a11+"/"+a_21+" and adding in R1")+"\n"+
             (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");}
     else if(a31==0 && a21==0){
     
         x=x+("No Row Operation required to make a21 and a31 entries zero as they are already zero "
                 + "\n---------------------------------------------");
     
     }
         double a_32=a32;
     
     
     if(a32!=0){
         
     double x3=(-1*a22)/a32;
     a32=(a32*x3)+a22;
     a33=(a33*x3)+a23;
     A3=(A3*x3)+A2;
             
     
     x=x+("\nNew form:")+"\n"+
             ("Mulitplying R3 by "+a22+"/"+a_32+" and adding in R2")+"\n"+
             (a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");}
     else if(a32==0){x=x+("No row operation required to make a32 entry zero  as it is already zero"
             + "\n----------------------------------------------------");}
     if(a33!=0 ){
     double var3=A3/a33;
     double var2=(A2-(a23*var3))/a22;
     double var1=(A1-(a13*var3)-(a12*var2))/a11;
     x=x+"\n"+("\nValues of varibles:variable 1=  "+var1)+"\n"+
             ("Values of varibles:variable 2=  "+var2)+"\n\n"+
             ("Values of varibles:variable 3="+var3);
     } 
     
     else if(a33==0 && A3!=0){
          x=x+("NO Solution Exists");
         }
     else if(a33==0 && A3==0){
     
         x=x+("Infinite solutions exist");
         if(a22!=0){
     
         double var3=(-a23/a22);
         double AAA2=A2/a22;
         x=x+("\nVarible 2 in terms of var3 is var2 =: "+AAA2+"+ 122("+var3+")var3");
         double var2=((a12*a23/a22*a11)-(a13/a11));
         double var2const=((A1/a11)-(a12*A2/a22*a11));
         x=x+("\nVarible 1 in terms of var3 is var1 =: "+var2+"var3 + ("+var2const+")");
     }
        
}}
    return x;}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" " +Execution.getm());
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        x=Reduction3by3(Execution.a11,Execution.a12,Execution.a13,Execution.a21,Execution.a22,Execution.a23,Execution.a31,Execution.a32,Execution.a33,Execution.A1,Execution.A2,Execution.A3);
        jTextArea2.setText(" "+x);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReductionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReductionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReductionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReductionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReductionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
