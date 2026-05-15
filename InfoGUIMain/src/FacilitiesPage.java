import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FacilitiesPage extends javax.swing.JFrame {
    public FacilitiesPage() {
        this.setUndecorated(true); //removes the default decorations from the window 
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //access the computer screen information
        
        //adjusts the screen size based on the sreen/monitor size
        int screenHeight = screenSize.height;
        int frameWidth = this.getWidth();
        int frameHeight = (int) (screenHeight * 0.95);
        
        //sets the size of the frame/screen
        this.setSize(frameWidth, frameHeight);
        setLocationRelativeTo(null); //Sets the location of the GUI to center
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        facilitiesBttn = new javax.swing.JButton();
        coursesBttn = new javax.swing.JButton();
        aboutBttn = new javax.swing.JButton();
        homeBttn = new javax.swing.JButton();
        MuntiLogo = new javax.swing.JLabel();
        CDMLogo = new javax.swing.JLabel();
        addressLbl14 = new javax.swing.JLabel();
        exitBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        addressLbl26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addressLbl22 = new javax.swing.JLabel();
        addressLbl23 = new javax.swing.JLabel();
        addressLbl24 = new javax.swing.JLabel();
        addressLbl25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        addressLbl29 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        addressLbl30 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        addressLbl31 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        addressLbl32 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        addressLbl33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COLEGIO DE MUNTINLUPA");
        jLabel1.setToolTipText("");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(255, 188, 29));

        facilitiesBttn.setBackground(new java.awt.Color(255, 188, 29));
        facilitiesBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        facilitiesBttn.setText("FACILITIES");
        facilitiesBttn.setBorder(null);
        facilitiesBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilitiesBttnActionPerformed(evt);
            }
        });

        coursesBttn.setBackground(new java.awt.Color(255, 188, 29));
        coursesBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        coursesBttn.setText("COURSES");
        coursesBttn.setBorder(null);
        coursesBttn.setMaximumSize(new java.awt.Dimension(76, 24));
        coursesBttn.setMinimumSize(new java.awt.Dimension(76, 24));
        coursesBttn.setPreferredSize(new java.awt.Dimension(76, 24));
        coursesBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesBttnActionPerformed(evt);
            }
        });

        aboutBttn.setBackground(new java.awt.Color(255, 188, 29));
        aboutBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        aboutBttn.setText("ABOUT US");
        aboutBttn.setBorder(null);
        aboutBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBttnActionPerformed(evt);
            }
        });

        homeBttn.setBackground(new java.awt.Color(255, 188, 29));
        homeBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        homeBttn.setText("HOME PAGE");
        homeBttn.setBorder(null);
        homeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBttn)
                .addGap(75, 75, 75)
                .addComponent(aboutBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(coursesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(facilitiesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBttn)
                    .addComponent(facilitiesBttn)
                    .addComponent(homeBttn)))
        );

        MuntiLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Munti.png"))); // NOI18N
        MuntiLogo.setText("jLabel2");

        CDMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CDM.png"))); // NOI18N

        addressLbl14.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl14.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
        addressLbl14.setForeground(new java.awt.Color(255, 255, 255));
        addressLbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl14.setText("THE HOME OF FUTURE ENGINEERS AND ARCHITECTS ");
        addressLbl14.setToolTipText("");
        addressLbl14.setVerifyInputWhenFocusTarget(false);

        exitBttn.setBackground(new java.awt.Color(255, 0, 0));
        exitBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exitBttn.setText("X");
        exitBttn.setBorder(null);
        exitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addressLbl14)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CDMLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(MuntiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CDMLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MuntiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLbl14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Comlab.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");

        jPanel14.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl26.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl26.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl26.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl26.setText("<html><div style='text-align: center; line-height: 100px;'>COMPUTER LABORATORY</div></html>");
        addressLbl26.setToolTipText("");
        addressLbl26.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(addressLbl26, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(addressLbl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        addressLbl22.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl22.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl22.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl22.setText("COLEGIO DE MUNTINLUPA");
        addressLbl22.setToolTipText("");
        addressLbl22.setVerifyInputWhenFocusTarget(false);

        addressLbl23.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl23.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
        addressLbl23.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl23.setText("THE HOME OF FUTURE ENGINEERS AND ARCHITECTS ");
        addressLbl23.setToolTipText("");
        addressLbl23.setVerifyInputWhenFocusTarget(false);

        addressLbl24.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl24.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        addressLbl24.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl24.setText("Mayor J.Posadas Ave, Sucat, Muntinlupa, 1770 Metro Manila");
        addressLbl24.setToolTipText("");
        addressLbl24.setVerifyInputWhenFocusTarget(false);

        addressLbl25.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl25.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        addressLbl25.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl25.setText("(02) 8424 8780");
        addressLbl25.setToolTipText("");
        addressLbl25.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(addressLbl22)
                            .addGap(66, 66, 66))
                        .addComponent(addressLbl24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressLbl23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(addressLbl25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addressLbl22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLbl23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLbl24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLbl25)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl29.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl29.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl29.setText("<html><div style='text-align: center; line-height: 100px;'>CHEMISTRY LABORATORY</div></html>");
        addressLbl29.setToolTipText("");
        addressLbl29.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(addressLbl29, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(addressLbl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chemlab.jpg"))); // NOI18N
        jLabel6.setText("jLabel2");

        jPanel16.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl30.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl30.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl30.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl30.setText("<html><div style='text-align: center; line-height: 100px;'>PHYSICS LABORATORY</div></html>");
        addressLbl30.setToolTipText("");
        addressLbl30.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(addressLbl30, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(addressLbl30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Physics lab.jpg"))); // NOI18N
        jLabel7.setText("jLabel2");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CElab.png"))); // NOI18N
        jLabel8.setText("jLabel2");

        jPanel18.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl31.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl31.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl31.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl31.setText("<html><div style='text-align: center; line-height: 100px;'>CIVIL ENGINEERING LABORATORY</div></html>");
        addressLbl31.setToolTipText("");
        addressLbl31.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(addressLbl31, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(addressLbl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ME.jpg"))); // NOI18N
        jLabel9.setText("jLabel2");

        jPanel19.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl32.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl32.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl32.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl32.setText("<html><div style='text-align: center; line-height: 100px;'>MECHANICAL ENGINEERING LABORATORY</div></html>");
        addressLbl32.setToolTipText("");
        addressLbl32.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(addressLbl32, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(addressLbl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Archi.jpg"))); // NOI18N
        jLabel10.setText("jLabel2");

        jPanel20.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl33.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl33.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl33.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl33.setText("<html><div style='text-align: center; line-height: 100px;'>ARCHITECTURE STUDIO</div></html>");
        addressLbl33.setToolTipText("");
        addressLbl33.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(addressLbl33, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addressLbl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facilitiesBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilitiesBttnActionPerformed
        FacilitiesPage facilitiesPage = new FacilitiesPage();
        JOptionPane.showMessageDialog(facilitiesPage, "This page is already opened!", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_facilitiesBttnActionPerformed

    private void coursesBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesBttnActionPerformed
        CoursesFrame coursesFrame = new CoursesFrame();
        dispose();
        coursesFrame.setVisible(true);
        coursesFrame.setLocationRelativeTo(null);
        coursesFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_coursesBttnActionPerformed

    private void aboutBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBttnActionPerformed
        AboutPage aboutPage = new AboutPage();
        dispose();
        aboutPage.setVisible(true);
        aboutPage.setLocationRelativeTo(null);
        aboutPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }//GEN-LAST:event_aboutBttnActionPerformed

    private void homeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBttnActionPerformed
        MainJFrame mainFrame = new MainJFrame();
        dispose();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_homeBttnActionPerformed

    private void exitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBttnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBttnActionPerformed

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
            java.util.logging.Logger.getLogger(FacilitiesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacilitiesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacilitiesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacilitiesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacilitiesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CDMLogo;
    private javax.swing.JLabel MuntiLogo;
    private javax.swing.JButton aboutBttn;
    private javax.swing.JLabel addressLbl14;
    private javax.swing.JLabel addressLbl22;
    private javax.swing.JLabel addressLbl23;
    private javax.swing.JLabel addressLbl24;
    private javax.swing.JLabel addressLbl25;
    private javax.swing.JLabel addressLbl26;
    private javax.swing.JLabel addressLbl29;
    private javax.swing.JLabel addressLbl30;
    private javax.swing.JLabel addressLbl31;
    private javax.swing.JLabel addressLbl32;
    private javax.swing.JLabel addressLbl33;
    private javax.swing.JButton coursesBttn;
    private javax.swing.JButton exitBttn;
    private javax.swing.JButton facilitiesBttn;
    private javax.swing.JButton homeBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
