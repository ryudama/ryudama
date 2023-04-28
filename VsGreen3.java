import java.util.Scanner; //scanner import

class VsGreen3{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); //scannerの定型文

        System.out.println("赤緑青黄で、最初に選んだポケモンは？ （フシギダネ・ヒトカゲ・ゼニガメ・ピカチュウ）> "); //入力
        
        String firstPokemon = scanner.next(); //オーキド研究所でもらえるポケモン設定

        String common = "ピジョット、フーディン、サイドン、"; //赤緑青の最初3体固定
        String common2 = "サンドパン、フーディン、ナッシー、"; //黄の最初3体固定

        switch(firstPokemon) {
            default:
                System.out.println("改造ダメゼッタイ");
                break; 
            case "フシギダネ":
                System.out.printf("フシギダネを選んだ場合は\n  手持ちは  \n  %sナッシー、ギャラドス、リザードン",common);
                break;
            case "ヒトカゲ":
                System.out.printf("ヒトカゲを選んだ場合は\n  手持ちは  \n  %sウインディ、ナッシー、カメックス",common);
                break;
            case "ゼニガメ":
                System.out.printf("ゼニガメを選んだ場合は\n  手持ちは  \n  %sギャラドス、ウインディ、フシギバナ",common);            
                break;
            case "ピカチュウ":
                System.out.println("オーキド研究所で勝った（はいorいいえ）？ > "); //研究所勝敗入力
                String Okido = scanner.next();

                switch(Okido){
                    default:
                        System.out.println("最初からやり直してください。");
                        break; 
                    case "いいえ":
                        System.out.printf("\n 手持ちは \n %sキュウコン、レアコイル、シャワーズ",common2);            
                        break;
                    case "はい":
                        System.out.println("22番道路で負けたor戦ってない（はいorいいえ）？ > "); //22番道路入力
                        String road = scanner.next();
                            switch(road){
                                default:
                                    System.out.println("最初からやり直してください。");
                                    break; 
                                case "はい":
                                    System.out.printf("\n 手持ちは \n  %sレアコイル、パルシェン、ブースター",common2);            
                                    break;
                                case "いいえ":
                                    System.out.printf("\n 手持ちは \n  %sパルシェン、キュウコン、サンダース",common2);            
                                    break;
                            }     
                }     
        }
        scanner.close();
        System.out.println();
    }   
}