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

    public void dijkstra(City start) {
        Map<City, Integer> distances = new HashMap<>();
        PriorityQueue<Map.Entry<City, Integer>> pq = 
        		new PriorityQueue<>(Map.Entry.comparingByValue());

        for (City city : adjList.keySet()) {
            distances.put(city, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        pq.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!pq.isEmpty()) {
            City current = pq.poll().getKey();

            for (Edge edge : adjList.get(current)) {
                City neighbor = edge.getDestination();
                int newDist = distances.get(current) 
                		+ edge.getWeight();
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(new AbstractMap.SimpleEntry<>
                    (neighbor, newDist));
                }
            }
        }

        System.out.println("Dijkstra distances from " + start + ":");
        for (Map.Entry<City, Integer> entry : distances.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
