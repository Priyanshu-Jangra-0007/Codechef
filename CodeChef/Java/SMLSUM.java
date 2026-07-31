            Pair[] pairs = new Pair[n];
            String[] aStr = br.readLine().split(" ");
            String[] bStr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                pairs[i] = new Pair(Integer.parseInt(aStr[i]
                    ), Integer.parseInt(bStr[i]));
            }
            Arrays.sort(pairs);

            long[] prefixSum = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + pairs[i - 
                    1].b;
            }

            String[] xStr = br.readLine().split(" ");
            for (int i = 0; i < q; i++) {
                int x = Integer.parseInt(xStr[i]);
                int index = upperBound(pairs, x);
                out.print(prefixSum[index] + " ");
            }
            out.println();
        }
        out.close();
    }

    static int upperBound(Pair[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid].a <= target) {