public class Circle {
    private static final double PI=3.14 ;
    private  static   int radios ;

    public Circle(int radios) {
        this.radios = radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    public int getRadios() {
        return radios;
    }

    @Override
    public String toString() {
        return "Circle  {" +
                "PI=" + PI +
                ", radios=" + radios +
                '}';
    }

    public static void  area (int radios){
            double area1 = PI * (radios * radios ) ;
        System.out.println("area: " + area1);
    }
    public static  void circumference (int radios) {
        double curcumferense = PI * 2 * radios;
        System.out.println(" circumference: " + curcumferense);
    }
}
