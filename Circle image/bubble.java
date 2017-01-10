import java.awt.*;
import java.util.*;
public class bubble{
		Picture OldPic;
		Color Ctemp;
		Picture NewPic;
		int x , y;
		double r;
		ArrayList<Double> radie = new ArrayList<Double>();
		ArrayList<Integer> xPos = new ArrayList<Integer>();
		ArrayList<Integer> yPos = new ArrayList<Integer>();
		boolean ok;
		int CircleSize;
		double pensize;
		
		
	public void bubble(Picture pic){
			this.OldPic = pic;
			
	}
	
	public void SearchPic(){
				StdDraw.setPenColor(StdDraw.BLACK);
				xPos.add((int)(Math.random()*OldPic.width()));
				yPos.add((int)(Math.random()*OldPic.height()));
				radie.add(Math.random()*CircleSize);
				Ctemp = this.OldPic.get(xPos.get(xPos.size()-1),yPos.get(yPos.size()-1));
		
	}
	
	public void paint(){
		System.out.println(this.ok);
		if(this.ok){
			
				if(Ctemp.getRed()>1 || Ctemp.getBlue()>1 || Ctemp.getGreen()>1){
					StdDraw.setPenRadius(pensize);
					StdDraw.filledCircle(xPos.get(xPos.size()-1),yPos.get(yPos.size()-1),radie.get(radie.size()-1));
					StdDraw.setPenColor(Ctemp);
					StdDraw.circle(xPos.get(xPos.size()-1),yPos.get(yPos.size()-1),radie.get(radie.size()-1));						
				}
				StdDraw.show();
			}
			else{
				xPos.remove(xPos.size()-1);
				yPos.remove(yPos.size()-1);
				radie.remove(radie.size()-1);
				
			}
	}
	public void Compare(){
		this.ok = true;
		if(radie.size() > 10){
			for(int i = radie.size()-2; i>0;i--){
				if((Math.abs(xPos.get(xPos.size()-1) - xPos.get(i-1))) < (radie.get(radie.size()-1)+radie.get(i-1)+(pensize*2)) && (Math.abs(yPos.get(yPos.size()-1) - yPos.get(i-1))) < (radie.get(radie.size()-1)+radie.get(i-1)+(pensize*2))){
				this.ok = false;	
			
				}
			}
		}
	}
	

}