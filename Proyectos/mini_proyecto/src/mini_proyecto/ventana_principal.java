
package mini_proyecto;

// Librerias
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.String;
import javax.swing.*;

public class ventana_principal extends javax.swing.JFrame {   
 static String sa=""; 
 static String joro=""; 
 static String gai=""; 
 static String rk=""; 
 static String pp=""; 
 static String regge=""; 
 static String ed ="";
 static POO jop = new POO();
 static swich sc = new swich();
 static rdbtn_estudios estudios = new rdbtn_estudios();
 static String contenedora ="";
 static String contenedorb ="";
 
    public ventana_principal() {
        initComponents();
        
        nombre.addKeyListener(new KeyAdapter(){
           
            @Override
            public void keyTyped(KeyEvent evt){
            
            if (nombre.getText().length() >= 8){
    evt.consume();

}
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        educ_grupo = new javax.swing.ButtonGroup();
        pais_grupo = new javax.swing.ButtonGroup();
        Bienvenida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Basica = new javax.swing.JRadioButton();
        Superior = new javax.swing.JRadioButton();
        Maestria = new javax.swing.JRadioButton();
        combo_comida = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Secundaria = new javax.swing.JRadioButton();
        Rock = new javax.swing.JCheckBox();
        Salsa = new javax.swing.JCheckBox();
        Pop = new javax.swing.JCheckBox();
        Reggaeton = new javax.swing.JCheckBox();
        Gaita = new javax.swing.JCheckBox();
        Joropo = new javax.swing.JCheckBox();
        pais1_click = new javax.swing.JRadioButton();
        pais2 = new javax.swing.JRadioButton();
        pais3 = new javax.swing.JRadioButton();
        pais4 = new javax.swing.JRadioButton();
        pais5 = new javax.swing.JRadioButton();
        pais6 = new javax.swing.JRadioButton();
        pais7 = new javax.swing.JRadioButton();
        pais8 = new javax.swing.JRadioButton();
        btn_cerrar = new javax.swing.JButton();
        edad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Direccion1 = new javax.swing.JLabel();
        btn_for = new javax.swing.JButton();
        txt_pais = new javax.swing.JScrollPane();
        textarea_pais = new javax.swing.JTextArea();
        txt_datos = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        Edad = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(-4144960,true));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Monospaced", 1, 24));
        Bienvenida.setForeground(new java.awt.Color(-1,true));
        Bienvenida.setText("??Bienvenido, usuario!, registra tus datos aqu??.");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 40));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14));
        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Paises que quisieras visitar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 290, 20));

        educ_grupo.add(Basica);
        Basica.setForeground(new java.awt.Color(0, 0, 255));
        Basica.setText("Basica");
        Basica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_basica(evt);
            }
        });
        getContentPane().add(Basica, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 100, -1));

        educ_grupo.add(Superior);
        Superior.setForeground(new java.awt.Color(0, 0, 255));
        Superior.setText("Superior");
        Superior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_superior(evt);
            }
        });
        getContentPane().add(Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 80, -1));

        educ_grupo.add(Maestria);
        Maestria.setForeground(new java.awt.Color(0, 0, 255));
        Maestria.setText("Maestr??a");
        Maestria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_maestria(evt);
            }
        });
        getContentPane().add(Maestria, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 80, -1));

        combo_comida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spaghetti", "Pabell??n", "Mandocas", "Choripan" }));
        getContentPane().add(combo_comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 160, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 12));
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("Comida favorita");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 190, 20));

        educ_grupo.add(Secundaria);
        Secundaria.setForeground(new java.awt.Color(0, 0, 255));
        Secundaria.setText("Secundaria");
        Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_secundaria(evt);
            }
        });
        getContentPane().add(Secundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, -1));

        Rock.setForeground(new java.awt.Color(0, 0, 255));
        Rock.setText("Rock");
        getContentPane().add(Rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 80, 20));

        Salsa.setBackground(new java.awt.Color(-1,true));
        Salsa.setForeground(new java.awt.Color(0, 51, 255));
        Salsa.setText("Salsa");
        getContentPane().add(Salsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 80, -1));

        Pop.setForeground(new java.awt.Color(0, 0, 255));
        Pop.setText("Pop");
        getContentPane().add(Pop, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 80, -1));

        Reggaeton.setForeground(new java.awt.Color(0, 0, 255));
        Reggaeton.setText("Reggaeton");
        getContentPane().add(Reggaeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        Gaita.setForeground(new java.awt.Color(0, 0, 255));
        Gaita.setText("Gaita");
        getContentPane().add(Gaita, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 80, -1));

        Joropo.setForeground(new java.awt.Color(0, 0, 255));
        Joropo.setText("Joropo");
        getContentPane().add(Joropo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 80, -1));

        pais_grupo.add(pais1_click);
        pais1_click.setForeground(new java.awt.Color(0, 255, 51));
        pais1_click.setText("Colombia");
        pais1_click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais1_click(evt);
            }
        });
        getContentPane().add(pais1_click, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        pais_grupo.add(pais2);
        pais2.setForeground(new java.awt.Color(0, 255, 51));
        pais2.setText("Per??");
        pais2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais2_click(evt);
            }
        });
        getContentPane().add(pais2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        pais_grupo.add(pais3);
        pais3.setForeground(new java.awt.Color(0, 255, 51));
        pais3.setText("Brasil");
        pais3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais3_click(evt);
            }
        });
        getContentPane().add(pais3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        pais_grupo.add(pais4);
        pais4.setForeground(new java.awt.Color(0, 255, 0));
        pais4.setText("Italia");
        pais4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais4_click(evt);
            }
        });
        getContentPane().add(pais4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        pais_grupo.add(pais5);
        pais5.setForeground(new java.awt.Color(0, 255, 51));
        pais5.setText("Polonia");
        pais5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais5_click(evt);
            }
        });
        getContentPane().add(pais5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        pais_grupo.add(pais6);
        pais6.setForeground(new java.awt.Color(0, 255, 51));
        pais6.setText("Reino Unido");
        pais6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais6_click(evt);
            }
        });
        getContentPane().add(pais6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        pais_grupo.add(pais7);
        pais7.setForeground(new java.awt.Color(0, 255, 51));
        pais7.setText("Jap??n");
        pais7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais7_click(evt);
            }
        });
        getContentPane().add(pais7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        pais_grupo.add(pais8);
        pais8.setForeground(new java.awt.Color(0, 255, 51));
        pais8.setText("China");
        pais8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pais8_click(evt);
            }
        });
        getContentPane().add(pais8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_programa(evt);
            }
        });
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edad_limitador(evt);
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 33));

        nombre.setToolTipText("No se puede agregar mas de 8 caracteres.");
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_limitador(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 33));

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido_limitador(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 33));

        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccion_limitador(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 33));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14));
        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Informaci??n del pais:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, -1));

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14));
        jLabel6.setForeground(new java.awt.Color(-1,true));
        jLabel6.setText("Nivel de estudios");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 150, 20));

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutar_resultado(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 140, 40));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_datos(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 130, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14));
        jLabel7.setForeground(new java.awt.Color(-1,true));
        jLabel7.setText("Gustos musicales");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 170, -1));

        Direccion1.setForeground(new java.awt.Color(-1,true));
        Direccion1.setText("     Direcci??n");
        getContentPane().add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 78, -1));

        btn_for.setText("FOR");
        btn_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for_ejecucion(evt);
            }
        });
        getContentPane().add(btn_for, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 70, 40));

        textarea_pais.setEditable(false);
        textarea_pais.setColumns(20);
        textarea_pais.setLineWrap(true);
        textarea_pais.setRows(5);
        txt_pais.setViewportView(textarea_pais);

        getContentPane().add(txt_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 360, 210));

        datos.setEditable(false);
        datos.setColumns(20);
        datos.setRows(5);
        txt_datos.setViewportView(datos);

        getContentPane().add(txt_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 230, 130));

        Edad.setForeground(new java.awt.Color(-1,true));
        Edad.setText("       Edad");
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 79, -1));

        Nombre.setForeground(new java.awt.Color(-1,true));
        Nombre.setText("      Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, -1));

        Apellido.setForeground(new java.awt.Color(-1,true));
        Apellido.setText("     Apellido");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 62, -1));

        Direccion.setForeground(new java.awt.Color(-1,true));
        Direccion.setText("     Datos:");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 78, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/When.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
