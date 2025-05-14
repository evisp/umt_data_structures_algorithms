public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Create city objects
        City tirana = new City("Tirana");
        City durres = new City("Durrës");
        City elbasan = new City("Elbasan");
        City shkoder = new City("Shkodër");
        City vlore = new City("Vlorë");
        City berat = new City("Berat");
        City fier = new City("Fier");
        City korce = new City("Korçë");

        // Add cities to the graph
        graph.addCity(tirana);
        graph.addCity(durres);
        graph.addCity(elbasan);
        graph.addCity(shkoder);
        graph.addCity(vlore);
        graph.addCity(berat);
        graph.addCity(fier);
        graph.addCity(korce);

        // Add roads (undirected, with sample distances in km)
        graph.addRoad(tirana, durres, 33);
        graph.addRoad(tirana, elbasan, 45);
        graph.addRoad(tirana, shkoder, 100);
        graph.addRoad(durres, fier, 85);
        graph.addRoad(fier, vlore, 35);
        graph.addRoad(vlore, berat, 70);
        graph.addRoad(elbasan, korce, 110);
        graph.addRoad(berat, elbasan, 70);
        graph.addRoad(fier, berat, 40);

        // Run Dijkstra from Tirana
        graph.dijkstra(tirana);
    }
}
