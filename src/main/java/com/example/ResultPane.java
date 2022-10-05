package com.example;

public class ResultPane extends Pane {
  public ResultPane(JustPayApp app) {
    super(app);
  }

  @Override
  public void doAction(String command) {
    switch(command) {
      case "OK_BUTTON":
        // バーコード読取：金額確認画面
        app.setPane(HomePane.class);
        break;
      case "CANCEL_BUTTON":
        // キャンセルボタン
        app.setPane(HomePane.class);
        break;
    }
  }
}
