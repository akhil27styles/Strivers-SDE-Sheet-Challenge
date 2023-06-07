public class repeatMissing {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length; 
        int xr = 0;
        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }
        System.out.println(xr);
         //take {3, 1, 2, 5, 4, 6, 7, 5}
        //{1, 2, 3, 4, 5, 6, 7,8}
       // after xor of a[i] and (i+1)
       // xr=13
        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));
        // the 13 binary is 1101 = 13
        // the rightmost bit which is 1
        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }
            //part of 0 group:
            else {
                zero = zero ^ a[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }
     // x=(3,1,5,7,5)^(1,3,5,7) =5
     //y=(2,4,6)=(2,4,6,8)=8
        // Last step: Identify the numbers:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }


    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}
