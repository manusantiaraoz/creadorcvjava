
package GUI;
import GUI.Curriculum;
import GUI.Manejocv;


public class vistaPanel1 extends javax.swing.JFrame {
Manejocv cv = new Manejocv();
    
    public vistaPanel1() {
        initComponents();
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
        nombre_area = new javax.swing.JTextArea();
        apellido = new javax.swing.JLabel();
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
        footer.setText("Briz-Santi-Sbrocco");
        footer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(footer)
                .addGap(349, 349, 349))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consejos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(357, 357, 357))
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
                        .addComponent(blog4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(349, 349, 349)))
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
                .addGap(35, 35, 35)
                .addComponent(footer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 153, 51));

        Personal.setBackground(new java.awt.Color(51, 51, 51));
        Personal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nombre.setForeground(new java.awt.Color(153, 153, 153));
        nombre.setText("¿Cual es tu nombre?:");

        nombre_area.setBackground(new java.awt.Color(153, 153, 153));
        nombre_area.setColumns(20);
        nombre_area.setRows(5);

        apellido.setForeground(new java.awt.Color(153, 153, 153));
        apellido.setText("¿Cual es tu Apellido?:");

        apellido_area.setBackground(new java.awt.Color(153, 153, 153));
        apellido_area.setColumns(20);
        apellido_area.setRows(5);

        perfilP.setForeground(new java.awt.Color(153, 153, 153));
        perfilP.setText("¿Cual es tu perfil Profesional?:");

        perfilP_area.setBackground(new java.awt.Color(153, 153, 153));
        perfilP_area.setColumns(20);
        perfilP_area.setRows(5);

        metas.setForeground(new java.awt.Color(153, 153, 153));
        metas.setText("Cuentanos una breve descripcion de tu perfil, tus metas y proyectos:");

        metas_area.setBackground(new java.awt.Color(153, 153, 153));
        metas_area.setColumns(20);
        metas_area.setRows(5);

        edad.setForeground(new java.awt.Color(153, 153, 153));
        edad.setText("¿Cual es tu edad?:");

        edad_area.setBackground(new java.awt.Color(153, 153, 153));
        edad_area.setColumns(20);
        edad_area.setRows(5);

        direccion.setForeground(new java.awt.Color(153, 153, 153));
        direccion.setText("¿Cual es tu direccion?:");

        direccion_area.setBackground(new java.awt.Color(153, 153, 153));
        direccion_area.setColumns(20);
        direccion_area.setRows(5);

        cel.setForeground(new java.awt.Color(153, 153, 153));
        cel.setText("ingresá tu numero de Celular:");

        cel_area.setBackground(new java.awt.Color(153, 153, 153));
        cel_area.setColumns(20);
        cel_area.setRows(5);

        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("ingresá tu email:");

        email_area.setBackground(new java.awt.Color(153, 153, 153));
        email_area.setColumns(20);
        email_area.setRows(5);

        linkedin.setForeground(new java.awt.Color(153, 153, 153));
        linkedin.setText("ingresá tu linkedin:");

        linkedin_area.setBackground(new java.awt.Color(153, 153, 153));
        linkedin_area.setColumns(20);
        linkedin_area.setRows(5);

        javax.swing.GroupLayout PersonalLayout = new javax.swing.GroupLayout(Personal);
        Personal.setLayout(PersonalLayout);
        PersonalLayout.setHorizontalGroup(
            PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PersonalLayout.createSequentialGroup()
                            .addComponent(nombre)
                            .addGap(134, 134, 134)
                            .addComponent(apellido))
                        .addComponent(perfilP)
                        .addComponent(perfilP_area, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(metas_area, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PersonalLayout.createSequentialGroup()
                            .addComponent(nombre_area, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(apellido_area))
                        .addComponent(metas))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cel))
                        .addGap(18, 18, 18)
                        .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email)))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(linkedin_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(linkedin)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PersonalLayout.setVerticalGroup(
            PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_area, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_area, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addComponent(perfilP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perfilP_area, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(metas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(metas_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(edad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addComponent(direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addComponent(cel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalLayout.createSequentialGroup()
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(linkedin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkedin_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal", Personal);

        profesional.setBackground(new java.awt.Color(51, 51, 51));

        carrera.setForeground(new java.awt.Color(153, 153, 153));
        carrera.setText("¿Que carrera estudias?:");

        carr_area.setBackground(new java.awt.Color(153, 153, 153));
        carr_area.setColumns(20);
        carr_area.setRows(5);

        institucion.setForeground(new java.awt.Color(153, 153, 153));
        institucion.setText("Nombre de la institucion:");

        inst_area.setBackground(new java.awt.Color(153, 153, 153));
        inst_area.setColumns(20);
        inst_area.setRows(5);
        inst_area.setSelectedTextColor(new java.awt.Color(0, 102, 255));

        curso.setForeground(new java.awt.Color(153, 153, 153));
        curso.setText("Si realizaste algun curso ingresa aqui el nombre:");

        curso_area.setBackground(new java.awt.Color(153, 153, 153));
        curso_area.setColumns(20);
        curso_area.setRows(5);

        idioma.setForeground(new java.awt.Color(153, 153, 153));
        idioma.setText("¿Caul es tu segundo Idioma?");

        idioma_area.setBackground(new java.awt.Color(153, 153, 153));
        idioma_area.setColumns(20);
        idioma_area.setRows(5);

        nivel.setForeground(new java.awt.Color(153, 153, 153));
        nivel.setText("¿cual es tu nivel?");

        nivel_area.setBackground(new java.awt.Color(153, 153, 153));
        nivel_area.setColumns(20);
        nivel_area.setForeground(new java.awt.Color(0, 0, 0));
        nivel_area.setRows(5);
        nivel_area.setCaretColor(new java.awt.Color(0, 0, 0));
        nivel_area.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        skill.setForeground(new java.awt.Color(153, 153, 153));
        skill.setText("Ingresa los lenguajes de programacion, herramientas, tecnologias que utilizas");
        skill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        habUno.setForeground(new java.awt.Color(153, 153, 153));
        habUno.setText("habilidad 1");

        habUno_Area.setBackground(new java.awt.Color(153, 153, 153));
        habUno_Area.setColumns(20);
        habUno_Area.setRows(5);

        habDos.setForeground(new java.awt.Color(153, 153, 153));
        habDos.setText("habilidad 2");

        habDos_Area.setBackground(new java.awt.Color(153, 153, 153));
        habDos_Area.setColumns(20);
        habDos_Area.setRows(5);

        habTres.setForeground(new java.awt.Color(153, 153, 153));
        habTres.setText("habilidad 3");

        habTres_Area.setBackground(new java.awt.Color(153, 153, 153));
        habTres_Area.setColumns(20);
        habTres_Area.setRows(5);

        habCuat.setForeground(new java.awt.Color(153, 153, 153));
        habCuat.setText("habilidad 4");

        habCin_Area.setBackground(new java.awt.Color(153, 153, 153));
        habCin_Area.setColumns(20);
        habCin_Area.setRows(5);

        habCin.setForeground(new java.awt.Color(153, 153, 153));
        habCin.setText("habilidad 5");

        habCuat_Area.setBackground(new java.awt.Color(153, 153, 153));
        habCuat_Area.setColumns(20);
        habCuat_Area.setRows(5);

        javax.swing.GroupLayout profesionalLayout = new javax.swing.GroupLayout(profesional);
        profesional.setLayout(profesionalLayout);
        profesionalLayout.setHorizontalGroup(
            profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carrera)
                            .addComponent(institucion)
                            .addComponent(curso))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(habDos_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(habCuat_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carr_area)
                    .addComponent(inst_area)
                    .addComponent(curso_area)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idioma)
                            .addComponent(idioma_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nivel)
                            .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(skill, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(habCin))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habUno)
                    .addComponent(habDos)
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(habUno_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profesionalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habTres_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profesionalLayout.createSequentialGroup()
                        .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(habTres)
                            .addComponent(habCuat))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(profesionalLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(habCin_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        profesionalLayout.setVerticalGroup(
            profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carr_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(institucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inst_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curso_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idioma)
                    .addComponent(nivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idioma_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(skill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habUno)
                    .addComponent(habTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habUno_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habTres_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habDos)
                    .addComponent(habCuat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(profesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habCuat_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habDos_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habCin)
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

        btnCrear.setBackground(new java.awt.Color(102, 102, 102));
        btnCrear.setForeground(new java.awt.Color(204, 51, 0));
        btnCrear.setText("Crear Cv");
        btnCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrear.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
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
       Curriculum persona = new Curriculum(nombre_area.getText(), apellido_area.getText(), carr_area.getText(),
               metas_area.getText(),edad_area.getText(),direccion_area.getText(),
               cel_area.getText(), email_area.getText(),linkedin_area.getText(), 
               carr_area.getText(),inst_area.getText(), curso_area.getText(), idioma_area.getText(),
               nivel_area.getText(),habUno_Area.getText(), habDos_Area.getText(), habTres_Area.getText(),
               habCuat_Area.getText(),habCin_Area.getText(),exp_area.getText() );  
        
        cv.agregar(persona);
        cv.crear();
        System.out.println("+++++++++++++++++++boton apretado++++++++++++++++++");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
  
    }//GEN-LAST:event_btnCrearMouseClicked
   
           
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

