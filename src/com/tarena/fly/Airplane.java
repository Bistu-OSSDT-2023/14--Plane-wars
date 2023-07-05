package com.tarena.fly;

import java.util.Random;


 /**敌飞机: 是飞行物，也是敌人 */
 
public class Airplane extends FlyingObject implements Enemy {
	private int yyspeed = 3;  //y坐标移动速度
	private int xxspeed = 1;  //x坐标移动速度
	/** 初始化数据 */
	public Airplane(){
		this.image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;          
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
	}
	
	/** 获取分数 */
	@Override
	public int getScore() {  
		return 5;
	}

	/** //越界处理 */
	@Override
	public 	boolean outOfBounds() {   
		return y>ShootGame.HEIGHT;
	}

	/** 移动 */
	@Override
	public void step() {  
		x += xxspeed; 
		y += yyspeed;
		if(x > ShootGame.WIDTH-width){    
            xxspeed = -1;  
        }  
        if(x < 0){  
            xxspeed = 1;  
        }  
	}

}