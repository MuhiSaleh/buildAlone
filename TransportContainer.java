package test3;

import java.util.ArrayList;
import java.util.List;

public class TransportContainer<T extends Möbel> {
    List<T> list = new ArrayList<>();

    public void add(T object) {
        list.add(object);
    }

    public T get() {
        return list.get(0);
    }

    public T getIndex(int n) {
        return list.get(n);
    }

    public List<T> getList() {
        return this.list;
    }

    public int getSIZE() {
        return this.list.size();
    }

    public void printList() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append("the " + i + "te object is: \n");
            sb.append(list.get(i).GetName());
            sb.append(" and have the Große ");
            sb.append(list.get(i).Getgroße());
            if (list.get(i) instanceof Auto) {
                Auto auto = (Auto) list.get(i);
                sb.append(" it has the color :" + auto.getFarbe() + " and the Type :" + auto.getType());
            } else {

                Fahrrad fahrrad = (Fahrrad) list.get(i);
                sb.append(" The Fahrrad has the Marke: " + fahrrad.getMarke());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
