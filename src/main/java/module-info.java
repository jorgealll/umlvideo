module com.example.umlvideo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.umlvideo to javafx.fxml;
    exports com.example.umlvideo;
}