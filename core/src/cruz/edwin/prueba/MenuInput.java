package cruz.edwin.prueba;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MenuInput extends InputListener{
	
	Menu menu;

	MenuInput(Menu menu){
		
		super();
		
		this.menu = menu;
		
	}
	
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    	
        System.out.println("touch down");
        
//        clicks ++;
//        
//        System.out.println("Clicks: " + clicks);
//        
//        menu.remove();

        return super.touchDown(event, x, y, pointer, button);
        
        
    }
	
}
