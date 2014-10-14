/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeplus.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import jeplus.EPlusConfig;
import javax.swing.*;
import jeplus.EPlusPostProcessor;
import jeplus.JEPlusConfig;
import jeplus.JEPlusFrameMain;
import jeplus.postproc.PostProcessFunc;
import jeplus.util.RelativeDirUtil;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Yi
 */
public class JPanel_RunReadVars extends javax.swing.JPanel {

    /** Logger */
    final static org.slf4j.Logger logger = LoggerFactory.getLogger(JPanel_RunReadVars.class);

    protected JEPlusFrameMain MainFrame = null;
    protected JFileChooser fc = new JFileChooser("./");
    
    protected String PostResultDir = null;
    protected String PostExportDir = "./";
    //PostProcFunc
    protected int PostProcFunc = 0;
    

    /**
     * Creates new form JPanel_RunReadVars
     * @param hostframe
     */
    public JPanel_RunReadVars(JEPlusFrameMain hostframe) {
        initComponents();
        MainFrame = hostframe;
        initContents();
    }

    /**
     * Extra ReadVars output file name from the rvi file
     * @param rvifile
     * @return
     */
    private String getRVIintermFileName(String rvifile) {
        String fn = EPlusConfig.getEPDefOutCSV();
        try (BufferedReader fr = new BufferedReader (new FileReader (rvifile))) {
            fr.readLine();
            fn = fr.readLine();
        }catch (Exception ex) {
            logger.error("Error reading RVI file " + rvifile, ex);
        }
        return fn;
    }
    
