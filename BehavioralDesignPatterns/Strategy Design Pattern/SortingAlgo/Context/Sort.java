package Context;

import Strategy.SortingStrategy;

public class Sort {
  SortingStrategy sortingStrategy;

  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void sort(int[] arr) {
    sortingStrategy.sort(arr);
  }
}