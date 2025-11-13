import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TokoFrame extends JFrame {
    JPanel inputPanel;
    JLabel namaProdukLabel;
    JTextField namaProdukField;
    JLabel hargaProdukLabel;
    JTextField hargaProdukField;
    String[] columnNames = {"Nama Produk", "Harga"};
    DefaultTableModel produkTableModel;
    JTable produkTable;
    JScrollPane scrollPane;
    JButton simpanButton;

    // 5 komponen baru (berbeda jenis)
    JComboBox<String> kategoriCombo; // (1) dropdown
    JCheckBox tersediaCheck;         // (2) checkbox
    JRadioButton promoRadio;         // (3) radio button
    JSpinner stokSpinner;            // (4) spinner (angka)
    JButton resetButton;             // (5) tombol tambahan

    public TokoFrame() {
        setTitle("Toko Application");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        populateComponents();
        populateActionListener();

        setContentPane(inputPanel);
    }

    void populateComponents() {
        inputPanel = new JPanel();
        inputPanel.setBounds(10, 10, 400, 700);
        inputPanel.setLayout(null);
        add(inputPanel);

        namaProdukLabel = new JLabel("Nama Produk: ");
        inputPanel.add(namaProdukLabel);
        namaProdukLabel.setBounds(10, 10, 100, 25);

        namaProdukField = new JTextField();
        namaProdukField.setBounds(120, 10, 200, 25);
        inputPanel.add(namaProdukField);

        hargaProdukLabel = new JLabel("Harga: ");
        hargaProdukLabel.setBounds(10, 50, 100, 25);
        inputPanel.add(hargaProdukLabel);

        hargaProdukField = new JTextField();
        hargaProdukField.setBounds(120, 50, 200, 25);
        inputPanel.add(hargaProdukField);

        // (1) JComboBox - pilihan kategori produk
        JLabel kategoriLabel = new JLabel("Kategori:");
        kategoriLabel.setBounds(10, 90, 100, 25);
        inputPanel.add(kategoriLabel);

        String[] kategori = {"Elektronik", "Makanan", "Pakaian", "Aksesoris", "Lainnya"};
        kategoriCombo = new JComboBox<>(kategori);
        kategoriCombo.setBounds(120, 90, 200, 25);
        inputPanel.add(kategoriCombo);

        // (2) JCheckBox - menandai ketersediaan stok
        tersediaCheck = new JCheckBox("Tersedia");
        tersediaCheck.setBounds(120, 120, 200, 25);
        inputPanel.add(tersediaCheck);

        // (3) JRadioButton - menandai apakah produk sedang promo
        promoRadio = new JRadioButton("Promo Aktif");
        promoRadio.setBounds(120, 150, 200, 25);
        inputPanel.add(promoRadio);

        // (4) JSpinner - untuk jumlah stok
        JLabel stokLabel = new JLabel("Stok:");
        stokLabel.setBounds(10, 180, 100, 25);
        inputPanel.add(stokLabel);

        stokSpinner = new JSpinner();
        stokSpinner.setBounds(120, 180, 100, 25);
        inputPanel.add(stokSpinner);

        // (5) JButton tambahan - tombol reset
        resetButton = new JButton("Reset");
        resetButton.setBounds(120, 210, 100, 25);
        inputPanel.add(resetButton);

        // untuk tabel
        produkTableModel = new DefaultTableModel(columnNames, 0);
        produkTable = new JTable(produkTableModel);
        scrollPane = new JScrollPane(produkTable);
        scrollPane.setBounds(420, 10, 900, 700);
        inputPanel.add(scrollPane);

        // untuk tombol simpan
        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(10, 240, 100, 25);
        inputPanel.add(simpanButton);
    }

    void populateActionListener() {
        simpanButton.addActionListener(e -> {
            String namaProduk = namaProdukField.getText();
            String hargaProduk = hargaProdukField.getText();
            String kategori = (String) kategoriCombo.getSelectedItem();
            boolean tersedia = tersediaCheck.isSelected();
            boolean promo = promoRadio.isSelected();
            int stok = (Integer) stokSpinner.getValue();

            produkTableModel.addRow(new Object[]{namaProduk, hargaProduk});

            JOptionPane.showMessageDialog(this,
                "Data disimpan:\n" +
                "Nama Produk: " + namaProduk +
                "\nHarga: " + hargaProduk +
                "\nKategori: " + kategori +
                "\nTersedia: " + (tersedia ? "Ya" : "Tidak") +
                "\nPromo: " + (promo ? "Aktif" : "Tidak") +
                "\nStok: " + stok);
        });

        // Event tombol reset
        resetButton.addActionListener(e -> {
            namaProdukField.setText("");
            hargaProdukField.setText("");
            kategoriCombo.setSelectedIndex(0);
            tersediaCheck.setSelected(false);
            promoRadio.setSelected(false);
            stokSpinner.setValue(0);
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        TokoFrame frame = new TokoFrame();
        frame.setVisible(true);
    }
}
