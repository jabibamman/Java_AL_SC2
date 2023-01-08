module com.poo.model.alsc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poo.model.alsc2 to javafx.fxml;
    exports com.poo.model.alsc2;
    exports com.poo.model.alsc2.model;
    opens com.poo.model.alsc2.model to javafx.fxml;
}