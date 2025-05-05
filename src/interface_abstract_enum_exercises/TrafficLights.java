package interface_abstract_enum_exercises;

enum TrafficLight{
    RED, YELLOW, GREEN
}
class Lights{
    public static void main(String[] args) {
        TrafficLight go = TrafficLight.GREEN;
        if(go == TrafficLight.GREEN){
            System.out.println("GO");
        }else if(go== TrafficLight.YELLOW){
            System.out.println("READY");
        }else{
            System.out.println("STOP");
        }
    }
}
