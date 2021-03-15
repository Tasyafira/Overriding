package overriding;
public class Class2 extends Class1{
    int sisi;
    
    @Override//overriding
    int Volume(){
        int volume = sisi * sisi * sisi;//rumus volume tabung
        System.out.println("Volume Kubus\t\t: " + volume+" cm3");
        return volume;
    }

    @Override//overriding
    int LuasPermukaan(){
        int LuasPermukaan = 6 * sisi * sisi;//rumus luas permukaan tabung
        System.out.println("Luas Permukaan Kubus\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
}
