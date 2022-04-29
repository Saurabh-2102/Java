package LInkedList;

// don't change the name of this class
// you can add inner classes if needed
class MMain {
    public static int permute(int[] arr){
        int result = permuteHelper(arr, 0);
        return result;
    }

     static int permuteHelper(int[] arr, int index){
        int max = Integer.MIN_VALUE;
        if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
            //System.out.println(Arrays.toString(arr));
            //Print the array
//            int max = Integer.MIN_VALUE;
            int[] res = new int[arr.length];
//            System.out.print("[");
            for(int i = 0; i < arr.length; i++){
//                System.out.print(arr[i] + ", ");
                res[i] = arr[i];
            }
            if(arr.length > 0)
            res[arr.length-1] = (arr[arr.length - 1]);
//            System.out.println();
            for(int i = 0; i < arr.length; i++){
//                System.out.print(res[i] + " ");
                if(i%2==0){
                    res[i] = (res[i]*-1);
                }
            }
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
               sum = sum + res[i];
            }
            max = Math.max(max,sum);
//          System.out.println(max);


//            System.out.println();
        }

        for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

            //Swap the elements at indices index and i
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            //Recurse on the sub array arr[index+1...end]
            permuteHelper(arr, index+1);

            //Swap the elements back
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
        return max;
    }
    public static void main (String[] args) {
    }
}
