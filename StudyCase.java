public class StudyCase {
    public static void main(String[] args){
         
        
        if(args.length==0){
            System.out.println("Please define argement(max argument 3)...!!!");
        }
        else{ 


            System.out.println("=================");
            int length_argument = args.length,i;
            int newarr[] = new int[length_argument + 1];
            
            String panj = "" + length_argument,hasil;
            System.out.println("Total Argument "+ panj);
            
            int result_multiply = 1;

            for (i = 0; i < length_argument; i++){
                //System.out.println(args[i]);
                int element = Integer.parseInt(args[i]); //need convert argument to integet for multiply
                newarr[i] = element;
                result_multiply *= element;
            }
            

            if(result_multiply % 2==0){ 
                hasil = "genap";
            } 
            else {
                    hasil="ganjil";
            }
            System.out.println(result_multiply +" "+ hasil);
        }    
    }
}