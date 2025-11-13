//doubleChar
public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    
    char letter = str.charAt(i);
    
    result += letter;
    result += letter;
 
  }
  
  return result;
}
