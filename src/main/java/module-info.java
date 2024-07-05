module com.machinelearning {
    requires javafx.controls;
    requires javafx.fxml;
    requires weka.stable;

    opens com.machinelearning to javafx.fxml;
    opens com.machinelearning.controllers to javafx.fxml;
    opens com.machinelearning.models to javafx.fxml;
    exports com.machinelearning;
    exports com.machinelearning.controllers;
    exports com.machinelearning.models;
}
