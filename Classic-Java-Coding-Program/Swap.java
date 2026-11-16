public class Swap {
    public static void main(String args[]){
        int m=5;
        int n=3;
        System.out.println("Before Swap-------------------------");
        System.out.println("m= "+m+ ",n= "+n);

        //swap using temp variable
            int temp;
            temp=m;
            m=n;
            n=temp;
        System.out.println("After Swap using temp-------------------------");
        System.out.println("m= "+m+ ",n= "+n);

        //swap without temporary variable,but using mathematical expression
            m=m+n;
            n=m-n;
            m=m-n;
    
        System.out.println("After Swap without using temp-------------------------");
        System.out.println("m= "+m+ ",n= "+n);

        //swap using bitwise operation
            m=m^n;
            n=m^n;
            m=m^n;
        System.out.println("After Swap with Bitwise operator-------------------------");
        System.out.println("m= "+m+ ",n= "+n);

    }
    
}
