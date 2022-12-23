import java.util.ArrayList;

public class Tugas_Mandiri1 {
    public static int GetPassenger(ArrayList<int[]> Biskota) {
        var x = Biskota;
        return x.get(0)[0] - x.get(0)[1] + x.get(1)[0] - x.get(1)[1] + x.get(2)[0] - x.get(2)[1];
    }

    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<int[]>();
        StopGo.add(new int[]{10, 0});
        StopGo.add(new int[]{3, 5});
        StopGo.add(new int[]{2, 5});
        System.out.println(GetPassenger(StopGo));
    }
}