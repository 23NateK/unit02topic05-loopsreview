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
public static int[] longestPlateau(int[] nums){
  int[] longest={0,0};
  for(int n=3;n<nums.length;n++){
    if(nums[n-1]==nums[n-2]&&nums[n]!=nums[n-3]&&longest[0]<3&&nums[n-2]>nums[n-3]&&nums[n-1]>=nums[n]){
      longest[0]=2;
      longest[1]=n-2;
    }else if(nums[n-1]==nums[n-2]&&nums[n-1]==nums[n-3]){
      longest[0]++;
    }
  }
  return longest;
}

public static void birthdayProblem(){
int[] bdays = new int[0];
  boolean match=false;
  int people=0;
  while(!match){
    double newbday=(Math.random()*365);
    System.out.println(newbday);
    newbday=Math.round(newbday);
    int[] copyList = new int[bdays.length+1];
    for(int x = 0; x< bdays.length; x++){
      copyList[x] = bdays[x];
    }
    copyList[copyList.length-1] = (int) newbday;
    bdays = copyList;
    people++;
    Arrays.sort(bdays);
    for(int n=1;n<bdays.length;n++){
      if(bdays[n-1]==bdays[n]){
        match=true;
      }
    }
  }
  System.out.println("It took "+people+" people to have a pair of matching bdays.");
}
  public static void main(String[] args) {
    //int[] nums={62, 79, 99, 50};
    //System.out.println(formGradeString(nums));

    //String[] name={"emily", "albert", "sophie", "phillip", "ophelia"};
    //Double[] gpas={0.223, 3.538, 3.237, 1.437, 1.162};
    //System.out.println(valedictorianName(name, gpas));

    //int[] num={0, 1, 1, 1, 1, 0, 3, 3, 2, 2};
    //System.out.println(Arrays.toString(longestPlateau(num)));
    
    birthdayProblem();
  }
}