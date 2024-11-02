package in.techcamp.firstapp;
//意味: このコードがどの「パッケージ」に属しているかを示しています
//補足: パッケージはフォルダのようなもので、プログラムを整理するためのものです。in.techcamp.firstappというパッケージの中にあることを表しています。


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import
//意味: これらは「外部のコード」を使うために必要な準備です。
//補足: import文で他の場所にあるコードを使えるようにします。ここでは、Spring Bootが提供するいくつかの機能（ControllerやGetMappingなど）を使うためにインポートしています。

@Controller
//意味: @Controllerは、このクラスがウェブページのコントローラ（操作の司令塔のようなもの）であることを示しています。
//補足: Controllerとは、ユーザーからのリクエスト（「/hello」を開くといった操作）に対応する処理を行う部分です。
public class PostController {
//意味: これはPostControllerという名前のクラス（クラスはプログラムの部品）を作る部分です。
//補足: クラスはプログラムの動作をまとめる「箱」のようなもので、ここにウェブページを表示するための動作を入れています。
    @GetMapping("/hello")
    //意味: このクラスにあるshowHelloというメソッドが、ユーザーが「/hello」にアクセスしたときに動作することを示しています。
    //補足: ユーザーがブラウザで「/hello」を開くと、showHelloメソッドが実行されます。
    public String showHello(Model model){
    //意味: これは「showHelloという名前のメソッド」を定義しています。
    //補足: メソッドはプログラムの中で「特定の処理を行うための小さな部品」です。このメソッドでは、表示するテキストを準備して、そのテキストを画面に表示させます。
    //Model:引数として渡されるオブジェクト。Springが自動的にModelオブジェクトをshowHelloメソッドに渡してくれる
    //model:メソッド内で使用する変数名
        var sampleText = "サンプルテキスト";
        //意味: sampleTextという変数を作り、その中に「サンプルテキスト」という日本語の文字を入れています。
        //補足: この変数はウェブページに表示させるためのテキストです。
        model.addAttribute("sampleText", sampleText);
        //意味: ここでは、変数sampleTextの中身（「サンプルテキスト」）を、modelという「モデル」に追加しています。(→value)
        //補足: modelは、画面に渡すデータを入れるための「箱」のようなものです。sampleTextの内容を"sampleText"という名前でmodelに入れて、画面で使えるようにしています。(←key)
        return "hello";
        //意味: showHelloメソッドが終わるときに、「hello」という名前の画面を表示するよう指定しています。
        //補足: Spring Bootでは、returnの後に書かれた名前（ここでは"hello"）に対応するHTMLファイルが表示されます。この場合、hello.htmlという名前のファイルを使って画面を表示します。
    }
}
