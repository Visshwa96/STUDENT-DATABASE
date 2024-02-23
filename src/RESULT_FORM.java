
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Date; 
import java.time.LocalTime;
import java.util.TimeZone;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableRowSorter;
public class RESULT_FORM extends javax.swing.JFrame {

    /**
     * Creates new form RESULT_FORM
     */
    String path = "";
    String st_studentid;
    Connection con;
    PreparedStatement insert;
     String date;
    ResultSet rs;
    String st_fname;
        String st_lname;
        String st_course;
        String st_contact;
        String st_gender;
        String st_address;
        String sub_name1;
        String sub_name2;
        String sub_name3;
        String sub_name4;
        String sub_name5;
        String sub_name6;
        String sub_name7;
        String sub_name8;
        String sub_name9;
        int sub_mark1;
        int sub_mark2;
        int sub_mark3;
        int sub_mark4;
        int sub_mark5;
        int sub_mark6;
        int sub_mark7;
        int sub_mark8;
        int sub_mark9;

        String st_grade = "";
        int sub_total = 0;
        int sub_average = 0;
    DefaultTableModel RecordTable;
    public RESULT_FORM() {
        initComponents();
        
        table_data();
         try{
            String url = "jdbc:mysql://localhost:3306/student_app";
            String username = "root";
            String password = "";
             con = DriverManager.getConnection(url,username,password);
         }
         catch(Exception e){
             System.out.println(e);
         }
         /*
         long millis=System.currentTimeMillis();  
         long time = System.currentTimeMillis();
          java.sql.Date date1 = new java.sql.Date(millis);    
          java.sql.Time time1 = new java.sql.Time(time);
         */
       date = date_time();
            table_data();
    }
    private String date_time(){
        String datetime;
          SimpleDateFormat formatDate = new SimpleDateFormat(
            "dd/MM/yyyy  HH:mm:ss");
        Date current_date = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        datetime = String.valueOf(formatDate.format(current_date));
        date_time.setText(String.valueOf( datetime));
        return datetime;
    }
    private void table_data(){
        try{
            int c;
       
        
        
        insert = con.prepareStatement("select * from student_info");
         rs =insert.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        c = rss.getColumnCount();
        
         RecordTable = (DefaultTableModel)jTable1.getModel();
        RecordTable.setRowCount(0);
        while(rs.next()){
            Vector ColumnData = new Vector();
            for(int i = 1; i<=c; i++){
            ColumnData.add(rs.getInt("id"));
            ColumnData.add(rs.getString("date"));
            ColumnData.add(rs.getString("st_studentid"));
            ColumnData.add(rs.getString("st_fname"));
            ColumnData.add(rs.getString("st_lname"));   
            ColumnData.add(rs.getString("st_course"));
            ColumnData.add(rs.getString("st_gender"));
            ColumnData.add(rs.getString("st_contact")); 
            ColumnData.add(rs.getString("st_address"));
            ColumnData.add(rs.getString("sub_name1"));
            ColumnData.add(rs.getInt("sub_mark1"));
            ColumnData.add(rs.getString("sub_name2"));
            ColumnData.add(rs.getInt("sub_mark2"));
            ColumnData.add(rs.getString("sub_name3"));
            ColumnData.add(rs.getInt("sub_mark3"));
            ColumnData.add(rs.getString("sub_name4"));
            ColumnData.add(rs.getInt("sub_mark4"));
            ColumnData.add(rs.getString("sub_name5"));
            ColumnData.add(rs.getInt("sub_mark5"));
            ColumnData.add(rs.getString("sub_name6"));
            ColumnData.add(rs.getInt("sub_mark6"));
            ColumnData.add(rs.getString("sub_name7"));
            ColumnData.add(rs.getInt("sub_mark7"));
            ColumnData.add(rs.getString("sub_name8"));
            ColumnData.add(rs.getInt("sub_mark8"));
            ColumnData.add(rs.getString("sub_name9"));
            ColumnData.add(rs.getInt("sub_mark9"));
            ColumnData.add(rs.getInt("sub_total"));
            ColumnData.add(rs.getString("sub_average"));
            ColumnData.add(rs.getString("st_grade"));
            ColumnData.add(rs.getString("st_photo"));
            }
            RecordTable.addRow(ColumnData); 
               
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        S_STUDENTID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        S_ADDRESS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        S_PANE = new javax.swing.JPanel();
        S_PHOTO = new javax.swing.JLabel();
        browse_but = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        S_FNAME = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        S_PHONE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        S_COURSE = new javax.swing.JComboBox<>();
        S_LNAME = new javax.swing.JTextField();
        S_SUB1 = new javax.swing.JComboBox<>();
        S_SUB2 = new javax.swing.JComboBox<>();
        S_SUB3 = new javax.swing.JComboBox<>();
        S_SUB4 = new javax.swing.JComboBox<>();
        S_SUB5 = new javax.swing.JComboBox<>();
        S_SUB6 = new javax.swing.JComboBox<>();
        S_SUB7 = new javax.swing.JComboBox<>();
        S_SUB8 = new javax.swing.JComboBox<>();
        S_SUB9 = new javax.swing.JComboBox<>();
        S_SUB10 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        UPDATE = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        S_MARK1 = new javax.swing.JTextField();
        S_MARK4 = new javax.swing.JTextField();
        S_MARK7 = new javax.swing.JTextField();
        S_MARK9 = new javax.swing.JTextField();
        S_MARK2 = new javax.swing.JTextField();
        S_MARK5 = new javax.swing.JTextField();
        S_MARK8 = new javax.swing.JTextField();
        S_MARK3 = new javax.swing.JTextField();
        S_MARK6 = new javax.swing.JTextField();
        S_MARK10 = new javax.swing.JTextField();
        date_time = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        S_TOTAL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        S_AVG = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        S_GRADE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("First Name:");

        S_STUDENTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_STUDENTIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("STUDENT ID:");

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Date:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "male", "female", "trans-gender","non-binary" }));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Last Name:");

