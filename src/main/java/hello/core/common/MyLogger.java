package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {
  private String uuid;
  private String requestUrl;

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  public void log(String message) {
    String log = String.format("[%s] [%s] %s", uuid, requestUrl, message);
    System.out.println(log);
  }
  @PostConstruct
  public void init() {
    uuid = UUID.randomUUID().toString();
    System.out.println("["+ uuid + "] request scope been create: " + this);
  }

  @PreDestroy
  public void close() {
    System.out.println("["+ uuid + "] request scope been close: " + this) ;
  }
}
