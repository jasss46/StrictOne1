package Date1362026;

public class number2 {

    public static void main(String [] args){

        int a=30,b=78;
      a= a-b;
      b= a+b;
      a= b-a;

        System.out.println(a+""+b);

        String name= "Jaswinder Singh";
        String rev= "";

        for(int i= name.length()-1; i>=0;i--){
            rev= rev+name.charAt(i);
        }
        System.out.println(rev);

    }


}
