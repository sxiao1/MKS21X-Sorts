public class Sorts{
  public static void selectionSort(int [] ary){
    for(int i = 0; i < ary.length - 1; i++){
      int min = ary[i]; //set random min
      int ind = i;
      for(int x = i; x < ary.length; x++){
        if(ary[x] < min){ //find min
          min = ary[x]; //min value
          ind = x; //where the min is
        }
      }
      ary[ind] = ary[i]; //switch min position with value of i
      ary[i] = min; //puts min in the position
    }
  }
  public static void bubbleSort(int[] data){
    for(int i = 0; i < data.length ; i++){
      int min = data[i]; //set first to min
      for(int x = i; x< data.length; x++){
        if(data[x] < min){
          min = data[x]; //set the smaller num to min
          data[x] = data[i]; // move num to front
          data[i] = min; //move the front num to the old min position
        }
      }
    }
    System.out.println(printData(data));
  }
public static String printData(int[] data){
  String newstr = "[";
  for(int i = 0; i < data.length; i ++){
    newstr += data[i];
    if(i+ 1 != data.length){
      newstr += ", ";
    }
  }
  newstr+= "]";
  return newstr;
}
public static void main(String[] args) {

    // Google random int generator

    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printData(test_a));
    // [3, 4, 7, 1, 6, 2, 8, 6]

    selectionSort(test_a);

    sorted = printData(test_a);
    System.out.println(sorted);
    // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printData(test_b));
    // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    selectionSort(test_b);

    sorted = printData(test_b);
    System.out.println(sorted);
    // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printData(test_c));
    // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    selectionSort(test_c);

    sorted = printData(test_c);
    System.out.println(sorted);
    // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

  }

}
