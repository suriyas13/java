import java.util.HashMap;
import java.util.Scanner;

class Product {
    Scanner scanner = new Scanner(System.in);

    public void add(HashMap<String, Integer> map) {
        System.out.println("Enter the Number of Products:");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter item name:");
            String pro = scanner.next();
            System.out.println("Enter Quantity:");
            int quantity = scanner.nextInt();
            map.put(pro, quantity);
        }
    }

    public void displayvalue(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String item = scanner.next();
        System.out.println("Quanity:" + map.get(item));
    }

    public void additem(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();
        map.putIfAbsent(pro, quantity);
    }

    public void checkQuantity(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();

        if (map.containsKey(pro)) {
            System.out.println("Product Quantity:" + map.get(pro));
        }
    }

    public void removeitem(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        map.remove(pro);
    }

    public void replaceitem(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter New Quantity:");
        int quantity = scanner.nextInt();
        map.replace(pro, quantity);
    }

    public void conditionallyReplace(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter Old Quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter New Quantity:");
        int quantity1 = scanner.nextInt();
        if (map.get(pro) == quantity) {
            map.replace(pro, quantity1);
            System.out.println("Quanity replaced");
        }
    }

    public void computeItem(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter quantity to be added:");
        int quantity = scanner.nextInt();
        map.compute(pro, (key, val) -> val + quantity);
        System.out.println("New Quanity is " + map.get(pro));
    }

    public void computeifAbsent(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter quantity :");
        int quantity = scanner.nextInt();

        if (map.computeIfAbsent(pro, key -> quantity) == quantity)
            System.out.println("Item Added");
    }

    public void computeifPresent(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter quantity to be added:");
        int quantity = scanner.nextInt();
        if (map.computeIfPresent(pro, (key, val) -> quantity) == quantity)
            System.out.println("Item Added");
    }

    public void mergequantity(HashMap<String, Integer> map) {
        System.out.println("Enter item name:");
        String pro = scanner.next();
        System.out.println("Enter quantity to be added:");
        int quantity = scanner.nextInt();
        map.merge(pro, quantity, Integer::sum);
        System.out.println("Item Added");
    }

    public void display(HashMap<String, Integer> map) {
        map.forEach((key, val) -> System.out.println(key + " " + val));
    }
}

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        Product obj = new Product();
        HashMap<String, Integer> map2 = new HashMap();

        while (true) {
            System.out.println("ENter the task:");
            int n = sc.nextInt();

            switch (n) {
                case 1: {
                    obj.add(map);
                    break;
                }
                case 2: {
                    obj.displayvalue(map);
                    break;
                }
                case 3: {
                    obj.additem(map);
                    break;
                }
                case 4: {
                    obj.checkQuantity(map);
                    break;
                }
                case 5: {
                    obj.removeitem(map);
                    break;
                }
                case 6: {
                    obj.replaceitem(map);
                    break;
                }
                case 7: {
                    obj.conditionallyReplace(map);
                    break;
                }
                case 8: {
                    obj.computeItem(map);
                    break;
                }
                case 9: {
                    obj.computeifAbsent(map);
                    break;
                }
                case 10: {
                    obj.computeifPresent(map);
                    break;
                }
                case 11: {
                    obj.mergequantity(map);
                    break;
                }
                case 12: {
                    obj.display(map);
                }
            }
            if (n == 13) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
