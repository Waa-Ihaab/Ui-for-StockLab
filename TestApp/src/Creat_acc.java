import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Creat_acc extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 360, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Create Account");
        primaryStage.show();
        
        scene.getStylesheets().add(getClass().getResource("Styles2.css").toExternalForm());
        
        Label SingUp = new Label("Sign Up");
        SingUp.getStyleClass().add("sign-in-label"); 
        
        Image image1 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logowhit.png");
        ImageView imageView1 = new ImageView(image1);
        
        Image image2 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logoblack.png");
        ImageView imageView2 = new ImageView(image2);
        
       
        Label StockLab = new Label("StockLab");
        StockLab.getStyleClass().add("StockLab-style"); 
        
        
        Label Infor = new Label("For more information contact us !");
        Infor.getStyleClass().add("Infor-style"); 
        
        
        Label Already = new Label("Already have an account .");
        Already.getStyleClass().add("Already-style"); 
        

        Label Gmailst = new Label("Stocklab.client@sttest.ma");
        Gmailst.getStyleClass().add("Gmailst-style"); 
        
        
        Label Phonest = new Label("0523548160");
        Phonest.getStyleClass().add("Phonest-style"); 
        
        TextField emailField = new TextField();
        emailField.setPromptText("Entrez votre e-mail");
        emailField.getStyleClass().add("email-field");
     
        TextField UserNameField = new TextField();
        UserNameField.setPromptText("Entrez votre user name");
        UserNameField.getStyleClass().add("UserNameField-Style");
        
        PasswordField passField = new PasswordField();
        passField.setPromptText("Entrez votre mot de passe");
        passField.getStyleClass().add("passField-Style");
        
        PasswordField ConfirmepassField = new PasswordField();
        ConfirmepassField.setPromptText("Rentrez votre mot de passe");
        ConfirmepassField.getStyleClass().add("Rentrezpass-field");
   
        
        Rectangle rectangle = new Rectangle(360, 50);
        rectangle.getStyleClass().add("rectangle-style");
        
        Rectangle rectanglesefli = new Rectangle(360,90);
        rectanglesefli.getStyleClass().add("rectanglesefli-style");
        rectanglesefli.setArcWidth(65); 
        rectanglesefli.setArcHeight(65); 
        
        
        Rectangle rectangleBlur = new Rectangle(100,15);
        rectangleBlur.getStyleClass().add("rectangleBlur-Style");
        rectangleBlur.setArcWidth(00); 
        rectangleBlur.setArcHeight(00); 
        BoxBlur boxBlur = new BoxBlur();
        boxBlur.setWidth(240);  
        boxBlur.setHeight(240);
        rectangleBlur.setEffect(boxBlur);
        
        
        Rectangle rectanglerose = new Rectangle(174, 174);
        rectanglerose.setFill(Color.valueOf("#FFA3A3"));
        BoxBlur blur = new BoxBlur(113,113,113); 
        rectanglerose.setEffect(blur);
        
        
        Rectangle rectanglezre9 = new Rectangle(174, 174);
        rectanglezre9.setFill(Color.valueOf("#A3FFE9"));
        rectanglezre9.setEffect(blur);
        
        Rectangle rectanglekhder = new Rectangle(174, 174);
        rectanglekhder.setFill(Color.valueOf("#A3FFA6"));
        rectanglekhder.setEffect(blur);
        
        
        
        
        Button Confirm = new Button("Confirm");
        Confirm.setOnMouseClicked(event -> {
        	  });
        
        Confirm.getStyleClass().add("Confirm-Style");
        
        
        Label Login = new Label("Login");
        Login.getStyleClass().add("Login-Style"); 
        
        Login.setOnMouseClicked(event -> {
            Stage stage = new Stage();
            MainInter mainInter = new MainInter();
            mainInter.start(stage);
            Stage currentStage = (Stage) SingUp.getScene().getWindow();
            currentStage.close();
        });
        
        
        
        root.getChildren().addAll(rectanglerose,
        		rectanglezre9,
        		rectanglekhder,
        		SingUp,
        		rectangle,
        		rectanglesefli,
        		rectangleBlur,
        		emailField,
        		UserNameField,
        		passField,
        		ConfirmepassField,
        		StockLab,
        		Infor,
        		Gmailst,
        		Phonest,
        		imageView2,
        		imageView1,
        		Confirm,
        		Already,
        		Login
        		);
        
        
       
        
        
        
        emailField.setTranslateX(0);
        emailField.setTranslateY(-50); 
        
        passField.setTranslateX(0);
        passField.setTranslateY(40); 
        
        ConfirmepassField.setTranslateX(0);
        ConfirmepassField.setTranslateY(85);
        
        UserNameField.setTranslateX(0);
        UserNameField.setTranslateY(-5);
        
        
        
        rectangleBlur.setTranslateX(0); 
        rectangleBlur.setTranslateY(265);
        
        
        Infor.setTranslateY(253);
        
        Gmailst.setTranslateY(265.5);
        
        Phonest.setTranslateY(277.5);
        
        rectanglesefli.setTranslateX(0); 
        rectanglesefli.setTranslateY(285); 
        
        rectanglerose.setTranslateX(-130); 
        rectanglerose.setTranslateY(-300); 
        rectanglezre9.setTranslateX(120); 
        rectanglezre9.setTranslateY(285); 
        rectanglekhder.setTranslateX(200); 
        rectanglekhder.setTranslateY(-270);
        
        rectangle.setTranslateX(0); 
        rectangle.setTranslateY(-280); 
        
        imageView2.setTranslateX(-133.25); 
        imageView2.setTranslateY(-200.5); 

        imageView1.setTranslateX(0); 
        imageView1.setTranslateY(-274); 
        
        Already.setTranslateX(-20);
        Already.setTranslateY(165);
        
        Login.setTranslateX(50);
        Login.setTranslateY(165);
        
        Confirm.setTranslateY(Confirm.getTranslateY() + 135);
        
    }

    public void display() {
        launch();
    }
}
