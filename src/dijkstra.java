
class p_pair{
    int wt;
    int prev;
    p_pair() {
        this.wt = Integer.MAX_VALUE;
        this.prev = -1;
    }
}

public class dijkstra {
    static boolean [] vis;
    static p_pair [] res;
    dijkstra(city[] c){
        res = new p_pair[c.length];
        vis = new boolean[c.length];
        for(int i=0;i<c.length;i++) vis[i]=false;
        for (int i = 0; i < c.length; i++) {
            res[i]= new p_pair();
        }
        res[0].wt=0;

    }

    void djk_mst(city[]c,int[][]mat){
        int count=0;

        while(count < c.length){
            int value=Integer.MAX_VALUE;
            int ind=0;
            for (int i = 0; i < c.length; i++) {
                if(vis[i]==false && res[i].wt < value){
                    value=res[i].wt;
                    ind =i;
                }
            }
            vis[ind]=true;
            for (int i = 0; i < c.length; i++) {
                if(vis[i]==false && mat[ind][i] !=0 && res[i].wt > value+mat[ind][i]){
                    res[i].wt = value+mat[ind][i];
                    res[i].prev = ind;
                }
            }
            count++;
        }
    }

    void printer(city[] c){
        System.out.println(c[0].ccode+" -> "+c[0].ccode+" : "+res[0].wt);
        for (int i = 1; i < res.length; i++) {
            System.out.println(c[0].ccode+" -> "+c[res[i].prev].ccode+" : "+res[i].wt);
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
        //dfs_graph d= new dfs_graph(cities);
        //d.dfs_print(cities,g.adj);
        dijkstra pr =new dijkstra(cities);
        pr.djk_mst(cities,g.adj);
        pr.printer(cities);
    }
}
