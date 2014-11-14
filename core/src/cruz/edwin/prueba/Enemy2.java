package cruz.edwin.prueba;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemy2 extends Image{
	
	int y = 300;
	
	int j = 0;

	  Enemy2(Texture texture){
		  
	      super(texture);

	      addListener(new EnemyInput2(this));

	  }

	  @Override
	  public void act(float delta) {
		  
		  super.act(delta);
	    
		  this.setY(y-=4);
		  
		  this.setX(500);
	    
	  }
	
}
