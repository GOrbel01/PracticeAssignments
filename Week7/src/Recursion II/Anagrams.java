public class Anagrams
{
    GenericList<String> list = new GenericList();
    
    public static void main(String[] args)
    {
        String word = "ABC";
        System.out.println(factorial(word.length()));
        makeList(word);
    }
    
    public static void makeList(String theWord)
    {        
        int count = 0;
        //Example Tool
        for (int i = 0; i < theWord.length(); i++)
        {
            for (int j = 0; j < theWord.length(); j++)
            {
                for (int k = 0; k < theWord.length(); k++)
                {
                    if (k == i && k == j && j == i)
                    {
                        System.out.print(theWord);
                        break;
                    }
                    else
                    { 
                        if (k == j)
                        {
                            System.out.print(theWord.charAt(i));
                        }
                        
                        if (k == i)
                        {
                            System.out.print(theWord.charAt(j));
                        }
                        
                        if (k != i && k != j && j != i)
                        {
                           
                            System.out.print(theWord.charAt(k));
                        }                            
                    }  
                }
                count++;  
                System.out.println();
            }

        }
        System.out.println("COUNT: " + count);
    }
    
        public static int factorial(int num) {
            int result = 1;
            if(num == 0) 
            {
                return 1;
            }
            else 
            {
                for(int i = 2; i <= num; i++) {
                    result *= i;
                }
                return result;
            }
        }
    
}