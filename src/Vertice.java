import java.util.ArrayList;
import java.util.List;

public class Vertice {
private Tabuleiro tabuleiroEstado;

private List<Vertice> verticeAdjacentes = new ArrayList<Vertice>();

public Tabuleiro getTabuleiroEstado(){
  return tabuleiroEstado;
}
public void adiconarVertice(Vertice vertice){
 verticeAdjacentes.add(vertice);
}
}
