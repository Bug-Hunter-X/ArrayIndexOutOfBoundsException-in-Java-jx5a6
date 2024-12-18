public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2; // A valid index
        if (index >= 0 && index < arr.length) {
            arr[index] = 10; //Check before access to avoid exception
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}