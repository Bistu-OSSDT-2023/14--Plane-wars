package com.tarena.fly;
import java.util.Random;
public class Stone extends FlyingObject implements Award{
     
        private int xSpeed = 0;   //x坐标移动速度  
        private int ySpeed = 2;   //y坐标移动速度  
        private int awardType;    //奖励类型
        
        /** 初始化数据 */  
        public Stone(){  
            this.image = ShootGame.stone;  
            width = image.getWidth();  
            height = image.getHeight();  
            y = -height;  
            Random rand = new Random();  
            x = rand.nextInt(ShootGame.WIDTH - width);  
            awardType = rand.nextInt(2);   //初始化时给奖励  
        }  
          
        /** 获得奖励类型 */  
        public int getType(){  
            return awardType;  
        }  
      
        /** 越界处理 */  
        @Override  
        public boolean outOfBounds() {  
            return y>ShootGame.HEIGHT;  
        }  
      
        /** 移动，可斜着飞 */  
        @Override  
        public void step() {        
            x += xSpeed;  
            y += ySpeed;  
            if(x > ShootGame.WIDTH-width){    
                xSpeed = -1;  
            }  
            if(x < 0){  
                xSpeed = 1;  
            }  
        }  
    }

