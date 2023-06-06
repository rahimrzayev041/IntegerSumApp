// Name: Rahim
// Surname: Rzayev
/* Description: An application has been provided for summing even numbers, odd numbers, or both, displaying the result on a JTextArea.
To use the application, enter numbers in the TextField using the "Add" button.
Clicking the "Sums" button computes the result, shown on the JTextArea.
For removing numbers or making changes, utilize the "Remove Integer" button.
The "List" button displays the added items on the JTextArea.
Additionally, the application allows adding strings separately using the "Add String" button and removing them with the "Remove String" button.Additionally, the application allows adding strings separately using the "Add String" button and removing them with the "Remove String" button.
A print function is also available. 
When entering both big and small numbers, the application prioritizes displaying the smallest number first.
The "Reset" button clears all added items and messages. 
Finally, use the "Exit" button to close the application.
*/


import java.util.*; /*The import statement in Javascript is used to import bindings that have been exported by another module.
The code is considerably easier to control when it is broken down into small, bite-size bits using the Javascript import.
This is why functions should only perform one task at a time, and files should only contain a few or one component at a time.*/
import javax.swing.JFrame;/* This is the javax. swing class. The JFrame class is a form of container that is java-based.
JFrame functions similarly to a main window, allowing users to add components such as labels, buttons, and textfields to construct a graphical user interface.*/
import javax.swing.JOptionPane;/*JOptionPane is a class library that simplifies the process.
It displays a basic dialog box that displays an information message or prompts the user for a simple input. */

/**
 *
 * @author Rahim
 */

public class IntegerSum extends javax.swing.JFrame {
    
    ArrayList <Integer> numbers = new ArrayList(); //creats a ArrayList <Integer> for all of the integer values

    /**
     * Creates new form Main
     */
    public IntegerSum() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        enterIntNumber = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        list = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        sumAll = new javax.swing.JButton();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputSum = new javax.swing.JTextArea();
        inputInteger = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        addstring = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        outputArray1 = new javax.swing.JTextArea();
        inputletter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("jButton2");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sum Elements by Rahim");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 255, 153));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(51, 255, 255));
        title.setText("Sums Elements");

        enterIntNumber.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        enterIntNumber.setForeground(new java.awt.Color(204, 0, 204));
        enterIntNumber.setText("Enter Integer:");

        add.setBackground(new java.awt.Color(0, 0, 204));
        add.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(255, 0, 0));
        remove.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        remove.setText("Remove Integer");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        list.setBackground(new java.awt.Color(102, 255, 102));
        list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        list.setText("List");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(102, 255, 102));
        exit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        sumAll.setBackground(new java.awt.Color(0, 0, 204));
        sumAll.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sumAll.setText("Sum All");
        sumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllActionPerformed(evt);
            }
        });

        sumEven.setBackground(new java.awt.Color(255, 0, 0));
        sumEven.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sumEven.setText("Sum Even");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setBackground(new java.awt.Color(255, 0, 0));
        sumOdd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        sumOdd.setText("Sum Odd");
        sumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddActionPerformed(evt);
            }
        });

        display2.setBackground(new java.awt.Color(204, 204, 255));
        display2.setColumns(20);
        display2.setRows(5);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        display2.setName(""); // NOI18N
        jScrollPane1.setViewportView(display2);

        outputSum.setBackground(new java.awt.Color(153, 255, 204));
        outputSum.setColumns(20);
        outputSum.setRows(5);
        jScrollPane3.setViewportView(outputSum);

        inputInteger.setBackground(new java.awt.Color(153, 255, 204));
        inputInteger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIntegerActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Restart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(255, 0, 0));
        print.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        addstring.setBackground(new java.awt.Color(0, 0, 204));
        addstring.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        addstring.setText("Add String");
        addstring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstringActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton3.setText("Remove String");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        outputArray1.setBackground(new java.awt.Color(204, 204, 255));
        outputArray1.setColumns(20);
        outputArray1.setRows(5);
        outputArray1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        outputArray1.setName(""); // NOI18N
        jScrollPane4.setViewportView(outputArray1);

        inputletter.setBackground(new java.awt.Color(153, 255, 204));
        inputletter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputletterKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Enter String:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputletter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(title)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterIntNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputInteger, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumOdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumEven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addstring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterIntNumber)
                            .addComponent(inputInteger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputletter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addstring)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumEven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumOdd)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(print)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(list)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(remove)
                                .addGap(12, 12, 12)
                                .addComponent(jButton3)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String sTemp; /* A variable is declared using the String method, and this variable is Temp */
        Integer newNum; /* To declare a variable, the integer method is used, and the variable is Num */
        
        try{ //trys to get number data 
            sTemp = inputInteger.getText(); //here The getText() method retrieves Text and saves it to a temporary string.
            newNum = Integer.parseInt(sTemp); //Get the primitive data type of a Temp string with this method.
        }catch (NumberFormatException e){ /*
                                           catch(NumberFormatException e) is written for poping the "Enter Number" message.
                                           This happens when there is exception. "Enter number" will be displayed when there is not number.
                                         */
            inputInteger.setText("Enter Number!!");
            return;/* The return statement instructs the function to return a certain value to the function caller.
When the return statement is used, the function will come to a halt.*/
        }if (newNum <= 0){ //if number is negative or 0 display Enter Positive Number!! and retry the program
            inputInteger.setText("Enter Positive Number!!");// these codes are for showing this writing on the textField
            return; //The return statement is used to return a particular value from the function to the function caller. The function will stop executing when the return statement is called. 
        }
