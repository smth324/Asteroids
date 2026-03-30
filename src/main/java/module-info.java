module asteroids {
    requires javafx.controls;
    requires javafx.fxml;

    exports asteroids;
    opens asteroids to javafx.fxml;
}