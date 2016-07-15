package com.elite.wjc;

import org.junit.Test;
import org.markdownj.MarkdownProcessor;

/**
 * Created by wjc133
 * Date: 2016/7/11
 * Time: 13:09
 */
public class NormalProcessorTest {
    MarkdownProcessor processor = new MarkdownProcessor();

    @Test
    public void testProcessor(){
        String markdown = "#zipkin的数据库替换\n" +
                "\n" +
                "zipkin目前支持三种类型的数据库\n" +
                "\n" +
                "1. cassandra\n" +
                "2. mysql\n" +
                "3. elasticsearch";
        String html = processor.markdown(markdown);
        System.out.println(html);
    }

    @Test
    public void testRemoveTab(){
        String markdown = "#zipkin的数据库替换\t\t\n";
        String html = processor.markdown(markdown);
        System.out.println(html);
    }
}
