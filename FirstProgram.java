public class FirstProgram {

    public static void main(String array[]) {
		//  System.out.println("Hello World using Java...");
        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);

        // int x = Integer.parseInt(array[0]);
        // int y = Integer.parseInt(array[1]);
        // int z = x + y;
        // System.out.println("Sum is " + z);

        int sum = 0;
        int n = array.length;
        if(n > 0) {
            for(int i = 0; i < n; i++) {
                sum += Integer.parseInt(array[i]);
            }
            System.out.println("Sum is :"+sum);
        }
        else {
            System.out.println("Please Enter Number...");
        }

    }

}