package designPattern.adapter;

public class PowerAdapter {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }
    public int outPutDC5V(){
        int adapterInput = ac220.outPutAC220();
        int adapterOutput = adapterInput /44;
        System.out.println("使用PowerAdapter 输入AC:"+adapterInput+"V"+"输出 DC:"+adapterOutput+"V");
        return  adapterOutput;
    }
}
