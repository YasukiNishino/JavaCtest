import java.util.*;


public class PaizaCtest {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        //文字列の行数
        int N = sc.nextInt();//5
        //比較する文字
        String G = sc.next();//ai
        //String型の要素を代入する配列を宣言
        String[] S_i = new String[N];//5個の1次元配列を定義
        
        //N回分ループを発生させ、文字列を標準入力する処理
        for(int i = 0; i < N; i++){
            S_i[i] = sc.next();
        }
        //特定の文字列が該当した時にカウントされていく変数
        int count = 0;
        //出力
        for(int i = 0; i < S_i.length; i++){
            if(S_i[i].contains(G)){
                count++;
                System.out.println(S_i[i]);
            } else if(!S_i[i].contains(G)){
                continue;
            }
        }
        //カウンターが0の場合の処理
        if(count == 0){
            System.out.println("None");
        }
    }
}