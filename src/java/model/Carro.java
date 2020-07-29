package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huilton Willian
 */
public class Carro {

    private int id;
    private String cor;
    private boolean checkConfirma;
    private boolean checkDevolver;

    public Carro(int id, String cor) {
        this.id = id;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCheckConfirma() {
        return checkConfirma;
    }

    public void setCheckConfirma(boolean checkConfirma) {
        this.checkConfirma = checkConfirma;
    }

    public boolean isCheckDevolver() {
        return checkDevolver;
    }

    public void setCheckDevolver(boolean checkDevolver) {
        this.checkDevolver = checkDevolver;
    }

}
