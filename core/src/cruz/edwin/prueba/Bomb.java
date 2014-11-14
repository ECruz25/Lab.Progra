package cruz.edwin.prueba;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Bomb extends Image{

	Bomb(Texture texture){
		
		super(texture);
		
		addListener(new BombInput(this));
		
	}
	
	@Override
	public void act(float delta){
		
		super.act(delta);
        
        this.setY(100);
        
        this.setX(100);
        
		
	}
	
}
