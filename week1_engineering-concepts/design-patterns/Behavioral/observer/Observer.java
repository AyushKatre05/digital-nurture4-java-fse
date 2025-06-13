interface Observer {
    void update(String message);
}
interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
class NewsPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void register(Observer o) { observers.add(o); }
    public void unregister(Observer o) { observers.remove(o); }
    public void notifyObservers() {
        for (Observer o : observers) o.update(news);
    }
    public void addNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
class NewsSubscriber implements Observer {
    private String name;
    public NewsSubscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}
