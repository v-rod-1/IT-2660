class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    
    // Step 3: Map called creditHours
    MyHashMap<String, Integer> creditHours = new MyHashMap<>();

    // Step 4: Add entries to credithours
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Step 5: check for IT-1025 and IT-2110 and display results
    System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025"));
    System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110"));

    // Step 6: Print all content in the map
    System.out.println("All courses and credit hours:");
    for (MyHashMap.Entry<String, Integer> entry : creditHours.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // Step 7: Remove IT-2030 and IT-1150
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Step 8: Print all of the values(only value) in the map
    System.out.println("Credit hours in the map:");
    for (Integer hours : creditHours.values()) {
      System.out.println(hours);
    }
  }
}