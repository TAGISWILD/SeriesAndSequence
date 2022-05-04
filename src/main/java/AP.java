public class AP {
    public static void main(String[] args) {
        int numOffset[] = {2, 5, 8};
        int d, a;
         int c = numOffset[1]-numOffset[0];
         int b = numOffset[2]-numOffset[1];
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
         else
         {
             System.out.println("Given Sequence is not in AP");
         }
    }
}
