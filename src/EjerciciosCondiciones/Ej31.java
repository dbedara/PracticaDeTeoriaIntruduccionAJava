//package EjerciciosCondiciones;
//
//import java.util.Scanner;
//
//public class Ej31 {
//    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Dime la Base Imponible: ");
//     double baseimp=scanner.nextInt();
//        System.out.println("Dime que tipo de iva aplicas: (1.general - 2.reducido - 3.superreducido) ");
//        int iva=scanner.nextInt();
//        System.out.println("Dime que codigo tiene: (1.nopro - 2.mitad - 3.meno5, 4.5proc)");
//        int promocion=scanner.nextInt();
//
//    double por_iva;
//    double pre_iva = switch (iva){
//      case 1:
//          por_iva=baseimp*0.21;
//          pre_iva=baseimp+por_iva;
//          System.out.println("IVA (21%): "+por_iva);
//          System.out.println("Precio Con IVA: "+ pre_iva);
//          break;
//      case 2:
//          por_iva=baseimp*0.10;
//          pre_iva=baseimp+por_iva;
//          System.out.println("IVA (10%):"+por_iva);
//          System.out.println("Precio Con IVA: "+ pre_iva);
//          break;
//      case 3:
//       por_iva=baseimp*0.04;
//          pre_iva=baseimp+por_iva;
//          System.out.println("IVA 4%:"+por_iva);
//          System.out.println("Precio Con IVA: "+ pre_iva);
//       break;
//      default:
//          System.out.println("Eso no es un valor valido");
//
//  }
//
//  double r_promocion=pre_iva+promocion;
//switch (promocion){
//    case 1:
//        r_promocion=pre_iva;
//    case 2:
//        r_promocion=pre_iva/2;
//        System.out.println(r_promocion);
//
//
//}
//
//    }
//}

