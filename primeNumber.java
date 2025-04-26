public class Main {
    public static void main(String[] args) {
        int number=11;
        System.out.println("your  given is"+number);
        for(int i=1;i<=number;i++){
            if(number%i == 0){
             count++;   
            
        }
        if(count==2){
            System.out.println("Number"+number+"is a prime number");
        }
        else{
            System.out.println("Number"+number+"is a not a prime number");
        }
    }
}
