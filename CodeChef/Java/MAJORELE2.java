            cnt1 = 1;
        }
        else if (cnt2 == 0) {
            el2 = val;
            cnt2 = 1;
        }
        else {
            cnt1--;
            cnt2--;
        }
    }

    // Phase 2: Validation
    cnt1 = 0;
    cnt2 = 0;

    for (int i = 0; i < n; i++) {
        long val = a.get(i);
        if (val == el1) cnt1++;
        else if (val == el2) cnt2++;
    }

    List<Long> ans = new ArrayList<>();
    if (cnt1 > n / 3) ans.add(el1);
    if (cnt2 > n / 3) ans.add(el2);

    Collections.sort(ans);
    return ans;
}