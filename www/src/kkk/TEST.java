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
