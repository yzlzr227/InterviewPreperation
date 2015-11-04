package com.lzr.qumulo;

import java.io.*;
import java.util.*;
public class Solution {
    
    private int bfs(Point start, Point end, Set<Point> set, int m, int n){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(start);
        int size = 1, currentSize = 0, step = 0;
        
        while (!queue.isEmpty()){
            Point cur = queue.poll();
            size--;
            if (cur.equals(end))    return step;
            set.add(cur);
            if (cur.y != 0){
                Point left = new Point(cur.x, cur.y - 1);
                if (!set.contains(left)){
                    set.add(left);
                    currentSize++;
                }else{
                    left = null;
                }
            }
            if (cur.y != n - 1){
                Point right = new Point(cur.x, cur.y + 1);
                if (!set.contains(right)){
                    set.add(right);
                    currentSize++;
                }else{
                    right = null;
                }
            }
            if (cur.x != 0){
                Point up = new Point(cur.x - 1, cur.y);
                if (!set.contains(up)){
                    set.add(up);
                    currentSize++;
                }else{
                    up = null;
                }
            }
            if (cur.x != m - 1){
                Point down = new Point(cur.x + 1, cur.y);
                if (!set.contains(down)){
                    set.add(down);
                    currentSize++;
                }else{
                    down = null;
                }
            }
            if (size == 0){
                step++;
                size = currentSize;
                currentSize = 0;
            }
        }
        return 0;
    }
    
    class Point{
        int x, y;
        
        public Point(int xx, int yy){
            this.x = xx;
            this.y = yy;
        }
        
        @Override
        public boolean equals(Object obj){
            if (obj == this)  return true; 
            if (obj == null || obj.getClass() != this.getClass())  return false; 
            Point anotherPoint = (Point) obj;
            if (this.x != anotherPoint.x || this.y != anotherPoint.y) return false;
            return true;
        }
        
        @Override
		public int hashCode() {
            long bits = 7L;
            bits = 31L * bits + (long)x;
            bits = 31L * bits + (long)y;
            return (int) (bits ^ (bits >> 32)); 
		}
    }
}