package cruz.edwin.prueba;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemy extends Image{

    Enemy(Texture texture){

        super(texture);

        addListener(new EnemyInput(this));

    }

    @Override
    public void act(float delta) {

        super.act(delta);
        
        this.setY(25);
        
        this.setX(this.getX()+5);
        
    }
    
}

