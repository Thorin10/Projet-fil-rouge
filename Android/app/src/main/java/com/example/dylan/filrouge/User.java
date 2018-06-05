package com.example.dylan.filrouge;

public class User {
    private int id_user;
    private String nom_user;
    private String prenom_user;
    private String mail_user;
    private int group_id;

    public User(String nom_user, String prenom_user, String mail_user, int group_id) {
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.mail_user = mail_user;
        this.group_id = group_id;
    }

    public User(){

    }

    public User(String nom_user, String prenom_user) {
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
    }

    @Override
    public String toString() {
        return  nom_user+ " " + prenom_user ;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getmail_user() {
        return mail_user;
    }

    public void setmail_user(String mail_user) {
        this.mail_user = mail_user;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}
