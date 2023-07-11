import java.util.Arrays;
public class Question6{
	
	int[] d= {17,13,11,2,3,5,7};
		Arrays.sort(d);
        int[] ans = new int[d.length];
        boolean[] visited = new boolean[d.length];
        int p = 0;
        int i = 0;
        int g = 0;
        while(p < d.length){
            if(i < d.length && visited[i] == false){
                if(g % 2 == 0){
                    visited[i] = true;
                    ans[i] = d[p];
                    p++;
                }
                i++;
                g++;
            } else if(i < d.length && visited[i] == true){
                i++;
            } else {
                i = 0;
                while(visited[i] == true){
                    i++;
                }
            }
        }
        return ans;
}
}
