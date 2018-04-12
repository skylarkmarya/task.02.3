import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Pen pen = new Pen();
        Marker marker = new Marker();
        Pencil pencil = new Pencil();

       // создаем нбор Новичка
        ArrayList <DrawStationary> NewbieStationary = new ArrayList<>();
        NewbieStationary.add(pen);
        NewbieStationary.add(marker);
        NewbieStationary.add(pencil);

        NewbieStationary.get(0).draw();
        NewbieStationary.get(1).draw();
        NewbieStationary.get(2).draw();

    }
}
