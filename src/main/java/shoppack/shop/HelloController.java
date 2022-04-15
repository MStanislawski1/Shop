//<GridPane prefHeight="339.0" prefWidth="262.0" xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="shoppack.shop.HelloController">

package shoppack.shop;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Button Addbtn;
    public TextField priceField;
    public TextField quantityField;
    @FXML
    private ListView<String> ItemsList;
    public ListView<String > ItemsList2;
    @FXML
    private TextField Screen;
    ObservableList list= FXCollections.observableArrayList();
    ObservableList list2= FXCollections.observableArrayList();

    private void loadData(){//dodawanie rzeczy do listy z rzeczami które można kupić
        list.removeAll(list);
        String A = "Ananas";
        String B = "Jabłko";
        list.addAll(A,B);
        ItemsList.getItems().addAll(list);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();

    }

    public void dispSelected(javafx.scene.input.MouseEvent mouseEvent) {
        String item=ItemsList.getSelectionModel().getSelectedItem();
        if(item==null||item.isEmpty()){
            Screen.setText("Nothing selected");
        }
        else{
            Screen.setText(item +" selected");
        }
    }


    public void AddAction(ActionEvent event) {
        //System.out.println("asdasd");
        String item=ItemsList.getSelectionModel().getSelectedItem();
        if(item==null||item.isEmpty()){
        }
        else{
            list2.removeAll(list2);
            String D=item;
            list2.addAll(D);
            ItemsList2.getItems().addAll(list2);
        }
    }



}
