/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logisticaigu;

import Controladoras.ControladoraCliente;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import logisticalogica.Cliente;

/**
 *
 * @author ULTRA
 */
public class ClientesTotales extends javax.swing.JFrame {
    private ControladoraCliente controladoraCliente;
    private DefaultTableModel tableModel;
    private String rolUsuario;
   
    public ClientesTotales(String rolUsuario) {
        initComponents();
        this.rolUsuario = rolUsuario;
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abre el JFrame en pantalla completa
        controladoraCliente = new ControladoraCliente();
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        // Crear un renderizador personalizado para los encabezados de las columnas
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda horizontalmente
        headerRenderer.setVerticalAlignment(SwingConstants.CENTER); // Centrar verticalmente
        headerRenderer.setFont(new Font("Arial", Font.PLAIN, 18)); // Establecer la fuente a Arial 18
        
        // Aplicar el renderizador personalizado a los encabezados de las columnas
        jTable1.getTableHeader().setDefaultRenderer(headerRenderer);
        
        cargarClientesEnTabla();
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            // Verificar si hay una fila seleccionada en la tabla
            if (!jTable1.getSelectionModel().isSelectionEmpty()) {
                // Habilitar el botón "Dar de baja"
                jButton3.setEnabled(true);
            } else {
                // Deshabilitar el botón "Dar de baja"
                jButton3.setEnabled(false);
            }
        }
    });
        ingresardocumento.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            filtrarClientes();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            filtrarClientes();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            filtrarClientes();
        }
    });
    jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarClientespornombreyape();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarClientespornombreyape();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrarClientespornombreyape();
            }
        });
    jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darDeBajaCliente();
            }
        });
      // Validación para el campo de número de documento
    ingresardocumento.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}
    });

    // Validación para el campo de nombre y apellido
    jTextField1.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isLetter(c) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}
    });
  if (!rolUsuario.equals("Administrador")) {
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }     

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        numerodocclienteemisor = new javax.swing.JLabel();
        ingresardocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre y Apellido", "N° Documento", "N° Telefono", "Correo electronico", "Direccion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de clientes");

        numerodocclienteemisor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        numerodocclienteemisor.setText("N° Documento:");

        ingresardocumento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ingresardocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresardocumentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Nombre y Apellido:");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton3.setText("Dar de baja");

        jButton4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton4.setText("Editar cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(numerodocclienteemisor)
                        .addGap(18, 18, 18)
                        .addComponent(ingresardocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(100, 100, 100)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(97, 97, 97)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numerodocclienteemisor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ingresardocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void ingresardocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresardocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresardocumentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu atras = new Menu(rolUsuario);
        atras.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistrarCliente2 registroclie = new RegistrarCliente2(rolUsuario);
        registroclie.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada == -1) {
        JLabel clienteeditar = new JLabel("Seleccione un cliente para editar.");
        clienteeditar.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null, clienteeditar, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    int idcliente = (int) jTable1.getValueAt(filaSeleccionada, 0);
    String nombreCompleto = jTable1.getValueAt(filaSeleccionada, 1).toString();
    
    String[] partesNombreApellido = nombreCompleto.split(" ");
    String nombre = partesNombreApellido[0];
    String apellido = partesNombreApellido[1];

    long numeroDocumento = Long.parseLong(jTable1.getValueAt(filaSeleccionada, 2).toString());
    long numeroTelefono = Long.parseLong(jTable1.getValueAt(filaSeleccionada, 3).toString());
    String correoElectronico = jTable1.getValueAt(filaSeleccionada, 4).toString();
    String direccion = jTable1.getValueAt(filaSeleccionada, 5).toString();

    Cliente cliente = new Cliente();
    cliente.setClienteID(idcliente);
    cliente.setNombre(nombre);
    cliente.setApellido(apellido);
    cliente.setNro_documento(numeroDocumento);
    cliente.setNro_telefono(numeroTelefono);
    cliente.setCorreoElectronico(correoElectronico);
    cliente.setDireccion(direccion);
    
    EditarCliente editarCliente = new EditarCliente(cliente, rolUsuario);
    editarCliente.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

   
    private void darDeBajaCliente() {
    // Obtiene la fila seleccionada
    int filaSeleccionada = jTable1.getSelectedRow();

    // Verifica si hay una fila seleccionada
    if (filaSeleccionada == -1) {
        JLabel clientebaja = new JLabel("Seleccione un cliente para dar de baja.");
        clientebaja.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null, clientebaja, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Obtiene el valor de la columna que contiene el ID del cliente
    Object clienteIDObj = jTable1.getValueAt(filaSeleccionada, 0);

    // Verifica si el valor no es nulo antes de intentar convertirlo
    if (clienteIDObj != null) {
        try {
            // Intenta convertir el valor a Integer (ID del cliente)
            Integer clienteID = (Integer) clienteIDObj;

            // Pide confirmación al usuario
            JLabel mensajeConfirmacion = new JLabel("¿Está seguro de dar de baja al cliente?");
            mensajeConfirmacion.setFont(new Font("Arial", Font.PLAIN, 18));
            Object[] options = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(null, mensajeConfirmacion, "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (opcion == JOptionPane.YES_OPTION) {
                // Llama al método correspondiente de la controladora para dar de baja al cliente por ID
                controladoraCliente.darDeBajaCliente(clienteID);

                // Actualiza la tabla después de dar de baja al cliente
                cargarClientesEnTabla();
            }
        } catch (ClassCastException e) {
            // Manejo de error si la conversión no es posible
            JLabel mensajeError = new JLabel("Error al convertir el ID del cliente a Integer.");
            mensajeError.setFont(new Font("Arial", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, mensajeError, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Manejo de error si el valor es nulo
        JLabel idnulo = new JLabel("El ID del cliente es nulo.");
        idnulo.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null, idnulo, "Mensaje", JOptionPane.ERROR_MESSAGE);
    }
}

   private void cargarClientesEnTabla() {
    // Limpiar la tabla antes de cargar nuevos datos
    tableModel.setRowCount(0);

    List<Cliente> clientes = controladoraCliente.filtrarClientesPorEstado("Activo");

    // Llenar la tabla con los datos de los clientes
    for (Cliente cliente : clientes) {
        String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido();

        Object[] rowData = {
            cliente.getClienteID(),
            nombreCompleto,
            cliente.getNro_documento(),
            cliente.getNro_telefono(),
            cliente.getCorreoElectronico(),
            cliente.getDireccion(),
            cliente.getEstado()
        };
        tableModel.addRow(rowData);
    }
}

    private void filtrarClientes() {
    String numeroDocumentoStr = ingresardocumento.getText().trim();

    if (numeroDocumentoStr.isEmpty()) {
        cargarClientesEnTabla(); // Si el campo de búsqueda está vacío, muestra todos los clientes
    } else {
        try {
            int numeroDocumento = Integer.parseInt(numeroDocumentoStr);

            // Realizar la búsqueda de clientes según los valores ingresados
            List<Cliente> clientes = controladoraCliente.filtrarClientesPorNumeroDocumento(numeroDocumento);

            // Limpiar la tabla antes de cargar nuevos datos
            tableModel.setRowCount(0);

            for (Cliente cliente : clientes) {
                String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido();

                Object[] rowData = {
                    cliente.getClienteID(),
                    nombreCompleto,
                    cliente.getNro_documento(),
                    cliente.getNro_telefono(),
                    cliente.getCorreoElectronico(),
                    cliente.getDireccion()
                };
                tableModel.addRow(rowData);
            }
        } catch (NumberFormatException e) {
            // Manejo de error si el texto no es un número válido
            JLabel ingresenrovalido = new JLabel("Ingrese un número válido para el documento.");
            ingresenrovalido.setFont(new Font("Arial", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null, ingresenrovalido, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    private void filtrarClientespornombreyape() {
        String nombre = jTextField1.getText().trim();
        String apellido = ingresardocumento.getText().trim();

        if (nombre.isEmpty() && apellido.isEmpty()) {
            cargarClientesEnTabla(); // Si ambos campos están vacíos, muestra todos los clientes
        } else {
            // Realizar la búsqueda de clientes según los valores ingresados
            List<Cliente> clientes = controladoraCliente.filtrarNombreyApellido(nombre + " " + apellido);

            // Limpiar la tabla antes de cargar nuevos datos
            tableModel.setRowCount(0);

            for (Cliente cliente : clientes) {
                String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido();

                Object[] rowData = {
                    nombreCompleto,
                    cliente.getNro_documento(),
                    cliente.getNro_telefono()
                };
                tableModel.addRow(rowData);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ingresardocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel numerodocclienteemisor;
    // End of variables declaration//GEN-END:variables
}
