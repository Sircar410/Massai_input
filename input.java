public class input {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0; i<args.length; ++i){
            sum += Character.getNumericValue(args[i].charAt(0));
            System.out.println("sum is at "+ i + " th " + sum );

        }
    }

}