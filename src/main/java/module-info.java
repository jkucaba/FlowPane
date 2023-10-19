module com.jakubku.flowpane.flowpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.flowpane.flowpanelayout to javafx.fxml;
    exports com.jakubku.flowpane.flowpanelayout;
}