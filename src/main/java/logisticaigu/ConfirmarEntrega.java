/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logisticaigu;

import Controladoras.ControladoraPaquete;
import Controladoras.ControladoraVehiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static logisticaigu.GestionarEntrega.vehiculoSeleccionado;
import logisticalogica.EnviarCorreo;
import logisticalogica.Paquete;

/**
 *
 * @author ULTRA
 */
public class ConfirmarEntrega extends javax.swing.JFrame {
    ControladoraPaquete controladoraPaquete = new ControladoraPaquete();
    private List<Paquete> paquetes;
private List<Paquete> paquetesEnCamino; // Agregar esta línea


    ControladoraVehiculo controladoraVehiculo = new ControladoraVehiculo();

    /**
     * Creates new form ConfirmarEntrega
     */
    public ConfirmarEntrega() {
        initComponents();
        abrirConfirmarEntrega();
         jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            filtrarPaquetes();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            filtrarPaquetes();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            filtrarPaquetes();
        }
    });
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirmar Entrega");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Codigo del paquete:");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo del paquete", "Descripcion", "Domicilio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(100, 100, 100)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1888, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un paquete para confirmar la entrega", "Paquete no seleccionado", JOptionPane.WARNING_MESSAGE);
    } else {
        Paquete paqueteSeleccionado = paquetesEnCamino.get(filaSeleccionada);

        // Mostrar un cuadro de diálogo de confirmación
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres seleccionar este paquete?\n\nCódigo del paquete: " + paqueteSeleccionado.getCodigo_paquete() + "\nDescripción: " + paqueteSeleccionado.getDescripcion(), "Confirmar Selección", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            // Array con las opciones del cuadro de diálogo
            Object[] opciones = {"Entregado", "Devuelto"};

            // Mostrar cuadro de diálogo
            int seleccion = JOptionPane.showOptionDialog(this, "Seleccione el estado del paquete:", "Confirmar Estado",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion != JOptionPane.CLOSED_OPTION) {
                // Actualizar el estado y la fecha de entrega del paquete en la base de datos
                paqueteSeleccionado.setFechaEntrega(new java.sql.Date(new java.util.Date().getTime())); // Fecha actual

                if (seleccion == 0) {
                    // Entregado
                    paqueteSeleccionado.setEstado("Entregado");

                    // Obtener el correo electrónico del cliente receptor si no es nulo
                    if (paqueteSeleccionado.getReceptor() != null) {
                        String emailClienteReceptor = paqueteSeleccionado.getReceptor().getCorreoElectronico();

                        // Enviar el correo electrónico al cliente receptor
                        EnviarCorreo enviarCorreo = new EnviarCorreo();
                        enviarCorreo.crearEmail(emailClienteReceptor, "Paquete Entregado", 
                            "Estimado/a " + paqueteSeleccionado.getReceptor().getNombre() + ",\n" +
                            "Su paquete con código " + paqueteSeleccionado.getCodigo_paquete() + " ha sido entregado con éxito.\n" +
                            "Fecha de entrega: " + paqueteSeleccionado.getFechaEntrega() + "\n" +
                            "Estado del paquete: " + paqueteSeleccionado.getEstado());
                        enviarCorreo.sendEmail();

                        // Mostrar una alerta de que el correo electrónico ha sido enviado
                        JOptionPane.showMessageDialog(this, "El correo electrónico ha sido enviado al cliente receptor.", "Correo electrónico enviado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Manejar el caso en el que el Receptor es nulo
                        JOptionPane.showMessageDialog(this, "No se puede enviar el correo electrónico al cliente receptor porque el receptor del paquete es nulo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // Devuelto
                    paqueteSeleccionado.setEstado("Devuelto");

                    // Enviar correo electrónico de devolución
                    String mensajeDevolucion = "Estimado/a " + paqueteSeleccionado.getReceptor().getNombre() + ",\n" +
                            "Le informamos que su paquete con código " + paqueteSeleccionado.getCodigo_paquete() + " ha sido devuelto debido a que no se encontró a nadie en el domicilio durante la entrega.\n" +
                            "Por favor, póngase en contacto con nosotros para coordinar una nueva entrega o para actualizar la información de envío.\n" +
                            "Atentamente,\n" +
                            "Encomiendas Patria";

                    EnviarCorreo enviarCorreoDevolucion = new EnviarCorreo();
                    enviarCorreoDevolucion.crearEmail(paqueteSeleccionado.getReceptor().getCorreoElectronico(), "Paquete Devuelto", mensajeDevolucion);
                    enviarCorreoDevolucion.sendEmail();

                    // Mostrar una alerta de que el correo electrónico de devolución ha sido enviado
                    JOptionPane.showMessageDialog(this, "Se ha enviado un correo electrónico al remitente informando la devolución del paquete.", "Correo electrónico enviado", JOptionPane.INFORMATION_MESSAGE);
                }

                controladoraPaquete.actualizarEstadoPaquete(paqueteSeleccionado);
                controladoraPaquete.actualizarFechaEntregaPaquete(paqueteSeleccionado);

                // Actualiza la fila seleccionada en la tabla para reflejar el cambio
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setValueAt(paqueteSeleccionado.getEstado(), filaSeleccionada, 3); // El 3 representa la columna del estado en la tabla

                // Preguntar si desea seguir en la pantalla o volver al menú
                int opcionSeguir = JOptionPane.showConfirmDialog(this, "¿Desea seguir en esta pantalla?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (opcionSeguir == JOptionPane.NO_OPTION) {
                    Menu atras = new Menu();
                    atras.setVisible(true);
                    dispose();
                }
            }
        }
    }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionarEntrega atras = new GestionarEntrega();
        atras.setVisible(true);
        dispose(); 
      }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
 public void abrirConfirmarEntrega() {
    try {
        if (vehiculoSeleccionado != null) {
             paquetes = controladoraVehiculo.obtenerPaquetesPorVehiculo(vehiculoSeleccionado);
            if (paquetes != null && !paquetes.isEmpty()) {
                paquetesEnCamino = filtrarPaquetesEnCamino(paquetes); // Asignar los paquetes en camino
                if (!paquetesEnCamino.isEmpty()) {
                    mostrarPaquetes(paquetesEnCamino);
                    setVisible(true);
                } else {
                    // Mostrar un mensaje indicando que no hay paquetes en camino para el vehículo seleccionado
                    JOptionPane.showMessageDialog(this, "No hay paquetes en camino para el vehículo seleccionado", "Sin Paquetes", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Mostrar un mensaje indicando que no hay paquetes para el vehículo seleccionado
                JOptionPane.showMessageDialog(this, "No hay paquetes para el vehículo seleccionado", "Sin Paquetes", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Mostrar un mensaje indicando que no se ha seleccionado ningún vehículo
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un vehículo", "Vehículo no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    } catch (Exception ex) {
        ex.printStackTrace(); // Imprimir el stack trace en la consola
        // Aquí puedes agregar un mensaje de error o manejar la excepción de acuerdo a tu lógica de la aplicación
    }
}



public List<Paquete> filtrarPaquetesEnCamino(List<Paquete> paquetes) {
    List<Paquete> paquetesEnCamino = new ArrayList<>();
    for (Paquete paquete : paquetes) {
        if ("EN CAMINO".equals(paquete.getEstado())) {
            paquetesEnCamino.add(paquete);
        }
    }
    return paquetesEnCamino;
}
public void mostrarPaquetes(List<Paquete> paquetes) {
    this.paquetesEnCamino = paquetes; // Actualiza la lista de paquetes en camino
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    for (Paquete paquete : paquetes) {
        modelo.addRow(new Object[]{
            paquete.getCodigo_paquete(),
            paquete.getDescripcion(),
            paquete.getDomicilioEntrega(),
            paquete.getEstado()
        });
    }
}

  
 private void filtrarPaquetes() {
    String codigoPaqueteTexto = jTextField1.getText();

    if (!codigoPaqueteTexto.isEmpty()) {
        List<Paquete> paquetesFiltrados = new ArrayList<>();
        int codigoPaquete;
        try {
            codigoPaquete = Integer.parseInt(codigoPaqueteTexto);
            if (paquetes != null) {
                for (Paquete paquete : paquetes) {
                    if (paquete.getCodigo_paquete() == codigoPaquete) {
                        paquetesFiltrados.add(paquete);
                    }
                }
                mostrarPaquetes(paquetesFiltrados);
            } else {
                System.out.println("La lista de paquetes está vacía o no ha sido inicializada.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Ingrese un número válido para el código de paquete.");
        }
    } else {
        // Si el campo está vacío, muestra todos los paquetes
        abrirConfirmarEntrega();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
