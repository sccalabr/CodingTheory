public class CodeWord {
    
    private final int[] Code;
    
    public CodeWord(String codeword) {
        int n = codeword.length();
        Code = new int[n];
        for(int i = 0; i < n; i++) {
            if (!Character.isDigit(codeword.charAt(i))) {
                System.out.println("Contains an invalid digit");
                break;
            }
            Code[i] = Integer.parseInt(String.valueOf(codeword.charAt(i)));
        }
    }
    
    public CodeWord(int n) {   //Randomly generates a codeword of length n
        Code = new int[n];
        for(int i=0; i < Code.length; i++) {
            if (Math.random() < .5) Code[i] = 1;
            else Code[i] = 0;
        }
    }
    
    public CodeWord add(CodeWord a) {  //Adds two codewords together
        CodeWord Sum = new CodeWord(Code.length);
            for(int i = 0; i < Code.length; i++) {
            Sum.Code[i] = (Code[i] + a.Code[i])%2;
            }
         return Sum;
    }
    
    public int weight() {              //Gives the weight of a codeword
        int n = 0;
        for(int i = 0; i < Code.length; i++) {
            n += Code[i];
        }
        return n;
    }
    
    public int hamming(CodeWord a) {   //gives the hamming distance between
        return add(a).weight();        //two codewords.
    }
            
    public void print() {              //Prints the random CodeWord
        for(int i = 0; i < Code.length; i++)
            System.out.print(Code[i]);
        System.out.println(" ");
    }
     
    /////////////////////////////////////////////////////
    public static void main(String[] args) {
        }
}
    
        
