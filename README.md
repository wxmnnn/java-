# java-
java课程项目仓库
# 阅读程序
TEST:
package kkk;
public class TEST {
   public static void main(String args[]) {
       CPU cpu = new CPU();
       HardDisk HD=new HardDisk();
       cpu.setSpeed(4000);
       HD.setAmount(200);
       PC pc =new PC();
       pc.setCPU(cpu);
       pc.setHardDisk(HD);
       pc.show();
    }
}

CPU:
package kkk;
public class CPU {
   int speed; 
   int getSpeed() {
      return speed;
   }
   public void setSpeed(int speed) {
      this.speed = speed;
   }
}

HardDisk:
package kkk;
public class HardDisk {
   int amount; 
   int getAmount() {
      return amount;
   }
   public void setAmount(int amount) {
      this.amount = amount;
   }
}

PC:
package kkk;
public class PC {
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }
     void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }
    void show(){
       System.out.println("CPU速度:"+cpu.getSpeed());
       System.out.println("硬盘容量:"+HD.getAmount());
    }
}

## 实验目的
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk 和Test,其中Test是主类。
## 实验过程
其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed; HardDisk类要求getAmount(）返回amount
的值，要求setAmount(int m)方法将参数m的值赋值给amount; PC 类要求setCPU(CPU c) 将参数c的值赋值给cpu,要求setHardDisk (HardDisk h)方法
将参数h的值赋值给HD,要求show(）方法能显示cpu的速度和硬盘容量。
## 核心方法
Test（主类）的要求
① main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200，
② main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200，
③ main方法中创建一个PC对象pc，
④ pc调用setCUP(CPU c)方法，调用时实参是cpu，
⑤ pc调用setHardDisk (HardDisk h)方法，调用时实参是disk，
⑥ pc调用show()方法。
## 实验结果
https://github.com/wxmnnn/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008200632.jpg
## 实验感想
第一次进行java实验发现了java较其他语言更加简洁，要应用主类来实现实验，但对java知识还很浅，需要补充知识来顺利进行实验。
