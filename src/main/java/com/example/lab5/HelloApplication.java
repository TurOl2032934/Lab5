package com.example.lab5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Scene 1
        stage.setTitle("Laboratoire 5");
        stage.setWidth(1000);
        stage.setHeight(800);

        Label texteUtilisateur = new Label("Entrez votre nom d'utilisateur");
        texteUtilisateur.setTranslateX(400);
        texteUtilisateur.setTranslateY(100);

        TextField fieldUtilisateur = new TextField("");
        fieldUtilisateur.setPromptText("Nom d'utilisateur");
        fieldUtilisateur.setTranslateX(400);
        fieldUtilisateur.setTranslateY(150);

        Label texteMotDePasse = new Label("Entrez votre mot de passe");
        texteMotDePasse.setTranslateX(400);
        texteMotDePasse.setTranslateY(300);

        PasswordField fieldMotDePasse = new PasswordField();
        fieldMotDePasse.setPromptText("Mot de passe");
        fieldMotDePasse.setTranslateX(400);
        fieldMotDePasse.setTranslateY(350);

        Button seConnecter = new Button("Se connecter");
        seConnecter.setTranslateX(400);
        seConnecter.setTranslateY(500);

        Button sInscrire = new Button("S'inscrire");
        sInscrire.setTranslateX(500);
        sInscrire.setTranslateY(500);

        //Scene 2
        Label prenomTexte = new Label("Prénom");
        prenomTexte.setTranslateX(400);
        prenomTexte.setTranslateY(25);

        TextField fieldPrenom = new TextField("");
        fieldPrenom.setPromptText("Prénom");
        fieldPrenom.setTranslateX(400);
        fieldPrenom.setTranslateY(50);

        Label nomDeFamilleTexte = new Label("Nom de Famille");
        nomDeFamilleTexte.setTranslateX(400);
        nomDeFamilleTexte.setTranslateY(100);

        TextField fieldNomDeFamille = new TextField("");
        fieldNomDeFamille.setPromptText("Nom de famille");
        fieldNomDeFamille.setTranslateX(400);
        fieldNomDeFamille.setTranslateY(125);

        Label nomDutilisateurTexte = new Label("Nom d'utilisateur");
        nomDutilisateurTexte.setTranslateX(400);
        nomDutilisateurTexte.setTranslateY(175);

        TextField fieldNomDutilisateur = new TextField("");
        fieldNomDutilisateur.setPromptText("Nom d'utilisateur");
        fieldNomDutilisateur.setTranslateX(400);
        fieldNomDutilisateur.setTranslateY(200);

        Label motDePasseTexte = new Label("Mot de passe");
        motDePasseTexte.setTranslateX(400);
        motDePasseTexte.setTranslateY(250);

        PasswordField fieldMotDePasse1 = new PasswordField();
        fieldMotDePasse1.setPromptText("Mot de passe");
        fieldMotDePasse1.setTranslateX(400);
        fieldMotDePasse1.setTranslateY(275);

        Label confirmationTexte = new Label("Confirmer le mot de passe");
        confirmationTexte.setTranslateX(400);
        confirmationTexte.setTranslateY(325);

        PasswordField fieldConfirmation = new PasswordField();
        fieldConfirmation.setPromptText("Mot de passe");
        fieldConfirmation.setTranslateX(400);
        fieldConfirmation.setTranslateY(350);

        Label genreTexte = new Label("Genre");
        genreTexte.setTranslateX(350);
        genreTexte.setTranslateY(400);

        RadioButton homme = new RadioButton("Homme");
        RadioButton femme = new RadioButton("Femme");
        RadioButton autre = new RadioButton("Autre");
        ToggleGroup genre = new ToggleGroup();
        homme.setToggleGroup(genre);
        femme.setToggleGroup(genre);
        autre.setToggleGroup(genre);
        homme.setTranslateX(350);
        homme.setTranslateY(425);
        femme.setTranslateX(450);
        femme.setTranslateY(425);
        autre.setTranslateX(550);
        autre.setTranslateY(425);

        Label ageTexte = new Label("Âge");
        ageTexte.setTranslateX(400);
        ageTexte.setTranslateY(450);

        Spinner age = new Spinner(18, 2300, 1200);
        age.setEditable(true);
        age.setTranslateX(400);
        age.setTranslateY(475);

        CheckBox accepter = new CheckBox("J'accepte les conditions d'utilisation");
        accepter.setTranslateX(400);
        accepter.setTranslateY(525);

        Button sIncrireFinal = new Button("S'incrire");
        sIncrireFinal.setTranslateX(350);
        sIncrireFinal.setTranslateY(575);

        Button effacer = new Button("Effacer");
        effacer.setTranslateX(425);
        effacer.setTranslateY(575);

        Button retour = new Button("Retour");
        retour.setTranslateX(500);
        retour.setTranslateY(575);

        //Scene 3
        ProgressIndicator cercle = new ProgressIndicator();
        cercle.setTranslateX(450);
        cercle.setTranslateY(200);

        Label chargement = new Label("Chargement du contenu");
        chargement.setTranslateX(400);
        chargement.setTranslateY(300);

        Label erreur = new Label("");
        erreur.setTranslateX(400);
        erreur.setTranslateY(650);
        erreur.setTextFill(Color.RED);

        //Connexion
        Group groupConnexion = new Group(texteUtilisateur, fieldUtilisateur, texteMotDePasse, fieldMotDePasse, seConnecter, sInscrire);
        Scene menuConnexion = new Scene(groupConnexion);
        stage.setScene(menuConnexion);
        stage.show();

        //Créer un compte
        Group groupInscription = new Group(prenomTexte, fieldPrenom, nomDeFamilleTexte, fieldNomDeFamille, nomDutilisateurTexte, fieldNomDutilisateur, motDePasseTexte, fieldMotDePasse1, confirmationTexte, fieldConfirmation, genreTexte, homme, femme, autre, ageTexte, age, accepter, sIncrireFinal, effacer, retour, erreur);
        Scene menuInscription = new Scene(groupInscription);

        //Chargement
        Group chargementTexte = new Group(cercle, chargement);
        Scene menuChargement = new Scene(chargementTexte);

        //Action boutons
        sInscrire.setOnAction((n) -> stage.setScene(menuInscription));
        retour.setOnAction((n) -> stage.setScene(menuConnexion));
        effacer.setOnAction((n) -> {
            fieldPrenom.clear();
            fieldNomDeFamille.clear();
            fieldNomDutilisateur.clear();
            fieldMotDePasse1.clear();
            fieldConfirmation.clear();
            genre.selectToggle(autre);
            age.getValueFactory().setValue(1200);
            accepter.setSelected(false);
        });
        seConnecter.setOnAction((n) -> {
            stage.setScene(menuChargement);
        });

        //Inscription d'un utilisateur
        sIncrireFinal.setOnAction((n) -> {
            if (fieldPrenom.getText().isEmpty()) {
                erreur.setText("Entrez votre prénom");

            } else if (fieldNomDeFamille.getText().isEmpty()) {
                erreur.setText("Entrez votre nom de famille");

            } else if (fieldNomDutilisateur.getText().isEmpty()) {
                erreur.setText("Entrez un nom d'utilisateur");

            } //else if (fieldNomDutilisateur == un autre){
                //erreur.setText("Ce nom d'utilisateur existe déjà\nVeuillez en choisir un autre");

            //}
            else if (fieldMotDePasse1.equals("")) {
                erreur.setText("Entrez un mot de passe");

            } else if (fieldMotDePasse1 != fieldConfirmation) {
                erreur.setEllipsisString("Les mots de passe ne correspondent pas");

            } else if (!homme.isSelected() && !femme.isSelected() && !autre.isSelected()) {
                erreur.setText("Entrez votre genre");

            } else if (!accepter.isSelected()) {
                erreur.setText("Impossible de continuer sans accepter les conditions d'utilisation");

            } //else {
                //bytesToHex(bytesToHex(fieldMotDePasse1, ));

            //}

        });

    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        launch();
    }
}