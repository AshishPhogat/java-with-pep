public class array {
    public static void main(String [] args){
        int [] arr = new int[10];
        arr[0] = 5;
        arr[1] = 10;

        arr[4] = 1;

        fun(arr);

        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);

    }

    static void fun(int[] arr){
        arr[2] = 20;
        arr[3] = 5;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        return;
    }
}
