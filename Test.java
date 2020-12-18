public class Test{
    private int [] numbers = new int[3];
    
    public Test(int [] numbers1){
        numbers = numbers1;
    }
    public double addNumbers(){
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] numbers3 = new int[1];
        numbers3[0] = 1;
        Test box = new Test(numbers3);
        System.out.println(box.addNumbers());

    }
}