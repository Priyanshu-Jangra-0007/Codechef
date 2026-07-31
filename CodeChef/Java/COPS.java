            for (int i = 0; i < 100; i++) {
                safeHouses[i] = true; 
            }

            for (int copHouse : copHouses) {
                int startHouse = Math.max(1, copHouse - x * 
                    y);
                int endHouse = Math.min(100, copHouse + x * 
                    y);
                for (int j = startHouse; j <= endHouse; j++) 
                    {
                    safeHouses[j - 1] = false; 
                }
            }

            int countSafeHouses = 0;
            for (boolean isSafe : safeHouses) {
                if (isSafe) {
                    countSafeHouses++;
                }
            }

            System.out.println(countSafeHouses);
        }
        
        scanner.close();
    }
}
