import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.lang.Object;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numWords = Integer.parseInt(br.readLine());
        Word[] arrOfWords = new Word[numWords + 1];
        //HashMap<Integer,Word> map = new HashMap<>();
        for (int i = 1; i < numWords+1 ; i++) {
            //map.put(i,new Word(i,br.readLine(), numWords));
            arrOfWords[i] = new Word(i,br.readLine(), numWords);
        }
        for (int i = 0; i < numWords - 2 ; i++) {
            String[] arrInt = br.readLine().split(" ");
            //Word left = map.get(Integer.valueOf(arrInt[0]));
            Word left = arrOfWords[Integer.valueOf(arrInt[0])];
            int rightNum = Integer.valueOf(arrInt[1]);
            left.addWord(rightNum);
            //Word right = map.get(Integer.valueOf(rightNum));
            //Word right = arrOfWords[Integer.valueOf(rightNum)];
            //right.notDeleted = false;
        }
        String[] arrInt = br.readLine().split(" ");
        //Word left = map.get(Integer.valueOf(arrInt[0]));
        Word finalWord = arrOfWords[Integer.valueOf(arrInt[0])];
        int rightNum = Integer.valueOf(arrInt[1]);
        finalWord.addWord(rightNum);

//        Word finalWord = new Word(0,"",numWords);
//        for (int i = 1; i < numWords+1 ; i++) {
//            //Word currWord = map.get(i);
//            Word currWord = arrOfWords[i];
//            if (currWord.notDeleted){
//                finalWord = currWord;
//            }
//        }
        finalWord.buildString(arrOfWords, bw);
        //StringBuilder finalString = (finalWord.buildString(arrOfWords, bw));
        //bw.write(finalString.toString());
        //bw.flush();

    }
}
