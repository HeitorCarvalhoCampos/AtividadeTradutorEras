import java.util.ArrayList;
import java.util.Collections;

public class main {

    List<Motorista> motoristas = getMotoristasDaEmpresa();

    List<Motorista> habilitados = new ArrayList<>();

    // Filtrando motoristas com CNH ativa
    for(
    Motorista m:motoristas)
    {
        if (m.isCnhAtiva()) {
            habilitados.add(m);
        }
    }

    // Ordenando por tempo de casa (anos) usando Comparador anônimo
    Collections.sort(habilitados,new Comparator<Motorista>(){

    @Override
    public int compare(Motorista m1, Motorista m2) {
        return Integer.compare(m1.getAnosEmpresa(), m2.getAnosEmpresa());
    }
});

}
