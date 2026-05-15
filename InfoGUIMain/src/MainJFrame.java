import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MainJFrame extends javax.swing.JFrame {

   
    public MainJFrame() {
       this.setUndecorated(true); //removes the default decorations from the window 
       initComponents();
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //access the computer screen information
        
       //adjusts the screen size based on the sreen/monitor size
       int screenHeight = screenSize.height;
       int frameWidth = this.getWidth();
       int frameHeight = (int) (screenHeight * 0.95);
        
       //sets the size of the frame/screen
       this.setSize(frameWidth, frameHeight);
       setLocationRelativeTo(null);
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
        MuntiLogo = new javax.swing.JLabel();
        CDMLogo = new javax.swing.JLabel();
        addressLbl14 = new javax.swing.JLabel();
        exitBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        addressLbl12 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        addressLbl20 = new javax.swing.JLabel();
        addressLbl21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addressLbl22 = new javax.swing.JLabel();
        addressLbl23 = new javax.swing.JLabel();
        addressLbl24 = new javax.swing.JLabel();
        addressLbl25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        addressLbl28 = new javax.swing.JLabel();
        addressLbl27 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(aboutBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(coursesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(facilitiesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(aboutBttn))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(coursesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(facilitiesBttn))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(CDMLogo)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MuntiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(addressLbl14)))
                .addGap(233, 233, 233))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(CDMLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MuntiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(addressLbl14)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Post1.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");

        jPanel14.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl12.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl12.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl12.setText("<html><div style='text-align: center; line-height: 100px;'>Colegio de Muntinlupa (CDM) achieved 100% passing rate in the April 2024 Civil Engineers Licensure Examination!</div></html>");
        addressLbl12.setToolTipText("");
        addressLbl12.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addressLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addressLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl20.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl20.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl20.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl20.setText("<html><div style='text-align: center; line-height: 100px;'>For the list of examinees and room assignments for CDM Admission Test 2024 (CDMAT 2024) on April 28, 2024 (Sunday)</div></html>");
        addressLbl20.setToolTipText("");
        addressLbl20.setVerifyInputWhenFocusTarget(false);

        addressLbl21.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl21.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl21.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl21.setText("<html><div style='text-align: center; line-height: 100px;'>𝙃𝙀𝘼𝘿𝙎 𝙐𝙋, 𝙁𝙐𝙏𝙐𝙍𝙀 𝙀𝙉𝙂𝙄𝙉𝙀𝙀𝙍𝙎 𝘼𝙉𝘿 𝘼𝙍𝘾𝙃𝙄𝙏𝙀𝘾𝙏𝙎!</div></html>");
        addressLbl21.setToolTipText("");
        addressLbl21.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(addressLbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(addressLbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(addressLbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(addressLbl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Post2.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Post3.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");

        jPanel17.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl28.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl28.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl28.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl28.setText("<html><div style='text-align: center; line-height: 100px;'>𝗖𝗼𝗻𝗴𝗿𝗮𝘁𝘂𝗹𝗮𝘁𝗶𝗼𝗻𝘀 𝘁𝗼 𝘁𝗵𝗲 𝗡𝗲𝘄𝗹𝘆-𝗟𝗶𝗰𝗲𝗻𝘀𝗲𝗱 𝗘𝗹𝗲𝗰𝘁𝗿𝗼𝗻𝗶𝗰𝘀 𝗘𝗻𝗴𝗶𝗻𝗲𝗲𝗿𝘀 𝗮𝗻𝗱 𝗘𝗹𝗲𝗰𝘁𝗿𝗼𝗻𝗶𝗰𝘀 𝗧𝗲𝗰𝗵𝗻𝗶𝗰𝗶𝗮𝗻𝘀 𝗳𝗿𝗼𝗺 𝗖𝗼𝗹𝗲𝗴𝗶𝗼 𝗱𝗲 𝗠𝘂𝗻𝘁𝗶𝗻𝗹𝘂𝗽𝗮 (𝗖𝗗𝗠)!</div></html>");
        addressLbl28.setToolTipText("");
        addressLbl28.setVerifyInputWhenFocusTarget(false);

        addressLbl27.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl27.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl27.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl27.setText("<html><div style='text-align: center; line-height: 100px;'>Back to back ang achievements ng Colegio de Muntinlupa na talaga namang nakakaproud! 100% ang passing rate ng CDM sa recently held licensure exam for Electronics Technicians, at 85.71% naman para sa Electronics Engineers.</div></html>");
        addressLbl27.setToolTipText("");
        addressLbl27.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addressLbl27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(addressLbl28, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(addressLbl28, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLbl27, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facilitiesBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilitiesBttnActionPerformed
        FacilitiesPage facilitiesPage = new FacilitiesPage();
        dispose();
        facilitiesPage.setVisible(true);
        facilitiesPage.setLocationRelativeTo(null);
        facilitiesPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CDMLogo;
    private javax.swing.JLabel MuntiLogo;
    private javax.swing.JButton aboutBttn;
    private javax.swing.JLabel addressLbl12;
    private javax.swing.JLabel addressLbl14;
    private javax.swing.JLabel addressLbl20;
    private javax.swing.JLabel addressLbl21;
    private javax.swing.JLabel addressLbl22;
    private javax.swing.JLabel addressLbl23;
    private javax.swing.JLabel addressLbl24;
    private javax.swing.JLabel addressLbl25;
    private javax.swing.JLabel addressLbl27;
    private javax.swing.JLabel addressLbl28;
    private javax.swing.JButton coursesBttn;
    private javax.swing.JButton exitBttn;
    private javax.swing.JButton facilitiesBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
