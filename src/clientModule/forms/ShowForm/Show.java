/*
 * Created by JFormDesigner on Sun May 02 21:35:52 MSK 2021
 */

package clientModule.forms.ShowForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

import clientModule.App;
import clientModule.Client;
import common.data.SpaceMarine;
import common.utility.Request;
import common.utility.Response;
import common.utility.User;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Show extends JPanel {
    public Show(Client client) {
        initComponents();
        this.client = client;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.mainFrame.setContentPane(App.mainMenu.getMainMenuPanel());
                App.mainFrame.validate();
            }
        });
    }

    public void drawTable() {
        try {
            this.client.send(new Request("show", "", this.client.getUser()));
            Response fromServer = this.client.receive();
            TreeMap<Integer, SpaceMarine> collection = fromServer.getCollection();
            DefaultTableModel model = (DefaultTableModel) this.table.getModel();
            while (model.getRowCount() > 0) model.removeRow(0);
            for (Map.Entry<Integer, SpaceMarine> e : collection.entrySet()) {
                Date in = new Date();
                LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
                Date outDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
                model.addRow(new Object[]{
                        e.getValue().getId(),
                        e.getKey(),
                        e.getValue().getName(),
                        e.getValue().getCoordinates().getX(),
                        e.getValue().getCoordinates().getY(),
                        outDate,
                        e.getValue().getHealth(),
                        e.getValue().getHeartCount(),
                        e.getValue().getAchievements(),
                        e.getValue().getWeaponType().toString(),
                        e.getValue().getChapter().getName(),
                        e.getValue().getChapter().getParentLegion(),
                        e.getValue().getOwner().getLogin()
                });
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setUser(User user) {
        this.client.setUser(user);
        this.currentUser.setText(user.getLogin());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        showPanel = new JPanel();
        currentUser = new JLabel();
        backButton = new JButton();
        name = new JLabel();
        filterButton = new JButton();
        resetButton = new JButton();
        scrollPane = new JScrollPane();
        table = new JTable();

        //======== showPanel ========
        {
            showPanel.setBackground(new Color(225, 183, 144));
            showPanel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
            .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax
            . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,
            12 ) ,java . awt. Color .red ) ,showPanel. getBorder () ) ); showPanel. addPropertyChangeListener( new java. beans
            .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e.
            getPropertyName () ) )throw new RuntimeException( ) ;} } );
            showPanel.setLayout(new MigLayout(
                "insets 0,hidemode 3",
                // columns
                "[70,grow,fill]" +
                "[70,grow,fill]" +
                "[grow,fill]" +
                "[70,grow,fill]" +
                "[70,grow,fill]",
                // rows
                "[80,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[35,fill]" +
                "[35,grow,fill]" +
                "[35,grow,fill]" +
                "[50,grow,fill]"));

            //---- currentUser ----
            currentUser.setText("test");
            currentUser.setHorizontalAlignment(SwingConstants.CENTER);
            currentUser.setFont(new Font("Arial", Font.BOLD, 14));
            currentUser.setForeground(new Color(40, 61, 82));
            showPanel.add(currentUser, "cell 0 0");

            //---- backButton ----
            backButton.setText("\u041d\u0430\u0437\u0430\u0434");
            backButton.setBackground(new Color(40, 61, 82));
            backButton.setFont(new Font("Arial", Font.BOLD, 12));
            backButton.setForeground(Color.white);
            backButton.setBorder(new EtchedBorder());
            showPanel.add(backButton, "cell 1 0,align center center,grow 0 0,width 70:70:100");

            //---- name ----
            name.setText("SpaceMarine");
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Arial Black", Font.BOLD, 36));
            name.setBackground(new Color(255, 102, 102));
            name.setForeground(new Color(40, 61, 82));
            showPanel.add(name, "cell 2 0,align center center,grow 0 0");

            //---- filterButton ----
            filterButton.setText("\u0424\u0438\u043b\u044c\u0442\u0440");
            filterButton.setForeground(Color.white);
            filterButton.setBackground(new Color(40, 61, 82));
            filterButton.setFont(new Font("Arial", Font.BOLD, 12));
            filterButton.setBorder(new EtchedBorder());
            showPanel.add(filterButton, "cell 3 0,align center center,grow 0 0,width 60:70:100");

            //---- resetButton ----
            resetButton.setText("\u0421\u0431\u0440\u043e\u0441");
            resetButton.setForeground(Color.white);
            resetButton.setBackground(new Color(40, 61, 82));
            resetButton.setFont(new Font("Arial", Font.BOLD, 12));
            resetButton.setBorder(new EtchedBorder());
            showPanel.add(resetButton, "cell 4 0,align center center,grow 0 0,width 70:70:100");

            //======== scrollPane ========
            {

                //---- table ----
                table.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "id", "key", "name", "x", "y", "date", "health", "heart", "achieve", "weaponType", "chapterName", "chapterLegion", "user"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Integer.class, Integer.class, String.class, Double.class, Float.class, Date.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                table.setFont(new Font("Arial", Font.PLAIN, 12));
                scrollPane.setViewportView(table);
            }
            showPanel.add(scrollPane, "cell 0 1 5 8");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel showPanel;
    private JLabel currentUser;
    private JButton backButton;
    private JLabel name;
    private JButton filterButton;
    private JButton resetButton;
    private JScrollPane scrollPane;
    private JTable table;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;

    public JPanel getShowPanel() {
        return showPanel;
    }
}
