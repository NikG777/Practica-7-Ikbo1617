import java.util.ArrayDeque;
import java.util.*;

public class Pyanitsa {

    public static int work(int f1[])
    {
        String res = "";
        ArrayDeque<Integer> secondplayer= new ArrayDeque<Integer>();
        ArrayDeque<Integer> firstplayer = new ArrayDeque<Integer>();
        int count = 0;
        Scanner sw = new Scanner(System.in);
        // Заполнение карт
        for(int i = 0; i < 5;i++){
            firstplayer.add(f1[i]);
        }
        for(int i = 5; i < 10;i++){
            secondplayer.add(f1[i]);
        }
        while ((secondplayer.isEmpty() != true)&& (firstplayer.isEmpty() != true) && (count <= 106)) {
            if ((secondplayer.getFirst() > firstplayer.getFirst()) || (secondplayer.getFirst() == 0 && firstplayer.getFirst() == 9)) {
                secondplayer.add(firstplayer.pop());
                secondplayer.add(secondplayer.pop());
                count++;
            } else if ((secondplayer.getFirst() < firstplayer.getFirst()) || (secondplayer.getFirst() == 0 && firstplayer.getFirst() == 9)) {
                firstplayer.add(firstplayer.pop());
                firstplayer.add(secondplayer.pop());
                count++;
            }
        }

            if (firstplayer.size() == 0) {
                System.out.println("Победил первый пьяница");
            }
            if (secondplayer.size() == 0) {
                System.out.println("Победил второй");
            }
            if (count > 106) {
                System.out.print("botva");
            }


        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sw = new Scanner(System.in);
        int f1 [] =  new int[10];
        for (int i = 0; i < 10; i++) {
            f1[i] = sw.nextInt();
        }
        work(f1);
    }

}