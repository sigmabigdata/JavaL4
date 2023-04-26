import java.util.ArrayList;
import java.util.Random;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

public class task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)%2==0){
                arrlst.remove(i);
            }
        }
        System.out.println(arrlst.toString());

    }
}