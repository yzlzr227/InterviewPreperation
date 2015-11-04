package com.lzr.utils;

public class Task{
	public int arriveTime;
	public int executeTime;
	public int lastTime;
	
	public Task(int arrT, int exeT){
		this.arriveTime = arrT;
		this.executeTime = exeT;
		this.lastTime = this.arriveTime;
	}
	
	public int work(int timeStamp, int length, double[] waitTime){
		if (timeStamp < this.arriveTime || this.executeTime <= 0)	return -length;
		waitTime[0] += timeStamp - this.lastTime;
		this.executeTime -= length;
		if (this.executeTime > 0){
			this.lastTime = timeStamp + length;
			return 0;
		} 
		return this.executeTime;
	}
}
