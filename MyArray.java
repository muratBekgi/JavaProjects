public class MyArray<T extends Comparable<T>> {
  public T[] values;

  public MyArray(T[] add){
    this.values =add;
  }

  public T highest(){
    if(values.length>0){
      int highestNum=0;
      for (int i = 0; i < values.length; i++)
        if(values[i].compareTo(values[highestNum])>0)
          highestNum=i;
      return values[highestNum];
    }
    return null;
  }

  public T lowest(){
    if(values.length>0){
      int lowestNum=0;
      for (int i = 0; i < values.length; i++)
        if(values[i].compareTo(values[lowestNum])<0)
          lowestNum=i;
      return values[lowestNum];
    }
    return null;
  }

  public static void main(String [] args){

    Integer[] values ={-55,0,23,99,70,-5};
    MyArray<Integer> integerMyArray=new MyArray<>(values);

    System.out.print("Values are: ");
    for (Integer value : values) {
      System.out.print(value + ", ");

    }
    System.out.println("\nHighest Value: "+integerMyArray.highest());
    System.out.println("Lowest Value: "+integerMyArray.lowest());
  }
}
