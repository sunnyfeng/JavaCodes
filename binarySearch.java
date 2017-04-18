public class binarySearch{

  //efficiency

  public static void main(String[] args){
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    System.out.println("Enter target number: ");
    int target = IO.readInt();
    if (binarySearch(arr,target)){
      System.out.println("The target is in the array.");
    } else {
      System.out.println("The target is not in the array.");
    }
  }

  public static boolean binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    int mid = 0;
    int counter=1;
    //array must be sorted
    while(end >= start){ //when end is less than start, they cross and element is not there

      System.out.println("Checking time #: " + counter);

      mid = (end+start)/2; //integer division; keeps changing
      if (arr[mid] == target){
        return true;
      } else if (arr[mid] > target){
        end = mid-1; // right before where I am
      } else{
        start = mid+1; //start changes
      }
      counter++;
    }

    return false;

  }

}
