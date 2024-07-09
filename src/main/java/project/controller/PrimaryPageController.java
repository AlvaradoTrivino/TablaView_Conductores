package project.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import project.model.DriverResult;
import project.repository.DriverResultRepository;

public class PrimaryPageController implements Initializable {

	// Table
	@FXML
	private TableView<DriverResult> tableDrivers;

	// Columns

	@FXML
	private TableColumn<DriverResult, String> ColumnDriverName;

	@FXML
	private TableColumn<DriverResult, Integer> ColumnRank;

	@FXML
	private TableColumn<DriverResult, Integer> ColumnTotalPoints;

	@FXML
	private TableColumn<DriverResult, Integer> ColumnWins;

	// Selector

	@FXML
	private ComboBox<Integer> selectionYear;

	// Variables
	private int selectedYear;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		for (int year = 1950; year <= 2019; year++) {
			selectionYear.getItems().add(year);
		}

		cargarDri(2019);

		// valor default
		selectionYear.setValue(2019);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@FXML
	private void cargarDri(int year) {
		this.ColumnDriverName.setCellValueFactory(new PropertyValueFactory("driverName"));
		this.ColumnRank.setCellValueFactory(new PropertyValueFactory("rank"));
		this.ColumnTotalPoints.setCellValueFactory(new PropertyValueFactory("totalPoints"));
		this.ColumnWins.setCellValueFactory(new PropertyValueFactory("wins"));

		DriverResultRepository drv = new DriverResultRepository();
		List<DriverResult> ls_d = drv.getResultByYear(year);
		for (DriverResult rs : ls_d) {
			tableDrivers.getItems().add(rs);
		}

	}

	@FXML
	void selectionMethod(ActionEvent event) {
		selectedYear = selectionYear.getValue();
		System.out.println("Year selected: " + selectedYear);
		// Limpiar la tabla antes de cargar nuevos datos
		tableDrivers.getItems().clear();
		cargarDri(selectedYear);
	}

}
