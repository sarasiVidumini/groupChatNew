module lk.ijse.groupchat {
    requires javafx.controls;
    requires javafx.fxml;

    opens lk.ijse.groupchat.controller to javafx.fxml;
    opens lk.ijse.groupchat to javafx.fxml; // optional but safe to keep
    exports lk.ijse.groupchat;
}
