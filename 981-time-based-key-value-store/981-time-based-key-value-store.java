public class TimeMap {

    private static final String EMPTY_STR = "";
    Map<String, TreeMap<Integer, String>> map;
	
	public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return EMPTY_STR;
        Map.Entry<Integer, String> e = map.get(key).floorEntry(timestamp);
        return e != null ? e.getValue() : EMPTY_STR;
    }
}






// class TimeMap {

//     public TimeMap() {
        
//     }
    
//     public void set(String key, String value, int timestamp) {
        
//     }
    
//     public String get(String key, int timestamp) {
        
//     }
// }

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */