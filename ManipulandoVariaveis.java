class ManipulandoVariaveis {
      public static void main(String[] args) {
             // aprovado >=7
             // exame >=5 e <7
             // reprovado <5

             double nota = 5.5 ;                     
             if (nota > 7) {                           
                     System.out.println("Parabéns voce foi aprovado");
             } else if (nota >=5 & nota < 7) {
                     System.out.println("Você vai precisar refazer o exame!");
             } else {
                     System.out.println("Você foi reprovado!");
             }
      }
}