import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
public class Word {
    int num;
    String str;
    ArrayList<Integer> seq = new ArrayList<>();
    //int[] sequence;
    int currIndex = 0;
    //boolean notDeleted = true;

    public Word(int num, String str, int numWords) {
        this.num = num;
        this.str = str;
    //    this.sequence = new int[numWords];
    }

    public void addWord(int num){
       // this.sequence[currIndex] = num;
        seq.add(num);
        currIndex += 1;
    }
    public void buildString(Word[] arrOfWords, BufferedWriter bw) throws IOException {
        //StringBuilder finalString = new StringBuilder("");
        bw.write(this.str);
        bw.flush();
        //finalString.append(this.str);
        for (int i = 0; i < currIndex ; i++) {
            Word nextWord = arrOfWords[seq.get(i)];
        //    Word nextWord = arrOfWords[sequence[i]];
            nextWord.buildString(arrOfWords,bw);
            //finalString.append(nextWord.buildString(arrOfWords, bw));
        }

        //return finalString;
    }
}
