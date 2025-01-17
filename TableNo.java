public class TableNo{//class
    public static void main(String[] args){//main method
        System.out.println("No.\tPow^2\tPow^3");//Heading displayed as string 
        //System.out.println(v+"\t"+(v*v)+"\t"+Math.pow(v,3));
        for(int v=0; v<13;v++){
            //for loop, v is a variable of type integer and is initializes as 0
            //while v is less than 12, variable v will increment by one more value than the one before, 
            //for loop will continue to repeat until a given criteria is met which then it will break/exit from its cycle
            System.out.println(v+"\t"+Math.pow(v,2)+"\t"+Math.pow(v,3));//displays the results
        }
    }
}
