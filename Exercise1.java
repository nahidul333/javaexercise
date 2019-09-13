public class Exercise1{
    public static void bainaryNumber(int value){
        //if value is greatere than 0 
        if(value > 0){
        //print value%2
        System.out.println(value % 2);
        //divide value by 2= result
        int result =  (value / 2);
        //call binaryNumber with result
        bainaryNumber(result);
        }
        }
        public static void main(String[]args){
        bainaryNumber(23);
         
    } 
}       