import java.util.ArrayList;

public class Table{
    
    public static void multTable(int start, int end){
        for(int i = start; i <= end; i++) {
            for(int j = start; j <= end; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }   
    }

    public static void multTableNoDupes(int start, int end){
        ArrayList<Integer> results = new ArrayList<>();
        for(int i = start; i <= end; i++) {
            for(int j = start; j <= end; j++) {
                int product = i * j;
                if(!results.contains(product)){
                    results.add(product);
                }
            }
        }   
        results.sort(Integer::compareTo);
        
        for(int i = 0; i < results.size(); i++){   
            System.out.print(results.get(i) + " ");
        }
    }


    public static void multTable(){
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
      }
    }

    public static void prettyMultTable(int start, int maxValue){
        int maxLength = Integer.toString(maxValue * maxValue).length();
        for(int i = start; i <= maxValue; i++) {
            for(int j = start; j <= maxValue; j++) {
                int product = i * j;
                int productLength = Integer.toString(product).length();
                if(productLength < maxLength){
                    int spacesToAdd = maxLength - productLength;
                    for(int k = 0; k < spacesToAdd; k++){
                        System.out.print(" ");
                    }
                }
                System.out.print(product + " ");
            }
            System.out.println();
        } 
    }
    
}