private void nombre_limitador(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_limitador
char c = evt.getKeyChar();
if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_PERIOD) || (c==KeyEvent.VK_BACK_SPACE)  )) {
    jop.mensaje("No puedes ingresar numeros en este campo");
    getToolkit().beep(); 
    evt.consume();
   }
}//GEN-LAST:event_nombre_limitador

private void edad_limitador(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edad_limitador
char c = evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE)  )) {
    jop.mensaje("No puedes ingresar letras en este campo");
    getToolkit().beep(); 
    evt.consume(); 
   }
}//GEN-LAST:event_edad_limitador

    private void apellido_limitador(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_limitador
char c = evt.getKeyChar();
if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_PERIOD) || (c==KeyEvent.VK_BACK_SPACE)  )) {
    jop.mensaje("No puedes ingresar numeros en este campo");
    getToolkit().beep(); 
    evt.consume();
}
    }//GEN-LAST:event_apellido_limitador

    private void direccion_limitador(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_limitador
char c = evt.getKeyChar();
if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_PERIOD) || (c==KeyEvent.VK_BACK_SPACE)  )) {
    jop.mensaje("No puedes ingresar numeros en este campo");
    getToolkit().beep(); 
    evt.consume();
}
    }//GEN-LAST:event_direccion_limitador

