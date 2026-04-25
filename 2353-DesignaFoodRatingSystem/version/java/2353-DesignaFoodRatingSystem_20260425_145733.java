// Last updated: 4/25/2026, 2:57:33 PM
1class FoodRatings {
2
3    class Pair {
4        String food;
5        int rating;
6
7        Pair(String food, int rating) {
8            this.food = food;
9            this.rating = rating;
10        }
11    }
12
13    Map<String, Integer> foodRating;
14    Map<String, String> foodCuisine;
15    Map<String, TreeSet<Pair>> cuisineMap;
16
17    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
18        foodRating = new HashMap<>();
19        foodCuisine = new HashMap<>();
20        cuisineMap = new HashMap<>();
21
22        for (int i = 0; i < foods.length; i++) {
23            foodRating.put(foods[i], ratings[i]);
24            foodCuisine.put(foods[i], cuisines[i]);
25
26            cuisineMap.putIfAbsent(cuisines[i], new TreeSet<>(
27                (a, b) -> {
28                    if (a.rating != b.rating) return b.rating - a.rating;
29                    return a.food.compareTo(b.food);
30                }
31            ));
32
33            cuisineMap.get(cuisines[i]).add(new Pair(foods[i], ratings[i]));
34        }
35    }
36
37    public void changeRating(String food, int newRating) {
38        String cuisine = foodCuisine.get(food);
39        TreeSet<Pair> set = cuisineMap.get(cuisine);
40
41        // Remove old entry
42        set.remove(new Pair(food, foodRating.get(food)));
43
44        // Update rating
45        foodRating.put(food, newRating);
46
47        // Add new entry
48        set.add(new Pair(food, newRating));
49    }
50
51    public String highestRated(String cuisine) {
52        return cuisineMap.get(cuisine).first().food;
53    }
54}
55
56/**
57 * Your FoodRatings object will be instantiated and called as such:
58 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
59 * obj.changeRating(food,newRating);
60 * String param_2 = obj.highestRated(cuisine);
61 */