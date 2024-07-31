import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Suriya", 100);
        System.out.println(map.get("Suriya"));// returns the value associated with the key "Suriya"
        map.put("Nitish", 200);
        map.put("Tushar", 300);
        map.put("Suriya", 400);
        System.out.println(map.get("Suriya"));// If the key is duplicate then the old key is replaced with the value.
        System.out.println(map.containsKey("Suriya"));// returns true if the key is present in the map
        System.out.println(map.remove("Suriya"));// removes the key and returns the value associated with the key
        map.replace("Nitish", 500);// replaces the value associated with the key "Nitish" with 500
        System.out.println(map);
        map.compute("Nitish", (key, val) -> val == null ? 1 : val + 100);
        map.computeIfAbsent("SUriya", key -> 1000);
        map.forEach((key, value) -> System.out.println(key + " " + value));

    }
}