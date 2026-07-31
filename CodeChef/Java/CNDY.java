
            for (int i = 0; i < 2 * n; i++) {
                prices[i] = scanner.nextInt();
            }

            HashMap<Integer, Integer> priceCount = new 
                HashMap<>();
            boolean isValid = true;

            for (int i = 0; i < 2 * n; i++) {
                priceCount.put(prices[i], priceCount
                    .getOrDefault(prices[i], 0) + 1);
                if (priceCount.get(prices[i]) > 2) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}
