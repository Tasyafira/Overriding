package overriding;
public class Class3 extends Class1{
    int panjang, luas, tinggi;

    @Override//overriding
    int Volume(){
        int volume = panjang * luas * tinggi;//rumus volume balok
        System.out.println("Volume Balok\t\t: " + volume+" cm3");
        return volume;
    }

    @Override//overriding
    int LuasPermukaan(){
        int LuasPermukaan = 2*(panjang*luas + panjang*tinggi + luas*tinggi);//rumus luas permukaan balok
        System.out.println("Luas Permukaan Balok\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
}
