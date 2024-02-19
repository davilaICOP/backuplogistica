/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logisticaigu;

import Controladoras.ControladoraVehiculo;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static logisticaigu.RegistrarMantenimiento.vehiculoSeleccionado;
import logisticalogica.Paquete;
import logisticalogica.Vehiculo;

/**
 *
 * @author ULTRA
 */
public class GestionarEntrega extends javax.swing.JFrame {
    ControladoraVehiculo controladoraVehiculo = new ControladoraVehiculo();
   public static Vehiculo vehiculoSeleccionado;
   private List<Vehiculo> vehiculos;
    /**
     * Creates new form GestionarEntrega
     */
    public GestionarEntrega() {
        initComponents();
        mostrarTodosLosVehiculos();
        inicializarVentana();

         Ingresarpatente.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent evt) {
            filtrarPorPatente();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent evt) {
            filtrarPorPatente();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent evt) {
            filtrarPorPatente();
        }
    });

    // Agregar DocumentListener a Ingresarmarca
    Ingresarmarca.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent evt) {
            filtrarPorModelo();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent evt) {
            filtrarPorModelo();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent evt) {
            // No es necesario para campos de texto sin formato
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Ingresarmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ingresarpatente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafiltrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestionar Entrega");

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Marca:");

        Ingresarmarca.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ingresarmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarmarcaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Patente:");

        Ingresarpatente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ingresarpatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarpatenteActionPerformed(evt);
            }
        });

        tablafiltrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablafiltrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Capacidad de carga", "N° Vehiculo", "Patente"
            }
        ));
        jScrollPane1.setViewportView(tablafiltrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1888, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Ingresarmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Ingresarpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresarpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresarmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

    private void IngresarmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarmarcaActionPerformed
        filtrarPorModelo();
    }//GEN-LAST:event_IngresarmarcaActionPerformed

    private void IngresarpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarpatenteActionPerformed
        filtrarPorPatente();
    }//GEN-LAST:event_IngresarpatenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (vehiculoSeleccionado != null) {
        List<Paquete> paquetes = controladoraVehiculo.obtenerPaquetesPorVehiculo(vehiculoSeleccionado);

        // Verificar si hay paquetes en estado "EN CAMINO"
        boolean hayPaquetesEnCamino = false;
        for (Paquete paquete : paquetes) {
            if ("EN CAMINO".equals(paquete.getEstado())) {
                hayPaquetesEnCamino = true;
                break;
            }
        }

        if (hayPaquetesEnCamino) {
            // Hay paquetes en camino, oculta la ventana actual y muestra la ventana ConfirmarEntrega
            this.setVisible(false);
            ConfirmarEntrega confirmarEntrega = new ConfirmarEntrega();
            confirmarEntrega.setVisible(true);
        } else {
            // No hay paquetes en camino, mostrar mensaje y no cerrar la ventana actual
            JOptionPane.showMessageDialog(this, "Este vehículo no tiene paquetes ", "Sin Paquetes en Camino", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // No se ha seleccionado ningún vehículo, mostrar un mensaje de error o manejar la situación según sea necesario
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu atras = new Menu();
        atras.setVisible(true);
        dispose(); // Cierra la pantalla actual
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void filtrarPorPatente() {
    String patente = Ingresarpatente.getText();
    vehiculos = controladoraVehiculo.filtrarVehiculosPorPatente(patente);
    mostrarVehiculosEnTabla(vehiculos);
}
private void mostrarVehiculosEnTabla(List<Vehiculo> vehiculos) {
    DefaultTableModel modelo = (DefaultTableModel) tablafiltrar.getModel();
    modelo.setRowCount(0); // Elimina todas las filas existentes en la tabla

    for (Vehiculo vehiculo : vehiculos) {
        modelo.addRow(new Object[]{
            vehiculo.getMarca().getModelo(), 
            vehiculo.getCapacidad_carga(), 
            vehiculo.getNro_vehiculo(), 
            vehiculo.getPatente()
        });
    }
}
private void filtrarPorModelo() {
    String modelo = Ingresarmarca.getText();

    if (modelo.isEmpty()) {
        mostrarTodosLosVehiculos(); // Muestra todos los vehículos si el campo está vacío
    } else {
        // Asignar los vehículos filtrados a la lista de vehículos de la clase
        vehiculos = controladoraVehiculo.filtrarVehiculosPorModeloCoincidente(modelo);
        mostrarVehiculosEnTabla(vehiculos);
    }
}

 private void inicializarVentana() {
        // Agregar el listener a la tabla para capturar la selección del usuario
        tablafiltrar.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = tablafiltrar.getSelectedRow();
            if (selectedRow >= 0) {
                // Obtener el vehículo seleccionado en la tabla
                vehiculoSeleccionado = vehiculos.get(selectedRow);
            }
        });
    }



private void mostrarTodosLosVehiculos() {
    // Asignar los vehículos obtenidos a la lista de vehículos de la clase
    vehiculos = controladoraVehiculo.obtenerTodosLosVehiculos();
    // Filtrar vehículos por estado "Activo"
    vehiculos = vehiculos.stream().filter(v -> "Activo".equalsIgnoreCase(v.getEstado())).collect(Collectors.toList());
    mostrarVehiculosEnTabla(vehiculos);
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ingresarmarca;
    private javax.swing.JTextField Ingresarpatente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablafiltrar;
    // End of variables declaration//GEN-END:variables
}
