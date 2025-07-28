public class passing {
    public static void update(int marks[],int score){
      score = 50;

      for(int i=0; i<marks.length; i++){
        marks[i] = marks[i]+1;
      }

    }

    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int score = 40;

        update(marks, score);

        System.out.println(score);
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
