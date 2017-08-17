

package DrawPanel;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanelFlor extends JPanel{
	
	//desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g){
		
		//chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); //largura total
		int heigth = getHeight(); // altura total
		int x=0;
		int i=0;
		
		for (i=0 ; i<210; i+=15){
			g.drawLine(0, 0+i, i+15, heigth);
		}
		
		
		for (i=0 ; i<210; i+=15){
			g.drawLine(0, heigth-i, i+15, 0);
		}
		
		for (i=0 ; i<210; i+=15){
			g.drawLine(width, 0+i, width-i-15, heigth);
		}
		
		for (i=0 ; i<210; i+=15){
				g.drawLine(width, heigth-i, width-15-i, 0);
			}
		
	}

} //fim da classe DrawPanel
