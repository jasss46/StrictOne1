package Date1362026;

public class ab_98 {

    public static void main(String[] args) {
        NumberChecker(4);
        evenOdd(5);
        largestOFTwoNumbers(87,988);
        smallestofTwoNumbers(8739,4789);
        largestOFThreeNumbers(873,48,283);

    }

    public static void NumberChecker(int a) {

        if (a > 0) {
            System.out.println("the number is positive");
        } else if (a < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    public static void evenOdd(int b){
        if(b%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }

    public static void largestOFTwoNumbers(int a, int b){
        if(a>b){
            System.out.println("a is the greatest number"+ a);
        }
        else {
            System.out.println("b is greatest number"+ b);
        }
    }
    public static void smallestofTwoNumbers(int a, int b){
        if (a<b){
            System.out.println("a is smallest number"+ a);
        }
        else{
            System.out.println("b is the smallest number"+ b);
        }
    }

    public static void largestOFThreeNumbers(int a, int b, int c){
        if (a>b&& a>c){
            System.out.println("a is largest number"+a );
        }
        else if( b>a&& b>c){
            System.out.println("b is the largest number"+ b);

        }
        else{
            System.out.println("c is the largest number");
        }
    }


}