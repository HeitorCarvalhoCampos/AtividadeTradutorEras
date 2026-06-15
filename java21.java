import java.util.Comparator;
import java.util.List;

public class java21 {
    public void executar() {
        List<Motorista> motoristas = getMotoristasDaEmpresa();

        List<Motorista> habilitados = motoristas.stream()
                .filter(Motorista::isCnhAtiva)
                .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
                .toList();
    }

}
