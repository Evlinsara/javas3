package chap1;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=1+2;
        System.out.println("1+2="+num);
        int org=num;
        
        num=num-1;
        System.out.println(org+"-1="+num);
        org=num;
        
        num=num*2;
        System.out.println(org+"*2="+num);
        org=num;
        
        num=num/2;
        System.out.println(org+"/2="+num);
        org=num;
        
        num=num+8;
        System.out.println(org+"+8="+num);
        org=num;
        
        num=num%7;
        System.out.println(org+"%7="+num);
       
	}

}
