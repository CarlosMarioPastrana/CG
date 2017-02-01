package com.mycompany.grafica1;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
    
    @FXML
    private Canvas canvas;
    
    private GraphicsContext lienzo;
    
    
    boolean mostrar;
       
    @FXML
    private void RV(ActionEvent event)
    {
       lienzo.setStroke(Color.GREEN);
       lienzo.setLineWidth(2);
       lienzo.strokeLine(40, 50, 120, 50);
       lienzo.strokeLine(120, 50, 120, 90);
       lienzo.strokeLine(40, 50, 40, 90);
       lienzo.strokeLine(40, 90, 120, 90);
    }
    
    @FXML
    private void RR(ActionEvent event)
    {
       lienzo.setStroke(Color.RED);
       lienzo.setLineWidth(4);
       lienzo.strokeLine(140, 50, 220, 50);
       lienzo.strokeLine(220, 50, 220, 90);
       lienzo.strokeLine(140, 50, 140, 90);
       lienzo.strokeLine(140, 90, 220, 90);
       lienzo.setFill(Color.BLUE);
       lienzo.fillRect(140, 50, 80, 40);
    }
    
    @FXML
    private void TV(ActionEvent event)
    {
        lienzo.setStroke(Color.GREEN);
        lienzo.setLineWidth(2);
        lienzo.strokeLine(280, 50, 240, 90);
        lienzo.strokeLine(280, 50, 320, 90);
        lienzo.strokeLine(240, 90, 320, 90);   
    }
    
    @FXML
    private void R(ActionEvent event)
    {
        lienzo.setStroke(Color.BLACK);
        lienzo.setLineWidth(2);
        lienzo.strokeLine(280, 150, 240, 190);
        lienzo.strokeLine(280, 150, 320, 190);
        lienzo.strokeLine(240, 190, 280, 230);
        lienzo.strokeLine(320, 190, 280, 230);
    }
    
    @FXML
    private void LP(ActionEvent event)
    {
        lienzo.clearRect(0, 0, 572, 318);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lienzo = canvas.getGraphicsContext2D();

        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(new Color(.15, .15, .15, .95));
        lienzo.setLineWidth(2);
        lienzo.strokeRect(0, 0, w, h);    

        mostrar = false;
    

    }    
}