private void limpiar_datos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_datos

// Pondra todos los campos de texto vacios  
edad.setText("");
nombre.setText("");
apellido.setText("");
direccion.setText("");
datos.setText("");
textarea_pais.setText("");

// Mensaje de tarea completada
getToolkit().beep(); 
jop.mensaje("Limpieza exitosa");
}//GEN-LAST:event_limpiar_datos

    private void cerrar_programa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_programa
         System.exit(0);
    }//GEN-LAST:event_cerrar_programa

    private void pais1_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais1_click
        jop.mensaje("Pa??s elegido: Colombia");
        sc.paises(1);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais1_click

    private void pais2_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais2_click
        jop.mensaje("Pa??s elegido: Per??");
        sc.paises(2);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais2_click

    private void pais3_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais3_click
        jop.mensaje("Pa??s elegido: Brasil");
        sc.paises(3);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais3_click

    private void pais4_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais4_click
        jop.mensaje("Pa??s elegido: Italia");
        sc.paises(4);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais4_click

    private void pais5_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais5_click
        jop.mensaje("Pa??s elegido: Polonia");
        sc.paises(5);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais5_click

    private void pais6_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais6_click
        jop.mensaje("Pa??s elegido: Reino Unido");
        sc.paises(6);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais6_click

    private void pais7_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais7_click
        jop.mensaje("Pa??s elegido: Jap??n");
        sc.paises(7);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais7_click

    private void pais8_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pais8_click
        jop.mensaje("Pa??s elegido: China");
        sc.paises(8);
        textarea_pais.setText(sc.res);
    }//GEN-LAST:event_pais8_click

    private void ejecutar_resultado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutar_resultado

// Declaraci??n de variables contenedoras
String var2;    // Nombre
String var3;    // Apellido
String var4;    // Direccion
String var5;
     
// Recolecci??n de valores
String cnt_var1 = edad.getText();      // Variable contenedora
int var1 = Integer.parseInt(cnt_var1); // Transformaci??n de String a int
var5 = (String)combo_comida.getSelectedItem();
// ---
var2= nombre.getText();
var3= apellido.getText();         
var4= direccion.getText();

