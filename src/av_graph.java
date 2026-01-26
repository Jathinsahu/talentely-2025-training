import java.util.HashMap;

class city {
    String cname;
    String ccode;
    static int value = 0;
    static HashMap<String, Integer> map = new HashMap<>();

    city(String cname, String ccode) {
        this.cname = cname.trim().toUpperCase();
        this.ccode = ccode.trim().toUpperCase();
        map.put(this.ccode, value++);
    }
}

class route {
    String src;
    String des;
    int cost;

    route(String src, String des, int cost) {
        this.src = src.trim().toUpperCase();
        this.des = des.trim().toUpperCase();
        this.cost = cost;
    }
}

class av_graph {
    static int[][] adj;

    av_graph(city[] c, route[] r) {
        adj = new int[c.length][c.length];
        for (int i = 0; i < r.length; i++) {
            adj[city.map.get(r[i].src)][city.map.get(r[i].des)] = r[i].cost;
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

        av_graph g = new av_graph(cities, routes);


        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                System.out.print(adj[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
