package cruz.edwin.prueba;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame extends ApplicationAdapter {

	SpriteBatch batch;

    Stage stage;

    Image my_image;

    Texture cloud;
    Texture sun;
    Texture mountain;
    Texture character;
    Texture star;
    Texture enemy;
    Texture flame;
    Texture menu;
    Texture pinguin;
    Texture missil;
    
    Music music;

    int frame = 0;
    int x = 0;
    int y = 0;

	@Override
	public void create () {

		batch = new SpriteBatch();
		
		enemy = new Texture(Gdx.files.internal("enemy.png"));
        cloud = new Texture(Gdx.files.internal("cloud.png"));
        character = new Texture(Gdx.files.internal("character.png"));
        mountain = new Texture(Gdx.files.internal("mountain.png"));
        sun = new Texture(Gdx.files.internal("sun.png"));
        menu = new Texture(Gdx.files.internal("menu.png"));
        
        music = Gdx.audio.newMusic(Gdx.files.internal("fight.wav"));
        
        my_image = new Image(enemy);

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        stage.addActor(my_image);

	}

    void addEnemy(){

        Texture texture_enemy = new Texture("flame.png");
        Enemy image_enemy = new Enemy(texture_enemy);
        stage.addActor(image_enemy);
        
//        Texture texture_pinguin = new Texture("pinguin.gif");
//        Enemy image_enemy2 = new Enemy(texture_pinguin);
//        stage.addActor(image_enemy2);
        
    }
    
    void addEnemy2(){
    	
    	Texture texture_missile = new Texture("missil.png");
        Enemy2 image_enemy2 = new Enemy2(texture_missile);
        stage.addActor(image_enemy2);
    	
    }
    
    void addBomb(){
    	
    	Texture texture_bomb = new Texture("bomb.png");
        Bomb image_bomb = new Bomb(texture_bomb);
        stage.addActor(image_bomb);
       
    	
    }

	@Override
	public void render () {

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

        batch.draw(sun, 30,300);
        batch.draw(mountain , 0, 0);
        batch.draw(character,450,0);
        batch.draw(cloud, 600,650);
        batch.draw(enemy,510,510);
        
        //batch.draw(menu, 0, 0);
        
        music.play();
        
        batch.end();
        
//        my_image.setX(my_image.getX()+10);

        stage.draw();
        stage.act();

        if (frame%750==0){

            addEnemy();

        }
        
        if(frame%20000==0){
        	
        	addEnemy2();
        	
        }
        
        System.out.println(frame);
        
        if(frame%2000000==0){
        	
            addBomb();
        	
        }
        
        
        if(BombInput.explode){
        	
        	
        	
        }
        
        
        
        //la velocidad con que aparecen los enemigos
        
        frame+=10;
        
	}
	
}	
