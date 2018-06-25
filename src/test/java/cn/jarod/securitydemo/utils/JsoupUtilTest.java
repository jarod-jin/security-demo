package cn.jarod.securitydemo.utils;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


public class JsoupUtilTest {

  @Test
  public void alert_clean() {
    String text = "   <a href=\"http://www.baidu.com/a\" onclick=\"alert(1);\">sss</a><script>alert(0);</script>sss   ";
    assertThat(JsoupUtil.clean(text))
              .contains("href=\"http://www.baidu.com/a","rel=\"nofollow\"","</a>sss")
              .doesNotContain("<script>alert(0);</script>","onclick=\"alert(1);","<script>");
  }

}
