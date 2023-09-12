package school.mjc.stage0.loops.task3;

public class NinesSum {

    public  void calculateSum(int lengthOfLastNumber) {

     int sum  = 0;
     int pemt = 0;
     for(int  i = 0; i< lengthOfLastNumber; i++ ){
         pemt=pemt * 10 + 9;
         sum+=pemt;
     }

     if(lengthOfLastNumber < 0){
            System.out.println(0);
     }else{
         System.out.println(sum);
     }
    }
}
