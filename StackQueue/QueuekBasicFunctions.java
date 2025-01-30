import java.util.*;

class QueuekBasicFunctions{

    public static void main(String args[]){
        Queue<Integer>q = new LinkedList<>();
        
        for(int i=5;i<=10;i++){
            q.offer(i);
        }

        for(int i=0;i<=10;i++){
            System.out.println(q.peek());
            q.poll();
        }
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

        return ;

    }
};