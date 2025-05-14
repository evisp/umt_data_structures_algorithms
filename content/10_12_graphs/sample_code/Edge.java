public class Edge {
    private City destination;
    private int weight;

    public Edge(City destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public City getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
