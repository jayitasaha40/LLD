public class WeightMachineAdapter {
  WeightMachine weightMachine;

  public WeightMachineAdapter(WeightMachine weightMachine) {
    this.weightMachine = weightMachine;
  }

  public int getKgWeight() {
    return (int) weightMachine.getPoundWeight() / 2;
  }
}