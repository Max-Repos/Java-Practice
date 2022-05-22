public class PrintStringwithForeach {
    public static void main(String[] args){
        String[] names = {"java","c","c++"};
        System.out.println("Printing the content of the array names:\n");

        for(String i: names){
            System.out.println(i);
        }
    }
}
