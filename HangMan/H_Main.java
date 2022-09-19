package HangMan;

import java.util.Scanner;

public class H_Main{
    public static void main(String[] args){
        String s = "i love it";
        char[] mosaic = new char[s.length()];

        int i;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                mosaic[i] = ' ';
                continue;
            }
            mosaic[i] = '*';
        }

        System.out.println(mosaic);
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int starCnt = 0;
        do{
            starCnt = 0;
            cnt++;
            System.out.println("Input >>");
            char input = sc.nextLine().charAt(0);

            for(i=0; i<s.length(); i++){
                if(s.charAt(i) == input){
                    mosaic[i] = input;
                }
            }
            System.out.println(mosaic);

            for(i=0; i<s.length(); i++){
                if(mosaic[i] == '*'){
                    starCnt++;
                }
            }

        }while(starCnt != 0);

        System.out.println("축하합니다! " + cnt + "번 만에 맞히셨습니다!");

    }
}