public class StaticConfiguration {

    static  String configName;
    static{
        configName="sahil sharma";
        System.out.println("name: "+configName);
    }
    public static void main(String[] args) {
        System.out.println(" name in main method: "+configName);
    }
    
}
