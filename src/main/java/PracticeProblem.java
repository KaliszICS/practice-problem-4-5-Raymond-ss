public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String triangle(int inp) {

    String result = "";
    
    for (int i = 1; i <= inp; i++) {
        for (int j=1; j <= i; j++)
        result += "*";
        
        if (i <= inp) {
            result += "\n"; 
        }
    }
    
    return result;
}

public static String pyramid(int rows) {
    
    String result = "";
    
    for (int i = 1; i <= rows; i++) {

        for (int j = i; j < rows; j++) {
            result += " ";

        }

            for (int a = 1; a <= i; a++) {
                result += "*";
                if (a < i){
                    result += " ";
                }
            }
            if (i <= rows) {
                result += "\n";
            }
        }
        return result;        
    }
    public static String multiplicationTable(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                result += (i*j);

            if (j < num) {
                result += " ";
            }
        }
        if (i <= num) {
            result += "\n";
        }
    }
    return result;
    
    
}
}
