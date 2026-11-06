import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Route> routes;

    // Вспомогательный класс маршрута
    public static class Route {
        private City city;
        private int price;

        public Route(City city, int price) {
            this.city = city;
            this.price = price;
        }

        @Override
        public String toString() {
            return city.getName() + ":" + price;
        }
    }

    // Конструктор только с названием
    public City(String name) {
        this.name = name;
        this.routes = new ArrayList<>();
    }

    // Конструктор с названием и маршрутами
    public City(String name, List<Route> routes) {
        this.name = name;
        this.routes = new ArrayList<>(routes);
    }

    public String getName() {
        return name;
    }

    // Добавление маршрута
    public void addRoute(City city, int price) {
        routes.add(new Route(city, price));
    }

    @Override
    public String toString() {
        String result = name + ": ";

        for (int i = 0; i < routes.size(); i++) {
            result += routes.get(i);

            if (i < routes.size() - 1) {
                result += ", ";
            }
        }

        return result;
    }
}