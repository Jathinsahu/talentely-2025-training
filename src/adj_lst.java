import java.util.ArrayList;
import java.util.HashMap;


class pair{
    String dest;
    int cost;
    pair(String dest,int cost){
        this.dest=dest;
        this.cost=cost;
    }

}

class adj_lst {
    ArrayList<ArrayList<pair>> adj;

    adj_lst(city[] c, route[] r) {
        adj = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < r.length; i++) {
            adj.get(city.map.get(r[i].src)).add(new pair(r[i].des,r[i].cost));
        }
    }

    public static void main(String[] args) {
        city[] cities = {
                new city("Vadodara", "BTQ"),
                new city("Ahmedabad", "AMD"),
                new city("Chennai", "MAA"),
                new city("Bangalore", "BLR"),
                new city("Hyderabad", "HYD"),
                new city("Delhi", "DEL"),
                new city("Kolkata", "CCU"),
                new city("Lucknow", "LKO"),
                new city("Cochin", "COK"),
                new city("Mumbai", "BOM")
        };

        route[] routes = {
                new route("BTQ", "LKO", 23),
                new route("DEL", "BOM", 10),
                new route("MAA", "DEL", 18),
                new route("HYD", "BLR", 15),
                new route("AMD", "DEL", 12),
                new route("BOM", "CCU", 16),
                new route("COK", "BLR", 23),
                new route("HYD", "CCU", 21),
                new route("MAA", "AMD", 16),
                new route("AMD", "BTQ", 9),
                new route("DEL", "HYD", 11),
                new route("LKO", "CCU", 6),
                new route("CCU", "BLR", 14),
                new route("DEL", "LKO", 21),
                new route("MAA", "HYD", 22),
                new route("BTQ", "HYD", 27),
                new route("DEL", "BTQ", 17),
                new route("LKO", "BOM", 10),
                new route("BLR", "COK", 25),
                new route("COK", "MAA", 19),
                new route("BOM", "MAA", 15)
        };

        adj_lst g = new adj_lst(cities, routes);
        int pos=0;
        System.out.println("Adjacency List:");
        for (ArrayList<pair>p:g.adj) {
            System.out.print(cities[pos++].ccode+" ->> ");
            for (pair k:p) {
                System.out.print("{"+k.dest+" : "+k.cost+"}\t");
            }
            System.out.println();
        }
        //System.out.println(g.adj);
    }
}
