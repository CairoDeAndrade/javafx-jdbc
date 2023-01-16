 package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{
	
	private Department entity;
	
	@FXML
	private TextField textId;
	
	@FXML
	private TextField textName;
	
	@FXML
	private Label lableErrorName;
	
	@FXML
	private Button BtSave;
	
	@FXML
	private Button BtCancel;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onBtSaveAction(ActionEvent event) {
		System.out.println("onBtSaveAction");
	}
	
	@FXML
	public void onBtCancelAction(ActionEvent event) {
		System.out.println("onBtCancelAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(textId);
		Constraints.setTextFieldMaxLength(textName, 30);
	}
	
	public void updateFormData() {
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		textId.setText(String.valueOf(entity.getId()));
		textName.setText(entity.getName());
	}
}
