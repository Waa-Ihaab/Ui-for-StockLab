import javax.swing.JButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainInter extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label label = new Label("Sign In");
        label.getStyleClass().add("sign-in-label"); 
        Label StockLab = new Label("StockLab");
        StockLab.getStyleClass().add("StockLab-style"); 
        
        Label Or = new Label("Or");
        Or.getStyleClass().add("Or-style"); 
        
        Label Infor = new Label("For more information contact us !");
        Infor.getStyleClass().add("Infor-style"); 
        

        Label Gmailst = new Label("Stocklab.client@sttest.ma");
        Gmailst.getStyleClass().add("Gmailst-style"); 
        
        
        Label Phonest = new Label("0523548160");
        Phonest.getStyleClass().add("Phonest-style"); 
        
        TextField emailField = new TextField();
        emailField.setPromptText("Entrez votre e-mail");
        emailField.getStyleClass().add("email-field");
     
        
        PasswordField passField = new PasswordField();
        passField.setPromptText("Entrez votre mot de passe");
        passField.getStyleClass().add("pass-field"); // Ajoutez une classe CSS si nécessaire


        
        
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
        
        Button Create_an_account = new Button("Create an account");
        Create_an_account.setOnAction(e -> {
            Creat_acc createAccount = new Creat_acc();
            Stage stage = new Stage();
            createAccount.start(stage);
            Stage currentStage = (Stage) Create_an_account.getScene().getWindow();
            currentStage.close();

        });
        
        
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = emailField.getText();
            String password = passField.getText();
            System.out.println("Login button clicked! Username: " + username + ", Password: " + password);
           
        });
        
        loginButton.getStyleClass().add("loginButton-style");
       
        Image image1 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logowhit.png");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logoblack.png");
        ImageView imageView2 = new ImageView(image2);
        
        Image loginsahm = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\loginsahm.png");
        ImageView imageloginsahm = new ImageView(loginsahm);
        Create_an_account.getStyleClass().add("Create_an_account-Style");
        
        Image linkdin = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\link.png");
        ImageView imagelinkdin = new ImageView(linkdin);
        
        Image google = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\google.png");
        ImageView imagegoogle = new ImageView(google);
        
        Image fb = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\fb.png");
        ImageView imagefb = new ImageView(fb);
      
        
      
        
        rectanglesefli.getStyleClass().add("loginsahm-style");
        
        
        StackPane root = new StackPane();
        
        root.getChildren().addAll(rectanglerose,
        		rectanglezre9,
        		rectanglekhder,
        		label,rectangle,
        		rectanglesefli,
        		rectangleBlur,
        		imageView1,
        		imageView2,
        		emailField,
        		passField,
        		StockLab,
        		loginButton,
        		imageloginsahm,
        		Or,
        		Create_an_account,
        		imagelinkdin,
        		imagegoogle,
        		imagefb,
        		Infor,
        		Gmailst,
        		Phonest
        		);
    
        
        Or.setTranslateX(0); 
        Or.setTranslateY(88); 
        
        BoxBlur boxBlur = new BoxBlur();
        boxBlur.setWidth(160);  
        boxBlur.setHeight(160);
        rectangleBlur.setEffect(boxBlur);
        
        emailField.setTranslateX(0);
        emailField.setTranslateY(-50); 
        passField.setTranslateX(0);
        passField.setTranslateY(0); 
        
        
        Infor.setTranslateY(255);
        
        Gmailst.setTranslateY(266.5);
        
        Phonest.setTranslateY(278.5);
        
        rectanglesefli.setTranslateX(0); 
        rectanglesefli.setTranslateY(285); 
        
        rectangleBlur.setTranslateX(0); 
        rectangleBlur.setTranslateY(265); 
        
        rectanglerose.setTranslateX(-130); 
        rectanglerose.setTranslateY(-300); 
        rectanglezre9.setTranslateX(120); 
        rectanglezre9.setTranslateY(285); 
        rectanglekhder.setTranslateX(200); 
        rectanglekhder.setTranslateY(-270);
        
        rectangle.setTranslateX(0); 
        rectangle.setTranslateY(-280); 
        
        imageView1.setTranslateX(0); 
        imageView1.setTranslateY(-274); 
        
        imageView2.setTranslateX(-133.25); 
        imageView2.setTranslateY(-200.5); 
        
        imageloginsahm.setTranslateY(imageloginsahm.getTranslateY() + 55.5);
        imageloginsahm.setTranslateX(imageloginsahm.getTranslateX() +28);
        
        imagelinkdin.setTranslateX(-50);
        imagelinkdin.setTranslateY(170);
        
        imagegoogle.setTranslateX(-0);
        imagegoogle.setTranslateY(170);
        
        imagefb.setTranslateX(50);
        imagefb.setTranslateY(170);
        
        loginButton.setTranslateY(loginButton.getTranslateY() + 55);
        Create_an_account.setTranslateY(Create_an_account.getTranslateY() + 120);
       
        Scene scene = new Scene(root, 360,600);
        scene.getStylesheets().add(getClass().getResource("Styles.css").toExternalForm());

        primaryStage.setTitle("Sign In");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
