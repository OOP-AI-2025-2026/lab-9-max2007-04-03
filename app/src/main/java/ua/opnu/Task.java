package ua.opnu;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        System.out.println("--- Завдання 1: removeShorterStrings ---");
        List<String> list1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        System.out.println("До: " + list1);
        removeShorterStrings(list1);
        System.out.println("Після: " + list1);

        System.out.println("\n--- Завдання 2: stutter ---");
        List<String> list2 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
        System.out.println("До: " + list2);
        stutter(list2);
        System.out.println("Після: " + list2);

        System.out.println("\n--- Завдання 3: switchPairs ---");
        List<String> list3 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        System.out.println("До: " + list3);
        switchPairs(list3);
        System.out.println("Після: " + list3);

        System.out.println("\n--- Завдання 4: removeDuplicates ---");
        List<String> list4 = new ArrayList<>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        System.out.println("До: " + list4);
        removeDuplicates(list4);
        System.out.println("Після: " + list4);

        System.out.println("\n--- Завдання 5: markLength4 ---");
        List<String> list5 = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println("До: " + list5);
        markLength4(list5);
        System.out.println("Після: " + list5);

        System.out.println("\n--- Завдання 6: isPalindrome ---");
        Queue<Integer> q6 = new ArrayDeque<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
        System.out.println("Черга: " + q6);
        System.out.println("Паліндром? " + isPalindrome(q6));
        System.out.println("Черга після перевірки (має бути незмінна): " + q6);

        System.out.println("\n--- Завдання 7: reorder ---");
        Queue<Integer> q7 = new ArrayDeque<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
        System.out.println("До: " + q7);
        reorder(q7);
        System.out.println("Після: " + q7);

        System.out.println("\n--- Завдання 8: rearrange ---");
        Queue<Integer> q8 = new ArrayDeque<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
        System.out.println("До: " + q8);
        rearrange(q8);
        System.out.println("Після: " + q8);

        System.out.println("\n--- Завдання 9: maxLength ---");
        Set<String> set9 = new HashSet<>(Arrays.asList("one", "two", "three"));
        System.out.println("Множина: " + set9);
        System.out.println("Макс. довжина: " + maxLength(set9));

        System.out.println("\n--- Завдання 10: removeEvenLength ---");
        Set<String> set10 = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        System.out.println("До: " + set10);
        removeEvenLength(set10);
        System.out.println("Після: " + set10);

        System.out.println("\n--- Завдання 11: numInCommon ---");
        List<Integer> list11a = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list11b = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        System.out.println("Спільних унікальних: " + numInCommon(list11a, list11b));

        System.out.println("\n--- Завдання 12: isUnique ---");
        Map<String, String> map12 = new HashMap<>();
        map12.put("Marty", "Stepp"); map12.put("Stuart", "Reges"); map12.put("Jessica", "Miller");
        map12.put("Amanda", "Camp"); map12.put("Hal", "Perkins");
        System.out.println("Map: " + map12);
        System.out.println("isUnique? " + isUnique(map12));

        System.out.println("\n--- Завдання 13: intersect ---");
        Map<String, Integer> map13a = new HashMap<>();
        map13a.put("Janet", 87); map13a.put("Logan", 62); map13a.put("Whitaker", 46); map13a.put("Kim", 52);
        Map<String, Integer> map13b = new HashMap<>();
        map13b.put("Logan", 62); map13b.put("Kim", 52); map13b.put("Whitaker", 52); map13b.put("Jeff", 88);
        System.out.println("Перетин: " + intersect(map13a, map13b));

        System.out.println("\n--- Завдання 14: reverse ---");
        Map<Integer, String> map14 = new HashMap<>();
        map14.put(42, "Marty"); map14.put(81, "Sue"); map14.put(17, "Ed"); map14.put(31, "Dave"); map14.put(56, "Ed");
        System.out.println("Оригінал: " + map14);
        System.out.println("Реверс: " + reverse(map14));

        System.out.println("\n--- Завдання 15: rarest ---");
        Map<String, Integer> map15 = new HashMap<>();
        map15.put("Alyssa", 22); map15.put("Char", 25); map15.put("Dan", 25); map15.put("Jeff", 20);
        map15.put("Kasey", 20); map15.put("Kim", 20); map15.put("Mogran", 25); map15.put("Ryan", 25); map15.put("Stef", 22);
        System.out.println("Map: " + map15);
        System.out.println("Найрідкісніше (найменше): " + rarest(map15));

        System.out.println("\n--- Завдання 16: maxOccurrences ---");
        List<Integer> list16 = Arrays.asList(9, 7, 9, -1, 2, 9, 7, 2, 15, 15);
        System.out.println("Список: " + list16);
        System.out.println("Макс. кількість входжень: " + maxOccurrences(list16));
    }

    public static void removeShorterStrings(List<String> list) {
        for (int i = (list.size() / 2) * 2 - 2; i >= 0; i -= 2) {
            String s1 = list.get(i);
            String s2 = list.get(i + 1);
            if (s1.length() <= s2.length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
            }
        }
    }

    public static void stutter(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(i, list.get(i));
        }
    }

    public static void switchPairs(List<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void removeDuplicates(List<String> list) {
        if (list.isEmpty()) return;
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }
        }
    }

    public static void markLength4(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
            }
        }
    }

    public static boolean isPalindrome(Queue<Integer> q) {
        Deque<Integer> stack = new ArrayDeque<>();
        int size = q.size();
        boolean isPalindrome = true;

        for (int i = 0; i < size; i++) {
            int val = q.remove();
            stack.push(val);
            q.add(val);
        }

        for (int i = 0; i < size; i++) {
            int qVal = q.remove();
            int sVal = stack.pop();

            if (qVal != sVal) {
                isPalindrome = false;
            }

            q.add(qVal);
        }

        return isPalindrome;
    }

    public static void reorder(Queue<Integer> q) {
        Deque<Integer> stack = new ArrayDeque<>();
        int size = q.size();
        int positiveCount = 0;

        for (int i = 0; i < size; i++) {
            int val = q.remove();
            if (val < 0) {
                stack.push(val);
            } else {
                q.add(val);
                positiveCount++;
            }
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < positiveCount; i++) {
            q.add(q.remove());
        }
    }

    public static void rearrange(Queue<Integer> q) {
        Deque<Integer> stack = new ArrayDeque<>();
        int size = q.size();
        int oddsCount = 0;

        for (int i = 0; i < size; i++) {
            int val = q.remove();
            if (val % 2 == 0) {
                q.add(val);
            } else {
                stack.push(val);
                oddsCount++;
            }
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        int evensCount = size - oddsCount;
        for (int i = 0; i < evensCount; i++) {
            q.add(q.remove());
        }

        for (int i = 0; i < oddsCount; i++) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static int maxLength(Set<String> set) {
        int max = 0;
        for (String s : set) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.length() % 2 == 0) {
                itr.remove();
            }
        }
    }

    public static int numInCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> common = new HashSet<>();

        for (Integer num : list2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        return common.size();
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> values = new HashSet<>();
        for (String value : map.values()) {
            if (values.contains(value)) {
                return false;
            }
            values.add(value);
        }
        return true;
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                Integer val1 = map1.get(key);
                Integer val2 = map2.get(key);
                if (Objects.equals(val1, val2)) {
                    result.put(key, val1);
                }
            }
        }
        return result;
    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) throw new NoSuchElementException("Map is empty");

        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer value : map.values()) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        int minCount = Integer.MAX_VALUE;
        int resultValue = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (count < minCount) {
                minCount = count;
                resultValue = value;
            } else if (count == minCount) {
                if (value < resultValue) {
                    resultValue = value;
                }
            }
        }
        return resultValue;
    }

    public static int maxOccurrences(List<Integer> list) {
        if (list.isEmpty()) return 0;

        Map<Integer, Integer> counts = new HashMap<>();
        int maxOcc = 0;

        for (Integer num : list) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);
            if (count > maxOcc) {
                maxOcc = count;
            }
        }
        return maxOcc;
    }
}