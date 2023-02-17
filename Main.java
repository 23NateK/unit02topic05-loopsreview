import java.util.Arrays;
public class Main {
  public static String formGradeString(int[] arr){
    String grades="";
    for(int n:arr){
      if(n>89){
        grades+="A";
      }else if(n<90&&n>79){
        grades+="B";
      }else if(n<80&&n>69){
        grades+="C";
      }else if(n<70&&n>59){
        grades+="D";
      }else{
        grades+="F";
      }
    }
    return grades;
  }

  public static void main(String[] args) {
    int[] checker={62, 79, 99, 50};
    System.out.println(formGradeString(checker));
    
  }
}