import java.util.*;

public class Median {
    static class Item implements Comparable<Item> {
        long val;
        int idx;

        Item(long val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Item other) {
            if (this.val != other.val) {
                return Long.compare(this.val, other.val);
            }
            return Integer.compare(this.idx, other.idx);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Item> left = new TreeSet<>();
        TreeSet<Item> right = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            Item cur = new Item(x, i);
            if (left.isEmpty() || cur.compareTo(left.last()) <= 0) {
                left.add(cur);
            } else {
                right.add(cur);
            }
            while (left.size() > right.size() + 1) {
                Item maxLeft = left.last();
                Item temp = left.lower(maxLeft);
                if (temp != null) {
                }
                left.remove(maxLeft);
                right.add(maxLeft);
            }

            while (left.size() < right.size()) {
                Item minRight = right.first();
                Item temp = right.higher(minRight);
                if (temp != null) {
                }
                right.remove(minRight);
                left.add(minRight);
            }
            if (left.size() > right.size()) {
                sb.append(left.last().val).append('\n');
            } else {
                long a = left.last().val;
                long b = right.first().val;
                double median = (a + b) / 2.0;
                sb.append(median).append('\n');
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }
}