package com.example;

public class FailurePane extends Pane {
  public FailurePane(JustPayApp app) {
    super(app);
  }

  @Override
  public void doAction(String command) {
    switch(command) {
      case "REREAD_BUTTON":
        // 再読取：バーコード読取画面
        app.setPane(BarcodeReaderPane.class);
        break;
      case "OK_BUTTON":
        // OKボタン
        app.setPane(HomePane.class);
        break;
      case "CANCEL_BUTTON":
        // キャンセルボタン
        app.setPane(HomePane.class);
        break;
    }
  }
}
