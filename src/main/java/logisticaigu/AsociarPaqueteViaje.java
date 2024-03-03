/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logisticaigu;

import Controladoras.ControladoraPaquete;
import Controladoras.ControladoraViaje;
import Controladoras.ControladoraViajePaquete;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import logisticalogica.Paquete;
import logisticalogica.Vehiculo;
import logisticalogica.Viaje;
import logisticalogica.ViajePaquete;
import logisticapersistencia.ControladoraPersistencia;

/**
 *
 * @author ULTRA
 */
public class AsociarPaqueteViaje extends javax.swing.JFrame {
    ControladoraPaquete ctrlPaquete = new ControladoraPaquete();
    private int idViaje;
    private int vehiculoId;
    private String modelo;
    private String patente;
    private Vehiculo vehiculoSeleccionado; // Add this line
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private String rolUsuario;
    /**
     * Creates new form AsociarPaqueteViaje
     */
    public AsociarPaqueteViaje(int vehiculoId ,String modelo,String patente,int idViaje, String rolUsuario) {
        initComponents();
        this.vehiculoId = vehiculoId;
        this.rolUsuario = rolUsuario;
        this.idViaje = idViaje;
        this.vehiculoSeleccionado = vehiculoSeleccionado;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abre el JFrame en pantalla completa
        
        // Crear un renderizador personalizado para los encabezados de las columnas
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda horizontalmente
        headerRenderer.setVerticalAlignment(SwingConstants.CENTER); // Centrar verticalmente
        headerRenderer.setFont(new Font("Arial", Font.PLAIN, 18)); // Establecer la fuente a Arial 18
        // Aplicar el renderizador personalizado a los encabezados de las columnas
        jTable1.getTableHeader().setDefaultRenderer(headerRenderer);
   
        cargarListaPaquetes();
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && jTable1.getSelectedRowCount() > 0) {
                    jButton2.setEnabled(true);
                } else {
                    jButton2.setEnabled(false);
                }
            }
        });
        
        cargarListaPaquetes();    
        jButton2.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paquetes");

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

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(100, 100, 100)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int[] selectedRows = jTable1.getSelectedRows();

    if (selectedRows.length == 0) {
        // Crear un JLabel para personalizar el mensaje
        JLabel messageLabel = new JLabel("Por favor, seleccione al menos un paquete.");
        // Establecer la fuente del JLabel
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        // Mostrar el cuadro de diálogo de advertencia con el JLabel personalizado y el título personalizado
        JOptionPane.showMessageDialog(this, messageLabel, "Alerta", JOptionPane.WARNING_MESSAGE);
        return;
    }

    ControladoraViaje controladoraViaje = new ControladoraViaje();
    Viaje viaje = controladoraViaje.obtenerViajePorId(idViaje);

    for (int selectedRow : selectedRows) {
        Integer codigoPaquete = (Integer) jTable1.getValueAt(selectedRow, 0);

        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        Paquete paquete = controladoraPersistencia.obtenerPaquetePorCodigo(codigoPaquete);

        // Impresión del origen y destino del paquete
        System.out.println("Origen del paquete: " + paquete.getOrigen().getNombre() + ", " + paquete.getLocalidadOrigen().getNombre());
        System.out.println("Destino del paquete: " + paquete.getDestino().getNombre() + ", " + paquete.getLocalidadDestino().getNombre());
        
        // Impresión del origen y destino del viaje
        System.out.println("Origen del viaje: " + viaje.getOrigen().getNombre() + ", " + viaje.getLocalidadOrigen().getNombre());
        System.out.println("Destino del viaje: " + viaje.getDestino().getNombre() + ", " + viaje.getLocalidadDestino().getNombre());

        boolean coincideOrigen = paquete.getOrigen().getNombre().equalsIgnoreCase(viaje.getOrigen().getNombre().trim()) && paquete.getLocalidadOrigen().getNombre().equalsIgnoreCase(viaje.getLocalidadOrigen().getNombre().trim());
        boolean coincideDestino = paquete.getDestino().getNombre().equalsIgnoreCase(viaje.getDestino().getNombre().trim()) && paquete.getLocalidadDestino().getNombre().equalsIgnoreCase(viaje.getLocalidadDestino().getNombre().trim());

        if (!coincideOrigen || !coincideDestino) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "El origen o destino del paquete no coincide con el origen o destino del viaje. ¿Seguro que desea continuar?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.NO_OPTION) {
                System.out.println("El usuario ha cancelado la acción."); // Depuración en la consola
                return;
            }
        }

        ViajePaquete viajePaquete = new ViajePaquete();
        viajePaquete.setPaquete(paquete);
        viajePaquete.setViaje(viaje);
        ControladoraViajePaquete ctrlViajePaquete = new ControladoraViajePaquete();
        ctrlViajePaquete.crearviajepaquete(viajePaquete);

        paquete.setEstado("PLANIFICADO");
        ctrlPaquete.actualizarEstadoPaquete(paquete);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(selectedRow);
    }

    // Preguntar si desea seguir asociando paquetes
    int confirmacion = JOptionPane.showConfirmDialog(
            this,
            "¿Desea seguir asociando paquetes a este vehículo?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
    );

    if (confirmacion == JOptionPane.NO_OPTION) {
        new Viajes(rolUsuario).setVisible(true);
        dispose();
    } else {
        cargarListaPaquetes();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.fireTableDataChanged();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     ViajeVehiculo atras = new ViajeVehiculo(vehiculoId,modelo, patente, rolUsuario);
     atras.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void cargarListaPaquetes() {
    List<Paquete> paquetesPendientes = ctrlPaquete.filtrarPaquetesPorEstado("PENDIENTE");
    List<Paquete> paquetesDevueltos = ctrlPaquete.filtrarPaquetesPorEstado("Devuelto");
    
    // Unir las listas de paquetes pendientes y devueltos
    paquetesPendientes.addAll(paquetesDevueltos);

    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Código Paquete");
    modelo.addColumn("Descripción");
    modelo.addColumn("Estado");
    modelo.addColumn("Domicilio de Retiro");
    modelo.addColumn("Domicilio de Entrega");
    modelo.addColumn("Fecha Registro Paquete");
    modelo.addColumn("Provincia Origen");
    modelo.addColumn("Localidad Origen");
    modelo.addColumn("Provincia Destino");
    modelo.addColumn("Localidad Destino");
    modelo.addColumn("Emisor");
    modelo.addColumn("Receptor");

    jTable1.setModel(modelo);

    for (Paquete paquete : paquetesPendientes) {
        String nombreApellidoEmisor = paquete.getEmisor() != null ? paquete.getEmisor().getNombre() + " " + paquete.getEmisor().getApellido() : "";
        String nombreApellidoReceptor = paquete.getReceptor() != null ? paquete.getReceptor().getNombre() + " " + paquete.getReceptor().getApellido() : "";

        Object[] fila = new Object[]{
            paquete.getCodigo_paquete(),
            paquete.getDescripcion(),
            paquete.getEstado(),
            paquete.getDomicilioRetiro(),
            paquete.getDomicilioEntrega(),
            paquete.getFechaRecibido(),
            paquete.getOrigen().getNombre(),
            paquete.getLocalidadOrigen().getNombre(),
            paquete.getDestino().getNombre(),
            paquete.getLocalidadDestino().getNombre(),
            nombreApellidoEmisor,
            nombreApellidoReceptor
        };

        modelo.addRow(fila);
    }
}


    /**
     * @param args the command line arguments
     */
    private String obtenerEstadoPaquete(int codigoPaquete) {
    List<Paquete> paquetes = ctrlPaquete.filtrarPaquetesPorCodigo(codigoPaquete);
    
    if (!paquetes.isEmpty()) {
        return paquetes.get(0).getEstado(); 
    } else {
        return ""; 
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
