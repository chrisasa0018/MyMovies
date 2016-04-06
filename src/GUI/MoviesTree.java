/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import support.tools.Exist;
import java.util.Stack;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.w3c.dom.NodeList;

/**
 *
 * @author christos
 */
public class MoviesTree extends javax.swing.JFrame {

    /**
     * Creates new form MoviesTree
     */
    public MoviesTree() {
        initComponents();
        treeModelCreate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(0, 26, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(0, 6, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void treeModelCreate() {
        int movieCounter = 1;
        boolean flag = true;
        Stack<String> yearStack = new Stack<String>();

        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode yearCat1 = null;
        DefaultMutableTreeNode yearCat2 = null;
        DefaultMutableTreeNode yearCat3 = null;


        while (flag) {

            String movieXpath = "//movie[" + movieCounter + "]/title";
            NodeList movieTitle = Exist.executeGetQuery(movieXpath, "./src/chris/results/MoviesData.xml");
            String yearXpath = "//movie[" + movieCounter + "]/year";
            NodeList movieYear = Exist.executeGetQuery(yearXpath, "./src/chris/results/MoviesData.xml");

            if (movieTitle.getLength() > 0) {
                String year = movieYear.item(0).getTextContent().trim();
                /* Fill the stack which contains all years of our movies.
                 * Stack contains unique records
                 */
                if (!yearStack.contains(year)) {
                    yearStack.push(year);

//                    System.out.println(year);
                }
                movieCounter++;
            } else {
                flag = false;
            }
        }

//        yearCat1 = new DefaultMutableTreeNode("a");
//        yearCat2 = new DefaultMutableTreeNode("b");
//        yearCat3 = new DefaultMutableTreeNode("c");
//        category.add(yearCat1);
//        category.add(yearCat2);
//        category.add(yearCat3);

        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Collage");
        DefaultMutableTreeNode d = new DefaultMutableTreeNode("Department");
        DefaultMutableTreeNode f = new DefaultMutableTreeNode("Faculty");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Acoountant");
        DefaultMutableTreeNode r = new DefaultMutableTreeNode("Resgistrar");
        DefaultMutableTreeNode m = new DefaultMutableTreeNode("Managenent");
        DefaultMutableTreeNode s = new DefaultMutableTreeNode("Security");
        c.add(d);
        d.add(f);
        d.add(a);
        d.add(m);
        m.add(s);
        c.add(a);
        
        JTree jtr = new JTree(c);
        jScrollPane2.add(jtr);
        jScrollPane2.revalidate();
        
//        jTree1 = new JTree(c);
//        System.out.println(jTree1.getModel().getRoot().toString());
        
//        System.out.println(category);


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
            java.util.logging.Logger.getLogger(MoviesTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviesTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviesTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviesTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviesTree().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}