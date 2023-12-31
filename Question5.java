import java.util.LinkedList;
import java.util.Queue;

public class Question5 {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList();

        for(int i = 1;i<n+1;i++){
            q.add(i);
        }
        while(q.size()!=1){
            for(int i = k-1;i>0;i--){
                q.add(q.poll());
            }
            q.poll();
        }

        return q.poll();
    }
}