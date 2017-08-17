//Utilizando DrawLine para conectar os cantos de um painel

package DrawPanel;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanelPiramide extends JPanel{
	
	//desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g){
		
		//chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); //largura total
		int heigth = getHeight(); // altura total
		int divHeigth = heigth/15;
		int divWidth = width/15;
		int x=0;
		int i=0;
		
		for (i=0 ; i<14; i++){
			g.drawLine(0, 0, i*divWidth, heigth-(i*divHeigth));
		}
		
		for (i=0 ; i<14; i++){
			g.drawLine(width, 0, width-(i*divWidth), heigth-(divHeigth*i));
		}
		
		for (i=0 ; i<14; i++){
			g.drawLine(0, heigth, width-(i*divWidth), heigth-(i*divHeigth));
		}
		
		for (i=0 ; i<14; i++){
				g.drawLine(width, heigth, i*divWidth, heigth-(i*divHeigth));
			}
		
	}

} //fim da classe DrawPanel
