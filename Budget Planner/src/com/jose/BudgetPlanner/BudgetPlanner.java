package com.jose.BudgetPlanner;

/**
 *
 * @author Ampatuan | Occeña | Henarios
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.jose.Bills.BillsMethod;
import com.jose.foods.FoodMethod;
import com.jose.misc.MiscMethod;
import com.jose.utils.UtilsMethod;
import com.jose.budget.BudgetMethod;
import javax.swing.JFrame;

public class BudgetPlanner extends javax.swing.JFrame {
    
    public static JFrame frame;
    public static double mnthlyExpnses=0,mnthlySvngs=0,mnthlyBdget=0;
    public static double billExpnses=0,billLimit=0;
    public static double foodExpnses=0,foodLimit=0;
    public static double utilExpnses=0,utilLimit=0;
    public static double miscExpnses=0,miscLimit=0;

    public static String Username;
    public static double mnthlybudgetIn=0;
    
     
    public BudgetPlanner(){
        initComponents();
        
        ImageIcon img = new ImageIcon("icon.png");
        setIconImage(img.getImage());
        
         try {
             new BillsMethod().addRowBills(jTable1);
             new FoodMethod().addRowFoods(jTable5);
             new UtilsMethod().addRowUtils(jTable6);
             new MiscMethod().addRowMisc(jTable7);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(BudgetPlanner.class.getName()).log(Level.SEVERE, null, ex);
         }
       
        new LoadData().loadData();
    }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBill = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelUsrNme = new javax.swing.JLabel();
        jLabelMnthBdgt = new javax.swing.JLabel();
        jTextFieldUsrNme = new javax.swing.JTextField();
        jTextFieldMnthlyBdget = new javax.swing.JTextField();
        jLabelMnthlyExpnses = new javax.swing.JLabel();
        jLabelSvngs = new javax.swing.JLabel();
        jTextFieldMnthlyExpnses = new javax.swing.JTextField();
        jTextFieldSvngs = new javax.swing.JTextField();
        jTabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonExpenses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBillsOptions = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonBillsGraph = new javax.swing.JButton();
        jTextFieldBillsAllocation = new javax.swing.JTextField();
        jTextFieldAllocationLeft = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldBillsExpnses = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jButtonExpensesFoods = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonFoodsOptions = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonFoodsGraph = new javax.swing.JButton();
        jTextFieldFoodAllocation = new javax.swing.JTextField();
        jTextFieldFoodAllocationLeft = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFoodsExpnses = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jSeparator9 = new javax.swing.JSeparator();
        jButtonExpensesUtils = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonUtilsOptions = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButtonUtilsGraph = new javax.swing.JButton();
        jTextFieldUtilAllocation = new javax.swing.JTextField();
        jTextFieldUtilsAllocationLeft = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldUtilsExpnses = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jSeparator10 = new javax.swing.JSeparator();
        jButtonMiscExpnses = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonMiscOptions = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButtonMiscGraph = new javax.swing.JButton();
        jTextFieldMiscAllocation = new javax.swing.JTextField();
        jTextFieldMiscAllocationLeft = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMiscExpnses = new javax.swing.JTextField();
        BudgetGraph = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrfrnce = new javax.swing.JMenu();
        jMenuPrfrnce1 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Planner™");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("budgetPlanner"); // NOI18N
        setResizable(false);

        jLabelUsrNme.setText("Username:");

        jLabelMnthBdgt.setText("Monthly Budget:");

        jTextFieldUsrNme.setEditable(false);

        jTextFieldMnthlyBdget.setEditable(false);

        jLabelMnthlyExpnses.setText("Monthly Expenses: ");

        jLabelSvngs.setText("Monthly Savings:");

        jTextFieldMnthlyExpnses.setEditable(false);

        jTextFieldSvngs.setEditable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Quantity", "Cost", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jButtonExpenses.setText("Add Expenses");
        jButtonExpenses.setToolTipText("");
        jButtonExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpensesActionPerformed(evt);
            }
        });

        jLabel1.setText("Bills Allocation:");

        jButtonBillsOptions.setText("Options");
        jButtonBillsOptions.setToolTipText("");
        jButtonBillsOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillsOptionsActionPerformed(evt);
            }
        });

        jLabel2.setText("Allocation Left:");

        jButtonBillsGraph.setText("Bills Graph");
        jButtonBillsGraph.setToolTipText("");
        jButtonBillsGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillsGraphActionPerformed(evt);
            }
        });

        jTextFieldBillsAllocation.setEditable(false);

        jTextFieldAllocationLeft.setEditable(false);

        jLabel3.setText("Bills Expenses:");

        jTextFieldBillsExpnses.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonBillsOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 10, Short.MAX_VALUE))
                                    .addComponent(jTextFieldAllocationLeft)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBillsExpnses)
                                    .addComponent(jTextFieldBillsAllocation))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBillsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExpenses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldBillsAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldBillsExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAllocationLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBillsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBillsOptions)
                .addGap(35, 35, 35))
        );

        jTabbed.addTab("Bills", jPanel1);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Quantity", "Cost", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(jTable5);

        jButtonExpensesFoods.setText("Add Expenses");
        jButtonExpensesFoods.setToolTipText("");
        jButtonExpensesFoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpensesFoodsActionPerformed(evt);
            }
        });

        jLabel4.setText("Foods Allocation:");

        jButtonFoodsOptions.setText("Options");
        jButtonFoodsOptions.setToolTipText("");
        jButtonFoodsOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodsOptionsActionPerformed(evt);
            }
        });

        jLabel5.setText("Allocation Left:");

        jButtonFoodsGraph.setText("Foods Graph");
        jButtonFoodsGraph.setToolTipText("");
        jButtonFoodsGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodsGraphActionPerformed(evt);
            }
        });

        jTextFieldFoodAllocation.setEditable(false);

        jTextFieldFoodAllocationLeft.setEditable(false);

        jLabel6.setText("Foods Expenses:");

        jTextFieldFoodsExpnses.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFoodsExpnses)
                                    .addComponent(jTextFieldFoodAllocation)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonFoodsOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldFoodAllocationLeft))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFoodsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExpensesFoods, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator8)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFoodAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldFoodsExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExpensesFoods, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldFoodAllocationLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFoodsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFoodsOptions)
                .addGap(35, 35, 35))
        );

        jTabbed.addTab("Foods", jPanel5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Quantity", "Cost", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(jTable6);

        jButtonExpensesUtils.setText("Add Expenses");
        jButtonExpensesUtils.setToolTipText("");
        jButtonExpensesUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpensesUtilsActionPerformed(evt);
            }
        });

        jLabel7.setText("Utils Allocation:");

        jButtonUtilsOptions.setText("Options");
        jButtonUtilsOptions.setToolTipText("");
        jButtonUtilsOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUtilsOptionsActionPerformed(evt);
            }
        });

        jLabel8.setText("Allocation Left:");

        jButtonUtilsGraph.setText("Utils Graph");
        jButtonUtilsGraph.setToolTipText("");
        jButtonUtilsGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUtilsGraphActionPerformed(evt);
            }
        });

        jTextFieldUtilAllocation.setEditable(false);

        jTextFieldUtilsAllocationLeft.setEditable(false);

        jLabel9.setText("Utils Expenses:");

        jTextFieldUtilsExpnses.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUtilsExpnses, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUtilAllocation)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonUtilsOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldUtilsAllocationLeft))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUtilsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExpensesUtils, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator9)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldUtilAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldUtilsExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExpensesUtils, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldUtilsAllocationLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUtilsGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUtilsOptions)
                .addGap(35, 35, 35))
        );

        jTabbed.addTab("Utilities", jPanel6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Quantity", "Cost", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(jTable7);

        jButtonMiscExpnses.setText("Add Expenses");
        jButtonMiscExpnses.setToolTipText("");
        jButtonMiscExpnses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMiscExpnsesActionPerformed(evt);
            }
        });

        jLabel10.setText("Utils Allocation:");

        jButtonMiscOptions.setText("Options");
        jButtonMiscOptions.setToolTipText("");
        jButtonMiscOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMiscOptionsActionPerformed(evt);
            }
        });

        jLabel11.setText("Allocation Left:");

        jButtonMiscGraph.setText("Misc Graph");
        jButtonMiscGraph.setToolTipText("");
        jButtonMiscGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMiscGraphActionPerformed(evt);
            }
        });

        jTextFieldMiscAllocation.setEditable(false);

        jTextFieldMiscAllocationLeft.setEditable(false);

        jLabel12.setText("Utils Expenses:");

        jTextFieldMiscExpnses.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMiscExpnses, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMiscAllocation)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonMiscOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldMiscAllocationLeft))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMiscGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMiscExpnses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator10)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldMiscAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldMiscExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMiscExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldMiscAllocationLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMiscGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMiscOptions)
                .addGap(35, 35, 35))
        );

        jTabbed.addTab("Misc.", jPanel7);

        BudgetGraph.setText("Budget Graph");
        BudgetGraph.setMaximumSize(new java.awt.Dimension(85, 23));
        BudgetGraph.setMinimumSize(new java.awt.Dimension(85, 23));
        BudgetGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBillLayout = new javax.swing.GroupLayout(jpBill);
        jpBill.setLayout(jpBillLayout);
        jpBillLayout.setHorizontalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMnthBdgt)
                            .addComponent(jLabelUsrNme))
                        .addGap(18, 18, 18)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMnthlyBdget, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsrNme))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBillLayout.createSequentialGroup()
                        .addComponent(jTabbed)
                        .addContainerGap())
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSvngs)
                            .addComponent(jLabelMnthlyExpnses))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSvngs, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jTextFieldMnthlyExpnses))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BudgetGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jpBillLayout.setVerticalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsrNme)
                    .addComponent(jTextFieldUsrNme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMnthBdgt)
                    .addComponent(jTextFieldMnthlyBdget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMnthlyExpnses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMnthlyExpnses))
                        .addGap(18, 18, 18)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSvngs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSvngs))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BudgetGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        jTextFieldUsrNme.getAccessibleContext().setAccessibleDescription("");

        jMenuPrfrnce.setText("File");

        jMenuPrfrnce1.setText("Preference");
        jMenuPrfrnce1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPrfrnce1MouseClicked(evt);
            }
        });
        jMenuPrfrnce.add(jMenuPrfrnce1);

        jMenuBar1.add(jMenuPrfrnce);

        jMenu1.setText("About");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpensesActionPerformed
        new BillsMethod().AddNewBill();
    }//GEN-LAST:event_jButtonExpensesActionPerformed

    private void jMenuPrfrnce1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPrfrnce1MouseClicked
        new Preference().SetPreference();
    }//GEN-LAST:event_jMenuPrfrnce1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new About().GetAbout();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButtonBillsOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillsOptionsActionPerformed
        new BillsMethod().SetBillsSavings();
    }//GEN-LAST:event_jButtonBillsOptionsActionPerformed

    private void jButtonExpensesFoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpensesFoodsActionPerformed
        new FoodMethod().AddNewFood();
    }//GEN-LAST:event_jButtonExpensesFoodsActionPerformed

    private void jButtonFoodsOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodsOptionsActionPerformed
        new FoodMethod().SetFoodSavings();
    }//GEN-LAST:event_jButtonFoodsOptionsActionPerformed

    private void jButtonExpensesUtilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpensesUtilsActionPerformed
        new UtilsMethod().AddNewUtil();
    }//GEN-LAST:event_jButtonExpensesUtilsActionPerformed

    private void jButtonUtilsOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUtilsOptionsActionPerformed
        new UtilsMethod().SetUtilsSavings();
    }//GEN-LAST:event_jButtonUtilsOptionsActionPerformed

    private void jButtonMiscExpnsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiscExpnsesActionPerformed
        new MiscMethod().AddNewMisc();
    }//GEN-LAST:event_jButtonMiscExpnsesActionPerformed

    private void jButtonMiscOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiscOptionsActionPerformed
        new MiscMethod().SetMiscSavings();
    }//GEN-LAST:event_jButtonMiscOptionsActionPerformed

    private void jButtonBillsGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillsGraphActionPerformed
        new BillsMethod().GetBillsGraph(mnthlybudgetIn, billExpnses, billLimit);
    }//GEN-LAST:event_jButtonBillsGraphActionPerformed

    private void jButtonFoodsGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodsGraphActionPerformed
        new FoodMethod().getFoodGraph(mnthlybudgetIn, foodExpnses, foodLimit);
    }//GEN-LAST:event_jButtonFoodsGraphActionPerformed

    private void jButtonUtilsGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUtilsGraphActionPerformed
        new UtilsMethod().GetUtilsChart(mnthlybudgetIn, utilExpnses, utilLimit);
    }//GEN-LAST:event_jButtonUtilsGraphActionPerformed

    private void jButtonMiscGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiscGraphActionPerformed
        new MiscMethod().GetMiscGraph(mnthlybudgetIn, miscExpnses, miscLimit);
    }//GEN-LAST:event_jButtonMiscGraphActionPerformed

    private void BudgetGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BudgetGraphActionPerformed
        new BudgetMethod().GetBudgetGraph(billLimit, foodLimit, utilLimit, miscLimit, mnthlybudgetIn);
    }//GEN-LAST:event_BudgetGraphActionPerformed

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new BudgetPlanner().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BudgetGraph;
    private javax.swing.JButton jButtonBillsGraph;
    private javax.swing.JButton jButtonBillsOptions;
    private javax.swing.JButton jButtonExpenses;
    private javax.swing.JButton jButtonExpensesFoods;
    private javax.swing.JButton jButtonExpensesUtils;
    private javax.swing.JButton jButtonFoodsGraph;
    private javax.swing.JButton jButtonFoodsOptions;
    private javax.swing.JButton jButtonMiscExpnses;
    private javax.swing.JButton jButtonMiscGraph;
    private javax.swing.JButton jButtonMiscOptions;
    private javax.swing.JButton jButtonUtilsGraph;
    private javax.swing.JButton jButtonUtilsOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMnthBdgt;
    private javax.swing.JLabel jLabelMnthlyExpnses;
    private javax.swing.JLabel jLabelSvngs;
    private static javax.swing.JLabel jLabelUsrNme;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuPrfrnce;
    private javax.swing.JMenu jMenuPrfrnce1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbed;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable5;
    public static javax.swing.JTable jTable6;
    public static javax.swing.JTable jTable7;
    public static javax.swing.JTextField jTextFieldAllocationLeft;
    public static javax.swing.JTextField jTextFieldBillsAllocation;
    public static javax.swing.JTextField jTextFieldBillsExpnses;
    public static javax.swing.JTextField jTextFieldFoodAllocation;
    public static javax.swing.JTextField jTextFieldFoodAllocationLeft;
    public static javax.swing.JTextField jTextFieldFoodsExpnses;
    public static javax.swing.JTextField jTextFieldMiscAllocation;
    public static javax.swing.JTextField jTextFieldMiscAllocationLeft;
    public static javax.swing.JTextField jTextFieldMiscExpnses;
    public static javax.swing.JTextField jTextFieldMnthlyBdget;
    public static javax.swing.JTextField jTextFieldMnthlyExpnses;
    public static javax.swing.JTextField jTextFieldSvngs;
    public static javax.swing.JTextField jTextFieldUsrNme;
    public static javax.swing.JTextField jTextFieldUtilAllocation;
    public static javax.swing.JTextField jTextFieldUtilsAllocationLeft;
    public static javax.swing.JTextField jTextFieldUtilsExpnses;
    public javax.swing.JPanel jpBill;
    // End of variables declaration//GEN-END:variables
   
}
