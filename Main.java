public class Main {
    public static void main(String[] args) {

        FriendshipGraph graph=new FriendshipGraph();
        Person rachel=new Person("Rachel");
        Person ben=new Person("Ben");
        Person ross=new Person("Ross");
        Person kei=new Person("Kei");
        graph.addVertex(rachel);
        graph.addVertex(ben);
        graph.addVertex(ross);
        graph.addVertex(kei);
        graph.addEdge(rachel,ross);
        graph.addEdge(ross,rachel);
        graph.addEdge(ben,ross);
        graph.addEdge(ross,ben);
System.out.println("C4");
        System.out.println(graph.getDistance(rachel,ross));
        System.out.println(graph.getDistance(rachel,ben));
        System.out.println(graph.getDistance(rachel,rachel));
        System.out.println(graph.getDistance(rachel,kei));
    }
}