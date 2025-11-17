import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
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
import javax.swing.JTable; //  import toggle button
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TokoFrame extends JFrame {

    JPanel inputPanel;
    JLabel namaProdukLabel;
    JTextField namaProdukField;
    JLabel hargaProdukLabel;
    JTextField hargaProdukField;

    // kolom tabel baru
    String[] columnNames = {"Nama Produk", "Harga", "Promo", "Stok"};
    DefaultTableModel produkTableModel;
    JTable produkTable;
    JScrollPane scrollPane;

    JButton simpanButton;

    // 5 komponen baru
    JComboBox<String> kategoriCombo;
    JCheckBox tersediaCheck;
    JRadioButton promoRadio;
    JSpinner stokSpinner;
    JButton resetButton;

    //  KOMPUTEN BARU YANG DIMINTA
    JRadioButton noPromoRadio;
    ButtonGroup promoGroup;

    //  Toggle Button baru
    JToggleButton eksporToggle;

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

        // Nama produk
        namaProdukLabel = new JLabel("Nama Produk:");
        namaProdukLabel.setBounds(10, 10, 100, 25);
        inputPanel.add(namaProdukLabel);

        namaProdukField = new JTextField();
        namaProdukField.setBounds(120, 10, 200, 25);
        inputPanel.add(namaProdukField);

        // Harga
        hargaProdukLabel = new JLabel("Harga:");
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

        //  RADIO BUTTON BARU: Tidak Ada Promo
        noPromoRadio = new JRadioButton("Tidak Ada Promo");
        noPromoRadio.setBounds(120, 175, 200, 25);
        inputPanel.add(noPromoRadio);

        // ButtonGroup agar hanya satu radio dapat dipilih
        promoGroup = new ButtonGroup();
        promoGroup.add(promoRadio);
        promoGroup.add(noPromoRadio);

        // (4) JSpinner - untuk jumlah stok
        JLabel stokLabel = new JLabel("Stok:");
        stokLabel.setBounds(10, 210, 100, 25);
        inputPanel.add(stokLabel);

        stokSpinner = new JSpinner();
        stokSpinner.setBounds(120, 210, 100, 25);
        inputPanel.add(stokSpinner);

        // (5) JButton tambahan - tombol reset
        resetButton = new JButton("Reset");
        resetButton.setBounds(120, 240, 100, 25);
        inputPanel.add(resetButton);

        // (6) JToggleButton baru: contoh toggle untuk fitur ekspor CSV
        eksporToggle = new JToggleButton("Mode Ekspor OFF");
        eksporToggle.setBounds(120, 270, 200, 25);
        inputPanel.add(eksporToggle);

        // untuk tabel
        produkTableModel = new DefaultTableModel(columnNames, 0);
        produkTable = new JTable(produkTableModel);
        scrollPane = new JScrollPane(produkTable);
        scrollPane.setBounds(420, 10, 900, 700);
        inputPanel.add(scrollPane);

        // untuk tombol simpan
        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(10, 305, 100, 25);
        inputPanel.add(simpanButton);
    }

    void populateActionListener() {
        simpanButton.addActionListener(e -> {
            String namaProduk = namaProdukField.getText();
            String hargaProduk = hargaProdukField.getText();

            String promoStatus =
                    promoRadio.isSelected() ? "ada" :
                    noPromoRadio.isSelected() ? "tidak ada" :
                    "tidak dipilih";

            int stok = (Integer) stokSpinner.getValue();

            produkTableModel.addRow(new Object[]{
                    namaProduk,
                    hargaProduk,
                    promoStatus,
                    stok
            });

            JOptionPane.showMessageDialog(this,
                    "Data disimpan:\n" +
                            "Nama Produk: " + namaProduk +
                            "\nHarga: " + hargaProduk +
                            "\nPromo: " + promoStatus +
                            "\nStok: " + stok);

            // ekspor otomatis jika toggle ON
            if (eksporToggle.isSelected()) {
                exportCSV(); // panggil fungsi ekspor
            }
        });

        // Event tombol reset
        resetButton.addActionListener(e -> {
            namaProdukField.setText("");
            hargaProdukField.setText("");
            kategoriCombo.setSelectedIndex(0);
            tersediaCheck.setSelected(false);
            promoGroup.clearSelection();
            stokSpinner.setValue(0);

            produkTableModel.setRowCount(0);
        });

        //  Event Toggle Button untuk mengganti teks saat ditekan
        eksporToggle.addActionListener(e -> {
            if (eksporToggle.isSelected()) {
                eksporToggle.setText("Mode Ekspor ON");
            } else {
                eksporToggle.setText("Mode Ekspor OFF");
            }
        });
    }

    // Fungsi ekspor CSV
    void exportCSV() {
        try (FileWriter writer = new FileWriter("D:\\Kuliah\\Semester 3\\Praktikum Pemrograman Berorientasi Objek\\PraktekPBO\\PraktekPBO\\Minggu11\\com.firstswing.app\\produk.csv")) {
            // header
            for (int i = 0; i < produkTableModel.getColumnCount(); i++) {
                writer.append(produkTableModel.getColumnName(i));
                if (i != produkTableModel.getColumnCount() - 1) writer.append(",");
            }
            writer.append("\n");

            // data
            for (int i = 0; i < produkTableModel.getRowCount(); i++) {
                for (int j = 0; j < produkTableModel.getColumnCount(); j++) {
                    writer.append(String.valueOf(produkTableModel.getValueAt(i, j)));
                    if (j != produkTableModel.getColumnCount() - 1) writer.append(",");
                }
                writer.append("\n");
            }

            writer.flush();
            JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke produk.csv!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal ekspor CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        TokoFrame frame = new TokoFrame();
        frame.setVisible(true);
    }
}

