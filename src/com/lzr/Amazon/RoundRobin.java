package com.lzr.Amazon;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.lzr.utils.Task;

public class RoundRobin {
	
	public double roundRobin(int[] arrivalTimes, int[] executeTimes, int q){
		if (arrivalTimes == null || arrivalTimes.length == 0 || 
				executeTimes == null || executeTimes.length == 0 || arrivalTimes.length != executeTimes.length)	return 0;
		Comparator<Task> comparator = new Comparator<Task>() {
			@Override
			public int compare(Task o1, Task o2) {
				return o1.arriveTime - o2.arriveTime;
			}
		};
		PriorityQueue<Task> allTasks = new PriorityQueue<>(comparator);
		for (int i = 0; i < arrivalTimes.length; i++){
			allTasks.add(new Task(arrivalTimes[i], executeTimes[i]));
		}
		
		Queue<Task> workingQueue = new LinkedList<>();
		
		int timeStamp = 0, length = allTasks.size();
		double[] waitTime = new double[1];
		while (!allTasks.isEmpty() || !workingQueue.isEmpty()){
			if (workingQueue.isEmpty()){
				timeStamp = allTasks.peek().arriveTime;
				addTaskToWorkingQueue(workingQueue, allTasks, timeStamp);
			}else{
				Task tmp = workingQueue.poll();
				int remainingTime = tmp.work(timeStamp, q, waitTime);
				timeStamp += q + remainingTime;
				addTaskToWorkingQueue(workingQueue, allTasks, timeStamp);
				if (tmp.executeTime > 0) workingQueue.offer(tmp);
			}
		}
		double answer = waitTime[0] / length;
		return answer;
	}

	private void addTaskToWorkingQueue(Queue<Task> workingQueue, PriorityQueue<Task> allTasks, int timeStamp){
		while (!allTasks.isEmpty() && timeStamp >= allTasks.peek().arriveTime){
			workingQueue.offer(allTasks.poll());
		}
	}
}

