
package GUI;

public class vistaPanel1 extends javax.swing.JFrame {
Manejocv cv = new Manejocv();



    
    public vistaPanel1() {
        initComponents();
        //desactivar boton
        btnCrear.setEnabled(false);
        //ocultar campo de mensaje campo vacio (seteo en falso) Co de Campo Obligatorio
        Co_nombre.setVisible(false);
        Co_apellido.setVisible(false);
        Co_celular.setVisible(false);
        Co_descripcion.setVisible(false);
        Co_direccion.setVisible(false);
        Co_edad.setVisible(false);
        Co_email.setVisible(false);
        Co_linkedin.setVisible(false);
        Co_perfil.setVisible(false);
        Co_hab1.setVisible(false);
        Co_hab2.setVisible(false);
        Co_hab3.setVisible(false);
        Co_hab4.setVisible(false);
        Co_hab5.setVisible(false);
        Co_idioma.setVisible(false);
        Co_idiomalvl.setVisible(false);
        Co_institucion.setVisible(false);
        Co_carrera.setVisible(false);
        
    }
    
    
    public void habilitarBtn(){
        if(!nombre_area.getText().isBlank()&&!apellido_area.getText().isBlank()&&!carr_area.getText().isBlank()&&
                !metas_area.getText().isBlank()&&!edad_area.getText().isBlank()&&!direccion_area.getText().isBlank()
                &&!cel_area.getText().isBlank()&&!email_area.getText().isBlank()&&!linkedin_area.getText().isBlank()
                &&!carr_area.getText().isBlank()&&!inst_area.getText().isBlank()
                &&!idioma_area.getText().isBlank()&&!nivel_area.getText().isBlank()&&!habUno_Area.getText().isBlank()
                &&!habDos_Area.getText().isBlank()&&!habTres_Area.getText().isBlank()&&!habCuat_Area.getText().isBlank()
                &&!habCin_Area.getText().isBlank()){
            
        btnCrear.setEnabled(true);
    }else{btnCrear.setEnabled(false);
        };
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        consejos = new javax.swing.JLabel();
        blog1 = new javax.swing.JLabel();
        blog2 = new javax.swing.JLabel();
        blog3 = new javax.swing.JLabel();
        blog4 = new javax.swing.JLabel();
        blog5 = new javax.swing.JLabel();
        blog6 = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Personal = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        Co_nombre = new javax.swing.JLabel();
        nombre_area = new javax.swing.JTextArea();
        apellido = new javax.swing.JLabel();
        Co_apellido = new javax.swing.JLabel();
        apellido_area = new javax.swing.JTextArea();
        perfilP = new javax.swing.JLabel();
        perfilP_area = new javax.swing.JTextArea();
        metas = new javax.swing.JLabel();
        metas_area = new javax.swing.JTextArea();
        edad = new javax.swing.JLabel();
        edad_area = new javax.swing.JTextArea();
        direccion = new javax.swing.JLabel();
        direccion_area = new javax.swing.JTextArea();
        cel = new javax.swing.JLabel();
        cel_area = new javax.swing.JTextArea();
        email = new javax.swing.JLabel();
        email_area = new javax.swing.JTextArea();
        linkedin = new javax.swing.JLabel();
        linkedin_area = new javax.swing.JTextArea();
        Co_perfil = new javax.swing.JLabel();
        Co_descripcion = new javax.swing.JLabel();
        Co_edad = new javax.swing.JLabel();
        Co_celular = new javax.swing.JLabel();
        Co_direccion = new javax.swing.JLabel();
        Co_linkedin = new javax.swing.JLabel();
        Co_email = new javax.swing.JLabel();
        profesional = new javax.swing.JPanel();
        carrera = new javax.swing.JLabel();
        carr_area = new javax.swing.JTextArea();
        institucion = new javax.swing.JLabel();
        inst_area = new javax.swing.JTextArea();
        curso = new javax.swing.JLabel();
        curso_area = new javax.swing.JTextArea();
        idioma = new javax.swing.JLabel();
        idioma_area = new javax.swing.JTextArea();
        nivel = new javax.swing.JLabel();
        nivel_area = new javax.swing.JTextArea();
        skill = new javax.swing.JLabel();
        habUno = new javax.swing.JLabel();
        habUno_Area = new javax.swing.JTextArea();
        habDos = new javax.swing.JLabel();
        habDos_Area = new javax.swing.JTextArea();
        habTres = new javax.swing.JLabel();
        habTres_Area = new javax.swing.JTextArea();
        habCuat = new javax.swing.JLabel();
        habCin_Area = new javax.swing.JTextArea();
        habCin = new javax.swing.JLabel();
        habCuat_Area = new javax.swing.JTextArea();
        Co_carrera = new javax.swing.JLabel();
        Co_institucion = new javax.swing.JLabel();
        Co_idioma = new javax.swing.JLabel();
        Co_idiomalvl = new javax.swing.JLabel();
        Co_hab1 = new javax.swing.JLabel();
        Co_hab2 = new javax.swing.JLabel();
        Co_hab3 = new javax.swing.JLabel();
        Co_hab4 = new javax.swing.JLabel();
        Co_hab5 = new javax.swing.JLabel();
        expLavoral = new javax.swing.JPanel();
        exp = new javax.swing.JLabel();
        exp_area = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cv Creator");
        setBackground(new java.awt.Color(51, 51, 51));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setForeground(new java.awt.Color(102, 102, 102));

        titulo.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 153, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("C.V Creator");
        titulo.setToolTipText("");
        titulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        consejos.setBackground(new java.awt.Color(204, 102, 0));
        consejos.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        consejos.setForeground(new java.awt.Color(255, 255, 255));
        consejos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consejos.setText("Algunos Consejos "); // NOI18N
        consejos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consejos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog1.setBackground(new java.awt.Color(255, 255, 51));
        blog1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog1.setForeground(new java.awt.Color(255, 255, 255));
        blog1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog1.setText("*Adapta tu cv a la oferta de  trabajo"); // NOI18N
        blog1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog2.setBackground(new java.awt.Color(255, 255, 51));
        blog2.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog2.setForeground(new java.awt.Color(255, 255, 255));
        blog2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog2.setText("*Utiliza palabras clave"); // NOI18N
        blog2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog3.setBackground(new java.awt.Color(255, 255, 51));
        blog3.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog3.setForeground(new java.awt.Color(255, 255, 255));
        blog3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog3.setText("*solo la formación relevante"); // NOI18N
        blog3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog4.setBackground(new java.awt.Color(255, 255, 51));
        blog4.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog4.setForeground(new java.awt.Color(255, 255, 255));
        blog4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog4.setText("*Nunca mientas"); // NOI18N
        blog4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog5.setBackground(new java.awt.Color(255, 255, 51));
        blog5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog5.setForeground(new java.awt.Color(255, 255, 255));
        blog5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog5.setText("*de que sea Facil Contactarte"); // NOI18N
        blog5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        blog6.setBackground(new java.awt.Color(255, 255, 51));
        blog6.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        blog6.setForeground(new java.awt.Color(255, 255, 255));
        blog6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blog6.setText("*Mantenlo siempre actualizado"); // NOI18N
        blog6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        footer.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        footer.setForeground(new java.awt.Color(255, 153, 51));
        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("By:Santi Araoz - Briz Franco");
        footer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(blog5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(blog6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blog3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blog1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blog2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blog4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(footer))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(consejos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(consejos)
                .addGap(18, 18, 18)
                .addComponent(blog1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blog2)
                .addGap(18, 18, 18)
                .addComponent(blog3)
                .addGap(18, 18, 18)
                .addComponent(blog4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blog5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blog6)
                .addGap(33, 33, 33)
                .addComponent(footer)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 153, 51));

        Personal.setBackground(new java.awt.Color(51, 51, 51));
        Personal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nombre.setForeground(new java.awt.Color(153, 153, 153));
        nombre.setText("¿Cual es tu nombre?:");

        Co_nombre.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_nombre.setForeground(new java.awt.Color(255, 51, 51));
        Co_nombre.setText("*campo obligatorio");

        nombre_area.setBackground(new java.awt.Color(153, 153, 153));
        nombre_area.setColumns(20);
        nombre_area.setForeground(new java.awt.Color(0, 0, 0));
        nombre_area.setLineWrap(true);
        nombre_area.setRows(5);
        nombre_area.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 102, 0), null, null));
        nombre_area.setCaretColor(new java.awt.Color(204, 51, 0));
        nombre_area.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nombre_area.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        nombre_area.setDoubleBuffered(true);
        nombre_area.setDragEnabled(true);
        nombre_area.setNextFocusableComponent(apellido_area);
        nombre_area.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        nombre_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombre_areaFocusLost(evt);
            }
        });
        nombre_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombre_areaKeyReleased(evt);
            }
        });

        apellido.setForeground(new java.awt.Color(153, 153, 153));
        apellido.setText("¿Cual es tu Apellido?:");

        Co_apellido.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_apellido.setForeground(new java.awt.Color(255, 51, 51));
        Co_apellido.setText("*campo obligatorio");

        apellido_area.setBackground(new java.awt.Color(153, 153, 153));
        apellido_area.setColumns(20);
        apellido_area.setRows(5);
        apellido_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellido_areaFocusLost(evt);
            }
        });
        apellido_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellido_areaKeyReleased(evt);
            }
        });

        perfilP.setForeground(new java.awt.Color(153, 153, 153));
        perfilP.setText("¿Cual es tu perfil Profesional?:");

        perfilP_area.setBackground(new java.awt.Color(153, 153, 153));
        perfilP_area.setColumns(20);
        perfilP_area.setRows(5);
        perfilP_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                perfilP_areaFocusLost(evt);
            }
        });
        perfilP_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perfilP_areaKeyReleased(evt);
            }
        });

        metas.setForeground(new java.awt.Color(153, 153, 153));
        metas.setText("Cuentanos una breve descripcion de tu perfil, tus metas y proyectos:");

        metas_area.setBackground(new java.awt.Color(153, 153, 153));
        metas_area.setColumns(20);
        metas_area.setRows(5);
        metas_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                metas_areaFocusLost(evt);
            }
        });
        metas_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                metas_areaKeyReleased(evt);
            }
        });

        edad.setForeground(new java.awt.Color(153, 153, 153));
        edad.setText("¿Cual es tu edad?:");

        edad_area.setBackground(new java.awt.Color(153, 153, 153));
        edad_area.setColumns(20);
        edad_area.setRows(5);
        edad_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edad_areaFocusLost(evt);
            }
        });
        edad_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edad_areaKeyReleased(evt);
            }
        });

        direccion.setForeground(new java.awt.Color(153, 153, 153));
        direccion.setText("¿Cual es tu direccion?:");

        direccion_area.setBackground(new java.awt.Color(153, 153, 153));
        direccion_area.setColumns(20);
        direccion_area.setRows(5);
        direccion_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccion_areaFocusLost(evt);
            }
        });
        direccion_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccion_areaKeyReleased(evt);
            }
        });

        cel.setForeground(new java.awt.Color(153, 153, 153));
        cel.setText(" Celular:");

        cel_area.setBackground(new java.awt.Color(153, 153, 153));
        cel_area.setColumns(20);
        cel_area.setRows(5);
        cel_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cel_areaFocusLost(evt);
            }
        });
        cel_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cel_areaKeyReleased(evt);
            }
        });

        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("ingresá tu email:");

        email_area.setBackground(new java.awt.Color(153, 153, 153));
        email_area.setColumns(20);
        email_area.setRows(5);
        email_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_areaFocusLost(evt);
            }
        });
        email_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email_areaKeyReleased(evt);
            }
        });

        linkedin.setForeground(new java.awt.Color(153, 153, 153));
        linkedin.setText("ingresá tu linkedin:");

        linkedin_area.setBackground(new java.awt.Color(153, 153, 153));
        linkedin_area.setColumns(20);
        linkedin_area.setRows(5);
        linkedin_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linkedin_areaFocusLost(evt);
            }
        });
        linkedin_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linkedin_areaKeyReleased(evt);
            }
        });

        Co_perfil.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_perfil.setForeground(new java.awt.Color(255, 51, 51));
        Co_perfil.setText("*campo obligatorio");

        Co_descripcion.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_descripcion.setForeground(new java.awt.Color(255, 51, 51));
        Co_descripcion.setText("*campo obligatorio");

        Co_edad.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_edad.setForeground(new java.awt.Color(255, 51, 51));
        Co_edad.setText("*campo obligatorio");

        Co_celular.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_celular.setForeground(new java.awt.Color(255, 51, 51));
        Co_celular.setText("*campo obligatorio");

        Co_direccion.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_direccion.setForeground(new java.awt.Color(255, 51, 51));
        Co_direccion.setText("*campo obligatorio");

        Co_linkedin.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_linkedin.setForeground(new java.awt.Color(255, 51, 51));
        Co_linkedin.setText("*campo obligatorio");

        Co_email.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_email.setForeground(new java.awt.Color(255, 51, 51));
        Co_email.setText("*campo obligatorio");

        javax.swing.GroupLayout PersonalLayout = new javax.swing.GroupLayout(Personal);
        Personal.setLayout(PersonalLayout);
        PersonalLayout.setHorizontalGroup(
            PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalLayout.createSequentialGroup()
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(Co_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombre_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellido_area, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(apellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Co_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(perfilP_area, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metas_area, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addComponent(cel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(email_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(linkedin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Co_linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addComponent(perfilP)
                                .addGap(18, 18, 18)
                                .addComponent(Co_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addComponent(metas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Co_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PersonalLayout.createSequentialGroup()
                                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edad_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Co_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(cel)
                                        .addGap(66, 66, 66)
                                        .addComponent(Co_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(email)
                                        .addGap(18, 18, 18)
                                        .addComponent(Co_email, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PersonalLayout.createSequentialGroup()
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Co_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(direccion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(linkedin_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PersonalLayout.setVerticalGroup(
            PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apellido)
                        .addComponent(Co_nombre)
                        .addComponent(Co_apellido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_area, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_area, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfilP)
                    .addComponent(Co_perfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilP_area, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metas)
                    .addComponent(Co_descripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metas_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad)
                    .addComponent(Co_edad)
                    .addComponent(direccion)
                    .addComponent(Co_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel)
                    .addComponent(Co_celular)
                    .addComponent(email)
                    .addComponent(Co_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linkedin)
                    .addComponent(Co_linkedin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkedin_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Personal", Personal);

        profesional.setBackground(new java.awt.Color(51, 51, 51));

        carrera.setForeground(new java.awt.Color(153, 153, 153));
        carrera.setText("¿Que carrera estudias?:");

        carr_area.setBackground(new java.awt.Color(153, 153, 153));
        carr_area.setColumns(20);
        carr_area.setRows(5);
        carr_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                carr_areaFocusLost(evt);
            }
        });
        carr_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carr_areaKeyReleased(evt);
            }
        });

        institucion.setForeground(new java.awt.Color(153, 153, 153));
        institucion.setText("Nombre de la institucion:");

        inst_area.setBackground(new java.awt.Color(153, 153, 153));
        inst_area.setColumns(20);
        inst_area.setRows(5);
        inst_area.setSelectedTextColor(new java.awt.Color(0, 102, 255));
        inst_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inst_areaFocusLost(evt);
            }
        });
        inst_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inst_areaKeyReleased(evt);
            }
        });

        curso.setForeground(new java.awt.Color(153, 153, 153));
        curso.setText("Si realizaste algun curso ingresa aqui el nombre:");

        curso_area.setBackground(new java.awt.Color(153, 153, 153));
        curso_area.setColumns(20);
        curso_area.setRows(5);
        curso_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                curso_areaKeyReleased(evt);
            }
        });

        idioma.setForeground(new java.awt.Color(153, 153, 153));
        idioma.setText("¿Caul es tu segundo Idioma?");

        idioma_area.setBackground(new java.awt.Color(153, 153, 153));
        idioma_area.setColumns(20);
        idioma_area.setRows(5);
        idioma_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idioma_areaFocusLost(evt);
            }
        });
        idioma_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idioma_areaKeyReleased(evt);
            }
        });

        nivel.setForeground(new java.awt.Color(153, 153, 153));
        nivel.setText("¿cual es tu nivel?");

        nivel_area.setBackground(new java.awt.Color(153, 153, 153));
        nivel_area.setColumns(20);
        nivel_area.setForeground(new java.awt.Color(0, 0, 0));
        nivel_area.setRows(5);
        nivel_area.setCaretColor(new java.awt.Color(0, 0, 0));
        nivel_area.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nivel_area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nivel_areaFocusLost(evt);
            }
        });
        nivel_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nivel_areaKeyReleased(evt);
            }
        });

        skill.setForeground(new java.awt.Color(153, 153, 153));
        skill.setText("Ingresa los lenguajes de programacion, herramientas, tecnologias que utilizas");
        skill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        habUno.setForeground(new java.awt.Color(153, 153, 153));
        habUno.setText("habilidad 1");

        habUno_Area.setBackground(new java.awt.Color(153, 153, 153));
        habUno_Area.setColumns(20);
        habUno_Area.setRows(5);
        habUno_Area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                habUno_AreaFocusLost(evt);
            }
        });
        habUno_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habUno_AreaKeyReleased(evt);
            }
        });

        habDos.setForeground(new java.awt.Color(153, 153, 153));
        habDos.setText("habilidad 2");

        habDos_Area.setBackground(new java.awt.Color(153, 153, 153));
        habDos_Area.setColumns(20);
        habDos_Area.setRows(5);
        habDos_Area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                habDos_AreaFocusLost(evt);
            }
        });
        habDos_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habDos_AreaKeyReleased(evt);
            }
        });

        habTres.setForeground(new java.awt.Color(153, 153, 153));
        habTres.setText("habilidad 3");

        habTres_Area.setBackground(new java.awt.Color(153, 153, 153));
        habTres_Area.setColumns(20);
        habTres_Area.setRows(5);
        habTres_Area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                habTres_AreaFocusLost(evt);
            }
        });
        habTres_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habTres_AreaKeyReleased(evt);
            }
        });

        habCuat.setForeground(new java.awt.Color(153, 153, 153));
        habCuat.setText("habilidad 4");

        habCin_Area.setBackground(new java.awt.Color(153, 153, 153));
        habCin_Area.setColumns(20);
        habCin_Area.setRows(5);
        habCin_Area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                habCin_AreaFocusLost(evt);
            }
        });
        habCin_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habCin_AreaKeyReleased(evt);
            }
        });

        habCin.setForeground(new java.awt.Color(153, 153, 153));
        habCin.setText("habilidad 5");

        habCuat_Area.setBackground(new java.awt.Color(153, 153, 153));
        habCuat_Area.setColumns(20);
        habCuat_Area.setRows(5);
        habCuat_Area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                habCuat_AreaFocusLost(evt);
            }
        });
        habCuat_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habCuat_AreaKeyReleased(evt);
            }
        });

        Co_carrera.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_carrera.setForeground(new java.awt.Color(255, 51, 51));
        Co_carrera.setText("*campo obligatorio");

        Co_institucion.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_institucion.setForeground(new java.awt.Color(255, 51, 51));
        Co_institucion.setText("*campo obligatorio");

        Co_idioma.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_idioma.setForeground(new java.awt.Color(255, 51, 51));
        Co_idioma.setText("*campo obligatorio");

        Co_idiomalvl.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_idiomalvl.setForeground(new java.awt.Color(255, 51, 51));
        Co_idiomalvl.setText("*campo obligatorio");

        Co_hab1.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_hab1.setForeground(new java.awt.Color(255, 51, 51));
        Co_hab1.setText("*campo obligatorio");

        Co_hab2.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_hab2.setForeground(new java.awt.Color(255, 51, 51));
        Co_hab2.setText("*campo obligatorio");

        Co_hab3.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_hab3.setForeground(new java.awt.Color(255, 51, 51));
        Co_hab3.setText("*campo obligatorio");

        Co_hab4.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_hab4.setForeground(new java.awt.Color(255, 51, 51));
        Co_hab4.setText("*campo obligatorio");

        Co_hab5.setFont(new java.awt.Font("Dubai Light", 1, 10)); // NOI18N
        Co_hab5.setForeground(new java.awt.Color(255, 51, 51));
        Co_hab5.setText("*campo obligatorio");

        javax.swing.GroupLayout profesionalLayout = new javax.swing.GroupLayout(profesional);
        profesional.setLayout(profesionalLayout);
        profesionalLayout.setHorizontalGroup(
            profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addComponent(carrera)
                        .addGap(18, 18, 18)
                        .addComponent(Co_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addComponent(institucion)
                        .addGap(18, 18, 18)
                        .addComponent(Co_institucion))
                    .addComponent(curso)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addComponent(habDos_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profesionalLayout.createSequentialGroup()
                                        .addComponent(habCuat)
                                        .addGap(18, 18, 18)
                                        .addComponent(Co_hab4))
                                    .addGroup(profesionalLayout.createSequentialGroup()
                                        .addComponent(habTres)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Co_hab3))))
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(habCuat_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(skill, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(habCin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Co_hab5))
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(habCin_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carr_area)
                    .addComponent(inst_area)
                    .addComponent(curso_area)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idioma_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idioma))
                                .addGap(50, 50, 50)
                                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profesionalLayout.createSequentialGroup()
                                        .addComponent(nivel)
                                        .addGap(32, 32, 32)
                                        .addComponent(Co_idiomalvl))
                                    .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addComponent(habUno)
                                .addGap(18, 18, 18)
                                .addComponent(Co_hab1))
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addComponent(habDos)
                                .addGap(18, 18, 18)
                                .addComponent(Co_hab2))
                            .addGroup(profesionalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(habUno_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(habTres_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Co_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        profesionalLayout.setVerticalGroup(
            profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrera)
                    .addComponent(Co_carrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carr_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(institucion)
                    .addComponent(Co_institucion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inst_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curso_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idioma)
                    .addComponent(nivel)
                    .addComponent(Co_idiomalvl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idioma_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Co_idioma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habUno)
                    .addComponent(habTres)
                    .addComponent(Co_hab1)
                    .addComponent(Co_hab3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habUno_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habTres_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habDos)
                    .addComponent(habCuat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Co_hab2)
                    .addComponent(Co_hab4))
                .addGap(9, 9, 9)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habCuat_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habDos_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habCin)
                    .addComponent(Co_hab5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habCin_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Profesional", profesional);

        expLavoral.setBackground(new java.awt.Color(51, 51, 51));

        exp.setForeground(new java.awt.Color(153, 153, 153));
        exp.setText("Experiencia Laboral");

        exp_area.setBackground(new java.awt.Color(153, 153, 153));
        exp_area.setColumns(20);
        exp_area.setRows(5);
        exp_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                exp_areaKeyReleased(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(102, 102, 102));
        btnCrear.setForeground(new java.awt.Color(204, 51, 0));
        btnCrear.setText("Crear Cv");
        btnCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrear.setBorderPainted(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnCrear.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnCrear.setEnabled(false);
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout expLavoralLayout = new javax.swing.GroupLayout(expLavoral);
        expLavoral.setLayout(expLavoralLayout);
        expLavoralLayout.setHorizontalGroup(
            expLavoralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expLavoralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expLavoralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expLavoralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(exp_area))
                    .addGroup(expLavoralLayout.createSequentialGroup()
                        .addComponent(exp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(expLavoralLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        expLavoralLayout.setVerticalGroup(
            expLavoralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expLavoralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(exp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exp_area, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Exp.Laboral", expLavoral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 480, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
Curriculum persona =  new Curriculum(nombre_area.getText(), apellido_area.getText(), carr_area.getText(),
               metas_area.getText(),edad_area.getText(),direccion_area.getText(),
               cel_area.getText(), email_area.getText(),linkedin_area.getText(), 
               carr_area.getText(),inst_area.getText(), curso_area.getText(), idioma_area.getText(),
               nivel_area.getText(),habUno_Area.getText(), habDos_Area.getText(), habTres_Area.getText(),
               habCuat_Area.getText(),habCin_Area.getText(),exp_area.getText() ); 
        cv.agregar(persona);
        cv.crear();
    }//GEN-LAST:event_btnCrearActionPerformed
  
    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
  
    }//GEN-LAST:event_btnCrearMouseClicked

    
//proceso de validacion de campos para crear el curriculum
    private void nombre_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_nombre_areaKeyReleased

    private void apellido_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_apellido_areaKeyReleased

    private void perfilP_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perfilP_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_perfilP_areaKeyReleased

    private void metas_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metas_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_metas_areaKeyReleased

    private void edad_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edad_areaKeyReleased
       habilitarBtn();
    }//GEN-LAST:event_edad_areaKeyReleased

    private void direccion_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_direccion_areaKeyReleased

    private void cel_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cel_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_cel_areaKeyReleased

    private void email_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_email_areaKeyReleased

    private void linkedin_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkedin_areaKeyReleased
       habilitarBtn();
    }//GEN-LAST:event_linkedin_areaKeyReleased

    private void carr_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carr_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_carr_areaKeyReleased

    private void inst_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inst_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_inst_areaKeyReleased

    private void curso_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curso_areaKeyReleased
        
    }//GEN-LAST:event_curso_areaKeyReleased

    private void idioma_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idioma_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_idioma_areaKeyReleased

    private void nivel_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nivel_areaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_nivel_areaKeyReleased

    private void habUno_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habUno_AreaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_habUno_AreaKeyReleased

    private void habDos_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habDos_AreaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_habDos_AreaKeyReleased

    private void habTres_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habTres_AreaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_habTres_AreaKeyReleased

    private void habCuat_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habCuat_AreaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_habCuat_AreaKeyReleased

    private void habCin_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habCin_AreaKeyReleased
        habilitarBtn();
    }//GEN-LAST:event_habCin_AreaKeyReleased

    private void exp_areaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exp_areaKeyReleased
        
    }//GEN-LAST:event_exp_areaKeyReleased

    private void nombre_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombre_areaFocusLost
        if(nombre_area.getText().isBlank()){
            Co_nombre.setVisible(true);
        }else{
            Co_nombre.setVisible(false);
        }
    }//GEN-LAST:event_nombre_areaFocusLost

    private void apellido_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellido_areaFocusLost
         if(apellido_area.getText().isBlank()){
            Co_apellido.setVisible(true);
        }else{
            Co_apellido.setVisible(false);
        }
    }//GEN-LAST:event_apellido_areaFocusLost

    private void perfilP_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_perfilP_areaFocusLost
        if(perfilP_area.getText().isBlank()){
            Co_perfil.setVisible(true);
        }else{
            Co_perfil.setVisible(false);
        }
    }//GEN-LAST:event_perfilP_areaFocusLost

    private void metas_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_metas_areaFocusLost
          if(metas_area.getText().isBlank()){
            Co_descripcion.setVisible(true);
        }else{
            Co_descripcion.setVisible(false);
        }
    }//GEN-LAST:event_metas_areaFocusLost

    private void edad_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edad_areaFocusLost
          if(edad_area.getText().isBlank()){
            Co_edad.setVisible(true);
        }else{
            Co_edad.setVisible(false);
        }
    }//GEN-LAST:event_edad_areaFocusLost

    private void direccion_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccion_areaFocusLost
          if(direccion_area.getText().isBlank()){
            Co_direccion.setVisible(true);
        }else{
            Co_direccion.setVisible(false);
        }
    }//GEN-LAST:event_direccion_areaFocusLost

    private void cel_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cel_areaFocusLost
          if(cel_area.getText().isBlank()){
            Co_celular.setVisible(true);
        }else{
            Co_celular.setVisible(false);
        }
    }//GEN-LAST:event_cel_areaFocusLost

    private void email_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_areaFocusLost
          if(email_area.getText().isBlank()){
            Co_email.setVisible(true);
        }else{
            Co_email.setVisible(false);
        }
    }//GEN-LAST:event_email_areaFocusLost

    private void linkedin_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linkedin_areaFocusLost
          if(linkedin_area.getText().isBlank()){
            Co_linkedin.setVisible(true);
        }else{
            Co_linkedin.setVisible(false);
        }
    }//GEN-LAST:event_linkedin_areaFocusLost

    private void carr_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carr_areaFocusLost
           if(carr_area.getText().isBlank()){
            Co_carrera.setVisible(true);
        }else{
            Co_carrera.setVisible(false);
        }
    }//GEN-LAST:event_carr_areaFocusLost

    private void inst_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inst_areaFocusLost
          if(inst_area.getText().isBlank()){
            Co_institucion.setVisible(true);
        }else{
            Co_institucion.setVisible(false);
        }
    }//GEN-LAST:event_inst_areaFocusLost

    private void idioma_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idioma_areaFocusLost
           if(idioma_area.getText().isBlank()){
            Co_idioma.setVisible(true);
        }else{
            Co_idioma.setVisible(false);
        }
    }//GEN-LAST:event_idioma_areaFocusLost

    private void nivel_areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nivel_areaFocusLost
           if(nivel_area.getText().isBlank()){
            Co_idiomalvl.setVisible(true);
        }else{
            Co_idiomalvl.setVisible(false);
        }
    }//GEN-LAST:event_nivel_areaFocusLost

    private void habUno_AreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_habUno_AreaFocusLost
           if(habUno_Area.getText().isBlank()){
            Co_hab1.setVisible(true);
        }else{
            Co_hab1.setVisible(false);
        }
    }//GEN-LAST:event_habUno_AreaFocusLost

    private void habDos_AreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_habDos_AreaFocusLost
            if(habDos_Area.getText().isBlank()){
            Co_hab2.setVisible(true);
        }else{
            Co_hab2.setVisible(false);
        }
    }//GEN-LAST:event_habDos_AreaFocusLost

    private void habTres_AreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_habTres_AreaFocusLost
            if(habTres_Area.getText().isBlank()){
            Co_hab3.setVisible(true);
        }else{
            Co_hab3.setVisible(false);
        }
    }//GEN-LAST:event_habTres_AreaFocusLost

    private void habCuat_AreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_habCuat_AreaFocusLost
            if(habCuat_Area.getText().isBlank()){
            Co_hab4.setVisible(true);
        }else{
            Co_hab4.setVisible(false);
        }
    }//GEN-LAST:event_habCuat_AreaFocusLost

    private void habCin_AreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_habCin_AreaFocusLost
            if(habCin_Area.getText().isBlank()){
            Co_hab5.setVisible(true);
        }else{
            Co_hab5.setVisible(false);
        }
    }//GEN-LAST:event_habCin_AreaFocusLost
   
           
     public static void main(String[] args) throws InterruptedException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vistaPanel1().setVisible(true);
            }
        });
    
     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Co_apellido;
    private javax.swing.JLabel Co_carrera;
    private javax.swing.JLabel Co_celular;
    private javax.swing.JLabel Co_descripcion;
    private javax.swing.JLabel Co_direccion;
    private javax.swing.JLabel Co_edad;
    private javax.swing.JLabel Co_email;
    private javax.swing.JLabel Co_hab1;
    private javax.swing.JLabel Co_hab2;
    private javax.swing.JLabel Co_hab3;
    private javax.swing.JLabel Co_hab4;
    private javax.swing.JLabel Co_hab5;
    private javax.swing.JLabel Co_idioma;
    private javax.swing.JLabel Co_idiomalvl;
    private javax.swing.JLabel Co_institucion;
    private javax.swing.JLabel Co_linkedin;
    private javax.swing.JLabel Co_nombre;
    private javax.swing.JLabel Co_perfil;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Personal;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextArea apellido_area;
    private javax.swing.JLabel blog1;
    private javax.swing.JLabel blog2;
    private javax.swing.JLabel blog3;
    private javax.swing.JLabel blog4;
    private javax.swing.JLabel blog5;
    private javax.swing.JLabel blog6;
    private javax.swing.JButton btnCrear;
    private javax.swing.JTextArea carr_area;
    private javax.swing.JLabel carrera;
    private javax.swing.JLabel cel;
    private javax.swing.JTextArea cel_area;
    private javax.swing.JLabel consejos;
    private javax.swing.JLabel curso;
    private javax.swing.JTextArea curso_area;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextArea direccion_area;
    private javax.swing.JLabel edad;
    private javax.swing.JTextArea edad_area;
    private javax.swing.JLabel email;
    private javax.swing.JTextArea email_area;
    private javax.swing.JLabel exp;
    private javax.swing.JPanel expLavoral;
    private javax.swing.JTextArea exp_area;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel habCin;
    private javax.swing.JTextArea habCin_Area;
    private javax.swing.JLabel habCuat;
    private javax.swing.JTextArea habCuat_Area;
    private javax.swing.JLabel habDos;
    private javax.swing.JTextArea habDos_Area;
    private javax.swing.JLabel habTres;
    private javax.swing.JTextArea habTres_Area;
    private javax.swing.JLabel habUno;
    private javax.swing.JTextArea habUno_Area;
    private javax.swing.JLabel idioma;
    private javax.swing.JTextArea idioma_area;
    private javax.swing.JTextArea inst_area;
    private javax.swing.JLabel institucion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel linkedin;
    private javax.swing.JTextArea linkedin_area;
    private javax.swing.JLabel metas;
    private javax.swing.JTextArea metas_area;
    private javax.swing.JLabel nivel;
    private javax.swing.JTextArea nivel_area;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextArea nombre_area;
    private javax.swing.JLabel perfilP;
    private javax.swing.JTextArea perfilP_area;
    private javax.swing.JPanel profesional;
    private javax.swing.JLabel skill;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

