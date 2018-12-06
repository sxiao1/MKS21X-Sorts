public class Sorts{
  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length ; i++){
      int min = data[i];
      for(int x = i; x< data.length; x++){
        if(data[x] < min){
          min = data[x];
          data[x] = data[i];
          data[i] = min;
        }
      }
    }
    System.out.println(printData(data));
  }
public static String printData(int[] data){
  String newstr = "[";
  for(int i = 0; i < data.length; i ++){
    newstr += data[i];
  }
  newstr+= "]";
  return newstr;
}
}
