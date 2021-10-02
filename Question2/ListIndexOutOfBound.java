public class ListIndexOutOfBound extends Exception  {
    String info;
    ListIndexOutOfBound(String detail){
        info = detail;
    }
    public String toString(){
        return "Exception ListIndexOutOfBound was called -"+info;
    }
}
