//Criando JFrame para exibir um DrawPanel

package DrawPanel;
import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		// Cria um painel que contém nosso desenho
		DrawPanelPiramide panel = new DrawPanelPiramide();
		
		// cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		//configura o JFrame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // adiciona o painel ao Frame
		application.setSize(250,  250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visível

	}

}
