package com.lzr.Amazon;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestFirstJob {
	
	public static double shortestFirstJob(int[] arrivalTime, int[] executeTime){
		if (arrivalTime == null || arrivalTime.length == 0 ||
			executeTime == null || executeTime.length == 0 ||
			arrivalTime.length != executeTime.length)	return 0;
		
		Comparator<Process> comparatorByArrivalTime = new Comparator<Process>() {
			@Override
			public int compare(Process o1, Process o2) {
				// TODO Auto-generated method stub
				return o1.arrivalTime - o2.arrivalTime;
			}
		};
		PriorityQueue<Process> allTasks = new PriorityQueue<>(comparatorByArrivalTime);
		for (int i = 0; i < arrivalTime.length; i++)	allTasks.add(new Process(arrivalTime[i], executeTime[i]));
		
		Comparator<Process> comparatorByExecuteTime = new Comparator<ShortestFirstJob.Process>() {
			@Override
			public int compare(Process o1, Process o2) {
				// TODO Auto-generated method stub
				if (o1.executeTime != o2.executeTime)	return o1.executeTime - o2.executeTime;
				return o1.arrivalTime - o2.arrivalTime;
			}
		};
		PriorityQueue<Process> workingQueue = new PriorityQueue<>(comparatorByExecuteTime);
		int timeStamp = 0;
		double waitTime = 0;
		
		while (!allTasks.isEmpty() || !workingQueue.isEmpty()){
			if (workingQueue.isEmpty()){
				timeStamp =  allTasks.peek().arrivalTime;
				addTaskToWorkingQueue(workingQueue, allTasks, timeStamp);
			}else{
				Process tmp = workingQueue.poll();
				waitTime += timeStamp - tmp.arrivalTime;
				timeStamp += tmp.executeTime;
				addTaskToWorkingQueue(workingQueue, allTasks, timeStamp);
			}
		}
		
		return waitTime / arrivalTime.length;
	}
	
	private static void addTaskToWorkingQueue(PriorityQueue<Process> workingQueue, PriorityQueue<Process> allTasks, int timeStamp){
		while (!allTasks.isEmpty() && timeStamp >= allTasks.peek().arrivalTime){
			workingQueue.offer(allTasks.poll());
		}
	}
	
	static class Process{
		int arrivalTime;
		int executeTime;
		
		public Process(int arriT, int exeT){
			this.arrivalTime = arriT;
			this.executeTime = exeT;
		}
	}
}
