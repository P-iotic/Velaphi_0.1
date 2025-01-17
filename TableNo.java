public class TableNo{
    public static void main(String[] args){
        System.out.println("No.\tPow^2\tPow^3");
        //System.out.println(v+"\t"+(v*v)+"\t"+Math.pow(v,3));
        for(int v=0; v<13;v++){
            System.out.println(v+"\t"+Math.pow(v,2)+"\t"+Math.pow(v,3));
        }
    }
}