        S_PANE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        S_PANE.setForeground(new java.awt.Color(255, 204, 0));
        S_PANE.setMaximumSize(new java.awt.Dimension(50, 50));

        S_PHOTO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        S_PHOTO.setForeground(new java.awt.Color(204, 204, 204));
        S_PHOTO.setText("PHOTO");
        S_PHOTO.setPreferredSize(new java.awt.Dimension(72, 77));

        javax.swing.GroupLayout S_PANELayout = new javax.swing.GroupLayout(S_PANE);
        S_PANE.setLayout(S_PANELayout);
        S_PANELayout.setHorizontalGroup(
            S_PANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_PANELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(S_PHOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        S_PANELayout.setVerticalGroup(
            S_PANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_PANELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(S_PHOTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        browse_but.setText("Browse");
        browse_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_butActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));

        S_FNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_FNAMEActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Course:");

        S_PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_PHONEActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Contact No:");

        S_COURSE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","CSC", "EEE", "ECE", "MECH","AI & DS"}));

        S_LNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_LNAMEActionPerformed(evt);
            }
        });

        S_SUB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "XXX", "YYY", "ZZZ" }));

        S_SUB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        S_SUB10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Item 2", "Item 3", "Item 4" }));

        jSeparator3.setForeground(new java.awt.Color(153, 255, 102));

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Student_ID", "fname", "lname", "course", "gender", "contact", "address", "SUB-1", "SUB-M1", "SUB-2", "SUB-M2", "SUB-3", "SUB-M3", "SUB-4", "SUB-M4", "SUB-5", "SUB-M5", "SUB-6", "SUB-M6", "SUB-7", "SUB-M7", "SUB-8", "SUB-M8", "SUB-9", "SUB-M9", "TOTAL", "AVG", "GRADE", "PHOTO URL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        S_MARK7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MARK7ActionPerformed(evt);
            }
        });

        S_MARK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MARK2ActionPerformed(evt);
            }
        });

        S_MARK5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MARK5ActionPerformed(evt);
            }
        });

        S_MARK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MARK3ActionPerformed(evt);
            }
        });

        S_MARK10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MARK10ActionPerformed(evt);
            }
        });

        date_time.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        date_time.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL:");

        S_TOTAL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("AVERAGE:");

        S_AVG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("GRADE:");

        S_GRADE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButton1.setText("PRINT");

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("SEARCH:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UPDATE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(S_TOTAL)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(S_AVG)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(S_GRADE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S_SUB1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(S_MARK1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(S_SUB5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S_SUB9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(S_MARK3)
                                    .addComponent(S_MARK2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S_SUB10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(S_MARK6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S_SUB2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(S_MARK4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S_SUB6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(S_MARK5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S_SUB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_SUB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S_MARK7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_MARK8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S_SUB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_SUB8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(S_MARK9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S_MARK10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S_ADDRESS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_time))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(S_STUDENTID)
                                    .addComponent(S_COURSE, 0, 268, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gender, 0, 283, Short.MAX_VALUE)
                                    .addComponent(S_FNAME))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(S_LNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browse_but)
                            .addComponent(S_PANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(date_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(S_STUDENTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(S_FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_LNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(S_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(S_COURSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(S_PANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(S_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(browse_but))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S_MARK7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(S_SUB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_SUB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_SUB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_SUB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(S_SUB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_SUB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_SUB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(S_SUB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_MARK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_SUB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_MARK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_MARK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_SUB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADD)
                            .addComponent(UPDATE)
                            .addComponent(jButton4)
                            .addComponent(clear)
                            .addComponent(exit)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(S_TOTAL)
                            .addComponent(jLabel6)
                            .addComponent(S_AVG)
                            .addComponent(jLabel13)
                            .addComponent(S_GRADE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void S_MARK10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MARK10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_MARK10ActionPerformed

    private void S_MARK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MARK3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_MARK3ActionPerformed

    private void S_MARK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MARK5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_MARK5ActionPerformed

    private void S_MARK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MARK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_MARK2ActionPerformed

    private void S_MARK7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MARK7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_MARK7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int no_row = jTable1.getSelectedRow();

        S_FNAME.setText(RecordTable.getValueAt(no_row,0).toString());

        S_FNAME.setText(RecordTable.getValueAt(no_row, 3).toString());
        S_LNAME.setText(RecordTable.getValueAt(no_row, 4).toString());
        S_COURSE.setSelectedItem(RecordTable.getValueAt(no_row, 5).toString());
        gender.setSelectedItem(RecordTable.getValueAt(no_row, 6).toString());
        S_PHONE.setText(RecordTable.getValueAt(no_row, 7).toString());
        S_ADDRESS.setText(RecordTable.getValueAt(no_row, 8).toString());
        S_SUB1.setSelectedItem(RecordTable.getValueAt(no_row, 9).toString());
        S_MARK1.setText(RecordTable.getValueAt(no_row, 10).toString());
        S_SUB2.setSelectedItem(RecordTable.getValueAt(no_row, 11).toString());
        S_MARK2.setText(RecordTable.getValueAt(no_row, 12).toString());
        S_SUB3.setSelectedItem(RecordTable.getValueAt(no_row, 13).toString());
        S_MARK3.setText(RecordTable.getValueAt(no_row, 14).toString());
        S_SUB4.setSelectedItem(RecordTable.getValueAt(no_row, 15).toString());
        S_MARK4.setText(RecordTable.getValueAt(no_row, 16).toString());
        S_SUB5.setSelectedItem(RecordTable.getValueAt(no_row, 17).toString());
        S_MARK5.setText(RecordTable.getValueAt(no_row, 18).toString());
        S_SUB6.setSelectedItem(RecordTable.getValueAt(no_row, 19).toString());
        S_MARK6.setText(RecordTable.getValueAt(no_row, 20).toString());
        S_SUB7.setSelectedItem(RecordTable.getValueAt(no_row, 21).toString());
        S_MARK7.setText(RecordTable.getValueAt(no_row, 22).toString());
        S_SUB8.setSelectedItem(RecordTable.getValueAt(no_row, 23).toString());
        S_MARK8.setText(RecordTable.getValueAt(no_row, 24).toString());
        S_SUB9.setSelectedItem(RecordTable.getValueAt(no_row, 25).toString());
        S_MARK9.setText(RecordTable.getValueAt(no_row, 26).toString());       
        S_TOTAL.setText(RecordTable.getValueAt(no_row,27).toString());
        S_AVG.setText(RecordTable.getValueAt(no_row,28).toString());
        S_GRADE.setText(RecordTable.getValueAt(no_row,29).toString());

        //S_PANE.setSize();

        int column = 30;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();
        ImageIcon imageIcon = new ImageIcon(value); // assign image to a new ImageIcon
        Image originalImage = imageIcon.getImage(); // transform it
        Image scaledImage = originalImage.getScaledInstance(S_PANE.getWidth(),S_PANE.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(scaledImage);  // assign to a new ImageIcon instance
        S_PHOTO.setIcon(newImageIcon);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int[] rows = jTable1.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            if(rows[i] !=-1){
                RecordTable.removeRow(rows[i]-i);   
                JOptionPane.showMessageDialog(null, "Selected rows has been deleted","Rows Deleted",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Unable to delete","Failed to Delete",JOptionPane.INFORMATION_MESSAGE);
            }
            
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
      
        jPanel1.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Register/Update", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.CENTER, new Font("SansSerif", Font.PLAIN, 24), Color.BLUE));
        String date1 = date_time();
        st_studentid = S_STUDENTID.getText();
        st_fname = S_FNAME.getText();
        st_lname = S_LNAME.getText();
        st_course = String.valueOf(S_COURSE.getSelectedItem());
        st_contact = S_PHONE.getText();
        st_gender = String.valueOf(gender.getSelectedItem());
       st_address = S_ADDRESS.getText();
        sub_name1 = String.valueOf(S_SUB1.getSelectedItem());
        sub_name2 = String.valueOf(S_SUB2.getSelectedItem());
        sub_name3 = String.valueOf(S_SUB3.getSelectedItem());
        sub_name4 = String.valueOf(S_SUB4.getSelectedItem());
        sub_name5 = String.valueOf(S_SUB5.getSelectedItem());
        sub_name6 = String.valueOf(S_SUB6.getSelectedItem());
        sub_name7 = String.valueOf(S_SUB7.getSelectedItem());
        sub_name8 = String.valueOf(S_SUB8.getSelectedItem());
        sub_name9 = String.valueOf(S_SUB9.getSelectedItem());
        sub_mark1 = Integer.parseInt(S_MARK1.getText());
        sub_mark2 = Integer.parseInt(S_MARK2.getText());
        sub_mark3 = Integer.parseInt(S_MARK3.getText());
        sub_mark4 = Integer.parseInt(S_MARK4.getText());
        sub_mark5 = Integer.parseInt(S_MARK5.getText());
       sub_mark6 = Integer.parseInt(S_MARK6.getText());
        sub_mark7 = Integer.parseInt(S_MARK7.getText());
        sub_mark8 = Integer.parseInt(S_MARK8.getText());
        sub_mark9 = Integer.parseInt(S_MARK3.getText());

        try{

  
            insert = con.prepareStatement("INSERT INTO student_info(date, st_studentid, st_fname, st_lname, st_course, st_gender, st_contact, st_address, sub_name1, sub_name2, sub_name3, sub_name4, sub_name5, sub_name6, sub_name7, sub_name8, sub_name9, sub_mark1, sub_mark2, sub_mark3, sub_mark4, sub_mark5, sub_mark6, sub_mark7, sub_mark8, sub_mark9, sub_total, sub_average, st_grade, st_photo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
            insert.setString(1,date1);
            insert.setString(2,st_studentid);
            insert.setString(3,st_fname);
            insert.setString(4,st_lname);
            insert.setString(5,st_course);
            insert.setString(6,st_gender);
            insert.setString(7,st_contact);
            insert.setString(8,st_address);
            insert.setString(9,sub_name1);
            insert.setString(10,sub_name2);
            insert.setString(11,sub_name3);
            insert.setString(12,sub_name4);
            insert.setString(13,sub_name5);
            insert.setString(14,sub_name6);
            insert.setString(15,sub_name7);
            insert.setString(16,sub_name8);
            insert.setString(17,sub_name9);
            insert.setInt(18,sub_mark1);
            insert.setInt(19,sub_mark2);
            insert.setInt(20,sub_mark3);
            insert.setInt(21,sub_mark4);
            insert.setInt(22,sub_mark5);
            insert.setInt(23,sub_mark6);
            insert.setInt(24,sub_mark7);
            insert.setInt(25,sub_mark8);
            insert.setInt(26,sub_mark9);
            insert.setInt(27,sub_total);
            insert.setString(28,String.valueOf(sub_average));
            insert.setString(29,st_grade);
            insert.setString(30,path);

            JOptionPane.showMessageDialog(null, "Record Added","Sucess",JOptionPane.INFORMATION_MESSAGE);
            insert.executeUpdate();
            table_data();
            S_TOTAL.setText(String.valueOf(sub_total));
            S_AVG.setText(String.valueOf(sub_average));
            S_GRADE.setText(String.valueOf(st_grade));

           
        }

        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void S_LNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_LNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_LNAMEActionPerformed

    private void S_PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_PHONEActionPerformed

    private void S_FNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_FNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_FNAMEActionPerformed

    private void browse_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_butActionPerformed
        // TODO add your handling code here:

        JFileChooser filechoose = new JFileChooser();

        int response = filechoose.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            File f1 = new File(filechoose.getSelectedFile().getAbsolutePath());
            path = String.valueOf(f1);
        }
        ImageIcon imageIcon = new ImageIcon(path); // assign image to a new ImageIcon
        Image originalImage = imageIcon.getImage(); // transform it
        Image scaledImage = originalImage.getScaledInstance(S_PANE.getWidth(),S_PANE.getHeight(),Image.SCALE_SMOOTH);
        //S_PANE.setSize();
        ImageIcon newImageIcon = new ImageIcon(scaledImage);  // assign to a new ImageIcon instance

        S_PHOTO.setIcon(newImageIcon);
    }//GEN-LAST:event_browse_butActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        S_STUDENTID.setText("");
        S_FNAME.setText("");
        S_FNAME.setText("");
        gender.setSelectedIndex(0);
        S_LNAME.setText("");
        S_COURSE.setSelectedIndex(0);
        S_PHONE.setText("");
        gender.setSelectedIndex(0);
        S_ADDRESS.setText("");
        S_SUB1.setSelectedIndex(0);
        S_SUB2.setSelectedIndex(0);
        S_SUB3.setSelectedIndex(0);
        S_SUB4.setSelectedIndex(0);
        S_SUB5.setSelectedIndex(0);
        S_SUB6.setSelectedIndex(0);
        S_SUB7.setSelectedIndex(0);
        S_SUB8.setSelectedIndex(0);
        S_SUB9.setSelectedIndex(0);
        S_SUB10.setSelectedIndex(0);
        S_MARK1.setText("");
        S_MARK2.setText("");
        S_MARK3.setText("");
        S_MARK4.setText("");
        S_MARK5.setText("");
        S_MARK6.setText("");
        S_MARK7.setText("");
        S_MARK8.setText("");
        S_MARK9.setText("");
        S_MARK10.setText("");
        S_PHOTO.setIcon(null);
        S_FNAME.requestFocus();
    }//GEN-LAST:event_clearActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
       
        String photo_path = path;
        String update = "dssd";
        st_fname = S_FNAME.getText();
        st_lname = S_LNAME.getText();
        st_course = String.valueOf(S_COURSE.getSelectedItem());
        st_contact = S_PHONE.getText();
        st_gender = String.valueOf(gender.getSelectedItem());
       st_address = S_ADDRESS.getText();
        sub_name1 = String.valueOf(S_SUB1.getSelectedItem());
        sub_name2 = String.valueOf(S_SUB2.getSelectedItem());
        sub_name3 = String.valueOf(S_SUB3.getSelectedItem());
        sub_name4 = String.valueOf(S_SUB4.getSelectedItem());
        sub_name5 = String.valueOf(S_SUB5.getSelectedItem());
        sub_name6 = String.valueOf(S_SUB6.getSelectedItem());
        sub_name7 = String.valueOf(S_SUB7.getSelectedItem());
        sub_name8 = String.valueOf(S_SUB8.getSelectedItem());
        sub_name9 = String.valueOf(S_SUB9.getSelectedItem());

        String st_rollno = "1";

        /*
        String sub1 = S_SUB1.getItemAt(0);
        String sub2 = S_SUB2.getItemAt(1);
        String sub3 = S_SUB3.getItemAt(2);
        String sub4 = S_SUB4.getItemAt(3);
        String sub5 = S_SUB5.getItemAt(4);
        String sub6 = S_SUB6.getItemAt(5);
        */
       sub_mark1 = Integer.parseInt(S_MARK1.getText());
        sub_mark2 = Integer.parseInt(S_MARK2.getText());
        sub_mark3 = Integer.parseInt(S_MARK3.getText());
        sub_mark4 = Integer.parseInt(S_MARK4.getText());
        sub_mark5 = Integer.parseInt(S_MARK5.getText());
       sub_mark6 = Integer.parseInt(S_MARK6.getText());
        sub_mark7 = Integer.parseInt(S_MARK7.getText());
        sub_mark8 = Integer.parseInt(S_MARK8.getText());
        sub_mark9 = Integer.parseInt(S_MARK3.getText());

        
        if(sub_mark1 <=100 && sub_mark2 <= 100 && sub_mark3 <= 100 && sub_mark4<=100 && sub_mark5 <=100 && sub_mark6 <= 100&& sub_mark7 <= 100&& sub_mark8 <= 100&& sub_mark9 <= 100){
            sub_total = sub_mark1 + sub_mark2 + sub_mark3 + sub_mark4 + sub_mark5 + sub_mark6 + sub_mark7 + sub_mark8 + sub_mark9;
            sub_average = sub_total / 9;
            if(sub_average > 90){
                st_grade = "0";
            }
            else if(sub_average >= 80 && sub_average <= 90){
                st_grade = "A+";
            }
            else if(sub_average >= 70 && sub_average <= 80){
                st_grade = "A";
            }
            else if(sub_average >=60 && sub_average <=70){
                st_grade = "B+";
            }
            else if(sub_average >=50 && sub_average <= 60){
                st_grade = "B";
            }
            else if(sub_average >= 40 && sub_average <= 50){
                st_grade = "D";
            }
            else{
                st_grade = "NO GRADE";
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Mark Should be below 100","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }

        try{

            PreparedStatement insert;
            insert = con.prepareStatement("INSERT INTO student_info(date, st_studentid, st_fname, st_lname, st_course, st_gender, st_contact, st_address, sub_name1, sub_name2, sub_name3, sub_name4, sub_name5, sub_name6, sub_name7, sub_name8, sub_name9, sub_mark1, sub_mark2, sub_mark3, sub_mark4, sub_mark5, sub_mark6, sub_mark7, sub_mark8, sub_mark9, sub_total, sub_average, st_grade, st_photo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            insert.setString(1,date);
            insert.setString(2,st_rollno);
            insert.setString(3,st_fname);
            insert.setString(4,st_lname);
            insert.setString(5,st_course);
            insert.setString(6,st_gender);
            insert.setString(7,st_contact);
            insert.setString(8,st_address);
            insert.setString(9,sub_name1);
            insert.setString(10,sub_name2);
            insert.setString(11,sub_name3);
            insert.setString(12,sub_name4);
            insert.setString(13,sub_name5);
            insert.setString(14,sub_name6);
            insert.setString(15,sub_name7);
            insert.setString(16,sub_name8);
            insert.setString(17,sub_name9);
            insert.setInt(18,sub_mark1);
            insert.setInt(19,sub_mark2);
            insert.setInt(20,sub_mark3);
            insert.setInt(21,sub_mark4);
            insert.setInt(22,sub_mark5);
            insert.setInt(23,sub_mark6);
            insert.setInt(24,sub_mark7);
            insert.setInt(25,sub_mark8);
            insert.setInt(26,sub_mark9);
            insert.setInt(27,sub_total);
            insert.setString(28,String.valueOf(sub_average));
            insert.setString(29,st_grade);
            insert.setString(30,path);
            
            JOptionPane.showMessageDialog(null, "Record Added","Sucess",JOptionPane.INFORMATION_MESSAGE);
            
           
            insert.executeUpdate();
            table_data();
            S_TOTAL.setText(String.valueOf(sub_total));
            S_AVG.setText(String.valueOf(sub_average));
            S_GRADE.setText(String.valueOf(st_grade));

            /*
            while(rs.next()){
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +rs.getString(3));
            }
            */
        }

        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void S_STUDENTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_STUDENTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_STUDENTIDActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(RecordTable);
          jTable1.setRowSorter(obj);
          obj.setRowFilter(RowFilter.regexFilter(Search.getText()));
                
                
                
// TODO add your handling code here:
    }//GEN-LAST:event_SearchKeyReleased
    public void getdatetime(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<=editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(RESULT_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESULT_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESULT_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESULT_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //<=/editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESULT_FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTextField S_ADDRESS;
    private javax.swing.JLabel S_AVG;
    private javax.swing.JComboBox<String> S_COURSE;
    private javax.swing.JTextField S_FNAME;
    private javax.swing.JLabel S_GRADE;
    private javax.swing.JTextField S_LNAME;
    private javax.swing.JTextField S_MARK1;
    private javax.swing.JTextField S_MARK10;
    private javax.swing.JTextField S_MARK2;
    private javax.swing.JTextField S_MARK3;
    private javax.swing.JTextField S_MARK4;
    private javax.swing.JTextField S_MARK5;
    private javax.swing.JTextField S_MARK6;
    private javax.swing.JTextField S_MARK7;
    private javax.swing.JTextField S_MARK8;
    private javax.swing.JTextField S_MARK9;
    private javax.swing.JPanel S_PANE;
    private javax.swing.JTextField S_PHONE;
    private javax.swing.JLabel S_PHOTO;
    private javax.swing.JTextField S_STUDENTID;
    private javax.swing.JComboBox<String> S_SUB1;
    private javax.swing.JComboBox<String> S_SUB10;
    private javax.swing.JComboBox<String> S_SUB2;
    private javax.swing.JComboBox<String> S_SUB3;
    private javax.swing.JComboBox<String> S_SUB4;
    private javax.swing.JComboBox<String> S_SUB5;
    private javax.swing.JComboBox<String> S_SUB6;
    private javax.swing.JComboBox<String> S_SUB7;
    private javax.swing.JComboBox<String> S_SUB8;
    private javax.swing.JComboBox<String> S_SUB9;
    private javax.swing.JLabel S_TOTAL;
    private javax.swing.JTextField Search;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton browse_but;
    private javax.swing.JButton clear;
    private javax.swing.JLabel date_time;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

