package cruz.edwin.prueba;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemyInput2 extends InputListener{

    Enemy2 enemy;
    
    int clicks;

    EnemyInput2(Enemy2 enemy){

        super();
        this.enemy = enemy;
        
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

        enemy.remove();

        return super.touchDown(event, x, y, pointer, button);
        
    }

}