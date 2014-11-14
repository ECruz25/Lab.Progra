package cruz.edwin.prueba;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemyInput extends InputListener{

    Enemy enemy;
    
    int clicks;
    
    boolean explode = false;

    EnemyInput(Enemy enemy){

        super();
        this.enemy = enemy;
        
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    	
        enemy.remove();
        
        return super.touchDown(event, x, y, pointer, button);
        
    }
    

    /*

    Check this!
    -------------------------------


    @Override
    public void touchUp(InputEvent event, float x, float y, int pointer, int button) {

        System.out.println("touch up");

        super.touchUp(event, x, y, pointer, button);
    }
    */
}
