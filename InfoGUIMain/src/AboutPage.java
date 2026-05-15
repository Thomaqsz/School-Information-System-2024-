import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;

public class AboutPage extends javax.swing.JFrame {
    public AboutPage() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        addressLbl11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addressLbl13 = new javax.swing.JLabel();
        addressLbl14 = new javax.swing.JLabel();
        addressLbl15 = new javax.swing.JLabel();
        addressLbl16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        addressLbl18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        addressLbl19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MuntiLogo = new javax.swing.JLabel();
        CDMLogo = new javax.swing.JLabel();
        addressLbl17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        facilitiesBttn = new javax.swing.JButton();
        courseBttn = new javax.swing.JButton();
        aboutBttn = new javax.swing.JButton();
        homeBttn = new javax.swing.JButton();
        exitBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><div style='text-align: center; line-height: 100px;'>CDM is a local government school and CHED-recognized FREE higher education institution in Muntinlupa.</div></html>");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><div style='text-align: center; line-height: 100px;'>THE COLLEGE SHALL:</div></html>");

        jPanel13.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl11.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl11.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl11.setText("COLEGIO DE MUNTINLUPA MiSSION:");
        addressLbl11.setToolTipText("");
        addressLbl11.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addressLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addressLbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        addressLbl13.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl13.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl13.setText("COLEGIO DE MUNTINLUPA");
        addressLbl13.setToolTipText("");
        addressLbl13.setVerifyInputWhenFocusTarget(false);

        addressLbl14.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl14.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
        addressLbl14.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl14.setText("THE HOME OF FUTURE ENGINEERS AND ARCHITECTS ");
        addressLbl14.setToolTipText("");
        addressLbl14.setVerifyInputWhenFocusTarget(false);

        addressLbl15.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl15.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        addressLbl15.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl15.setText("Mayor J.Posadas Ave, Sucat, Muntinlupa, 1770 Metro Manila");
        addressLbl15.setToolTipText("");
        addressLbl15.setVerifyInputWhenFocusTarget(false);

        addressLbl16.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl16.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        addressLbl16.setForeground(new java.awt.Color(51, 51, 51));
        addressLbl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl16.setText("(02) 8424 8780");
        addressLbl16.setToolTipText("");
        addressLbl16.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(addressLbl13)
                            .addGap(66, 66, 66))
                        .addComponent(addressLbl15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressLbl14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(addressLbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addressLbl13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLbl14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLbl15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLbl16)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><div style='text-align: center; line-height: 100px;'>The Premier Local Government Institution for Engineering in the Country</div></html>");

        jPanel16.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl18.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl18.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl18.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl18.setText("COLEGIO DE MUNTINLUPA VISION:");
        addressLbl18.setToolTipText("");
        addressLbl18.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addressLbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addressLbl18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><div style='text-align: center; line-height: 100px;'>God-loving</div></html>");

        jPanel17.setBackground(new java.awt.Color(0, 11, 137));

        addressLbl19.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl19.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        addressLbl19.setForeground(new java.awt.Color(255, 255, 0));
        addressLbl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl19.setText("COLEGIO DE MUNTINLUPA CORE VALUES:");
        addressLbl19.setToolTipText("");
        addressLbl19.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addressLbl19)
                .addGap(39, 39, 39))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addressLbl19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><div style='text-align: left; line-height: 100px;'>•Provide high quality professional and technological education that meets international standard of excellence;</div></html>");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><div style='text-align: left; line-height: 100px;'>•Provide accessible and equitable opportunities for deserving and quualified Filipinos wanting to pursue higher education;</div></html>");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><div style='text-align: left; line-height: 100px;'>•Produce efficient and competent engineers who will be the drivers of the sustainable development in the country; and</div></html>");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("<html><div style='text-align: left; line-height: 100px;'>•Produce solutions to the needs of the industries and the communities.</div></html>");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html><div style='text-align: center; line-height: 100px;'>Culture of Excellence</div></html>");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><div style='text-align: center; line-height: 100px;'>Social Consciousness</div></html>");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html><div style='text-align: center; line-height: 100px;'>Integrity</div></html>");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html><div style='text-align: center; line-height: 100px;'>Teamwork</div></html>");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html><div style='text-align: center; line-height: 100px;'>Discipline</div></html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109)))
                        .addGap(77, 77, 77)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jScrollPane1.setViewportView(jPanel4);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COLEGIO DE MUNTINLUPA");
        jLabel1.setToolTipText("");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        MuntiLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Munti.png"))); // NOI18N
        MuntiLogo.setText("jLabel2");

        CDMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CDM.png"))); // NOI18N

        addressLbl17.setBackground(new java.awt.Color(0, 51, 153));
        addressLbl17.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
        addressLbl17.setForeground(new java.awt.Color(255, 255, 255));
        addressLbl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLbl17.setText("THE HOME OF FUTURE ENGINEERS AND ARCHITECTS ");
        addressLbl17.setToolTipText("");
        addressLbl17.setVerifyInputWhenFocusTarget(false);

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

        courseBttn.setBackground(new java.awt.Color(255, 188, 29));
        courseBttn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        courseBttn.setText("COURSES");
        courseBttn.setBorder(null);
        courseBttn.setMaximumSize(new java.awt.Dimension(76, 24));
        courseBttn.setMinimumSize(new java.awt.Dimension(76, 24));
        courseBttn.setPreferredSize(new java.awt.Dimension(76, 24));
        courseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBttnActionPerformed(evt);
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
                .addComponent(courseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(facilitiesBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutBttn)
                    .addComponent(facilitiesBttn)
                    .addComponent(homeBttn)))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addressLbl17)
                .addGap(281, 281, 281))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CDMLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(MuntiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
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
                .addComponent(addressLbl17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        dispose();
        facilitiesPage.setVisible(true);
        facilitiesPage.setLocationRelativeTo(null);
        facilitiesPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_facilitiesBttnActionPerformed

    private void courseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBttnActionPerformed
        CoursesFrame coursesFrame = new CoursesFrame();
        dispose();
        coursesFrame.setVisible(true);
        coursesFrame.setLocationRelativeTo(null);
        coursesFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_courseBttnActionPerformed

    private void aboutBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBttnActionPerformed
        AboutPage aboutPage = new AboutPage();
        JOptionPane.showMessageDialog(aboutPage, "This page is already opened!", "Warning", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CDMLogo;
    private javax.swing.JLabel MuntiLogo;
    private javax.swing.JButton aboutBttn;
    private javax.swing.JLabel addressLbl11;
    private javax.swing.JLabel addressLbl13;
    private javax.swing.JLabel addressLbl14;
    private javax.swing.JLabel addressLbl15;
    private javax.swing.JLabel addressLbl16;
    private javax.swing.JLabel addressLbl17;
    private javax.swing.JLabel addressLbl18;
    private javax.swing.JLabel addressLbl19;
    private javax.swing.JButton courseBttn;
    private javax.swing.JButton exitBttn;
    private javax.swing.JButton facilitiesBttn;
    private javax.swing.JButton homeBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
