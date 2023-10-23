
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 91939
 */
public class NewJFrame extends javax.swing.JFrame {
     double average;
    int[] gradeRanges = {90, 80, 70, 60,50,40};
        String[] gradeLetters = {"O","S", "A", "B", "C", "D","F"};
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        assignment1TF = new javax.swing.JTextField();
        assignment2TF = new javax.swing.JTextField();
        quizTF = new javax.swing.JTextField();
        midtermTF1 = new javax.swing.JTextField();
        a1letterTF = new javax.swing.JTextField();
        midterm2TF = new javax.swing.JTextField();
        mt1letterTF = new javax.swing.JTextField();
        qletterTF = new javax.swing.JTextField();
        a2letterTF = new javax.swing.JTextField();
        mt2letterTF = new javax.swing.JTextField();
        avgTF = new javax.swing.JTextField();
        gpaTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        finalexamTF = new javax.swing.JTextField();
        fletterTF = new javax.swing.JTextField();
        fgTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Grade Calculator");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Assignment 1:");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Assignment 2:");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setText("Quiz :");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("Mid Term 1:");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setText("Mid Term 2:");

        a1letterTF.setEditable(false);

        mt1letterTF.setEditable(false);

        qletterTF.setEditable(false);

        a2letterTF.setEditable(false);

        mt2letterTF.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Average");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("FinalGrade");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Grade");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setText("Final Exam :");

        fletterTF.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("GPA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(midtermTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mt1letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(assignment2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(assignment1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(quizTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qletterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(midterm2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finalexamTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fletterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(mt2letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avgTF))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(jLabel11))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jLabel8))
                            .addGap(101, 101, 101)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assignment2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(assignment1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(a1letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(quizTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qletterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mt1letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midtermTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(midterm2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mt2letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fletterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalexamTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(406, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String assignment1score,assignment2score,quizscore,midterm1score,midterm2score,finalexamscore;
       
        double gpa=0;
         
        
        assignment1score=assignment1TF.getText();
        assignment2score=assignment2TF.getText();
        quizscore=quizTF.getText();
        midterm1score=midtermTF1.getText();
        midterm2score=midterm2TF.getText();
        finalexamscore=finalexamTF.getText();
        
        double assignment1=Double.parseDouble(assignment1score);
        double assignment2=Double.parseDouble(assignment2score);
        double quiz=Double.parseDouble(quizscore);
        double midterm1=Double.parseDouble(midterm1score);
        double midterm2=Double.parseDouble(midterm2score);
        double finalexam=Double.parseDouble(finalexamscore);
        
        average=((assignment1+assignment2+quiz+midterm1+midterm2+finalexam)/6);
        if(assignment1>=90){
            a1letterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(assignment1>=80 && assignment1<90){
            a1letterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(assignment1>=70 && assignment1<80){
            a1letterTF.setText("A");
            gpa=gpa+8.0;
        }
         else if(assignment1>=60 && assignment1<70){
            a1letterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(assignment1>=50 && assignment1<60){
            a1letterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(assignment1>=40 && assignment1<50){
            a1letterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
             a1letterTF.setText("F");
             gpa=gpa+0;
         }
        
        
        
         if(assignment2>=90){
            a2letterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(assignment2>=80 && assignment2<90){
            a2letterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(assignment2>=70 && assignment2<80){
            a2letterTF.setText("A");
            gpa=gpa+8.0;
        }
         else if(assignment2>=60 && assignment2<70){
            a2letterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(assignment2>=50 && assignment2<60){
            a2letterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(assignment2>=40 && assignment2<50){
            a2letterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
             a2letterTF.setText("F");
             gpa=gpa+0;
         }
        
         
        if(quiz>=90){
            qletterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(quiz>=80 && quiz<90){
           qletterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(quiz>=70 && quiz<80){
            qletterTF.setText("A");
            gpa=gpa+8.0;
        }
         else if(quiz>=60 && quiz<70){
            qletterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(quiz>=50 && quiz<60){
            qletterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(quiz>=40 && quiz<50){
            qletterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
             qletterTF.setText("F");
             gpa=gpa+0;
         }
         
        
         if(midterm1>=90){
            mt1letterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(midterm1>=80 && midterm1<90){
          mt1letterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(midterm1>=70 && midterm1<80){
            mt1letterTF .setText("A");
            gpa=gpa+8.0;
        }
         else if(midterm1>=60 && midterm1<70){
            mt1letterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(midterm1>=50 && midterm1<60){
            mt1letterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(midterm1>=40 && midterm1<50){
             mt1letterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
              mt1letterTF.setText("F");
             gpa=gpa+0;
         }
         
        
         
          if(midterm2>=90){
            mt2letterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(midterm2>=80 && midterm2<90){
          mt2letterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(midterm2>=70 && midterm2<80){
            mt2letterTF.setText("A");
            gpa=gpa+8.0;
        }
         else if(midterm2>=60 && midterm2<70){
           mt2letterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(midterm2>=50 && midterm2<60){
           mt2letterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(midterm2>=40 && midterm2<50){
            mt2letterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
             mt2letterTF.setText("F");
             gpa=gpa+0;
         }
          
          
          if(finalexam>=90){
            fletterTF.setText("O");
            gpa=gpa+10.0;
        }
        else if(finalexam>=80 && finalexam<90){
           fletterTF.setText("S");
            gpa=gpa+9.0;
        }
         else if(finalexam>=70 && finalexam<80){
            fletterTF.setText("A");
            gpa=gpa+8.0;
        }
         else if(finalexam>=60 && finalexam<70){
            fletterTF.setText("B");
            gpa=gpa+7.0;
        }
         else if(finalexam>=50 && finalexam<60){
            fletterTF.setText("C");
            gpa=gpa+6.0;
        }
         else if(finalexam>=40 && finalexam<50){
            fletterTF.setText("D");
            gpa=gpa+5.0;
        }
         else{
             fletterTF.setText("F");
             gpa=gpa+0;
         }
         
         
       
        
        gpa=gpa/6;
        
        if(midterm1>=40 && midterm2>=40 && assignment1>=40 && assignment2>=40 && quiz>=40 && finalexam>=40){
        gpaTF.setText(Double.toString(gpa));
        }
        else{
            gpaTF.setText("-");
        }
        
        if(midterm1>=40 && midterm2>=40 && assignment1>=40 && assignment2>=40 && quiz>=40 && finalexam>=40){
        avgTF.setText(Double.toString(average));
        }
        else{
            avgTF.setText("-");
        }
            
          String finalLetterGrade = calculateLetterGrade(average, gradeRanges, gradeLetters);
          
          if(midterm1>=40 && midterm2>=40 && assignment1>=40 && assignment2>=40 && quiz>=40 && finalexam>=40){
          fgTF.setText(finalLetterGrade);
          }
           else{
            fgTF.setText("-");
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed

     private static String calculateLetterGrade(double average, int[] gradeRanges, String[] gradeLetters) {
        for (int i = 0; i < gradeRanges.length; i++) {
            if (average >= gradeRanges[i]) {
                return gradeLetters[i];
            }
        }
        return "F"; // If the average is below 60, return "F".
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);


         
        // Define the grading scale
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1letterTF;
    private javax.swing.JTextField a2letterTF;
    private javax.swing.JTextField assignment1TF;
    private javax.swing.JTextField assignment2TF;
    private javax.swing.JTextField avgTF;
    private javax.swing.JTextField fgTF;
    private javax.swing.JTextField finalexamTF;
    private javax.swing.JTextField fletterTF;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField midterm2TF;
    private javax.swing.JTextField midtermTF1;
    private javax.swing.JTextField mt1letterTF;
    private javax.swing.JTextField mt2letterTF;
    private javax.swing.JTextField qletterTF;
    private javax.swing.JTextField quizTF;
    // End of variables declaration//GEN-END:variables
}
