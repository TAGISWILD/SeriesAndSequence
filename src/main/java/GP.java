public class GP {

        public static int square(int num, int power) {
            return (int) Math.pow(num,power);


    }
    public static void main(String[] args) {
        int numOffset[] = {2, (2*2), (2*2*2)};
        int r, a;
        int c = numOffset[1]/numOffset[0];
        int b = numOffset[2]/numOffset[1];
        if (c==b)
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
        else
        {
            System.out.println("Given Sequence is not in GP");
        }
    }
}
