package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking3 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1, 0);
        System.out.println(sb);
    }
    static void dfs(int start, int depth){
        if(depth == M){
            for(int value: arr){
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i = start; i <= N; i++){
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
