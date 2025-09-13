/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 *
 * @author hndu
 */
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Gui extends Application {
    
    @Override
    public void start(Stage primaryStage){ 
        
        primaryStage.setTitle("Bank Of Coders (BCO)");
        Button login = new Button("Login");
        
         
        GridPane layout = new GridPane();
        layout.add(login, 0, 3);
       
        Label user = new Label("Username: ");
        TextField userField = new TextField();
        
        Label pw = new Label("Password: ");
        TextField pwField = new TextField();
        
        
        Label welcome = new Label("BCO");
        welcome.setFont(Font.font("Copperplate", FontWeight.NORMAL, 25));
        
        Label invalid = new Label("Invalid Login");
        
        
        //positioning on the grid
        layout.setAlignment(Pos.CENTER);
        layout.add(userField, 1 ,1);
        layout.add(user, 0, 1);
        layout.add(pw, 0, 2);
        layout.add(pwField, 1, 2);
        layout.add(welcome , 0 , 0);
        
        
        
        //We create a manager to authenticate the initial logins
        Manager BCO = new Manager();
        
        login.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                String username = userField.getText();
                String password = pwField.getText();

                if (username.equals("admin") && password.equals("admin")){
                    managerWindow(primaryStage, BCO); //if a manager logs in this takes them to the manager screen
                    System.out.println("Got here");
                    
                } else if (BCO.verify(username, password)){ //will create a verify method in the manager class to check for login credentials
                    customerWindow(primaryStage, BCO);
                    System.out.println("Got here logged in");
                } 
                  else{
                    System.out.println("Invalid Login");
                    layout.add(invalid, 1, 3);
                }
            }
        });
        
        Scene scene = new Scene(layout, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public void managerWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        Label welcomeManager = new Label("MANAGER PORTAL");
        Label optionText = new Label("OPTIONS: ");
        
        Button addButton = new Button("Add Customer");
        Button deleteButton = new Button("Delete Customer");
        Button logoutButton = new Button("Logout");
        welcomeManager.setFont(Font.font("Copperplate", FontWeight.NORMAL, 25));

        
        GridPane managerPane = new GridPane();
        managerPane.setAlignment(Pos.CENTER);
        managerPane.add(welcomeManager ,0 ,0);
        managerPane.add(optionText, 0, 1);
        managerPane.add(addButton, 0, 2);
        managerPane.add(deleteButton, 0, 3);
        managerPane.add(logoutButton, 0, 4);
        
        addButton.setOnAction((ActionEvent e)->{
        addCustomerWindow(primaryStage, BCO);
        });
        
        deleteButton.setOnAction((ActionEvent e)->{
        deleteCustomerWindow(primaryStage, BCO); 
        });
       
        logoutButton.setOnAction((ActionEvent e) -> {
            start(primaryStage);
        });
        
        Scene scene = new Scene(managerPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
    }
    
    public void addCustomerWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        Label user = new Label("First Name: ");
        TextField userField = new TextField();
        Label pass = new Label("Password: ");
        TextField passField = new TextField();
        
        Button addC = new Button("Add");
        Button backButton = new Button("Back");
        
        Label addedText = new Label("Customer Added!");
        
        GridPane addPane = new GridPane();
        
        addC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = userField.getText();
                String password = passField.getText();
                if (username != null && password != null) {
                    BCO.addCustomer(username, password);
                    addPane.add(addedText, 1, 3);
                }
                else {
                    System.out.println("urname and pw gotta be right");
                }
            }
        });
        
        backButton.setOnAction((ActionEvent e) -> {
            managerWindow(primaryStage, BCO);
        });
        
        
        addPane.setAlignment(Pos.CENTER);
        addPane.add(user, 0, 1);
        addPane.add(userField, 1, 1);
        addPane.add(pass, 0, 2);
        addPane.add(passField, 1, 2);
        addPane.add(addC, 0,3);
        addPane.add(backButton, 0, 4);
        
        Scene scene = new Scene(addPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void deleteCustomerWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        Label user = new Label("First Name: ");
        TextField userField = new TextField();
        Label pass = new Label("Password: ");
        TextField passField = new TextField();
        
        Button deleteC = new Button("Delete");
        Button backButton = new Button("Back");
        
        Label deleteText = new Label("Customer Deleted");
        
        GridPane addPane = new GridPane();

        
        deleteC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = userField.getText();
                String password = passField.getText();
                if (username != null && password != null) {
                    BCO.deleteCustomer(username, password);
                    addPane.add(deleteText, 1, 3);
                }
                else {
                    System.out.println("urname and pw gotta be right");
                }
            }
        });
        
        backButton.setOnAction((ActionEvent e) -> {
            managerWindow(primaryStage, BCO);
        });
        
        addPane.setAlignment(Pos.CENTER);
        addPane.add(user, 0, 1);
        addPane.add(userField, 1, 1);
        addPane.add(pass, 0, 2);
        addPane.add(passField, 1, 2);
        addPane.add(deleteC, 0,3);
        addPane.add(backButton, 0, 4);
        
        Scene scene = new Scene(addPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void customerWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        
        Button logoutButton = new Button("Logout");
        Button depositButton = new Button("Deposit");
        Button withdrawButton = new Button("Withdraw");
        Button purchaseButton = new Button("Purchase");
        
        Label welcomeText = new Label("Welcome to your account.");
        Label balLabel = new Label("Balance: "+ BCO.getBalance());
        welcomeText.setFont(Font.font("Copperplate", FontWeight.NORMAL, 15));

        
        GridPane customerGrid = new GridPane();
        customerGrid.add(logoutButton, 0,4);
        
        withdrawButton.setOnAction((ActionEvent e) -> { //using lambda notation
            withdrawWindow(primaryStage, BCO);
        });
        
        depositButton.setOnAction((ActionEvent e) -> {
            depositWindow(primaryStage, BCO);
        });
        
        purchaseButton.setOnAction((ActionEvent e) -> {
            purchaseWindow(primaryStage, BCO);
        });
        
        logoutButton.setOnAction((ActionEvent e) -> {
            start(primaryStage);
        });
        
        
         balLabel.setFont(Font.font("Copperplate", FontWeight.NORMAL, 15));

        customerGrid.setAlignment(Pos.CENTER);
        customerGrid.add(welcomeText, 0,0);
        customerGrid.add(depositButton, 0,1);
        customerGrid.add(withdrawButton, 0, 2);
        customerGrid.add(purchaseButton, 0, 3);
        customerGrid.add(balLabel, 2, 1);
        
        
        Scene scene = new Scene(customerGrid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public void withdrawWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        GridPane withdrawPane = new GridPane();
        
        Label withdrawText = new Label("Withdrawls");
                
        
        Button back = new Button("Back");
        Button withdraw = new Button("Widthdraw");
        
        TextField withdrawField = new TextField();
        
        Label levelLabel = new Label("Level: " + BCO.level());
        Label balLabel = new Label("Balance: "+ BCO.getBalance());
        
        withdraw.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              int amount = Integer.parseInt(withdrawField.getText());
              if (BCO.withdraw(amount)){
                  levelLabel.setText("Level: " + BCO.level());
                  balLabel.setText("Balance: " + BCO.getBalance());   
              }else{
                  Alert notEnough = new Alert(AlertType.WARNING);
                  notEnough.setTitle("WARNING");
                  notEnough.setContentText("Low on funds/Not enough");
              }
                  
            }
        
        });
        
        back.setOnAction((ActionEvent e) -> {
            customerWindow(primaryStage, BCO);
        });
        
        withdrawPane.setAlignment(Pos.CENTER);
        withdrawPane.add(back, 1, 4);
        withdrawPane.add(withdraw,0,4);
        withdrawPane.add(withdrawText, 0, 0);
        withdrawPane.add(withdrawField, 0,1);
        withdrawPane.add(levelLabel, 1, 1);
        withdrawPane.add(balLabel, 0, 2);
        
        Scene scene = new Scene(withdrawPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public void depositWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        GridPane depositPane = new GridPane();
        
        Label depositText = new Label("Deposit");
                
        
        Button back = new Button("Back");
        Button deposit = new Button("Deposit");
        
        TextField depositField = new TextField();
        
        Label levelLabel = new Label("Level: " + BCO.level());
        Label balLabel = new Label("Balance: "+ BCO.getBalance());
        
        deposit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              int amount = Integer.parseInt(depositField.getText());
              BCO.deposit(amount);
              levelLabel.setText("Level: "+ BCO.level());
              balLabel.setText("Account Balance: " + BCO.getBalance());
              }
                  
            });
        
        
        
        back.setOnAction((ActionEvent e) -> {
            customerWindow(primaryStage, BCO);
        });
        
        depositPane.setAlignment(Pos.CENTER);
        depositPane.add(back, 1, 4);
        depositPane.add(deposit,0,4);
        depositPane.add(depositText, 0, 0);
        depositPane.add(depositField, 0,1);
        depositPane.add(levelLabel, 1, 1);
        depositPane.add(balLabel, 0, 2);
        
        Scene scene = new Scene(depositPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void purchaseWindow(Stage primaryStage, Manager a){
        Manager BCO = a;
        GridPane purchasePane = new GridPane();
        
        Label purchaseText = new Label("Enter the amount to purchase");
                
        
        Button back = new Button("Back");
        Button purchase = new Button("Purchase");
        
        TextField purchaseField = new TextField();
        
        Label levelLabel = new Label("Level: " + BCO.level());
        Label balLabel = new Label("Balance: "+ BCO.getBalance());
       
        
        purchase.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
              int amount = Integer.parseInt(purchaseField.getText());
              if (BCO.purchase(amount)){
                  levelLabel.setText("Level: " + BCO.level());
                  balLabel.setText("Balance: " + BCO.getBalance());   
              }else{
                  Alert notEnough = new Alert(AlertType.WARNING);
                  notEnough.setTitle("WARNING");
                  notEnough.setContentText("Low on funds/Not enough");
              }
                  
            }
        
        });
        
        back.setOnAction((ActionEvent e) -> {
            customerWindow(primaryStage, BCO);
        });
        
        purchasePane.setAlignment(Pos.CENTER);
        purchasePane.add(back, 1, 4);
        purchasePane.add(purchase,0,4);
        purchasePane.add(purchaseText, 0, 0);
        purchasePane.add(purchaseField, 0,1);
        purchasePane.add(levelLabel, 1, 1);
        purchasePane.add(balLabel, 0, 2);
        
        Scene scene = new Scene(purchasePane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();  
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
    
    
}
