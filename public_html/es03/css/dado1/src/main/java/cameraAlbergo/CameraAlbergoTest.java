package cameraAlbergo;

public class CameraAlbergoTest {

    public static void main(String[] args) {
       CameraAlbergo m0 =new CameraAlbergo(1);
       CameraAlbergo m1 =new CameraAlbergo(1);
       CameraAlbergo m2 =new CameraAlbergo(1);
       CameraAlbergo m3 =new CameraAlbergo(2);
       CameraAlbergo m4 =new CameraAlbergo(2);
       CameraAlbergo m5 =new CameraAlbergo(2);
       CameraAlbergo m6 =new CameraAlbergo(3);
       CameraAlbergo m7 =new CameraAlbergo(3);
       CameraAlbergo m8 =new CameraAlbergo(3);
               
       System.out.println(m0.calc(2));
       System.out.println(m1.calc(6));
       System.out.println(m2.calc(12));
       System.out.println(m3.calc(2));
       System.out.println(m4.calc(6));
       System.out.println(m5.calc(12));
       System.out.println(m6.calc(2));
       System.out.println(m7.calc(6));
       System.out.println(m8.calc(12));
    }
}
    
