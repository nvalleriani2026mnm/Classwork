public static void randomizeUntilNum() {

  int num = 3;
  int iters = 4;

  for(int i = 0; i < iters; i++) {
    int currentNum = (int) (Math.random() * 10);
      while(currentNum != num) {
        currentNum = (int) (Math.random() * 10);
        System.out.print(currentNum);
      }
      System.out.println("");
  }
}
