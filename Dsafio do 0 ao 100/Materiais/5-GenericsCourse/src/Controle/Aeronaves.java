package Controle;

import java.util.List;

public interface Aeronaves {

    void addVoo(Integer nrVoo);

    Integer primeiroVoo();

    void listaVoos();

    List<Integer> getListaAeronaves();

    void setListaAeronaves(List<Integer> listaAeronaves);

}