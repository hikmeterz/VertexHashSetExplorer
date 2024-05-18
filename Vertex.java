public class Vertex {
    private final int x, y, z;

    public Vertex(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vertex other) {
        return x == other.x && y == other.y && z == other.z;
    }

    public String toString() {
        return "{" + x + ",\t" + y + ",\t" + z + "}";
    }
}