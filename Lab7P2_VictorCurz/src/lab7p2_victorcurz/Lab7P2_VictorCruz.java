/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_victorcurz;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Lab7P2_VictorCruz extends javax.swing.JFrame {

    /**
     * Creates new form LabP2_VictorCruz
     */
    public Lab7P2_VictorCruz() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_TipoMusica.getModel();
        modelo.addElement("Default");
        modelo.addElement("Instrumental");
        modelo.addElement("De Voz");
        CB_TipoMusica.setModel(modelo);
        
        DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) CB_Formato.getModel();
        modelo1.addElement("Default");
        modelo1.addElement("Instrumental");
        modelo1.addElement("De Voz");
        CB_TipoMusica.setModel(modelo1);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_CRUDArstistas = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_NombreArtista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_GeneroMusical = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_NombreDisquera = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_AliasArtista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CB_TipoMusica = new javax.swing.JComboBox<>();
        JB_AgregarArtista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_ListarArtista = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        JB_ModificarArtista = new javax.swing.JButton();
        JB_EliminarArtista = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JD_CRUDCanciones = new javax.swing.JDialog();
        JD_CRUDAlbumes = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        CB_Formato = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        JB_AgregarAlbum = new javax.swing.JButton();
        TF_NombreAlbum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_ListarAlbumes = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TF_FechaProduccion = new javax.swing.JTextField();
        JB_ModificarAlbum = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JB_EliminarAlbum = new javax.swing.JButton();
        TF_GeneroMuscialAlbum = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TF_AliasProductor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JB_AgregarAlbumesArtistas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JL_ListarAlbumesArtistas = new javax.swing.JList<>();
        JD_Simulacion = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        JB_SalirSistema = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_CRUDArtista = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMI_CRUDCanciones = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMI_CRUDAlbumes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JMI_SimulacionRepdructor = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Artistas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Nombre del Artista:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Genero Musical:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Nombre de la Disquera: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Alias de Artista");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Tipo de Musica:");

        JB_AgregarArtista.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_AgregarArtista.setText("Agregar Artista");
        JB_AgregarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AgregarArtistaMouseClicked(evt);
            }
        });

        JL_ListarArtista.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(JL_ListarArtista);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setText("Listar Artistas");

        JB_ModificarArtista.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_ModificarArtista.setText("Modificar Artista");
        JB_ModificarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ModificarArtistaMouseClicked(evt);
            }
        });

        JB_EliminarArtista.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_EliminarArtista.setText("Eliminar Artista");
        JB_EliminarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_EliminarArtistaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel8.setText("Seleccione una Artista para Modficar");

        javax.swing.GroupLayout JD_CRUDArstistasLayout = new javax.swing.GroupLayout(JD_CRUDArstistas.getContentPane());
        JD_CRUDArstistas.getContentPane().setLayout(JD_CRUDArstistasLayout);
        JD_CRUDArstistasLayout.setHorizontalGroup(
            JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CRUDArstistasLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(TF_GeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(TF_NombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(TF_NombreDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_AliasArtista)
                            .addComponent(CB_TipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JB_AgregarArtista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addComponent(JB_ModificarArtista)
                        .addGap(38, 38, 38)
                        .addComponent(JB_EliminarArtista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)))
                .addGap(32, 32, 32))
        );
        JD_CRUDArstistasLayout.setVerticalGroup(
            JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_ModificarArtista)
                            .addComponent(JB_EliminarArtista)))
                    .addGroup(JD_CRUDArstistasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_NombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_GeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_NombreDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_AliasArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(JD_CRUDArstistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CB_TipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(JB_AgregarArtista)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_CRUDCancionesLayout = new javax.swing.GroupLayout(JD_CRUDCanciones.getContentPane());
        JD_CRUDCanciones.getContentPane().setLayout(JD_CRUDCancionesLayout);
        JD_CRUDCancionesLayout.setHorizontalGroup(
            JD_CRUDCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_CRUDCancionesLayout.setVerticalGroup(
            JD_CRUDCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setText("Formato");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setText("Nombre del Album:");

        JB_AgregarAlbum.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_AgregarAlbum.setText("Agregar Album");
        JB_AgregarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AgregarAlbumMouseClicked(evt);
            }
        });

        JL_ListarAlbumes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(JL_ListarAlbumes);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setText("Fecha de Produccion");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setText("Listar Albumes");

        JB_ModificarAlbum.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_ModificarAlbum.setText("Modificar Album");
        JB_ModificarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ModificarAlbumMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel13.setText("Seleccione una Artista para Modficar");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setText("Genero de Musica del Album");

        JB_EliminarAlbum.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JB_EliminarAlbum.setText("Eliminar Album");
        JB_EliminarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_EliminarAlbumMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setText("Alias del Productor");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel16.setText("Albumes");

        JB_AgregarAlbumesArtistas.setText("=====");

        JL_ListarAlbumesArtistas.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(JL_ListarAlbumesArtistas);

        javax.swing.GroupLayout JD_CRUDAlbumesLayout = new javax.swing.GroupLayout(JD_CRUDAlbumes.getContentPane());
        JD_CRUDAlbumes.getContentPane().setLayout(JD_CRUDAlbumesLayout);
        JD_CRUDAlbumesLayout.setHorizontalGroup(
            JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(TF_FechaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(TF_NombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(TF_GeneroMuscialAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_AliasProductor)
                            .addComponent(CB_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JB_AgregarAlbum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_AgregarAlbumesArtistas)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addComponent(JB_ModificarAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_EliminarAlbum)))
                .addGap(47, 47, 47))
        );
        JD_CRUDAlbumesLayout.setVerticalGroup(
            JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(JB_AgregarAlbumesArtistas))
                            .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_ModificarAlbum)
                            .addComponent(JB_EliminarAlbum)))
                    .addGroup(JD_CRUDAlbumesLayout.createSequentialGroup()
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TF_NombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TF_FechaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TF_GeneroMuscialAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TF_AliasProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(JD_CRUDAlbumesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CB_Formato, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(JB_AgregarAlbum)))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout JD_SimulacionLayout = new javax.swing.GroupLayout(JD_Simulacion.getContentPane());
        JD_Simulacion.getContentPane().setLayout(JD_SimulacionLayout);
        JD_SimulacionLayout.setHorizontalGroup(
            JD_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_SimulacionLayout.setVerticalGroup(
            JD_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        JB_SalirSistema.setText("Salir del Sistema");
        JB_SalirSistema.setFocusable(false);
        JB_SalirSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_SalirSistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_SalirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_SalirSistemaMouseClicked(evt);
            }
        });
        jToolBar1.add(JB_SalirSistema);

        jMenu1.setText("Artistas");

        JMI_CRUDArtista.setText("CRUD Artistas");
        JMI_CRUDArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CRUDArtistaActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CRUDArtista);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Canciones");

        JMI_CRUDCanciones.setText("CRUD Canciones");
        JMI_CRUDCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CRUDCancionesActionPerformed(evt);
            }
        });
        jMenu2.add(JMI_CRUDCanciones);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Albumes");

        JMI_CRUDAlbumes.setText("CRUD Albumes");
        JMI_CRUDAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CRUDAlbumesActionPerformed(evt);
            }
        });
        jMenu3.add(JMI_CRUDAlbumes);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reproductor");

        JMI_SimulacionRepdructor.setText("Simulacion Reproductor");
        JMI_SimulacionRepdructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_SimulacionRepdructorActionPerformed(evt);
            }
        });
        jMenu4.add(JMI_SimulacionRepdructor);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 489, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_CRUDArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CRUDArtistaActionPerformed
        Artistas();
    }//GEN-LAST:event_JMI_CRUDArtistaActionPerformed

    private void JMI_CRUDCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CRUDCancionesActionPerformed
      Canciones();
    }//GEN-LAST:event_JMI_CRUDCancionesActionPerformed

    private void JMI_CRUDAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CRUDAlbumesActionPerformed
        // TODO add your handling code here:
        Albumes();
    }//GEN-LAST:event_JMI_CRUDAlbumesActionPerformed

    private void JMI_SimulacionRepdructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_SimulacionRepdructorActionPerformed
        // TODO add your handling code here:
        Simulacion();
    }//GEN-LAST:event_JMI_SimulacionRepdructorActionPerformed

    private void JB_SalirSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_SalirSistemaMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JB_SalirSistemaMouseClicked

    private void JB_AgregarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_AgregarArtistaMouseClicked
        String tipo =(String)CB_TipoMusica.getSelectedItem();
         Artistas a = new Artistas (TF_NombreArtista.getText(),
                 TF_GeneroMusical.getText(),
                 TF_NombreDisquera.getText(),
                 TF_AliasArtista.getText(),
                 tipo);
    
        Admin_Artistas ar = new Admin_Artistas("./Artistas.vjcm");
        ar.cargarArchivo();
        ar.setArtistas(a);
        ar.escribirArchivo();
        JOptionPane.showMessageDialog(this,
                "Artista guardado exsitosamente");
        
        DefaultListModel modelo = (DefaultListModel) JL_ListarArtista.getModel();
        modelo.addElement(a);
        JL_ListarArtista.setModel(modelo);
        
        TF_NombreArtista.setText("");
        TF_GeneroMusical.setText("");
        TF_NombreDisquera.setText("");
        TF_AliasArtista.setText("");
        CB_TipoMusica.setSelectedIndex(0);
    }//GEN-LAST:event_JB_AgregarArtistaMouseClicked

    private void JB_ModificarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ModificarArtistaMouseClicked
        Admin_Artistas ar
                    = new Admin_Artistas("./Artistas.vjcm");
        int p;
         p = JL_ListarArtista.getSelectedIndex();    
        
            ar.cargarArchivo();
            ar.getListaArtistas().get(p).setAlias(JOptionPane.showInputDialog("Alias del Artista: "));
            ar.getListaArtistas().get(p).setGeneroM(JOptionPane.showInputDialog("Genero Musical: "));
            ar.getListaArtistas().get(p).setNom_disco(JOptionPane.showInputDialog("Nombre de la Discografica: "));
            ar.getListaArtistas().get(p).setNombre(JOptionPane.showInputDialog("Nombre del Artista: "));
            ar.getListaArtistas().get(p).setTipoM(JOptionPane.showInputDialog("Tipo de Musica: "));
            ar.escribirArchivo();
        
            
             DefaultListModel modeloLISTA = (DefaultListModel) JL_ListarArtista.getModel();
            ((Artistas) modeloLISTA.get(JL_ListarArtista.getSelectedIndex())).setNombre(ar.getListaArtistas().get(p).getNombre());
            ((Artistas) modeloLISTA.get(JL_ListarArtista.getSelectedIndex())).setAlias(ar.getListaArtistas().get(p).getAlias());
            ((Artistas) modeloLISTA.get(JL_ListarArtista.getSelectedIndex())).setNom_disco(ar.getListaArtistas().get(p).getNom_disco());
            ((Artistas) modeloLISTA.get(JL_ListarArtista.getSelectedIndex())).setGeneroM(ar.getListaArtistas().get(p).getGeneroM());
            ((Artistas) modeloLISTA.get(JL_ListarArtista.getSelectedIndex())).setTipoM(ar.getListaArtistas().get(p).getTipoM());
            
            JL_ListarArtista.setModel(modeloLISTA);
    }//GEN-LAST:event_JB_ModificarArtistaMouseClicked

    private void JB_EliminarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_EliminarArtistaMouseClicked
        // TODO add your handling code here:
         Admin_Artistas ar=
                    new Admin_Artistas("./Artistas.vjcm");
            int p;
            p= JL_ListarArtista.getSelectedIndex();
            
            ar.cargarArchivo();
            ar.getListaArtistas().remove(p);
            ar.escribirArchivo();
            
             DefaultListModel modeloLISTA = (DefaultListModel) JL_ListarArtista.getModel();
             modeloLISTA.removeElementAt(p);
             JL_ListarArtista.setModel(modeloLISTA);
            
    }//GEN-LAST:event_JB_EliminarArtistaMouseClicked

    private void JB_AgregarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_AgregarAlbumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_AgregarAlbumMouseClicked

    private void JB_ModificarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ModificarAlbumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_ModificarAlbumMouseClicked

    private void JB_EliminarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_EliminarAlbumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_EliminarAlbumMouseClicked

     public void Artistas(){
        JD_CRUDArstistas.pack();
        JD_CRUDArstistas.setModal(true);
        JD_CRUDArstistas.setLocationRelativeTo(this);
        JD_CRUDArstistas.setVisible(true);
    }
     
     public void Albumes(){
        JD_CRUDAlbumes.pack();
        JD_CRUDAlbumes.setModal(true);
        JD_CRUDAlbumes.setLocationRelativeTo(this);
        JD_CRUDAlbumes.setVisible(true);
    }
     
     public void Canciones(){
        JD_CRUDCanciones.pack();
        JD_CRUDCanciones.setModal(true);
        JD_CRUDCanciones.setLocationRelativeTo(this);
        JD_CRUDCanciones.setVisible(true);
    }
     public void Simulacion(){
        JD_Simulacion.pack();
        JD_Simulacion.setModal(true);
        JD_Simulacion.setLocationRelativeTo(this);
        JD_Simulacion.setVisible(true);
    }
     
     
    
    
    
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
            java.util.logging.Logger.getLogger(Lab7P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab7P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab7P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab7P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab7P2_VictorCruz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Formato;
    private javax.swing.JComboBox<String> CB_TipoMusica;
    private javax.swing.JButton JB_AgregarAlbum;
    private javax.swing.JButton JB_AgregarAlbumesArtistas;
    private javax.swing.JButton JB_AgregarArtista;
    private javax.swing.JButton JB_EliminarAlbum;
    private javax.swing.JButton JB_EliminarArtista;
    private javax.swing.JButton JB_ModificarAlbum;
    private javax.swing.JButton JB_ModificarArtista;
    private javax.swing.JButton JB_SalirSistema;
    private javax.swing.JDialog JD_CRUDAlbumes;
    private javax.swing.JDialog JD_CRUDArstistas;
    private javax.swing.JDialog JD_CRUDCanciones;
    private javax.swing.JDialog JD_Simulacion;
    private javax.swing.JList<String> JL_ListarAlbumes;
    private javax.swing.JList<String> JL_ListarAlbumesArtistas;
    private javax.swing.JList<String> JL_ListarArtista;
    private javax.swing.JMenuItem JMI_CRUDAlbumes;
    private javax.swing.JMenuItem JMI_CRUDArtista;
    private javax.swing.JMenuItem JMI_CRUDCanciones;
    private javax.swing.JMenuItem JMI_SimulacionRepdructor;
    private javax.swing.JTextField TF_AliasArtista;
    private javax.swing.JTextField TF_AliasProductor;
    private javax.swing.JTextField TF_FechaProduccion;
    private javax.swing.JTextField TF_GeneroMuscialAlbum;
    private javax.swing.JTextField TF_GeneroMusical;
    private javax.swing.JTextField TF_NombreAlbum;
    private javax.swing.JTextField TF_NombreArtista;
    private javax.swing.JTextField TF_NombreDisquera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
