
public class PermutationDemo {
	// swap two characters of string 
    static void swap(StringBuilder sb,int l,int r)
    {
        char temp = sb.charAt(l);
        sb.setCharAt(l,sb.charAt(r));
        sb.setCharAt(r,temp);
    }
    
    // function to reverse the string between index l and r
    static void reverse(StringBuilder sb,int l,int r)
    {
        while(l < r)
        {
            swap(sb,l,r);
            l++;
            r--;
        }
    }
    
    // function to search a character lying between index l and r 
    // which is closest greater (just greater) than val
    // and return it's index 
    static int binarySearch(StringBuilder sb,int l,int r,char val) 
    { 
      int index = -1; 
      
      while (l <= r) 
      { 
        int mid = (l+r)/2;
        if (sb.charAt(mid) <= val) 
        {
            r = mid - 1;
        }
        else 
        { 
          l = mid + 1; 
          if (index == -1 || sb.charAt(index) >= sb.charAt(mid)) 
            index = mid; 
        } 
      } 
      return index; 
    } 
    
    // this function generates next permutation (if there exists any such permutation) from the given string
    // and returns True
    // Else returns false
    static boolean nextPermutation(StringBuilder sb) 
    { 
      int len = sb.length();
      int i = len-2; 
      
      while (i >= 0 && sb.charAt(i) >= sb.charAt(i+1)) 
      i--;
      
      if (i < 0) 
        return false; 
      else 
      { 
        int index = binarySearch(sb,i+1,len-1,sb.charAt(i)); 
        swap(sb,i,index); 
        reverse(sb,i+1,len-1); 
        return true; 
      } 
    }    
    
    // main function to find next permutation
    public static void main(String args[])
    {
        String str = "nmhdgfecba";
        // strings in java are immutable,so we convert strings into StringBuilder
        // StringBuilder are mutable strings        
        StringBuilder sb = new StringBuilder(str);
      boolean is = nextPermutation(sb); 
      
      if(is == false) 
        System.out.println("Next Permutation Doesnt exist"); 
      else
        System.out.println(sb);
           
    }

}
