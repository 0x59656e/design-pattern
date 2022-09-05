package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumber {
    private List<Integer> numList = new ArrayList<>();

    public static boolean isPrime(Integer n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public PrimeNumber(List<Integer> numList) {
        this.numList = numList;
    }

    public Iterator<Integer> getIterator() {
        return new PrimeNumberIterator();
    }

    public List<Integer> getNumList() {
        return numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }

    class PrimeNumberIterator implements Iterator<Integer> {
        Iterator<Integer> listIter = PrimeNumber.this.numList.iterator();

        @Override
        public boolean hasNext() {
            return listIter.hasNext();
        }

        @Override
        public Integer next() {
            while (listIter.hasNext()) {
                Integer i = listIter.next();
                if (isPrime(i))
                    return i;
            }
            return 0;
        }
    }

}