    public void initContents () {
        // PostResultDir = MainFrame.getProject().getExecSettings().getParentDir();
        PostResultDir = MainFrame.getProject().resolveWorkDir();
        this.txtResultDir.setText(PostResultDir);
        txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" + 
                        txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        chkCollectRunTimes = new javax.swing.JCheckBox();
        txtCombinedFile = new javax.swing.JTextField();
        txtIndividualtFilePrefix = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtExportDir = new javax.swing.JTextField();
        cmdSelectExportDir = new javax.swing.JButton();
        chkExportIndividual = new javax.swing.JCheckBox();
        chkExportCombined = new javax.swing.JCheckBox();
        chkExportStats = new javax.swing.JCheckBox();
        txtStatsFilePrefix = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdCollectResults = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        cmdSelectExtraRvi = new javax.swing.JButton();
        cmdEditExtraRvi = new javax.swing.JButton();
        txtExtraRviFile = new javax.swing.JTextField();
        cboReadVarsFrequency = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReadVarsCmdLine = new javax.swing.JTextField();
        chkProjectJobsOnly = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtResultDir = new javax.swing.JTextField();
        cmdSelectResultDir = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        cboProcFunc = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaPostFuncInfo = new javax.swing.JTextArea();

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Output options"));

        chkCollectRunTimes.setText("Collect Simulation times from report (.end) files");

        txtCombinedFile.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtCombinedFile.setText("processed_results");

        txtIndividualtFilePrefix.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtIndividualtFilePrefix.setText("my");
        txtIndividualtFilePrefix.setEnabled(false);

        jLabel43.setText("-[job_id].csv");

        jLabel44.setText("Export directory: ");

        txtExportDir.setText("./");

        cmdSelectExportDir.setText("...");
        cmdSelectExportDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectExportDirActionPerformed(evt);
            }
        });

        chkExportIndividual.setText("Export filtered results of each job to : ");
        chkExportIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExportIndividualActionPerformed(evt);
            }
        });

        chkExportCombined.setSelected(true);
        chkExportCombined.setText("Export all results to one table, with name: ");
        chkExportCombined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExportCombinedActionPerformed(evt);
            }
        });

        chkExportStats.setSelected(true);
        chkExportStats.setText("Export descriptive statistics tables: ");
        chkExportStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExportStatsActionPerformed(evt);
            }
        });

        txtStatsFilePrefix.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtStatsFilePrefix.setText("my");

        jLabel1.setText("-[mean, variance...].csv");

        jLabel3.setText(" .csv");

        cmdCollectResults.setText("Collect Results");
        cmdCollectResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCollectResultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chkExportIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkExportCombined, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(chkExportStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtStatsFilePrefix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtCombinedFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtIndividualtFilePrefix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExportDir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSelectExportDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chkCollectRunTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cmdCollectResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExportDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSelectExportDir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkExportIndividual)
                    .addComponent(txtIndividualtFilePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkExportCombined)
                    .addComponent(txtCombinedFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkExportStats)
                    .addComponent(txtStatsFilePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCollectRunTimes)
                    .addComponent(cmdCollectResults))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("ReadVarsESO"));

        cmdSelectExtraRvi.setText("...");
        cmdSelectExtraRvi.setToolTipText("Select a .rvi file for extracting results");
        cmdSelectExtraRvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectExtraRviActionPerformed(evt);
            }
        });

        cmdEditExtraRvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jeplus/images/page_white_edit.png"))); // NOI18N
        cmdEditExtraRvi.setToolTipText("Edit the contents of the file");
        cmdEditExtraRvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditExtraRviActionPerformed(evt);
            }
        });

        txtExtraRviFile.setText("my.rvi");
        txtExtraRviFile.setToolTipText("The input file name for the E+ ReadVarsESO tool is \"my.rvi\"");
        txtExtraRviFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtraRviFileActionPerformed(evt);
            }
        });
        txtExtraRviFile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExtraRviFileFocusLost(evt);
            }
        });

        cboReadVarsFrequency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Timestep", "Hourly", "Daily", "Monthly", "RunPeriod" }));
        cboReadVarsFrequency.setToolTipText("Select frequency of E+ model output. Leave it blank if unsure.");
        cboReadVarsFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboReadVarsFrequencyActionPerformed(evt);
            }
        });
        cboReadVarsFrequency.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboReadVarsFrequencyPropertyChange(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("RVI file: ");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel40.setText("Output frequency: ");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel41.setText("Command line: ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        txtReadVarsCmdLine.setText("readvarseso ... ...");
        txtReadVarsCmdLine.setToolTipText("This is a preview of the commandline to be run in each individual job folder.");
        jScrollPane1.setViewportView(txtReadVarsCmdLine);

        chkProjectJobsOnly.setSelected(true);
        chkProjectJobsOnly.setText("Scan only the jobs defined in the current project");
        chkProjectJobsOnly.setToolTipText("If unselected, I will try to scan all possible jobs.");
        chkProjectJobsOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkProjectJobsOnlyActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Result folder: ");

        txtResultDir.setText("output/");

        cmdSelectResultDir.setText("...");
        cmdSelectResultDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectResultDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkProjectJobsOnly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtExtraRviFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSelectExtraRvi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEditExtraRvi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboReadVarsFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtResultDir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSelectResultDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtResultDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSelectResultDir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExtraRviFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdSelectExtraRvi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addComponent(cmdEditExtraRvi))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboReadVarsFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkProjectJobsOnly)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Post Process Function"));

        cboProcFunc.setModel(new javax.swing.DefaultComboBoxModel(PostProcessFunc.getPosProcFunc()));
        cboProcFunc.setToolTipText("Apply filter process to the raw result. No generic filter is available at the moment. If you need to filter your result, please contant Dr Yi Zhang.");
        cboProcFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProcFuncActionPerformed(evt);
            }
        });

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel42.setText("Customized process: ");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaPostFuncInfo.setEditable(false);
        txaPostFuncInfo.setBackground(new java.awt.Color(240, 240, 240));
        txaPostFuncInfo.setColumns(20);
        txaPostFuncInfo.setLineWrap(true);
        txaPostFuncInfo.setRows(5);
        txaPostFuncInfo.setText("Default post-process function does nothing exception copies outputs from reader to writer.");
        txaPostFuncInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jScrollPane2.setViewportView(txaPostFuncInfo);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboProcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(cboProcFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSelectExportDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectExportDirActionPerformed
        // Select a directory to open
        fc.setCurrentDirectory(new File (txtExportDir.getText()));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setMultiSelectionEnabled(false);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            PostExportDir = fc.getSelectedFile().getAbsolutePath() + File.separator;
            txtExportDir.setText(PostExportDir);
        }
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }//GEN-LAST:event_cmdSelectExportDirActionPerformed

    private void chkExportIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExportIndividualActionPerformed
        if (this.chkExportIndividual.isSelected()) {
            this.txtIndividualtFilePrefix.setEnabled(true);
        }else {
            this.txtIndividualtFilePrefix.setEnabled(false);
        }
    }//GEN-LAST:event_chkExportIndividualActionPerformed

    private void chkExportCombinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExportCombinedActionPerformed
        if (this.chkExportCombined.isSelected()) {
            this.txtCombinedFile.setEnabled(true);
        }else {
            this.txtCombinedFile.setEnabled(false);
        }
    }//GEN-LAST:event_chkExportCombinedActionPerformed

    private void chkExportStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExportStatsActionPerformed
        if (this.chkExportStats.isSelected()) {
            this.txtStatsFilePrefix.setEnabled(true);
        }else {
            this.txtStatsFilePrefix.setEnabled(false);
        }
    }//GEN-LAST:event_chkExportStatsActionPerformed

    private void cmdCollectResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCollectResultsActionPerformed
        if (MainFrame.validateBatchJobs()) {
            EPlusPostProcessor post = new EPlusPostProcessor (
                MainFrame.getOutputPanel(),
                (MainFrame.getActingManager() == null) ? MainFrame.getBatchManager() : MainFrame.getActingManager(),
                this.txtResultDir.getText(),
                this.chkProjectJobsOnly.isSelected(),
                this.txtReadVarsCmdLine.getText(),
                this.getRVIintermFileName(txtExtraRviFile.getText().trim()),
                this.PostProcFunc,
                this.txtExportDir.getText(),
                this.chkExportIndividual.isSelected(),
                this.txtIndividualtFilePrefix.getText(),
                this.chkExportCombined.isSelected(),
                this.txtCombinedFile.getText(),
                this.chkExportStats.isSelected(),
                this.txtStatsFilePrefix.getText(),
                this.chkCollectRunTimes.isSelected()
            );
            new Thread(post).start(); //@todo: need to set variables in the post-processor
        }
    }//GEN-LAST:event_cmdCollectResultsActionPerformed

    private void cmdSelectExtraRviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectExtraRviActionPerformed
        // Select a file to open
        fc.setFileFilter(EPlusConfig.getFileFilter(EPlusConfig.RVI));
        fc.setMultiSelectionEnabled(false);
        String rvidir = RelativeDirUtil.checkAbsolutePath(txtExtraRviFile.getText(), MainFrame.getProject().getBaseDir());
        fc.setCurrentDirectory(new File (rvidir).getParentFile());
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            txtExtraRviFile.setText(file.getPath());
            txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" +
                txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
        }
        fc.resetChoosableFileFilters();
    }//GEN-LAST:event_cmdSelectExtraRviActionPerformed

    private void cmdEditExtraRviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditExtraRviActionPerformed

        // Test if the template file is present
        String fn = txtExtraRviFile.getText();
        String templfn = RelativeDirUtil.checkAbsolutePath(fn, MainFrame.getProject().getBaseDir());
        File ftmpl = new File (templfn);
        if (! ftmpl.exists()) {
            int n = JOptionPane.showConfirmDialog(
                this,
                "<html><p><center>The RVI/MVI file " + templfn + " does not exist." +
                "Do you want to select one?</center></p><p> Select 'NO' to create this file. </p>",
                "RVI file not available",
                JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                this.cmdSelectExtraRviActionPerformed(null);
                templfn = txtExtraRviFile.getText();
            }
        }
        int idx = MainFrame.getTpnEditors().indexOfTab(fn);
        if (idx >= 0) {
            MainFrame.getTpnEditors().setSelectedIndex(idx);
        }else {
            EPlusEditorPanel RviFilePanel = new EPlusEditorPanel(
                MainFrame.getTpnEditors(),
                fn,
                EPlusConfig.getFileFilter(EPlusConfig.RVI),
                templfn,
                "text/EPlusRVI",
                null);
            int ti = MainFrame.getTpnEditors().getTabCount();
            MainFrame.getTpnEditors().addTab(txtExtraRviFile.getText(), RviFilePanel);
            RviFilePanel.setTabId(ti);
            MainFrame.getTpnEditors().setSelectedIndex(ti);
            MainFrame.getTpnEditors().setTabComponentAt(ti, new ButtonTabComponent (MainFrame.getTpnEditors(), RviFilePanel));
            MainFrame.getTpnEditors().setToolTipTextAt(ti, templfn);
        }
    }//GEN-LAST:event_cmdEditExtraRviActionPerformed

    private void txtExtraRviFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtraRviFileActionPerformed
        txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" +
            txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
    }//GEN-LAST:event_txtExtraRviFileActionPerformed

    private void txtExtraRviFileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExtraRviFileFocusLost
        txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" +
            txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
    }//GEN-LAST:event_txtExtraRviFileFocusLost

    private void cboReadVarsFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboReadVarsFrequencyActionPerformed
        txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" +
            txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
    }//GEN-LAST:event_cboReadVarsFrequencyActionPerformed

    private void cboReadVarsFrequencyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboReadVarsFrequencyPropertyChange
        txtReadVarsCmdLine.setText("\"" + JEPlusConfig.getDefaultInstance().getResolvedReadVars() + "\" \"" +
            txtExtraRviFile.getText() + "\" unlimited " + cboReadVarsFrequency.getSelectedItem());
    }//GEN-LAST:event_cboReadVarsFrequencyPropertyChange

    private void chkProjectJobsOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkProjectJobsOnlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkProjectJobsOnlyActionPerformed

    private void cmdSelectResultDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectResultDirActionPerformed
        // Select a directory to open
        fc.setCurrentDirectory(new File (txtResultDir.getText()));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setMultiSelectionEnabled(false);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            PostResultDir = fc.getSelectedFile().getAbsolutePath() + File.separator;
            txtResultDir.setText(PostResultDir);
        }
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }//GEN-LAST:event_cmdSelectResultDirActionPerformed

    private void cboProcFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProcFuncActionPerformed
        // TODO add your handling code here:
        this.PostProcFunc = Math.max(cboProcFunc.getSelectedIndex(), 0);
        txaPostFuncInfo.setText(PostProcessFunc.getPosProcFuncDescription()[this.PostProcFunc]);
        if (this.PostProcFunc == 0) {
            txtExportDir.setText("./");
            chkExportIndividual.setSelected(false);
            chkExportIndividual.setEnabled(true);
            chkExportCombined.setSelected(true);
            chkExportCombined.setEnabled(true);
            chkExportStats.setSelected(true);
            chkExportStats.setEnabled(true);
            txtIndividualtFilePrefix.setEnabled(false);
            txtCombinedFile.setEnabled(true);
            txtStatsFilePrefix.setEnabled(true);
            jLabel43.setEnabled(true);
            jLabel3.setEnabled(true);
            jLabel1.setEnabled(true);
        }else if (this.PostProcFunc == 1) {
            txtExportDir.setText("LinkingTRNSYS/");
            chkExportIndividual.setSelected(false);
            chkExportIndividual.setEnabled(false);
            chkExportCombined.setSelected(false);
            chkExportCombined.setEnabled(false);
            chkExportStats.setSelected(false);
            chkExportStats.setEnabled(false);
            txtIndividualtFilePrefix.setEnabled(false);
            txtCombinedFile.setEnabled(false);
            txtStatsFilePrefix.setEnabled(false);
            jLabel43.setEnabled(true);
            jLabel3.setEnabled(false);
            jLabel1.setEnabled(false);
        }
    }//GEN-LAST:event_cboProcFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboProcFunc;
    private javax.swing.JComboBox cboReadVarsFrequency;
    private javax.swing.JCheckBox chkCollectRunTimes;
    private javax.swing.JCheckBox chkExportCombined;
    private javax.swing.JCheckBox chkExportIndividual;
    private javax.swing.JCheckBox chkExportStats;
    private javax.swing.JCheckBox chkProjectJobsOnly;
    private javax.swing.JButton cmdCollectResults;
    private javax.swing.JButton cmdEditExtraRvi;
    private javax.swing.JButton cmdSelectExportDir;
    private javax.swing.JButton cmdSelectExtraRvi;
    private javax.swing.JButton cmdSelectResultDir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaPostFuncInfo;
    private javax.swing.JTextField txtCombinedFile;
    private javax.swing.JTextField txtExportDir;
    private javax.swing.JTextField txtExtraRviFile;
    private javax.swing.JTextField txtIndividualtFilePrefix;
    private javax.swing.JTextField txtReadVarsCmdLine;
    private javax.swing.JTextField txtResultDir;
    private javax.swing.JTextField txtStatsFilePrefix;
    // End of variables declaration//GEN-END:variables
}
