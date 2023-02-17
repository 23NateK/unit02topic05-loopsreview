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
public static String valedictorianName(String[] names,Double[] gpa){
  String winner="";
double max=gpa[0];
  for(int num=1;num<gpa.length;num++){
    if (gpa[num]>max){
      max=gpa[num];
      winner=names[num];
    }
  }
  return winner;
}
  public static void main(String[] args) {
    //int[] checker={62, 79, 99, 50};
    //System.out.println(formGradeString(checker));
    String[] name={"emily", "albert", "sophie", "phillip", "ophelia"};
    Double[] gpas={0.223, 3.538, 3.237, 1.437, 1.162};
    System.out.println(valedictorianName(name, gpas));
    
  }
}