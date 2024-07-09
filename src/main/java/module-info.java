module project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.opencsv;
    requires org.json;

    exports project;
    exports project.controller;

    opens project.controller;
    opens project.model to javafx.base;

}
