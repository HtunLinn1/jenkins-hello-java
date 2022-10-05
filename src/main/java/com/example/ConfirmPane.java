package com.example;

public class ConfirmPane extends Pane {
  public ConfirmPane(JustPayApp app) {
    super(app);
  }

  @Override
  public void doAction(String command) {
    switch(command) {
      case "SETTLEMENT_BUTTON_OK":
        // 決済OK：決済結果画面
        app.setPane(ResultPane.class);
        break;
      case "SETTLEMENT_BUTTON_FAIL":
        // 決済失敗：決済失敗画面
        app.setPane(FailurePane.class);
        break;
      case "CANCEL_BUTTON":
        // キャンセルボタン
        app.setPane(HomePane.class);
        break;
    }
  }
}
