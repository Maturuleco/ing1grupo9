/*
 * IngresoMesaCraps.java
 *
 * Created on 9 de julio de 2008, 22:32
 */

package tvirtualcraps.vista;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import tvirtualcraps.entidades.entrada.EntradaCraps;
import tvirtualcraps.entidades.Mesa;
import tvirtualcraps.entidades.MesaConverter;
import tvirtualcraps.entidades.Usuario;
import tvirtualcraps.entidades.UsuarioConverter;
import tvirtualcraps.entidades.VTermConverter;
import tvirtualcraps.entidades.Vterm;
import tvirtualcraps.entidades.entrada.RespuestaEntradaCraps;

/**
 *
 * @author  Yakko
 */
public class IngresoMesaCraps extends javax.swing.JFrame {

    /** Creates new form IngresoMesaCraps */
    public IngresoMesaCraps() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextUsuario = new javax.swing.JTextField();
        jTextMesa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEntrada = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextIdTerminal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextIdGrupo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioAceptadoSi = new javax.swing.JRadioButton();
        jRadioAceptadoNo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMotivo = new javax.swing.JTextArea();
        jButtonSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso/Egreso Mesa Craps");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso"));
        jPanel1.setName("jPanel1"); // NOI18N

        jTextUsuario.setName("jTextUsuario"); // NOI18N

        jTextMesa.setName("jTextMesa"); // NOI18N

        jLabel2.setText("Jugador");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Mesa");
        jLabel3.setName("jLabel3"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jTextMesa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jTextUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextMesa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButtonEntrada.setText("Entrada");
        jButtonEntrada.setName("jButtonEntrada"); // NOI18N
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Terminal"));
        jPanel2.setName("jPanel2"); // NOI18N

        jTextIdTerminal.setName("jTextIdTerminal"); // NOI18N

        jLabel1.setText("Id Terminal");
        jLabel1.setName("jLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTextIdTerminal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextIdTerminal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo"));
        jPanel3.setName("jPanel3"); // NOI18N

        jTextIdGrupo.setName("jTextIdGrupo"); // NOI18N

        jLabel4.setText("Grupo");
        jLabel4.setName("jLabel4"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTextIdGrupo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextIdGrupo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Respuesta"));
        jPanel4.setName("jPanel4"); // NOI18N

        jRadioAceptadoSi.setText("Si");
        jRadioAceptadoSi.setEnabled(false);
        jRadioAceptadoSi.setName("jRadioAceptadoSi"); // NOI18N

        jRadioAceptadoNo.setText("No");
        jRadioAceptadoNo.setEnabled(false);
        jRadioAceptadoNo.setName("jRadioAceptadoNo"); // NOI18N
        jRadioAceptadoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAceptadoNoActionPerformed(evt);
            }
        });

        jLabel5.setText("Aceptado");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("Motivo");
        jLabel6.setName("jLabel6"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextMotivo.setColumns(10);
        jTextMotivo.setRows(3);
        jTextMotivo.setEnabled(false);
        jTextMotivo.setMaximumSize(new java.awt.Dimension(80, 54));
        jTextMotivo.setMinimumSize(new java.awt.Dimension(80, 54));
        jTextMotivo.setName("jTextMotivo"); // NOI18N
        jScrollPane1.setViewportView(jTextMotivo);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jRadioAceptadoSi)
                        .add(18, 18, 18)
                        .add(jRadioAceptadoNo))
                    .add(jLabel5)
                    .add(jLabel6)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jLabel5)
                .add(5, 5, 5)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioAceptadoNo)
                    .add(jRadioAceptadoSi))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSalida.setText("Salida");
        jButtonSalida.setName("jButtonSalida"); // NOI18N
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButtonEntrada)
                        .add(17, 17, 17)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jButtonSalida)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSalida)
                    .add(jButtonEntrada))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed
    
    String vTerm = "0000" + this.jTextIdTerminal.getText();
    vTerm = vTerm.substring(vTerm.length()-4, vTerm.length());
    String grupo = "00" + this.jTextIdGrupo.getText();
    grupo = grupo.substring(grupo.length()-2, grupo.length());
    String usuario = this.jTextUsuario.getText();
    String mesa = this.jTextMesa.getText();

    EntradaCraps entrada = new EntradaCraps(new Vterm(vTerm), new Usuario(usuario), new Mesa(mesa));
    XStream xstream = new XStream();

    xstream.alias("entradaCraps", EntradaCraps.class);
    xstream.useAttributeFor(EntradaCraps.class, "vTerm");
    xstream.registerConverter(new VTermConverter());

    xstream.useAttributeFor(EntradaCraps.class, "usuario");
    xstream.registerConverter(new UsuarioConverter());

    xstream.useAttributeFor(EntradaCraps.class, "mesa");
    xstream.registerConverter(new MesaConverter());


    String xml = xstream.toXML(entrada);
    xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + xml;
    //System.out.println(xml);

    FileWriter file;
    try {
    file = new FileWriter("/Temp/Servidor/entradaCraps" + grupo + vTerm + ".xml");
    file.write(xml);
    file.close();

    } catch (IOException ex) {
       System.err.println("Error en generacion archivo de entrada");
    } 

    String archivo = "/Temp/respuestaEntradaCraps" + grupo  + vTerm + ".xml";
    while (!(new File(archivo)).exists());
  
    StringBuffer buff = new StringBuffer();
    
    try {
        FileReader fileR = new FileReader(archivo);
    
        fileR.read();

        int c;
        while ((c = fileR.read()) != -1) {
            buff.append(Character.toChars(c)[0]);
        }
        
        fileR.close();
        
        while (!(new File(archivo)).delete());
        
    } catch (IOException ex) {
        System.err.println("Error en lectura respuesta de entrada");
    }
    
    String xml2 = buff.toString();
    
    xml2 = xml2.substring(xml2.indexOf("?>") + 3);
    
    //System.out.println(xml2);
      
    XStream xstream1 = new XStream(new DomDriver());
    
    xstream1.alias("entradaCraps", RespuestaEntradaCraps.class);
    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "vTerm");
    xstream1.registerConverter(new VTermConverter());

    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "usuario");
    xstream1.registerConverter(new UsuarioConverter());

    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "mesa");
    xstream1.registerConverter(new MesaConverter());

    //RespuestaEntradaCraps respuesta = new RespuestaEntradaCraps(new Vterm(vTerm), new Usuario(usuario), new Mesa(mesa), "si", "todo bien");
    //xml = xstream1.toXML(respuesta);
    //xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + xml;
    //System.out.println(xml);
    
    RespuestaEntradaCraps respuesta = (RespuestaEntradaCraps)xstream1.fromXML(xml2);
    
    if ("si".equals(respuesta.getAceptado())) {
        this.jRadioAceptadoSi.setSelected(true);
        this.jRadioAceptadoNo.setSelected(false);
    } else {
        this.jRadioAceptadoSi.setSelected(false);
        this.jRadioAceptadoNo.setSelected(true);
    }
    
    this.jTextMotivo.setText(respuesta.getDescripcion());
    
    EventHandler eh = new EventHandler(grupo, vTerm);
    
    eh.setVisible(true);
    
    eh.readState();   
}//GEN-LAST:event_jButtonEntradaActionPerformed

