package data;

public class Main {

    public static void main(String[] args) {

        //commented next lines if you want use the test input data
        Reader reader = new Reader();

        for (String key : reader.getRunPaths().keySet()) {
            reader.getGraph().shortestPath(key);
            reader.getGraph().printCost(reader.getRunPaths().get(key));
        }

        //new TestData();         //uncommented the line if you want use the test input data
    }
}
