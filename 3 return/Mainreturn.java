public class Mainreturn{

    public static void main(String[] args){
        System.out.println(sumFinder(2,3));  //one way to see the result

        int answer=sumFinder(1,2);           //another way to see the result
        System.out.println(answer);
    }

    public static int sumFinder(int a,int b){
        int sum=a+b;
        return sum;                         //***return used in here***
    }
}