/*
=====================
Inicio de debugger
=====================
Este algoritmo ejecutara varios procesos para verificar dos requisitos, la edad y longitud del nombre.
Una vez indetificado el caso de ambos, tomara las medidas adecuadas
*/

// Verificacion de la edad
if(var1 <=17) {
    getToolkit().beep();
    jop.mensaje("Los menores de 18 a??os no pueden registrarse");
    edad.setText("");  
} else if(var1 >=61) {
    getToolkit().beep();
    jop.mensaje("Los mayores a 60 a??os no pueden registrarse");
    edad.setText("");  
}
if(var1 >=18 && var1 <= 60){
    ed=edad.getText();
    edad.setText("");
}
if(Salsa.isSelected()){
    sa=Salsa.getText();
}else{
    sa="";
}
if(Joropo.isSelected()){
    joro=Joropo.getText();
}else{
    joro="";
}
if(Gaita.isSelected()){
    gai=Gaita.getText();
}else{
    gai="";
}
if(Pop.isSelected()){
    pp=Pop.getText();
}else{
    pp="";
}
if(Rock.isSelected()){
    rk=Rock.getText();
}else{
    rk="";
}
if(Reggaeton.isSelected()){
    regge=Reggaeton.getText();
}else{
    regge="";
}
 datos.setText(ed +"\r\n" + var2 + "\r\n" + var3 + "\r\n" + var4 + "\r\n\r\n" + "Nivel escolar:" + "\r\n" + rdbtn_estudios.estudio_res + "\r\n\r\n" + "Comida favorita:" + "\r\n" + var5 + "\r\n\r\n" + "Gustos:" + "\r\n" + sa + "\r\n" + regge + "\r\n" + pp + "\r\n" + gai + "\r\n"  + joro  + "\r\n" + rk  );
/*
=====================
Fin de debugger
=====================
*/
    }//GEN-LAST:event_ejecutar_resultado

    private void for_ejecucion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_for_ejecucion
for(int i=5; i<51; i++ ){
       contenedora += "\n"+ i;
      }

      for(int i=50; i>=5; i--){
      contenedorb += "\n" + i;
      }
      jop.mensaje(contenedora);
          jop.mensaje(contenedorb);
    }//GEN-LAST:event_for_ejecucion

    private void radio_basica(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_basica
        estudios.liceo(1);
    }//GEN-LAST:event_radio_basica

    private void radio_secundaria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_secundaria
        estudios.liceo(2);
    }//GEN-LAST:event_radio_secundaria

    private void radio_superior(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_superior
        estudios.liceo(3);
    }//GEN-LAST:event_radio_superior

    private void radio_maestria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_maestria
        estudios.liceo(4);
    }//GEN-LAST:event_radio_maestria

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
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    jop.mensaje("Bienvenido al programa de registro.");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventana_principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JRadioButton Basica;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Edad;
    private javax.swing.JCheckBox Gaita;
    private javax.swing.JCheckBox Joropo;
    private javax.swing.JRadioButton Maestria;
    private javax.swing.JLabel Nombre;
    private javax.swing.JCheckBox Pop;
    private javax.swing.JCheckBox Reggaeton;
    private javax.swing.JCheckBox Rock;
    private javax.swing.JCheckBox Salsa;
    private javax.swing.JRadioButton Secundaria;
    private javax.swing.JRadioButton Superior;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_for;
    private javax.swing.JComboBox combo_comida;
    private javax.swing.JTextArea datos;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.ButtonGroup educ_grupo;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton pais1_click;
    private javax.swing.JRadioButton pais2;
    private javax.swing.JRadioButton pais3;
    private javax.swing.JRadioButton pais4;
    private javax.swing.JRadioButton pais5;
    private javax.swing.JRadioButton pais6;
    private javax.swing.JRadioButton pais7;
    private javax.swing.JRadioButton pais8;
    private javax.swing.ButtonGroup pais_grupo;
    private javax.swing.JTextArea textarea_pais;
    private javax.swing.JScrollPane txt_datos;
    private javax.swing.JScrollPane txt_pais;
    // End of variables declaration//GEN-END:variables
}
