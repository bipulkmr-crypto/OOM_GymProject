module com.example.oom_gym {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.oom_gym to javafx.fxml;
    exports com.example.oom_gym;
}