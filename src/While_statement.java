class While_statement{
   public static void main(String[] args) {
      int i = 0;
      do{
          System.out.println("rule # " + i);
          i+=1;
      }
      while(i<3);{
          System.out.println("rule #"+ i);
          i += 1;
      }
      for(int a = 0;i<3 ;i+=1){
          System.out.println("rule # "+ a);
      }
    }

}