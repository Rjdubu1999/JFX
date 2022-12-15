module wilkinson.first_screen {
    requires javafx.controls;
    requires javafx.fxml;


    opens wilkinson.first_screen to javafx.fxml;
    exports wilkinson.first_screen;
}