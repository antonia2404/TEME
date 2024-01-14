package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShoesForm {
    private JTextField textMaterial;
    private JTextField textModel;
    private JButton cancelButton;
    private JButton addButton;
    private JRadioButton pradaRadioButton;
    private JRadioButton musetteRadioButton;
    private JRadioButton chloeRadioButton;
    private JRadioButton steveMaddensRadioButton;
    private JComboBox<String> sizeComboBox;
    private JCheckBox pinkCheckBox;
    private JCheckBox redCheckBox;
    private JCheckBox blackCheckBox;
    private JCheckBox whiteCheckBox;
    private JCheckBox greenCheckBox;
    private JCheckBox blueCheckBox;
    private JCheckBox goldCheckBox;
    private JCheckBox violetCheckBox;
    private JPanel myPanel;

    private List<String> selectedColors;  // Track selected colors
    private List<Shoe> shoesList;
    private ButtonGroup brandButtonGroup;

    public ShoesForm() {
        shoesList = new ArrayList<>();
        selectedColors = new ArrayList<>();
        brandButtonGroup = new ButtonGroup();

        // Initialize components and set up event listeners
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the program
                System.exit(0);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String material = textMaterial.getText();
                String model = textModel.getText();
                String selectedBrand = getSelectedBrand();
                String selectedSize = (String) sizeComboBox.getSelectedItem();
                List<String> selectedColors = getSelectedColors();

                // Create a Shoe object
                Shoe shoe = new Shoe(material, model, selectedBrand, selectedSize, selectedColors);

                // Add the shoe to the list
                shoesList.add(shoe);

                // Save the data to a JSON file
                saveShoesDataToJson();

                // Display the added shoe information
                displayShoesInfo(material, model, selectedBrand, selectedSize, selectedColors);

                // Clear the form
                clearForm();
            }
        });

        // Add radio buttons to the ButtonGroup
        brandButtonGroup.add(pradaRadioButton);
        brandButtonGroup.add(musetteRadioButton);
        brandButtonGroup.add(chloeRadioButton);
        brandButtonGroup.add(steveMaddensRadioButton);
    }

    private List<String> getSelectedColors() {
        List<String> selectedColors = new ArrayList<>();

        // Check each color checkbox and add the selected ones to the list
        if (pinkCheckBox.isSelected()) selectedColors.add("Pink");
        if (redCheckBox.isSelected()) selectedColors.add("Red");
        if (blackCheckBox.isSelected()) selectedColors.add("Black");
        if (whiteCheckBox.isSelected()) selectedColors.add("White");
        if (greenCheckBox.isSelected()) selectedColors.add("Green");
        if (blueCheckBox.isSelected()) selectedColors.add("Blue");
        if (goldCheckBox.isSelected()) selectedColors.add("Gold");
        if (violetCheckBox.isSelected()) selectedColors.add("Violet");

        return selectedColors;
    }

    private String getSelectedBrand() {
        if (pradaRadioButton.isSelected()) {
            return "Prada";
        } else if (musetteRadioButton.isSelected()) {
            return "Musette";
        } else if (chloeRadioButton.isSelected()) {
            return "Chloe";
        } else if (steveMaddensRadioButton.isSelected()) {
            return "Steve Maddens";
        } else {
            return "Unknown";
        }
    }

    private void clearForm() {
        // Clear text fields
        textMaterial.setText("");
        textModel.setText("");

        // Clear radio button selection using the ButtonGroup
        brandButtonGroup.clearSelection();

        // Clear combo box
        sizeComboBox.setSelectedIndex(0);

        // Clear check boxes
        pinkCheckBox.setSelected(false);
        redCheckBox.setSelected(false);
        blackCheckBox.setSelected(false);
        whiteCheckBox.setSelected(false);
        greenCheckBox.setSelected(false);
        blueCheckBox.setSelected(false);
        goldCheckBox.setSelected(false);
        violetCheckBox.setSelected(false);
    }

    private void displayShoesInfo(String material, String model, String brand, String size, List<String> selectedColors) {

        StringBuilder colorsString = new StringBuilder();
        for (String color : selectedColors) {
            colorsString.append(color).append(", ");
        }
        if (colorsString.length() > 0) {
            colorsString.setLength(colorsString.length() - 2); // Remove the last comma and space
        }

        JOptionPane.showMessageDialog(null, "Material: " + material + "\nModel: " + model + "\nBrand: " + brand +
                "\nSize: " + size + "\nSelected Colors: " + colorsString.toString(), "Shoes Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveShoesDataToJson() {
        try (FileWriter writer = new FileWriter("shoes_data.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(shoesList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create and show the form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Shoes Form");
                frame.setContentPane(new ShoesForm().myPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private class Shoe {
        private String material;
        private String model;
        private String brand;
        private String size;
        private List<String> color;

        public Shoe(String material, String model, String brand, String size, List<String> color) {
            this.material = material;
            this.model = model;
            this.brand = brand;
            this.size = size;
            this.color = color;
        }
    }
}
