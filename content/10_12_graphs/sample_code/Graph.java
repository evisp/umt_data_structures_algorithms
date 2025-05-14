import java.util.*;

public class Graph {
    private Map<City, List<Edge>> adjList = new HashMap<>();

    public void addCity(City city) {
        adjList.putIfAbsent(city, new ArrayList<>());
    }

    public void addRoad(City from, City to, int distance) {
        adjList.get(from).add(new Edge(to, distance));
        adjList.get(to).add(new Edge(from, distance)); 
    }

}
