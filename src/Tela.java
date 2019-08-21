import javax.swing.JFrame;

public class Tela extends JFrame {
    
    public Tela() {
        super("Jogo da Velha - Tec. em Desenvolvimento de Jogos");
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}