numbers.add(newNum); //adds newNum Integer to numbers ArrayList
        inputInteger.setText(null);// I wrote these codes for deleting numbers from inputInteger for making app easier for user.
      
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String sTemp; /* String method is used to declare a variable and this variable is tTemp */
        Integer newNum; /* Integer method is used to declare a variable and this variable is tNum */
        
        try{ //trys to get number data 
            sTemp = inputInteger.getText(); //here getText() method gets Text and stores in a tTemp string
            newNum = Integer.parseInt(sTemp); //To acquire the primitive data type of a tTemp string, use this function.
        }catch /*
                                           catch(NumberFormatException e) is written for poping the "Enter Number" message.
                                           This happens when there is exception. "Enter number" will be displayed when there is not number.
                                         */ 
                (NumberFormatException e){ 
            inputInteger.setText("Enter Number!!");
            return;/*
                      The return statement is coded to return a specific value from the function to the function caller. 
                      The function will stop executing when the return statement is called. 
                    */
        }if (newNum <= 0){ //if number is negative or 0 display Enter Positive Number!! Only and retry the program
            inputInteger.setText("Enter Positive Number!!"); /*  
                                                              setText() method is used to set "Enter Positive Number!!" text in the inputInteger textFied and press "Remove" button
                                                              It will be displayed when the user enters negative number and 0. 
                                                            */
            return;/*
                      The return statement is coded to return a specific value from the function to the function caller. 
                      The function will stop executing when the return statement is called. 
                    */
        }
        
        numbers.remove(newNum); //removes newNum Integer to numbers ArrayList
          inputInteger.setText(null); //After pressing the "Remove" button, this code is used to delete a number from the inputInteger textField.
         
    }//GEN-LAST:event_removeActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed

        String outputString=""; //creats Strings outputString="" and sNumbers
      
       outputArray1.setText("The ArrayList Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
            Collections.sort(numbers);//sort() is used to sort the elements present in the specified list of Collection in ascending order.
      
        // List for loop. 
        for (int i = 0; i < numbers.size(); i++) {// The for loop control is a repetition control that is written to make operations easier.
           
            outputArray1.append(numbers.get(i) + "\n");/*    
                                                        Appending in Javascript is a way to insert content to the end of already existing elements.
                                                        To append in Javascript, we use the Jquery function append(). With the append() function
                                                      */
        }
      
        
    }//GEN-LAST:event_listActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0); // exits program
    }//GEN-LAST:event_exitActionPerformed

    private void sumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllActionPerformed
        String sTemp, outputString="", sNumbers; // creates the strings sTemp, outputString="" and sNumbers
        Integer iNumbers; /* The integer method is used to declare a variable, which is named iNumbers. */
        Integer sumAll = SumCalculator.sumCalculator(numbers); /* To declare a variable, the integer method is used, and the variable is summAll */
        
        sTemp = Integer.toString(sumAll); // The SumCalculator.sumCalculator( ) method is used to add all the integers together.
        outputSum.setText(sTemp); //sTemp is set using the setText( ) method.
        
        Iterator <Integer> stepper = numbers.iterator(); //creats a iterator 
        for (int i = 0; i < numbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray1.setText("The ArrayList Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString

    }//GEN-LAST:event_sumAllActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        String sTemp, outputString="", sNumbers; //creats temp, outputString="" and sNumbers string
        Integer iNumbers; //creats Integer iNumbers
        Integer sumEven = SumCalculator.sumEvenCalculator(numbers); //gets the sum value for the even numbers in the string
        ArrayList <Integer> evenNumbers = SumCalculator.findEvenCalculator(numbers); //sends numbers arraylist to findEvenCaluclator
        
        sTemp = Integer.toString(sumEven); //sets the temp string to the value of the Integer
        outputSum.setText(sTemp); //sets output text feild to the value of sTemp
        
        Iterator <Integer> stepper = evenNumbers.iterator(); //creats a iterator 
        for (int i = 0; i < evenNumbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
        outputArray1.setText("The Even Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
        
        
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddActionPerformed
        String sTemp, outputString="", sNumbers; //creats temp, outputString="" and sNumbers string
        Integer iNumbers; //creats Integer iNumbers
        Integer sumOdd = SumCalculator.sumOddCalculator(numbers); //gets the sum value for the odd numbers in the string
        ArrayList <Integer> oddNumbers = SumCalculator.findOddCalculator(numbers); //sends numbers arraylist to findOddCaluclator
        
        sTemp = Integer.toString(sumOdd); //sets the temp string to the value of the Integer
        outputSum.setText(sTemp); //sets output text feild to the value of sTemp
        
        Iterator <Integer> stepper = oddNumbers.iterator(); //creats a iterator 
        for (int i = 0; i < oddNumbers.size(); i++){ //creats forloop to find how many numbers are in the arraylist
            iNumbers = (Integer) stepper.next(); //gets a item from arraylist then gets the next item
            sNumbers = Integer.toString(iNumbers); //converts iNumbers Integer to sNumbers String
            
            outputString = outputString + sNumbers +"\n"; //creats output string with sNumbers values and a tab
        } 
     outputArray1.setText("The Odd Values are:" + "\n" + outputString); //outputs The ArrayList Values are:, creats a tab then shows outputString
        
    }//GEN-LAST:event_sumOddActionPerformed

    private void inputIntegerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIntegerActionPerformed
        // This TextField is for writing numbers which you want to add outputArray.
    }//GEN-LAST:event_inputIntegerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        When the user click "Restart" button the data on the text field  will be cleared.
        These codes ware typed for deleting everything on text fields.
        null code is typed for clearing data.
        */
        display2.setText(null); // When user clicked on restart button it will delete all numbers from textField
        inputInteger.setText(null); // When user clicked on restart button it will delete all numbers from textField
        outputSum.setText(null); // When user clicked on restart button it will delete all numbers from textField
        numbers.clear();// these codes are for deleting array list from textField
         outputArray1.setText(null); // When user clicked on restart button it will delete all numbers from textField
         inputletter.setText((null));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        JFrame frame = new JFrame("Print");// these codes are written for creating new JFrame
      
   if (JOptionPane.showConfirmDialog(frame,"Do you want to print numbers?"," IntegerSum",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)//these code is used for showing option pane to user
       
        
           try{ /*
                  try-catch block is used to handle exceptions in the program.
                  If the program is not able to process the exception, 
                  it's thrown back to the JVM which terminates the program and prints the exception stack trace to the output stream
               */
            
             outputArray1.setText(inputInteger.getText() + "\n"); // the purpose of this code is setting the data on the outputArray1 which is entered to inputInteger textField
            
             outputArray1.print();// this code is used for printing
           
        }catch (Exception e){//The finally block is used to provide statements that are executed regardless of whether any exceptions occur.
        }
        
         else
        
        {  if(JOptionPane.showConfirmDialog(frame,"Do you want to print letters?"," IntegerSum",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)//these code is used for showing option pane to user
       
           try {  /*
                    try-catch block is used to handle exceptions in the program.
                    If the program is not able to process the exception, 
                    it's thrown back to the JVM which terminates the program and prints the exception stack trace to the output stream
                 */
             display2.setText(inputletter.getText() + "\n"); //the purpose of this code is setting the data on the display2 which is entered to inputletter textField
            
             display2.print(); outputArray1.print();// this code is used for printing page
           
        }
           catch (Exception e){//The finally block is used to provide statements that are executed regardless of whether any exceptions occur.
        
        }
    }
    }//GEN-LAST:event_printActionPerformed

    private void addstringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstringActionPerformed
   display2.setText( display2.getText() + inputletter.getText() + "\n");// these codes are for getting text from TextField and upload this text to another textfield
        
        inputletter.setText(null);//this code is for deleting numbers from inputInteger. After pressing "Add String" button the date will be deleted for making app easier for user.
    }//GEN-LAST:event_addstringActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(display2.getText().length()>0) // these codes are for getting text from textField
        {
            StringBuilder s=new StringBuilder(display2.getText());// these codes are for getting text from textField
            s.deleteCharAt(display2.getText().length()-1);// these codes are for getting text from textField
            display2.setText(s.toString());// these codes are for setting text on the textFiel}d
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inputletterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputletterKeyPressed
    char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
    
    if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.
        
    inputletter.setEditable(true); // If the parameter is false, then the user can type into the field.
       
    }
      else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.
    
    {
        inputletter.setEditable(false);// If the parameter is false, then the user cannot type into the field.
    
    inputletter.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
    }
    }//GEN-LAST:event_inputletterKeyPressed

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
            java.util.logging.Logger.getLogger(IntegerSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegerSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegerSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegerSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegerSum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addstring;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea display2;
    private javax.swing.JLabel enterIntNumber;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputInteger;
    private javax.swing.JTextField inputletter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton list;
    private javax.swing.JTextArea outputArray1;
    private javax.swing.JTextArea outputSum;
    private javax.swing.JButton print;
    private javax.swing.JButton remove;
    private javax.swing.JButton sumAll;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
