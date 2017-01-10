import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class CircleImage{
	public static void main(String[] args){
	
	
		
		Picture orginal = new Picture("pics//" + args[0]+".png");
		Picture blank = new Picture(orginal.width(), orginal.height());
		StdDraw.setCanvasSize(orginal.width(), orginal.height());
		StdDraw.setXscale(0,orginal.width());
		StdDraw.setYscale(orginal.height(),0);
		bubble test = new bubble();
		StdDraw.clear(StdDraw.BLACK);
		// orginal.show();
		test.bubble(orginal);
		boolean end = true;
		int counter = 0;
		
		test.CircleSize = 8;
		test.pensize = 0.002;
		
		while(end){
			test.SearchPic();
			test.Compare();
			test.paint();
			counter ++;
			System.out.println(counter);
			if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
				end = false;
			}	
		}
		StdDraw.save("circlePics//"+args[0]+"_circle.png");
	}


}