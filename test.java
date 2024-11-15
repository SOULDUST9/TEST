public class test{
    
    private int ant; 

    public test(){
        this.ant = 10;
    }

    public int number(){
        return ant;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        test x = new test();
        System.out.println(a+b+x.number());
  }
}