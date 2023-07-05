package com.tarena.fly;
/** 
 * 奖励 
 */  
public interface Award {  
    int DOUBLE_FIRE = 0;  //双倍火力  
    int LIFE = 1;   //1条命  
    int CLEAR =2;
    /** 获得奖励类型(上面的0或1或2) */  
    int getType();  
}
