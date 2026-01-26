public class dfs_graph {
    static boolean [] vis;
    int count=0;
    dfs_graph(city[] c){
        vis = new boolean[c.length];
        for(int i=0;i<c.length;i++) vis[i]=false;
        for (int i = 0; i < c.length; i++) {

        }
    }

    static void dfs_print(city[]c,int [][] mat){
        stk<Integer> s = new stk<>();
        s.push(0);
        while(!s.isempty()){
            if(!vis[s.peek()]) {
                int val = s.pop();
                System.out.print(c[val].cname + "\t");
                vis[val]=true;
                for (int i = 0; i < c.length; i++) {
                    if(mat[val][i] != 0){
                        s.push(i);
                    }
                }
            }
            else{
                s.pop();
            }
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
        dfs_graph d= new dfs_graph(cities);
        d.dfs_print(cities,g.adj);
    }
}
