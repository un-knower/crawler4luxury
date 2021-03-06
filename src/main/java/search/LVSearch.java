package search;

import componentImpl.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import us.codecraft.webmagic.selector.Html;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yang
 * @Date: 2017/12/12.13:58
 * @Desc: LVCrawler
 */
public class LVSearch {
    private WebDriver driver;

    private String search(String url, String value) {
        driver = WebDriverManager.getInstall().create(3, driver);
        // 让浏览器访问 Baidu
        driver.get(url);
        // 获取 网页的 title
        System.out.println(" Page title is: " + driver.getTitle());
        // 通过 id 找到 input 的 DOM
        WebElement element = driver.findElement(By.id("resultPageSearchInput"));
        // 输入关键字
        element.sendKeys(value);
        // 提交 input 所在的 form
        element.submit();
        Html html = new Html(element.getAttribute("outerHTML"));
        return html.get();
    }

    private final static int STAT_RUNNING = 1;

    private final static int STAT_CLODED = 2;

    private AtomicInteger stat = new AtomicInteger(STAT_RUNNING);

    public static void main(String[] args) {
        LVSearch cv = new LVSearch();
        System.out.println(cv.stat.get());
        System.out.println(cv.stat.compareAndSet(STAT_RUNNING, STAT_CLODED));
    }

}
