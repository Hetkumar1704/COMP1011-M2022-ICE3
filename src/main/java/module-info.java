module ca.georgiancollege.comp1011m2022ice3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ca.georgiancollege.comp1011m2022ice3 to javafx.fxml;
    exports ca.georgiancollege.comp1011m2022ice3;
}