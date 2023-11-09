package com.inventario.inventario.controller;

import com.inventario.inventario.models.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductoController implements Initializable {

    @FXML
    public AnchorPane main;
    @FXML
    public TableView<Product> productos;

    @FXML
    private TableColumn colId;
    @FXML
    private TableColumn colName;
    @FXML
    private TableColumn colQuantitiesSold;
    @FXML
    private TableColumn colQuantitiesRemainign;

    @FXML
    private TableColumn price;

    private ObservableList<Product> products;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        products = FXCollections.observableArrayList();
        this.colId.setCellFactory(new PropertyValueFactory<>("id"));
        this.colId.setCellFactory(new PropertyValueFactory<>("name"));
        this.colId.setCellFactory(new PropertyValueFactory<>("price"));
    }


}
