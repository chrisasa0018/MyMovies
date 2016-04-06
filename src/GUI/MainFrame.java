/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 6 Οκτ 2011, 2:33:11 μμ
 */
package GUI;

import _MainPackage.Main;
import support.tools.Exist;
import support.tools.ImageProcess;
import support.tools.WriteFile;
import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.w3c.dom.NodeList;

/**
 *
 * @author Christos
 */
public class MainFrame extends javax.swing.JFrame {

    JFileChooser fc;
    int movieCounter = 1;
    boolean fl = true;
    
    String MoviesDataXML = "./src/chris/results/MoviesData.xml";
    String MoviesListTXT = "./src/chris/results/MoviesList.txt";
    String ServerResponseTXT = "./src/chris/results/ServerResponse.txt";
    

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        fc = jFC;
        jSelectFolderDialog.setVisible(true);
        this.movieDataDisplay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSelectFolderDialog = new javax.swing.JDialog();
        jCardLayoutPn = new javax.swing.JPanel();
        jFileChooserPn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPathTF = new javax.swing.JTextField();
        jBrowseBt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jExitBt = new javax.swing.JButton();
        jOkBt = new javax.swing.JButton();
        jLoadingPn = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jFC = new javax.swing.JFileChooser();
        DataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        YearTextField = new javax.swing.JTextField();
        GenreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        WriterTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlotTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActorTextArea = new javax.swing.JTextArea();
        ImagePanel = new javax.swing.JPanel();
        RuntimeTextField = new javax.swing.JTextField();
        RatingTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PosterPanel = new javax.swing.JPanel();
        PosterLabel = new javax.swing.JLabel();
        NextMovieButton = new javax.swing.JButton();
        PreviousMovieButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFileMenu = new javax.swing.JMenu();
        jExitMI = new javax.swing.JMenuItem();
        jEditMenu = new javax.swing.JMenu();
        jChangeFolderMI = new javax.swing.JMenuItem();
        jClearDataMI = new javax.swing.JMenuItem();

        jSelectFolderDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jSelectFolderDialog.setAlwaysOnTop(true);
        jSelectFolderDialog.setMinimumSize(new java.awt.Dimension(455, 132));
        jSelectFolderDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jSelectFolderDialog.setResizable(false);

        jCardLayoutPn.setLayout(new java.awt.CardLayout());

