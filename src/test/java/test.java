
import crawler.SinaCrawler;
import crawler.SinaCrawler2;
import compone.Component;
import factory.CrawlerComponent;

/**
 * @Author: yang 【youtulu.cn】
 * @Date: 2017/12/1.17:17
 */
public class test {
    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        Component component = CrawlerComponent.create("测试job");
        component.AddJob(new SinaCrawler())
                .AddJob(new SinaCrawler2())
                .setInterval(60 * 60 * 24)
                .run();

    }

}