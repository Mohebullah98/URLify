class Main {
  public static String URLify(String s, int trueLength){
    int whitespaces=0;
    char sentence[] = s.toCharArray(); 
    for(int i=0;i<trueLength;i++){
      if (sentence[i]==' ') whitespaces++;// keep track of whitespaces
    }
    for(int i=trueLength;i>0;i--){
      if (sentence[i]==' '){//move characters to their relative position
        sentence[i+(whitespaces*2)]='0';
        sentence[i+(whitespaces*2)-1]='2';
        sentence[i+(whitespaces*2)-2]='%';
        whitespaces--;// decrease whitespace count when you pass one
      }
      else{ sentence[i+(whitespaces*2)]=sentence[i];}//move characters over depending upon how many spaces you've passed
    }
    return new String (sentence);
  }
  public static void main(String[] args) {
    String s = "Hey this is a sentence        ";//assume string has adequate space in the end
    System.out.print(URLify(s,s.length()-9));//true length of string is given
  }
}