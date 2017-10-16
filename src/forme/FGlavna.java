/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Radnik;
import domen.Tiket;
import domen.UplatnoMesto;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.ScrollPane;
import java.beans.EventHandler;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import komunikacija.KontrolerKI;

import repozitorijum.Repozitorijum;
import transfer.ServerTransferObjekat;
import transfer.KlijentTransferObjekat;

/**
 *
 * @author KORISNIK
 */
public class FGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FGlavna
     */
    public FGlavna() {
        initComponents();
        pripremiFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jMenuTiket = new javax.swing.JMenu();
        jMenuItemKreirajTiket = new javax.swing.JMenuItem();
        jMenuItemPretraziTiket = new javax.swing.JMenuItem();
        jMenuUtakmice = new javax.swing.JMenu();
        jMenuItemUnosUtakmice = new javax.swing.JMenuItem();
        jMenuItemIzmenaUtakmice = new javax.swing.JMenuItem();
        jMenuItemUnosRezultata = new javax.swing.JMenuItem();
        jMenuLista = new javax.swing.JMenu();
        jMenuItemGenerisiListu = new javax.swing.JMenuItem();
        jMenuStanje = new javax.swing.JMenu();
        jMenuItemPregledStanja = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemUnosRadnika = new javax.swing.JMenuItem();
        jMenuItemIzmenaRadnika = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kladionica");
        setName("Kladionica"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenuTiket.setText("Tiket");

        jMenuItemKreirajTiket.setText("Kreiraj tiket");
        jMenuItemKreirajTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajTiketActionPerformed(evt);
            }
        });
        jMenuTiket.add(jMenuItemKreirajTiket);

        jMenuItemPretraziTiket.setText("Pretrazi tiket");
        jMenuItemPretraziTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPretraziTiketActionPerformed(evt);
            }
        });
        jMenuTiket.add(jMenuItemPretraziTiket);

        jMenuBar.add(jMenuTiket);

        jMenuUtakmice.setText("Utakmice");

        jMenuItemUnosUtakmice.setText("Unos utakmice");
        jMenuItemUnosUtakmice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnosUtakmiceActionPerformed(evt);
            }
        });
        jMenuUtakmice.add(jMenuItemUnosUtakmice);

        jMenuItemIzmenaUtakmice.setText("Izmena utakmice");
        jMenuItemIzmenaUtakmice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIzmenaUtakmiceActionPerformed(evt);
            }
        });
        jMenuUtakmice.add(jMenuItemIzmenaUtakmice);

        jMenuItemUnosRezultata.setText("Unos rezultata");
        jMenuItemUnosRezultata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnosRezultataActionPerformed(evt);
            }
        });
        jMenuUtakmice.add(jMenuItemUnosRezultata);

        jMenuBar.add(jMenuUtakmice);

        jMenuLista.setText("Lista");

        jMenuItemGenerisiListu.setText("Generisi listu");
        jMenuItemGenerisiListu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerisiListuActionPerformed(evt);
            }
        });
        jMenuLista.add(jMenuItemGenerisiListu);

        jMenuBar.add(jMenuLista);

        jMenuStanje.setText("Stanje");

        jMenuItemPregledStanja.setText("Pregled stanja");
        jMenuItemPregledStanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPregledStanjaActionPerformed(evt);
            }
        });
        jMenuStanje.add(jMenuItemPregledStanja);

        jMenuBar.add(jMenuStanje);

        jMenuAdmin.setText("Admin");

        jMenuItemUnosRadnika.setText("Unos radnika");
        jMenuItemUnosRadnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnosRadnikaActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemUnosRadnika);

        jMenuItemIzmenaRadnika.setText("Izmena radnika");
        jMenuItemIzmenaRadnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIzmenaRadnikaActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemIzmenaRadnika);

        jMenuBar.add(jMenuAdmin);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKreirajTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajTiketActionPerformed

        try {
            if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
                JPanelIzmenaRadnika.nitProvereIzmenaRadnika.interrupt();
            }
            if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
                JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
            }
            Tiket tiket = new Tiket(new ArrayList<>());
            tiket.setRadnik(repozitorijum.Repozitorijum.ulogovaniRadnik);
            KlijentTransferObjekat zahtev = new KlijentTransferObjekat();
            zahtev.setOperacija(KlijentTransferObjekat.KREIRAJ_NOVI_TIKET);
            zahtev.setObjekatOperacije(tiket);
            KontrolerKI.vratiInstancu().posaljiZahtev(zahtev);
            ServerTransferObjekat odgovor = KontrolerKI.vratiInstancu().procitajOdgovor();

            if (odgovor.getSignal() == -1) {
                throw new Exception(odgovor.getPoruka());
            }
            Repozitorijum.tiket = (Tiket) odgovor.getObjekatIzvrsenjaOperacije();

            prikaziKreirajTiket();

        } catch (IOException eio) {
            prikaziFormuPrijava();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }


    }//GEN-LAST:event_jMenuItemKreirajTiketActionPerformed

    private void jMenuItemPretraziTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPretraziTiketActionPerformed
        // TODO add your handling code here:
        if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
            JPanelIzmenaRadnika.nitProvereIzmenaRadnika.interrupt();
        }
        if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
            JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
        }
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();

        fGlavna.getContentPane().removeAll();
        JPanel jPanel = new JPanelPretraziTiket();

        JScrollPane jScroll = new JScrollPane(jPanel);
        fGlavna.add(jScroll, BorderLayout.CENTER);

        fGlavna.pack();
        fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);


    }//GEN-LAST:event_jMenuItemPretraziTiketActionPerformed

    private void jMenuItemPregledStanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPregledStanjaActionPerformed
        JDialogStanje jds;
        try {

            jds = new JDialogStanje(this, true);
            jds.setLocationRelativeTo(null);
            jds.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }


    }//GEN-LAST:event_jMenuItemPregledStanjaActionPerformed

    private void jMenuItemUnosUtakmiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnosUtakmiceActionPerformed
        // TODO add your handling code here:
        if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
            JPanelIzmenaRadnika.nitProvereIzmenaRadnika.interrupt();
        }
        if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
            JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
        }
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanelUtakmice jPanel = null;

        try {
            jPanel = new JPanelUtakmice();
            jPanel.pripremiZaUnosNoveUtakmice();
            JScrollPane jScroll = new JScrollPane(jPanel);
            fGlavna.add(jScroll, BorderLayout.CENTER);
            fGlavna.pack();
            fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);
        } catch (IOException ex) {
            prikaziFormuPrijava();
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItemUnosUtakmiceActionPerformed

    private void jMenuItemUnosRezultataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnosRezultataActionPerformed
        // TODO add your handling code here:
        if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
            JPanelIzmenaRadnika.nitProvereIzmenaRadnika.interrupt();
        }
        if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
            JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
        }
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanelUtakmice jPanel = null;

        try {
            jPanel = new JPanelUtakmice();
            jPanel.pripremiZaUnosenjeRezultata();
            JScrollPane jScroll = new JScrollPane(jPanel);
            fGlavna.add(jScroll, BorderLayout.CENTER);

            fGlavna.pack();
            fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);
        } catch (IOException eio) {
            prikaziFormuPrijava();
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItemUnosRezultataActionPerformed

    private void jMenuItemIzmenaUtakmiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIzmenaUtakmiceActionPerformed
        // TODO add your handling code here:
        if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
            JPanelIzmenaRadnika.nitProvereIzmenaRadnika.interrupt();
        }
        if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
            JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
        }
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanelUtakmice jPanel = null;

        try {
            jPanel = new JPanelUtakmice();
            jPanel.pripremiZaIzmenuUtakmice();
            JScrollPane jScroll = new JScrollPane(jPanel);
            fGlavna.add(jScroll, BorderLayout.CENTER);

            fGlavna.pack();
            fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);
        } catch (IOException eio) {
            prikaziFormuPrijava();
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItemIzmenaUtakmiceActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            Radnik r = repozitorijum.Repozitorijum.ulogovaniRadnik;
            KlijentTransferObjekat zahtev = new KlijentTransferObjekat();
            zahtev.setOperacija(KlijentTransferObjekat.ODJAVA);
            zahtev.setObjekatOperacije(r);
            KontrolerKI.vratiInstancu().posaljiZahtev(zahtev);

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemGenerisiListuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerisiListuActionPerformed
        // TODO add your handling code here:

        JDialogLista jdl;
        try {

            jdl = new JDialogLista(this, rootPaneCheckingEnabled);
            jdl.setLocationRelativeTo(null);
            jdl.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemGenerisiListuActionPerformed

    private void jMenuItemUnosRadnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnosRadnikaActionPerformed
        // TODO add your handling code here:

        try {
            if (JPanelIzmenaRadnika.nitProvereIzmenaRadnika != null) {
                JPanelIzmenaRadnika.nitProvereIzmenaRadnika.isInterrupted();
            }
            Radnik radnik = new Radnik();
            UplatnoMesto um = new UplatnoMesto();
            um.setIdUplatnogMesta(1);
            radnik.setUplatnoMesto(um);
            KlijentTransferObjekat zahtev = new KlijentTransferObjekat();
            zahtev.setOperacija(KlijentTransferObjekat.KREIRAJ_NOVOG_RADNIKA);
            zahtev.setObjekatOperacije(radnik);
            KontrolerKI.vratiInstancu().posaljiZahtev(zahtev);
            ServerTransferObjekat odgovor = KontrolerKI.vratiInstancu().procitajOdgovor();

            if (odgovor.getSignal() == -1) {
                throw new Exception(odgovor.getPoruka());
            }
            Repozitorijum.noviRadnik = (Radnik) odgovor.getObjekatIzvrsenjaOperacije();

            prikaziUnosRadnika();

        } catch (IOException eio) {
            prikaziFormuPrijava();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemUnosRadnikaActionPerformed

    private void jMenuItemIzmenaRadnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIzmenaRadnikaActionPerformed
        // TODO add your handling code here:
        if (JPanelUnosRadnika.nitProvereUnosRadnika != null) {
            JPanelUnosRadnika.nitProvereUnosRadnika.interrupt();
        }
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanel jPanel = null;
        jPanel = new JPanelIzmenaRadnika();
        JScrollPane jScroll = new JScrollPane(jPanel);
        fGlavna.add(jScroll, BorderLayout.CENTER);
        fGlavna.pack();
        fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);


    }//GEN-LAST:event_jMenuItemIzmenaRadnikaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemGenerisiListu;
    private javax.swing.JMenuItem jMenuItemIzmenaRadnika;
    private javax.swing.JMenuItem jMenuItemIzmenaUtakmice;
    private javax.swing.JMenuItem jMenuItemKreirajTiket;
    private javax.swing.JMenuItem jMenuItemPregledStanja;
    private javax.swing.JMenuItem jMenuItemPretraziTiket;
    private javax.swing.JMenuItem jMenuItemUnosRadnika;
    private javax.swing.JMenuItem jMenuItemUnosRezultata;
    private javax.swing.JMenuItem jMenuItemUnosUtakmice;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenu jMenuStanje;
    private javax.swing.JMenu jMenuTiket;
    private javax.swing.JMenu jMenuUtakmice;
    // End of variables declaration//GEN-END:variables

    private void prikaziKreirajTiket() throws ClassNotFoundException, IOException {
        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanel jPanel = null;
        jPanel = new JPanelKreirajTiket();
        JScrollPane jScroll = new JScrollPane(jPanel);
        fGlavna.add(jScroll, BorderLayout.CENTER);
        fGlavna.pack();
        fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);
    }

    private void prikaziFormuPrijava() {
        JOptionPane.showMessageDialog(this, "Izgubili ste konekciju sa serverom! Probajte ponovo da se ulogujete!");
        FPrijava fp = new FPrijava();
        fp.setLocationRelativeTo(null);
        fp.setResizable(false);
        fp.setVisible(true);
    }

    private void pripremiFormu() {
        if (repozitorijum.Repozitorijum.ulogovaniRadnik.getStatus().equals("radnik")) {

            jMenuAdmin.setVisible(false);
            jMenuAdmin.setEnabled(false);
        }
    }

    private void prikaziUnosRadnika() {

        JFrame fGlavna = this;
        int stanje = fGlavna.getExtendedState();
        fGlavna.getContentPane().removeAll();
        JPanel jPanel = null;
        jPanel = new JPanelUnosRadnika();
        JScrollPane jScroll = new JScrollPane(jPanel);
        fGlavna.add(jScroll, BorderLayout.CENTER);
        fGlavna.pack();
        fGlavna.setExtendedState(stanje | JFrame.MAXIMIZED_BOTH);
    }
}