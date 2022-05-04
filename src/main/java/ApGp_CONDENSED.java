public class ApGp_CONDENSED {
    public static int square(int num, int power) {
        return (int) Math.pow(num,power);


    }
    public static void main(String[] args) {
        int numOffset[] = {1, 1, 1};
        int a, d, r;
        int c = numOffset[1]-numOffset[0];
        int b = numOffset[2]-numOffset[1];
        int e = numOffset[1]/numOffset[0];
        int f = numOffset[2]/numOffset[1];
        if (c==b)
        {
            a=numOffset[0];
            d=c;
            System.out.println("Given Sequence is in AP");
            System.out.println("First ten terms of this AP will be: ");
            for (int i=0; i<10; i++)
            {
                int apval = a + (i*d);
                System.out.println(" "+apval);
            }
        }
        else if (e==f)
        {
            a=numOffset[0];
            r=c;
            System.out.println("Given Sequence is in GP\n");
            System.out.println("First ten terms of this GP will be: ");
            for (int i=0; i<9; i++)
            {
                int gpval = a*square(r,i);
                System.out.println(" "+gpval);
            }
        }
        else{
            System.out.println("The given sequence is neither AP nor GP!");
        }
    }
}
