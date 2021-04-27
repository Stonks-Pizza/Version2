import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    Button GoToSignInBtn;

    public void handleGoToSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

        Stage window = (Stage) GoToSignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CreateAccountBtn;

    public void handleCreateAccountBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) CreateAccountBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button HomeBtn;

    public void handleHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

        Stage window = (Stage) HomeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button ProfileBtn;

    public void handleProfileBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) ProfileBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button MenuBtn;

    public void handleMenuBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) MenuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button BackBtn;

    public void handleBackBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) BackBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button GoToCartBtn;

    public void handleGoToCartBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cart.fxml"));

        Stage window = (Stage) GoToCartBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button SignInBtn;

    public void handleSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) SignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CustomPizzaBtn;

    public void handleCustomPizzaBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CustomPizza.fxml"));

        Stage window = (Stage) CustomPizzaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CheckOutBtn;

    public void handleCheckOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("checkOut.fxml"));

        Stage window = (Stage) CheckOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CarryOutBtn;

    public void handleCarryOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CarryOutCheckOut.fxml"));

        Stage window = (Stage) CarryOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }
}
