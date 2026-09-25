
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String entry : cpdomains) {
            String[] parts = entry.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];
            
            String[] fragments = domain.split("\\.");
            
            String subdomain = "";
            for (int i = fragments.length - 1; i >= 0; i--) {
                subdomain = fragments[i] + 
                           (subdomain.isEmpty() ? "" : "." + subdomain);
                
                map.put(subdomain, 
                        map.getOrDefault(subdomain, 0) + count);
            }
        }
        
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key);
        }
        
        return result;
    }
}