        jFileChooserPn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0));
        jFileChooserPn.setLayout(new java.awt.GridLayout(3, 0));

        jLabel9.setText("  Insert movies folder path");
        jFileChooserPn.add(jLabel9);

        jPathTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPathTFActionPerformed(evt);
            }
        });

        jBrowseBt.setText("Browse");
        jBrowseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowseBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPathTF, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBrowseBt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jPathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBrowseBt))
        );

        jFileChooserPn.add(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 1, 1, 1));

        jExitBt.setText("Exit");
        jExitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitBtActionPerformed(evt);
            }
        });

        jOkBt.setText("Ok");
        jOkBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jExitBt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jOkBt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jExitBt)
                .addComponent(jOkBt))
        );

        jFileChooserPn.add(jPanel1);

        jCardLayoutPn.add(jFileChooserPn, "card1");

        jLoadingPn.setLayout(new java.awt.GridLayout(4, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jLoadingPn.add(jPanel3);

        jLabel10.setText("Loading...");
        jLoadingPn.add(jLabel10);

        jProgressBar1.setIndeterminate(true);
        jLoadingPn.add(jProgressBar1);

        jCardLayoutPn.add(jLoadingPn, "card2");

        javax.swing.GroupLayout jSelectFolderDialogLayout = new javax.swing.GroupLayout(jSelectFolderDialog.getContentPane());
        jSelectFolderDialog.getContentPane().setLayout(jSelectFolderDialogLayout);
        jSelectFolderDialogLayout.setHorizontalGroup(
            jSelectFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(jSelectFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSelectFolderDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jCardLayoutPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jSelectFolderDialogLayout.setVerticalGroup(
            jSelectFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(jSelectFolderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSelectFolderDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jCardLayoutPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jFC.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMovies");
        setResizable(false);

        DataPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Title");

        jLabel2.setText("Year");

        jLabel3.setText("Genre");

        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });

        GenreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Writer");

        WriterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriterTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Actors");

        PlotTextArea.setColumns(20);
        PlotTextArea.setLineWrap(true);
        PlotTextArea.setTabSize(0);
        jScrollPane1.setViewportView(PlotTextArea);

        jLabel8.setText("Plot");

        ActorTextArea.setColumns(20);
        ActorTextArea.setLineWrap(true);
        ActorTextArea.setTabSize(0);
        jScrollPane2.setViewportView(ActorTextArea);

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DataPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(TitleTextField)
                            .addComponent(YearTextField)
                            .addComponent(GenreTextField)
                            .addComponent(WriterTextField))))
                .addContainerGap())
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WriterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        ImagePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RuntimeTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        RuntimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuntimeTextFieldActionPerformed(evt);
            }
        });

        RatingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Runtime");

        jLabel7.setText("Rating");

        PosterPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PosterPanelLayout = new javax.swing.GroupLayout(PosterPanel);
        PosterPanel.setLayout(PosterPanelLayout);
        PosterPanelLayout.setHorizontalGroup(
            PosterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PosterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PosterPanelLayout.setVerticalGroup(
            PosterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PosterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePanelLayout.createSequentialGroup()
                .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                        .addContainerGap(73, Short.MAX_VALUE)
                        .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RatingTextField)
                            .addComponent(RuntimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ImagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PosterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PosterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RuntimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        NextMovieButton.setText(">");
        NextMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMovieButtonActionPerformed(evt);
            }
        });

        PreviousMovieButton.setText("<");
        PreviousMovieButton.setEnabled(false);
        PreviousMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousMovieButtonActionPerformed(evt);
            }
        });

        jFileMenu.setText("File");

        jExitMI.setText("Exit");
        jExitMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitMIActionPerformed(evt);
            }
        });
        jFileMenu.add(jExitMI);

        jMenuBar1.add(jFileMenu);

        jEditMenu.setText("Edit");

        jChangeFolderMI.setText("Change movies' folder");
        jChangeFolderMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeFolderMIActionPerformed(evt);
            }
        });
        jEditMenu.add(jChangeFolderMI);

        jClearDataMI.setText("Clear data");
        jClearDataMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearDataMIActionPerformed(evt);
            }
        });
        jEditMenu.add(jClearDataMI);

        jMenuBar1.add(jEditMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PreviousMovieButton)
                    .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextMovieButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreviousMovieButton)
                    .addComponent(NextMovieButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTextFieldActionPerformed

    private void movieDataDisplay() {
        String movieXpath = "//movie[" + movieCounter + "]/title";
        NodeList movieTitle = Exist.executeGetQuery(movieXpath, MoviesDataXML);

        String yearXpath = "//movie[" + movieCounter + "]/year";
        NodeList movieYear = Exist.executeGetQuery(yearXpath, MoviesDataXML);

        String genreXpath = "//movie[" + movieCounter + "]/genre";
        NodeList movieGenre = Exist.executeGetQuery(genreXpath, MoviesDataXML);

        String plotXpath = "//movie[" + movieCounter + "]/plot";
        NodeList moviePlot = Exist.executeGetQuery(plotXpath, MoviesDataXML);

        String writerXpath = "//movie[" + movieCounter + "]/writer";
        NodeList movieWriter = Exist.executeGetQuery(writerXpath, MoviesDataXML);

        String actorXpath = "//movie[" + movieCounter + "]/actors";
        NodeList movieActor = Exist.executeGetQuery(actorXpath, MoviesDataXML);

        String runtimeXpath = "//movie[" + movieCounter + "]/runtime";
        NodeList movieRuntime = Exist.executeGetQuery(runtimeXpath, MoviesDataXML);

        String ratingXpath = "//movie[" + movieCounter + "]/rating";
        NodeList movieRating = Exist.executeGetQuery(ratingXpath, MoviesDataXML);


        if (movieTitle.getLength() > 0) {

            String title = movieTitle.item(0).getTextContent().trim();
            String year = movieYear.item(0).getTextContent().trim();
            String genre = movieGenre.item(0).getTextContent().trim();
            String plot = moviePlot.item(0).getTextContent().trim();
            String writer = movieWriter.item(0).getTextContent().trim();
            String[] actorTab = movieActor.item(0).getTextContent().trim().split(", ");
            String actor = "";
            for (int i = 0; i < actorTab.length; i++) {
                actor = actor + actorTab[i] + "\n";
            }
            String runtime = movieRuntime.item(0).getTextContent().trim();
            String rating = movieRating.item(0).getTextContent().trim();

            TitleTextField.setText(title);
            YearTextField.setText(year);
            GenreTextField.setText(genre);
            WriterTextField.setText(writer);
            ActorTextArea.setText(actor);
            PlotTextArea.setText(plot);

            RuntimeTextField.setText(runtime);
            RatingTextField.setText(rating + " / 10");

            String imgFile = "./src/chris/results/images/" + title + year + ".jpg";

            Image origPoster = new ImageIcon(imgFile).getImage();
            Image resizedPoster = new ImageIcon(ImageProcess.getScaledImage(origPoster, PosterLabel.getHeight(), PosterLabel.getWidth())).getImage();
            ImageIcon post = new ImageIcon(resizedPoster);
            PosterLabel.setIcon(post);
        }
    }

    private void NextMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMovieButtonActionPerformed
        // TODO add your handling code here:

        // Disable "next" button
        int nextMovie = movieCounter + 1;
        String movieXpath = "//movie[" + nextMovie + "]/title";
        NodeList movieTitle = Exist.executeGetQuery(movieXpath, MoviesDataXML);
        if (movieTitle.getLength() == 0) {
            NextMovieButton.setEnabled(false);
        } else {
            movieCounter++;
        }

        // Enable "previous" button
        int previousMovie = movieCounter - 1;
        movieXpath = "//movie[" + previousMovie + "]/title";
        movieTitle = Exist.executeGetQuery(movieXpath, MoviesDataXML);
        if (movieTitle.getLength() != 0) {
            PreviousMovieButton.setEnabled(true);
        }

        // Display data
        movieDataDisplay();

        System.out.println(movieCounter);
    }//GEN-LAST:event_NextMovieButtonActionPerformed

    private void PreviousMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousMovieButtonActionPerformed
        // TODO add your handling code here:
        if (movieCounter > 1) {
            movieCounter--;
        }
//        if (movieCounter == 1) {
//            PreviousMovieButton.setEnabled(false);
//        }

        // Disable "previous" button
        int previousMovie = movieCounter - 1;
        String movieXpath = "//movie[" + previousMovie + "]/title";
        NodeList movieTitle = Exist.executeGetQuery(movieXpath, MoviesDataXML);
        if (movieTitle.getLength() == 0) {
            PreviousMovieButton.setEnabled(false);
        }

        // Enable "next" button
        int nextMovie = movieCounter + 1;
        movieXpath = "//movie[" + nextMovie + "]/title";
        movieTitle = Exist.executeGetQuery(movieXpath, MoviesDataXML);
        if (movieTitle.getLength() != 0) {
            NextMovieButton.setEnabled(true);
        }

        // Display data
        movieDataDisplay();

        System.out.println(movieCounter);
    }//GEN-LAST:event_PreviousMovieButtonActionPerformed

    private void GenreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreTextFieldActionPerformed

    private void WriterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WriterTextFieldActionPerformed

    private void RuntimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuntimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuntimeTextFieldActionPerformed

    private void RatingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RatingTextFieldActionPerformed

    private void jOkBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkBtActionPerformed
        /* Check if the user give a correct path
         */
        if (jPathTF.getText().equals("")) {
            // Invalid path
            JOptionPane.showMessageDialog(this, "Please choose a valid file path.", "Path error", JOptionPane.ERROR_MESSAGE);
            // Clean path text field
            jPathTF.setText("");
        } else {
            Main.moviesFullFilePath = jPathTF.getText();
            Main.moviesFile = new File(jPathTF.getText());

            if (Main.moviesFile.exists()) {
                // Use thread to change card to avoid lagging
//                Thread thr1 = new Thread(r1);
//                thr1.start();

                // Get data!
                try {
                    Main.createTittleYearLists();
                    Main.getMoviesImages();
                    jSelectFolderDialog.setVisible(false);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // Invalid path
                JOptionPane.showMessageDialog(this, "Please choose a valid file path.", "Path error", JOptionPane.ERROR_MESSAGE);
                // Clean path text field
                jPathTF.setText("");
            }

        }
    }//GEN-LAST:event_jOkBtActionPerformed
    Runnable r1 = new Runnable() {
        public void run() {
            System.out.println("ok");
            // Show loading card
            CardLayout cl = (CardLayout) (jCardLayoutPn.getLayout());
            cl.show(jCardLayoutPn, "card2");
        }
    };

    private void jPathTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPathTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPathTFActionPerformed

    private void jBrowseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowseBtActionPerformed
        // TODO add your handling code here:
        //        int returnVal =
        fc.showOpenDialog(MainFrame.this);
        File file = fc.getSelectedFile();
        //        System.out.println(file.getAbsolutePath());

        jPathTF.setText(file.getAbsolutePath());
    }//GEN-LAST:event_jBrowseBtActionPerformed

    private void jExitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitBtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jExitBtActionPerformed

    private void jClearDataMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearDataMIActionPerformed
        // TODO add your handling code here:
        try {
            WriteFile.write("", MoviesListTXT);
            WriteFile.write("", ServerResponseTXT);
            WriteFile.write("", MoviesDataXML);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jSelectFolderDialog.setVisible(true);
    }//GEN-LAST:event_jClearDataMIActionPerformed

    private void jChangeFolderMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChangeFolderMIActionPerformed
        // TODO add your handling code here:
        jSelectFolderDialog.setVisible(true);
    }//GEN-LAST:event_jChangeFolderMIActionPerformed

    private void jExitMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitMIActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jExitMIActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ActorTextArea;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JTextField GenreTextField;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton NextMovieButton;
    private javax.swing.JTextArea PlotTextArea;
    private javax.swing.JLabel PosterLabel;
    private javax.swing.JPanel PosterPanel;
    private javax.swing.JButton PreviousMovieButton;
    private javax.swing.JTextField RatingTextField;
    private javax.swing.JTextField RuntimeTextField;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JTextField WriterTextField;
    private javax.swing.JTextField YearTextField;
    private javax.swing.JButton jBrowseBt;
    private javax.swing.JPanel jCardLayoutPn;
    private javax.swing.JMenuItem jChangeFolderMI;
    private javax.swing.JMenuItem jClearDataMI;
    private javax.swing.JMenu jEditMenu;
    private javax.swing.JButton jExitBt;
    private javax.swing.JMenuItem jExitMI;
    private javax.swing.JFileChooser jFC;
    private javax.swing.JPanel jFileChooserPn;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jLoadingPn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jOkBt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPathTF;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jSelectFolderDialog;
    // End of variables declaration//GEN-END:variables
}
