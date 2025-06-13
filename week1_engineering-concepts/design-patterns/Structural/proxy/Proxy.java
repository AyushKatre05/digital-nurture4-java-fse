interface Internet {
    void connectTo(String server);
}
class RealInternet implements Internet {
    public void connectTo(String server) {
        System.out.println("Connecting to " + server);
    }
}
class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> banned = List.of("abc.com", "xyz.com");

    public void connectTo(String server) {
        if (banned.contains(server)) {
            System.out.println("Access Denied to " + server);
        } else {
            internet.connectTo(server);
        }
    }
}