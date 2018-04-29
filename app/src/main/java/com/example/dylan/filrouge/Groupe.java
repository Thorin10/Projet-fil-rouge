package com.example.dylan.filrouge;

public class Groupe {
    private int id_group;
    private String nom_group;
    private int ou_id;

    public int getOu_id() {
        return ou_id;
    }

    public void setOu_id(int ou_id) {
        this.ou_id= ou_id;
    }

    public Groupe(String nom_group, int ou_id) {
        this.nom_group = nom_group;
        this.ou_id = ou_id;
    }

    public Groupe(){

    }


    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getNom_group() {
        return nom_group;
    }

    public void setNom_group(String nom_group) {
        this.nom_group = nom_group;
    }
}
