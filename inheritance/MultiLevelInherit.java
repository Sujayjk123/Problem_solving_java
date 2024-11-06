package inheritance;
public class MultiLevelInherit {
    public static void main(String[] args) {
        SmartRefrigerator smartFridge = new SmartRefrigerator("Samsung", 200, 350, "Android");
        smartFridge.turnOn(); 
        smartFridge.cool(); 
        smartFridge.controlViaApp(); 
    }
}
