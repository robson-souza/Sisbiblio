package br.com.pk.sisbiblio;

import br.com.pk.sisbiblio.bean.Genero;
import br.com.pk.sisbiblio.model.GeneroDao;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
GeneroDao dao = new GeneroDao();
Genero g = new Genero();

    public Home(){
        initComponents();
        txtaltgen.setVisible(false);
        lblaltgen.setVisible(false);
        btnaltgen.setVisible(false);
        btndelgen.setVisible(false);
        txtcadgen.setEditable(true);
        txtidgen.setVisible(false);
        atualizacombobox();
    }
    
    public void atualizacombobox(){
        cbgen.removeAllItems();
        dao.listaGenero().forEach((g) -> {
            cbgen.addItem(g);
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bglivro = new javax.swing.ButtonGroup();
        bgusuario = new javax.swing.ButtonGroup();
        bgfunc = new javax.swing.ButtonGroup();
        jTextField14 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jpgenero = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtcadgen = new javax.swing.JTextField();
        btncadgen = new javax.swing.JButton();
        btnlmpgen = new javax.swing.JButton();
        btnaltgen = new javax.swing.JButton();
        btndelgen = new javax.swing.JButton();
        lblaltgen = new javax.swing.JLabel();
        txtaltgen = new javax.swing.JTextField();
        btnpesqgen = new javax.swing.JButton();
        cbgen = new javax.swing.JComboBox<>();
        txtidgen = new javax.swing.JTextField();
        jplivro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jpusuario = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpfuncionario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jpautor = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jplocalizacao = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jpeditora = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();

        jTextField14.setText("jTextField14");

        jButton13.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisbiblio v0.3®");
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 600));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpgenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Gênero");

        txtcadgen.setFont(txtcadgen.getFont().deriveFont(txtcadgen.getFont().getStyle() | java.awt.Font.BOLD, txtcadgen.getFont().getSize()-1));

        btncadgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncadgen.setText("Cadastrar");
        btncadgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadgenActionPerformed(evt);
            }
        });

        btnlmpgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlmpgen.setText("Limpar Dados");
        btnlmpgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmpgenActionPerformed(evt);
            }
        });

        btnaltgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnaltgen.setText("Alterar");
        btnaltgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltgenActionPerformed(evt);
            }
        });

        btndelgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndelgen.setText("Excluir");
        btndelgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelgenActionPerformed(evt);
            }
        });

        lblaltgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblaltgen.setText("Alterar para");

        txtaltgen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtaltgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaltgenActionPerformed(evt);
            }
        });

        btnpesqgen.setText("Alterar/Excluir");
        btnpesqgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqgenActionPerformed(evt);
            }
        });

        cbgen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgenActionPerformed(evt);
            }
        });

        txtidgen.setEditable(false);
        txtidgen.setFont(txtidgen.getFont().deriveFont(txtidgen.getFont().getStyle() | java.awt.Font.BOLD, txtidgen.getFont().getSize()-1));
        txtidgen.setBorder(null);

        org.jdesktop.layout.GroupLayout jpgeneroLayout = new org.jdesktop.layout.GroupLayout(jpgenero);
        jpgenero.setLayout(jpgeneroLayout);
        jpgeneroLayout.setHorizontalGroup(
            jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpgeneroLayout.createSequentialGroup()
                .add(47, 47, 47)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jpgeneroLayout.createSequentialGroup()
                        .add(cbgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 49, Short.MAX_VALUE)
                        .add(btnpesqgen))
                    .add(jpgeneroLayout.createSequentialGroup()
                        .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jpgeneroLayout.createSequentialGroup()
                                .add(lblaltgen)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jpgeneroLayout.createSequentialGroup()
                                .add(jLabel20)
                                .add(28, 28, 28)
                                .add(txtidgen)
                                .add(63, 63, 63)))
                        .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtcadgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtaltgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jpgeneroLayout.createSequentialGroup()
                        .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btncadgen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnaltgen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnlmpgen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btndelgen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jpgeneroLayout.setVerticalGroup(
            jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpgeneroLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnpesqgen)
                    .add(cbgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel20)
                    .add(txtcadgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtidgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblaltgen)
                    .add(txtaltgen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(19, 19, 19)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btncadgen)
                    .add(btnlmpgen))
                .add(18, 18, 18)
                .add(jpgeneroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnaltgen)
                    .add(btndelgen))
                .add(55, 55, 55))
        );

        jTabbedPane2.addTab("GÊNERO", jpgenero);

        jplivro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel1.setText("ISBN *");

        jLabel2.setText("Título *");

        jLabel3.setText("Ano *");

        jLabel5.setText("Edição");

        jLabel6.setText("Status");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativado", "Desativado" }));

        jButton5.setText("Cadastrar");

        jButton6.setText("Limpar Dados");

        jLabel7.setText("* - Campos Obrigatórios");

        jLabel13.setText("Localização");

        jLabel14.setText("Prateleira");

        jLabel15.setText("Estante");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "A", "B", "C", "D", "E", "F", "G", "H" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        org.jdesktop.layout.GroupLayout jplivroLayout = new org.jdesktop.layout.GroupLayout(jplivro);
        jplivro.setLayout(jplivroLayout);
        jplivroLayout.setHorizontalGroup(
            jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jplivroLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jplivroLayout.createSequentialGroup()
                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(jButton5))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jplivroLayout.createSequentialGroup()
                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jplivroLayout.createSequentialGroup()
                                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jplivroLayout.createSequentialGroup()
                                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel6)
                                            .add(jLabel5))
                                        .add(21, 21, 21)
                                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jTextField8)
                                            .add(jComboBox1, 0, 92, Short.MAX_VALUE)))
                                    .add(jplivroLayout.createSequentialGroup()
                                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel1)
                                            .add(jLabel2)
                                            .add(jLabel3))
                                        .add(16, 16, 16)
                                        .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jTextField7)
                                            .add(jTextField6)
                                            .add(jTextField5))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 69, Short.MAX_VALUE)
                                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jplivroLayout.createSequentialGroup()
                                        .add(jLabel14)
                                        .add(8, 8, 8)
                                        .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jplivroLayout.createSequentialGroup()
                                        .add(jLabel15)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jplivroLayout.createSequentialGroup()
                                        .add(jLabel13)
                                        .add(17, 17, 17))))
                            .add(jplivroLayout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jButton6)
                                .add(41, 41, 41)))
                        .add(72, 72, 72))))
        );
        jplivroLayout.setVerticalGroup(
            jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jplivroLayout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel13)))
                .add(18, 18, 18)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel15)
                        .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel3)
                        .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel14)
                        .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(21, 21, 21)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jplivroLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton5)
                    .add(jButton6))
                .add(37, 37, 37))
        );

        jTabbedPane2.addTab("LIVRO", jplivro);

        jpusuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jButton7.setText("Limpar Dados");

        jButton8.setText("Cadastrar");

        jLabel8.setText("* - Campos Obrigatórios");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativado", "Desativado" }));

        jLabel9.setText("Status");

        jLabel10.setText("Email");

        jLabel11.setText("Telefone");

        jLabel12.setText("Nome *");

        jLabel16.setText("CPF *");

        org.jdesktop.layout.GroupLayout jpusuarioLayout = new org.jdesktop.layout.GroupLayout(jpusuario);
        jpusuario.setLayout(jpusuarioLayout);
        jpusuarioLayout.setHorizontalGroup(
            jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpusuarioLayout.createSequentialGroup()
                .add(106, 106, 106)
                .add(jLabel16)
                .addContainerGap(303, Short.MAX_VALUE))
            .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jpusuarioLayout.createSequentialGroup()
                    .add(108, 108, 108)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel8)
                        .add(jpusuarioLayout.createSequentialGroup()
                            .add(jButton8)
                            .add(33, 33, 33)
                            .add(jButton7))
                        .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jpusuarioLayout.createSequentialGroup()
                                .add(jLabel11)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTextField10))
                            .add(jpusuarioLayout.createSequentialGroup()
                                .add(jLabel12)
                                .add(16, 16, 16)
                                .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextField11)
                                    .add(jTextField12)))
                            .add(jpusuarioLayout.createSequentialGroup()
                                .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel9)
                                    .add(jLabel10))
                                .add(21, 21, 21)
                                .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextField9)
                                    .add(jComboBox2, 0, 92, Short.MAX_VALUE)))))
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        jpusuarioLayout.setVerticalGroup(
            jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpusuarioLayout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel16)
                .addContainerGap(288, Short.MAX_VALUE))
            .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jpusuarioLayout.createSequentialGroup()
                    .add(31, 31, 31)
                    .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(18, 18, 18)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(18, 18, 18)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel11)
                        .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(21, 21, 21)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel10)
                        .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(18, 18, 18)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel9)
                        .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(18, 18, 18)
                    .add(jLabel8)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpusuarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton8)
                        .add(jButton7))
                    .add(31, 31, 31)))
        );

        jTabbedPane2.addTab("USUÁRIO", jpusuario);

        jpfuncionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel17.setText("CPF");

        jLabel18.setText("Nome");

        jLabel19.setText("Função");

        jButton16.setText("Cadastrar");

        jButton17.setText("Limpar Dados");

        org.jdesktop.layout.GroupLayout jpfuncionarioLayout = new org.jdesktop.layout.GroupLayout(jpfuncionario);
        jpfuncionario.setLayout(jpfuncionarioLayout);
        jpfuncionarioLayout.setHorizontalGroup(
            jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpfuncionarioLayout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jpfuncionarioLayout.createSequentialGroup()
                        .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel17)
                            .add(jLabel18)
                            .add(jLabel19))
                        .add(73, 73, 73)
                        .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextField13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .add(jTextField15)
                            .add(jTextField16)))
                    .add(jpfuncionarioLayout.createSequentialGroup()
                        .add(jButton16)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 36, Short.MAX_VALUE)
                        .add(jButton17)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jpfuncionarioLayout.setVerticalGroup(
            jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpfuncionarioLayout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel17)
                    .add(jTextField13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(46, 46, 46)
                .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel18)
                    .add(jTextField15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(38, 38, 38)
                .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel19)
                    .add(jTextField16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(48, 48, 48)
                .add(jpfuncionarioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton16)
                    .add(jButton17))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("FUNCIONÁRIO", jpfuncionario);

        jpautor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel23.setText("Nome do autor");

        jButton11.setText("Cadastrar");

        jButton12.setText("Limpar Dados");

        org.jdesktop.layout.GroupLayout jpautorLayout = new org.jdesktop.layout.GroupLayout(jpautor);
        jpautor.setLayout(jpautorLayout);
        jpautorLayout.setHorizontalGroup(
            jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpautorLayout.createSequentialGroup()
                .add(45, 45, 45)
                .add(jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel23, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(52, 52, 52)
                .add(jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTextField20))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jpautorLayout.setVerticalGroup(
            jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpautorLayout.createSequentialGroup()
                .add(126, 126, 126)
                .add(jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel23)
                    .add(jTextField20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(60, 60, 60)
                .add(jpautorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton11)
                    .add(jButton12))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("AUTOR", jpautor);

        jplocalizacao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jButton18.setText("Cadastrar");

        jButton19.setText("Limpar Dados");

        jRadioButton5.setText("Estante");

        jRadioButton6.setText("Prateleira");

        org.jdesktop.layout.GroupLayout jplocalizacaoLayout = new org.jdesktop.layout.GroupLayout(jplocalizacao);
        jplocalizacao.setLayout(jplocalizacaoLayout);
        jplocalizacaoLayout.setHorizontalGroup(
            jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jplocalizacaoLayout.createSequentialGroup()
                .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jplocalizacaoLayout.createSequentialGroup()
                        .add(47, 47, 47)
                        .add(jButton18)
                        .add(37, 37, 37)
                        .add(jButton19))
                    .add(jplocalizacaoLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jRadioButton5)
                            .add(jRadioButton6))
                        .add(50, 50, 50)
                        .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextField22)
                            .add(jTextField21))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jplocalizacaoLayout.setVerticalGroup(
            jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jplocalizacaoLayout.createSequentialGroup()
                .add(65, 65, 65)
                .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRadioButton5))
                .add(35, 35, 35)
                .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRadioButton6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jplocalizacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton18)
                    .add(jButton19))
                .add(85, 85, 85))
        );

        jTabbedPane2.addTab("LOCALIZAÇÃO", jplocalizacao);

        jpeditora.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel21.setText("Nome da Editora");

        jButton9.setText("Cadastrar");

        jButton10.setText("Limpar Campos");

        org.jdesktop.layout.GroupLayout jpeditoraLayout = new org.jdesktop.layout.GroupLayout(jpeditora);
        jpeditora.setLayout(jpeditoraLayout);
        jpeditoraLayout.setHorizontalGroup(
            jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpeditoraLayout.createSequentialGroup()
                .add(46, 46, 46)
                .add(jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel21)
                    .add(jButton9))
                .add(72, 72, 72)
                .add(jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTextField18))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jpeditoraLayout.setVerticalGroup(
            jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpeditoraLayout.createSequentialGroup()
                .add(125, 125, 125)
                .add(jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel21)
                    .add(jTextField18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 91, Short.MAX_VALUE)
                .add(jpeditoraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton9)
                    .add(jButton10))
                .add(65, 65, 65))
        );

        jTabbedPane2.addTab("EDITORA", jpeditora);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesqgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqgenActionPerformed
        txtcadgen.setEditable(false);
        btncadgen.setVisible(false);
        btnaltgen.setVisible(true);
        btndelgen.setVisible(true);
        txtaltgen.setVisible(true);
        lblaltgen.setVisible(true);
        g=(Genero) cbgen.getSelectedItem();
        txtcadgen.setText(g.getNome());
        txtidgen.setText(g.getId().toString());
    }//GEN-LAST:event_btnpesqgenActionPerformed

    private void btndelgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelgenActionPerformed
        txtcadgen.setEditable(true);
        lblaltgen.setVisible(false);
        txtaltgen.setVisible(false);
        btncadgen.setVisible(true);
        btndelgen.setVisible(false);
        btnaltgen.setVisible(false);
        g.setNome(txtcadgen.getText());
        g.setId(Long.parseLong(txtidgen.getText()));
        dao.excluiGenero(g);
        txtcadgen.setText("");
        txtaltgen.setText("");
        atualizacombobox();
        txtcadgen.requestFocus();
                
    }//GEN-LAST:event_btndelgenActionPerformed

    private void btnaltgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltgenActionPerformed
        txtcadgen.setEditable(true);
        lblaltgen.setVisible(false);
        txtaltgen.setVisible(false);
        btncadgen.setVisible(true);
        btndelgen.setVisible(false);
        btnaltgen.setVisible(false);
        g.setNome(txtaltgen.getText());
        g.setId(Long.parseLong(txtidgen.getText()));
        dao.atualizaGenero(g,g);
        txtcadgen.setText("");
        txtaltgen.setText("");
        atualizacombobox();
    }//GEN-LAST:event_btnaltgenActionPerformed

    private void btnlmpgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmpgenActionPerformed
        txtcadgen.setText("");
        txtcadgen.setEditable(true);
        btncadgen.setVisible(true);
        btnaltgen.setVisible(false);
        btndelgen.setVisible(false);
        txtaltgen.setVisible(false);
        lblaltgen.setVisible(false);
        txtcadgen.requestFocus();
    }//GEN-LAST:event_btnlmpgenActionPerformed

    private void btncadgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadgenActionPerformed
        if ((txtcadgen.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo!");
        } else {
            g.setNome(txtcadgen.getText());
            dao.criaGenero(g);
            txtcadgen.setText("");
            atualizacombobox();
        }
    }//GEN-LAST:event_btncadgenActionPerformed

    private void txtaltgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaltgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaltgenActionPerformed

    private void cbgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbgenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgfunc;
    private javax.swing.ButtonGroup bglivro;
    private javax.swing.ButtonGroup bgusuario;
    private javax.swing.JButton btnaltgen;
    private javax.swing.JButton btncadgen;
    private javax.swing.JButton btndelgen;
    private javax.swing.JButton btnlmpgen;
    private javax.swing.JButton btnpesqgen;
    private javax.swing.JComboBox<Object> cbgen;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jpautor;
    private javax.swing.JPanel jpeditora;
    private javax.swing.JPanel jpfuncionario;
    private javax.swing.JPanel jpgenero;
    private javax.swing.JPanel jplivro;
    private javax.swing.JPanel jplocalizacao;
    private javax.swing.JPanel jpusuario;
    private javax.swing.JLabel lblaltgen;
    private javax.swing.JTextField txtaltgen;
    private javax.swing.JTextField txtcadgen;
    private javax.swing.JTextField txtidgen;
    // End of variables declaration//GEN-END:variables
}
