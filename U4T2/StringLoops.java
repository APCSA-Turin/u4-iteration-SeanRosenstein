public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 
       
       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String String) {
      int idx = 0;
      int count = 0;
      while(!(idx==String.length())){
        if(String.toLowerCase().substring(idx,idx+1).indexOf(character.toLowerCase())!=-1){
          count++;
        }
        idx++;
      }
      return count;
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String String) {
      int idx = String.length()-1;
      String rString = "";
      while(!(idx==-1)){
        rString += String.substring(idx,idx+1);
        idx--;
    }
    return rString;
  }
}