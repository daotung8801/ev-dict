/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;


import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static EVDict4_1.DictionaryData.dictionaryType.EV;
import static EVDict4_1.DictionaryData.dictionaryType.VE;

/**
 * @author ADMIN
 */
public class DictApp extends javax.swing.JFrame {

    /**
     * Creates new form DictApp
     */
    public DictApp() {
        initComponents();
        initRecentWordList();
        speakerButton.setVisible(false);
    }

    public DictionaryData.dictionaryType state = EV;
    public int check_input = 0;
    DefaultListModel list = new DefaultListModel();
    String word_select = "";

    FileImplement dictEV = new FileImplement(EV);
    FileImplement dictVE = new FileImplement(VE);

    DictionaryData da = new DictionaryData();

    VoiceImplement speaker = new VoiceImplement();

    AddForm af = new AddForm();
    EditForm ef = new EditForm();
    GoogleAPIForm apiForm = new GoogleAPIForm();

    public void initRecentWordList() {
        list = da.initRecentList(da.recentWord);
        dictList.setModel(list);
    }

    public void initBookmarkWordList() {
        list = da.initBookmarkList(da.markedWord);
        dictList.setModel(list);
    }

    public void initDictList() {
        list = new DefaultListModel();
        if (state == EV) {
            list = dictEV.initDict();
        } else if (state == VE) {
            list = dictVE.initDict();
        }
        dictList.setModel(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dictList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        meaningTextPane = new javax.swing.JTextPane();
        evButton = new javax.swing.JButton();
        veButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        speakerButton = new javax.swing.JButton();
        recentButton = new javax.swing.JButton();
        apiButton = new javax.swing.JButton();
        bookmarkButton = new javax.swing.JButton();
        addBmButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        searchTextField.setText("Tra cứu từ ở đây bạn nhé...");
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        dictList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        dictList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dictListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(dictList);

        meaningTextPane.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(meaningTextPane);

        evButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/evdict.png"))); // NOI18N
        evButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evButtonActionPerformed(evt);
            }
        });

        veButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/vedict.png"))); // NOI18N
        veButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veButtonActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/add.png"))); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/remove.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/edit.png"))); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/export.png"))); // NOI18N
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        speakerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/speaker.png"))); // NOI18N
        speakerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerButtonActionPerformed(evt);
            }
        });

        recentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/history.png"))); // NOI18N
        recentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recentButtonActionPerformed(evt);
            }
        });

        apiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/ggtranslate.png"))); // NOI18N
        apiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apiButtonActionPerformed(evt);
            }
        });

        bookmarkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EVDict4_1/Icon/bookmark.png"))); // NOI18N
        bookmarkButton.setToolTipText("Book mark");
        bookmarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookmarkButtonActionPerformed(evt);
            }
        });

        addBmButton.setText("jButton1");
        addBmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBmButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Selection");

        jMenuItem6.setText("jMenuItem6");
        jMenu3.add(jMenuItem6);

        jMenuItem5.setText("jMenuItem5");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(evButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(veButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(recentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(apiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(91, 91, 91)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(84, 84, 84)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addBmButton)
                                                                        .addComponent(bookmarkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(evButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(veButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(recentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(exportButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(speakerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bookmarkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(addBmButton)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2))))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String searchWord = searchTextField.getText();
            if (searchWord.trim().isEmpty()) {
                check_input = -1;
            } else if (state == EV) {
                if (dictEV.getWord().contains(searchWord)) {
                    check_input = 1;
                    meaningTextPane.setText(dictEV.getDictData().get(searchWord));
                } else {
                    check_input = 0;
                }
            } else if (state == VE) {
                if (dictVE.getWord().contains(searchWord)) {
                    check_input = 1;
                    meaningTextPane.setText(dictVE.getDictData().get(searchWord));
                } else {
                    check_input = 0;
                }
            }
            if (check_input == -1) {
                JOptionPane.showMessageDialog(null, "Từ đang bị trống, vui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (check_input == 0) {
                JOptionPane.showMessageDialog(null, "Từ này đang không có trong từ điển!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        ArrayList<String> newDictList = new ArrayList<>();
        list = new DefaultListModel<>();
        String searchWord = searchTextField.getText();
        if (state == EV) {
            if (searchWord.trim().isEmpty()) {
                newDictList = new ArrayList(dictEV.getWord());
            } else {
                newDictList = dictEV.searchWord(searchWord, dictEV.getWord());
            }
        } else if (state == VE) {
            if (searchWord.trim().isEmpty()) {
                newDictList = new ArrayList(dictVE.getWord());
            } else {
                newDictList = dictVE.searchWord(searchWord, dictVE.getWord());
            }
        }
        for (String word : newDictList) {
            list.addElement(word);
        }
        dictList.setModel(list);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void dictListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dictListValueChanged
        // TODO add your handling code here:
        word_select = dictList.getSelectedValue();
        searchTextField.setText(word_select);
        da.saveToRencent(word_select);
        try {
            da.readToFile(da.recentWord, "RecentList.txt");
        } catch (IOException ex) {
            Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        String meaning = "";
        if (state == EV) {
            meaning = dictEV.getDictData().get(word_select);
        } else if (state == VE) {
            meaning = dictVE.getDictData().get(word_select);
        }
        speakerButton.setVisible(true);
        meaningTextPane.setText(meaning);
    }//GEN-LAST:event_dictListValueChanged

    private void evButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        state = EV;
        initDictList();
    }//GEN-LAST:event_evButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchWord = searchTextField.getText();
        if (searchWord.trim().isEmpty()) {
            check_input = -1;
        } else if (state == EV) {
            if (dictEV.getWord().contains(searchWord)) {
                check_input = 1;
                meaningTextPane.setText(dictEV.getDictData().get(searchTextField.getText()));
            }
        } else if (state == VE) {
            if (dictVE.getWord().contains(searchWord)) {
                check_input = 1;
                meaningTextPane.setText(dictVE.getDictData().get(searchTextField.getText()));
            }
        }

        if (check_input == -1) {
            JOptionPane.showMessageDialog(null, "Từ đang bị trống, vui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (check_input == 0) {
            JOptionPane.showMessageDialog(null, "Từ này đang không có trong từ điển!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        af.setVisible(true);
        af.wordTextField.setText("");
        af.meaningTextPane.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void veButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        state = VE;
        initDictList();
    }//GEN-LAST:event_veButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu lại những thay đổi không?", "Thông báo", JOptionPane.YES_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            try {
                dictEV.updateFile();
                dictVE.updateFile();
            } catch (IOException ex) {
                Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        if (word == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn từ để xoá!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá từ này khỏi từ điển không?", "Cảnh báo", JOptionPane.YES_OPTION);
            if (state == EV) {
                if (answer == JOptionPane.YES_OPTION) {
                    dictEV.removeFromDict(word);
                    initDictList();
                    check_input = 1;
                }
            } else if (state == VE) {
                if (answer == JOptionPane.YES_OPTION) {
                    dictVE.removeFromDict(word);
                    initDictList();
                    check_input = 1;
                }
            }
            if (check_input == 1) {
                JOptionPane.showMessageDialog(null, "Đã xong!");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        if (word == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn từ để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            ef.setVisible(true);
            ef.wordTextField.setText(word);
            if (state == EV) {
                ef.meaningTextPane.setText(dictEV.getDictData().get(word));
            } else if (state == VE) {
                ef.meaningTextPane.setText(dictVE.getDictData().get(word));
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        // TODO add your handling code here:
        searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void speakerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerButtonActionPerformed
        // TODO add your handling code here:
        speaker.HandleVoice(word_select);
    }//GEN-LAST:event_speakerButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        try {
            // TODO add your handling code here:
            dictEV.updateFile();
            dictVE.updateFile();
        } catch (IOException ex) {
            Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Mọi thông tin đã được thay đổi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_exportButtonActionPerformed

    private void recentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recentButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        initRecentWordList();
    }//GEN-LAST:event_recentButtonActionPerformed

    private void apiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apiButtonActionPerformed
        // TODO add your handling code here:
        apiForm.setVisible(true);
    }//GEN-LAST:event_apiButtonActionPerformed

    private void bookmarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookmarkButtonActionPerformed
        // TODO add your handling code here:
        searchTextField.setText("");
        meaningTextPane.setText("");
        initBookmarkWordList();
    }//GEN-LAST:event_bookmarkButtonActionPerformed

    private void addBmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBmButtonActionPerformed
        // TODO add your handling code here:
        String word = dictList.getSelectedValue();
        da.saveToBookmark(word);
        if (word == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn từ để lưu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                da.readToFile(da.recentWord, "BookmarkList.txt");
            } catch (IOException ex) {
                Logger.getLogger(DictApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Bạn đã thêm vào Bookmark", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addBmButtonActionPerformed

    public static DictApp dictApp = new DictApp();

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
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dictApp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBmButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton apiButton;
    private javax.swing.JButton bookmarkButton;
    private javax.swing.JButton deleteButton;
    public javax.swing.JList<String> dictList;
    private javax.swing.JButton editButton;
    private javax.swing.JButton evButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane meaningTextPane;
    private javax.swing.JButton recentButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton speakerButton;
    private javax.swing.JButton veButton;
    // End of variables declaration//GEN-END:variables
}