private void jRadioAceptadoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAceptadoNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jRadioAceptadoNoActionPerformed

private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed

    String vTerm = "0000" + this.jTextIdTerminal.getText();
    vTerm = vTerm.substring(vTerm.length()-4, vTerm.length());
    String grupo = "00" + this.jTextIdGrupo.getText();
    grupo = grupo.substring(grupo.length()-2, grupo.length());
    String usuario = this.jTextUsuario.getText();
    String mesa = this.jTextMesa.getText();

    EntradaCraps entrada = new EntradaCraps(new Vterm(vTerm), new Usuario(usuario), new Mesa(mesa));
    XStream xstream = new XStream();

    xstream.alias("salidaCraps", EntradaCraps.class);
    xstream.useAttributeFor(EntradaCraps.class, "vTerm");
    xstream.registerConverter(new VTermConverter());

    xstream.useAttributeFor(EntradaCraps.class, "usuario");
    xstream.registerConverter(new UsuarioConverter());

    xstream.useAttributeFor(EntradaCraps.class, "mesa");
    xstream.registerConverter(new MesaConverter());


    String xml = xstream.toXML(entrada);
    xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + xml;
    //System.out.println(xml);

    FileWriter file;
    try {
    file = new FileWriter("/Temp/Servidor/salidaCraps" + grupo + vTerm + ".xml");
    file.write(xml);
    file.close();

    } catch (IOException ex) {
       System.err.println("Error en generacion archivo de salida");
    } 
    
    String archivo = "/Temp/respuestaSalidaCraps" + grupo  + vTerm + ".xml";

    while (!(new File(archivo)).exists());
  
    StringBuffer buff = new StringBuffer();
    
    try {
        FileReader fileR = new FileReader(archivo);
    
        fileR.read();

        int c;
        while ((c = fileR.read()) != -1) {
            buff.append(Character.toChars(c)[0]);
        }
        fileR.close();
        
        while (!(new File(archivo)).delete());
        
    } catch (IOException ex) {
        System.err.println("Error en lectura respuesta de salida");
    }
    
    String xml2 = buff.toString();
    
    xml2 = xml2.substring(xml2.indexOf("?>") + 3);
    
    //System.out.println(xml2);
 
    XStream xstream1 = new XStream(new DomDriver());
    
    xstream1.alias("salidaCraps", RespuestaEntradaCraps.class);
    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "vTerm");
    xstream1.registerConverter(new VTermConverter());

    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "usuario");
    xstream1.registerConverter(new UsuarioConverter());

    xstream1.useAttributeFor(RespuestaEntradaCraps.class, "mesa");
    xstream1.registerConverter(new MesaConverter());

    //RespuestaEntradaCraps respuesta = new RespuestaEntradaCraps(new Vterm(vTerm), new Usuario(usuario), new Mesa(mesa), "si", "todo bien");
    //xml = xstream1.toXML(respuesta);
    //xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + xml;
    //System.out.println(xml);
    
    RespuestaEntradaCraps respuesta = (RespuestaEntradaCraps)xstream1.fromXML(xml2);
    
    if ("si".equals(respuesta.getAceptado())) {
        this.jRadioAceptadoSi.setSelected(true);
        this.jRadioAceptadoNo.setSelected(false);
    } else {
        this.jRadioAceptadoSi.setSelected(false);
        this.jRadioAceptadoNo.setSelected(true);
    }
    
    this.jTextMotivo.setText(respuesta.getDescripcion());

}//GEN-LAST:event_jButtonSalidaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoMesaCraps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioAceptadoNo;
    private javax.swing.JRadioButton jRadioAceptadoSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextIdGrupo;
    private javax.swing.JTextField jTextIdTerminal;
    private javax.swing.JTextField jTextMesa;
    private javax.swing.JTextArea jTextMotivo;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables

}