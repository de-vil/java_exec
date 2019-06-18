package java2019_6.day2.test2;

public class Computer {

    //封装基本属性，确保不会被恶意修改 安全性考虑
    private String cpu;
    private String ram;
    private String ssd;
    private String gpu;

    //get方法set方法的写法
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    //默认构造函数
    public Computer(){

    }
    //构造函数
    public Computer(String cpu, String ram, String ssd, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
