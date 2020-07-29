package bean;

import model.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huilton Willian
 */
@ManagedBean
@ViewScoped
public class CarroBean {

    private List<Carro> listaCarro = new ArrayList<>();

    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    @PostConstruct
    public void CarroBean() {
        populaListaCarros();
    }

    public void populaListaCarros() {
        listaCarro.add(new Carro(0, "Azul"));
        listaCarro.add(new Carro(0, "Amarelo"));
        listaCarro.add(new Carro(1, "Prata"));
        listaCarro.add(new Carro(2, "Verde"));
    }

    public void slcConfirmaClick(Carro carro) {
        for (Carro carroFor : listaCarro) {
            if (carroFor.getId() == carro.getId()) {
                carroFor.setCheckConfirma(true);
                carroFor.setCheckDevolver(false);
            }
        }
        PrimeFaces.current().ajax().update("frm:dtTabela");
    }

    public void slcDevolverClick(Carro carro) {
        for (Carro carroFor : listaCarro) {
            if (carroFor.getId() == carro.getId()) {
                carroFor.setCheckConfirma(false);
                carroFor.setCheckDevolver(true);
            }
        }
        PrimeFaces.current().ajax().update("frm:dtTabela");
    }
}
