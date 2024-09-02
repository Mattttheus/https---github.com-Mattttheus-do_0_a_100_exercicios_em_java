import Construtores.Integer;
import Construtores.List;

public interface Aeronaves<Integer> {

    void addVoo(Integer nrVoo);

    Integer primeiroVoo();

    void listaVoos();

    List<Integer> getListaAeronaves();

    void setListaAeronaves(List<Integer> listaAeronaves);

}