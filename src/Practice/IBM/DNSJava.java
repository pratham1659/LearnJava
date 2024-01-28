package Practice.IBM;

import java.util.*;

public class DNSJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cache_size = scanner.nextInt();
        int cache_time = scanner.nextInt();
        int server_time = scanner.nextInt();
        int n = scanner.nextInt();
        String[] urls = new String[n];
        for (int i = 0; i < n; i++) {
            urls[i] = scanner.next();
        }
        List<Integer> result = getMinTime(cache_size, cache_time, server_time, Arrays.asList(urls));
        for (int time : result) {
            System.out.print(time + " ");
        }
    }

    public static List<Integer> getMinTime(int cache_size, int cache_time, int server_time, List<String> urls) {
        Map<String, Integer> cache = new LinkedHashMap<>();
        List<Integer> minTimes = new ArrayList<>();
        for (String url : urls) {
            String domain = getDomain(url);
            if (cache.containsKey(domain)) {
                minTimes.add(cache_time);
            } else {
                cache.put(domain, server_time);
                minTimes.add(server_time);
                if (cache.size() > cache_size) {
                    cache.remove(cache.keySet().iterator().next());
                }
            }
        }
        return minTimes;
    }

    public static String getDomain(String url) {
        String[] parts = url.split("/");
        String domain = parts[2];
        if (domain.contains("www.")) {
            domain = domain.substring(4);
        }
        int index = domain.indexOf('.');
        if (index != -1) {
            domain = domain.substring(0, index);
        }
        return domain;
    }
}