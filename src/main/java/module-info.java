module com.desafiocontrolefluxo.desafiocontrolefluxo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.desafiocontrolefluxo.desafiocontrolefluxo to javafx.fxml;
    exports com.desafiocontrolefluxo.desafiocontrolefluxo;
}