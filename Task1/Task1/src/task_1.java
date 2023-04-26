import java.util.ArrayList;
import java.util.Random;

/*
 * Реализовать алгоритм сортировки слиянием
 */
public class task_1{
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        sort(arrlst);
        System.out.println(arrlst.toString());

    }
    static void sort(ArrayList<Integer> arr){
        if (arr.size()>1){
            ArrayList<Integer> arr1 = new ArrayList<Integer>(arr.size()/2);
            ArrayList<Integer> arr2 = new ArrayList<Integer>(arr.size()-arr.size()/2);
            for (int i=0;i<arr.size()/2;i++){
                arr1.add(arr.get(i));
            }
            for (int i=arr.size()/2;i<arr.size();i++){
                arr2.add(arr.get(i));
            }
            sort(arr1);
            sort(arr2);
            merge(arr,arr1,arr2);

        }
    }
    static void merge(ArrayList<Integer> arr, ArrayList<Integer>  arr1,ArrayList<Integer>  arr2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<Integer> narr = new ArrayList<>();
        for(int i=0;i<arr1.size()+arr2.size();i++){
            if(i1<arr1.size() && i2<arr2.size()){
                if (arr1.get(i1)<arr2.get(i2)){
                    narr.add(arr1.get(i1));
                    i1++;
                }
                else{
                    narr.add(i, arr2.get(i2));
                    i2++;
                }
            }
            else{
                if(i1>=arr1.size() & i2<arr2.size()){
                    narr.add(arr2.get(i2));
                    i2++;
                }
                if(i2>=arr2.size() & i1<arr1.size()){
                    narr.add(arr1.get(i1));
                    i1++;
                }

            }
        }
        arr.clear();
        for(int i=0;i<narr.size();i++){
            arr.add(narr.get(i));
        }
    }
}