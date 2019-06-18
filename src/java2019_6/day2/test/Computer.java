package java2019_6.day2.test;

public class Computer {

    private String cpu;
    String ram;
    String ssd;
    String gpu;

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
