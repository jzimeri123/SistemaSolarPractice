public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure BB=new BasicStructure();
        BB.planets="2";
        BB.moon="2";
        BB.stars="10";
        BB.sun="1";
        System.out.println("Solar system is ready");

        FeatureSun xros=new FeatureSun();
        xros.temp="3434k";
        xros.color="green";
        xros.radius="3455678miles";


        Planet1 zoro=new Planet1();
        zoro.color="pink";
        zoro.radius="123456";

        Planet2 dros=new Planet2();
        dros.color="yellow";
        dros.radius="12345";

    }
}
