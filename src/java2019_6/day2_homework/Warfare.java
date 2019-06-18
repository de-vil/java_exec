package java2019_6.day2_homework;

/**
 * 作业：士兵类，士兵类有子类：炮兵（使用炮弹攻击），步兵（使用步枪攻击），骑兵（骑马射箭）
 * 指挥官类中有发起攻击的命令方法，调用不同士兵的攻击的方法
 */

public class Warfare {
    public static void main(String[] args) {
        Commander commander = new Commander();

        Soldier artillery = new Artillery();
        Soldier cavalry = new Cavalry();
        Soldier infantry = new Infantry();

        artillery.name = "炮兵";
        cavalry.name = "骑兵";
        infantry.name = "步兵";

        commander.command(artillery);
        commander.command(cavalry);
        commander.command(infantry);

    }
}
