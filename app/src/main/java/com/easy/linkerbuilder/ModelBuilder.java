package com.easy.linkerbuilder;

import com.walixiwa.easy.machine.model.BaseRuleModel;

import java.util.Arrays;
import java.util.Collections;

/**
 * 代码中创建引擎的几个例子
 */
public class ModelBuilder {
    /**
     * 免嗅探站源DEMO，不保证有效性
     * @return
     */
    public static BaseRuleModel buildZuiDaModel(){
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("最大资源网");
        ruleModel.setVersion("2019.12.01/20:21");
        ruleModel.setBaseUrl("http://www.zuidazy2.net");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("http://www.zuidazy2.net/index.php?m=vod-search-pg-%page-wd-%keyWords.html");
        ruleModel.setRuleResultList("<li><span class=\"tt\">.*?xing_vb5.*?</li>");
        ruleModel.setRuleResultTitle("target=\"_blank\">(.*?)</a>");
        ruleModel.setRuleResultLinkHeader("http://www.zuidazy2.net");
        ruleModel.setRuleResultLink("<a href=\"(.*?)\"");
        ruleModel.setRuleResultType("xing_vb5\">(.*?)</span>");
        ruleModel.setRuleResultTime("xing_vb6\">(.*?)</span>");
        ruleModel.setRuleDetailCover("<img class=\"lazy\" src=\"(.*?)\"");
        ruleModel.setRuleDetailDesc("<div class=\"vodplayinfo\">(.*?)</div>");
        ruleModel.setRuleDetailListM3u8("<div id=\"play_1\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailListShare("<div id=\"play_2\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailDownList("<div id=\"down_1\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailMain("<li>.*?checkbox.*?</li>");
        ruleModel.setRuleDetailTitle("checked=\"\" />(.*?)\\$");
        ruleModel.setRuleDetailLink("value=\"(.*?)\"");
        ruleModel.setBlockWords(Arrays.asList("福利片","伦理片"));
        return ruleModel;
    }
    /**
     * 免嗅探站源DEMO，不保证有效性
     * @return
     */
    public static BaseRuleModel buildOkYunModel(){
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("Ok资源网");
        ruleModel.setVersion("2019.11.26");
        ruleModel.setBaseUrl("http://www.okzyw.com");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("http://www.okzyw.com/?m=vod-search-pg-%page-wd-%keyWords.html");
        ruleModel.setRuleResultList("<li><span class=\"tt\">[\\s\\S]*?</li>");
        ruleModel.setRuleResultTitle("target=\"_blank\">([\\s\\S]*?)</a>");
        ruleModel.setRuleResultLinkHeader("http://www.okzyw.com");
        ruleModel.setRuleResultLink("href=\"(.*?)\"");
        ruleModel.setRuleResultType("<span class=\"xing_vb5\">(.*?)</span>");
        ruleModel.setRuleResultTime("<span class=\"xing_vb6\">(.*?)</span>");
        ruleModel.setRuleDetailCover("<img class=\"lazy\" src=\"(.*?)\"");
        ruleModel.setRuleDetailDesc("<span class=\"more\" txt=\"([\\s\\S]*?)</span>");
        ruleModel.setRuleDetailListM3u8("<div id=\"2\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailListShare("<div id=\"1\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailDownList("<div id=\"down_1\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailMain("<li><input type=\"checkbox\"[\\s\\S]*?</li>");
        ruleModel.setRuleDetailTitle("/>(.*?)\\$");
        ruleModel.setRuleDetailLink("value=\"(.*?)\"");
        ruleModel.setBlockWords(Arrays.asList("伦理片","福利片"));
        return ruleModel;
    }


    /**
     * 嗅探源DEMO，不保证有效性
     * @return
     */
    public static BaseRuleModel buildChokModel() {
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("Chok吧电影院");
        ruleModel.setVersion("2019.02.02");
        ruleModel.setBaseUrl("https://www.chok8.com/");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("https://www.chok8.com/vodsearch/%keyWords----------%page---.html");
        ruleModel.setRuleResultList("<h3 class=\"title\"><a href=\".*?\">.*?</a>[\\s\\S]*?</div></li>");
        ruleModel.setRuleResultTitle("<a href=\".*?\">(.*?)</a>");
        ruleModel.setRuleResultLinkHeader("https://www.chok8.com");
        ruleModel.setRuleResultLink("<a href=\"(.*?)\">");
        ruleModel.setRuleResultType("类型：</span>(.*?)<");
        ruleModel.setRuleResultTime("年份：</span>(.*?)</span>");

        ruleModel.setRuleDetailCover("<img class=\"lazyload\" src=\".*?\" data-original=\"(.*?)\" />");
        ruleModel.setRuleDetailDesc("<span class=\"detail-sketch\">([\\s\\S]*?)</span>");

        ruleModel.setRuleDetailListSniff("<li><a href=\"/vodplay/.*?\">.*?</a></li>");
        ruleModel.setRuleSniffPattern("(ftn\\.qq\\.com|ftn_handler|^((?!url=).)*\\.m3u8|^((?!\\.php).)*\\.mp4)");
        ruleModel.setRuleDetailMain("<a href=\"/vodplay/.*?\">.*?</a>");
        ruleModel.setRuleDetailTitle("<a href=\"/vodplay/.*?\">(.*?)</a>");
        ruleModel.setRuleDetailLink("<a href=\"(.*?)\"");
        ruleModel.setRuleDetailLinkHeader("https://www.chok8.com");
        return ruleModel;
    }

    public static BaseRuleModel buildQingYunModel(){
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("青云资源网");
        ruleModel.setVersion("2020.05.24");
        ruleModel.setBaseUrl("http://qy-video.com/");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("http://qy-video.com/index.php?m=vod-search-pg-%page-wd-%keyWords.html");
        ruleModel.setRuleResultList("<li><span class=\"tt\">[\\s\\S]*?</li>");
        ruleModel.setRuleResultTitle("target=\"_blank\">([\\s\\S]*?)</font>");
        ruleModel.setRuleResultLinkHeader("http://qy-video.com");
        ruleModel.setRuleResultLink("href=\"(.*?)\"");
        ruleModel.setRuleResultType("<span class=\"xing_vb51\">(.*?)</span>");
        ruleModel.setRuleResultTime("<span class=\"xing_vb54\">(.*?)</span>");
        ruleModel.setRuleDetailCover("<img class=\"lazy\" src=\"(.*?)\"");
        ruleModel.setRuleDetailDesc("<div class=\"vodplayinfo\">(.*?)</div>");
//        ruleModel.setRuleDetailListM3u8("ckplayer</h3>[\\s\\S]*?</ul>");
//        ruleModel.setRuleDetailListShare("ckplayers</h3>[\\s\\S]*?</ul>");
//        ruleModel.setRuleDetailMain("<li><input type=\"checkbox\"[\\s\\S]*?</li>");
//        ruleModel.setRuleDetailTitle("/>(.*?)\\$");
//        ruleModel.setRuleDetailLink("value=\"(.*?)\"");

        ruleModel.setRuleDetailListSniff("ckplayer</h3>[\\s\\S]*?</ul>");
        ruleModel.setRuleSniffPattern("(ftn\\.qq\\.com|hls|^((?!url=).)*\\/hls\\/index\\.m3u8|^((?!\\.php).)*\\.mp4)");
        ruleModel.setRuleDetailMain("<li><input type=\"checkbox\"[\\s\\S]*?</li>");
        ruleModel.setRuleDetailTitle("/>(.*?)\\$");
        ruleModel.setRuleDetailLink("<a href=\"(.*?)\"");
        ruleModel.setRuleDetailLinkHeader("http://qy-video.com");

        ruleModel.setBlockWords(Arrays.asList("伦理片","福利片"));
        return ruleModel;
    }
    public static BaseRuleModel buildYongjiuModel(){
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("永久资源采集网");
        ruleModel.setVersion("2020.05.24");
        ruleModel.setBaseUrl("http://www.yongjiuzy1.com/");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("http://www.yongjiuzy1.com/index.php?m=vod-search-pg-%page-wd-%keyWords.html");
        ruleModel.setRuleResultList("id=\"data_list\">[\\s\\S]*?</tbody>");
        ruleModel.setRuleResultTitle("target=\"_blank\">([\\s\\S]*?)</a>");
        ruleModel.setRuleResultLinkHeader("http://www.yongjiuzy1.com/");
        ruleModel.setRuleResultLink("href=\"(.*?)\"");
        ruleModel.setRuleResultType("target=\"_blank\">(.*?)</a>");
        ruleModel.setRuleResultTime("<td><font (.*?)</font>");
        ruleModel.setRuleDetailCover("<div class=\"videoPic\"><img src=\"(.*?)\"");
        ruleModel.setRuleDetailDesc("<div class=\"videoDetail\">(.*?)</div>");
        ruleModel.setRuleDetailListM3u8("<div class=\"movievod\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailMain("<li><input type=\"checkbox\"[\\s\\S]*?</li>");
        ruleModel.setRuleDetailTitle("/>(.*?)\\$");
        ruleModel.setRuleDetailLink("value=\"(.*?)\"");
        ruleModel.setBlockWords(Arrays.asList("伦理片","福利片"));
        return ruleModel;
    }
    public static BaseRuleModel buildJuheModel(){
        BaseRuleModel ruleModel = new BaseRuleModel();
        ruleModel.setName("聚合资源网");
        ruleModel.setVersion("2020.05.24");
        ruleModel.setBaseUrl("http://juhezyw.cc/");
        ruleModel.setReqCharset("utf-8");
        ruleModel.setHtmlCharset("utf-8");
        ruleModel.setSearchUrl("http://juhezyw.cc/index.php?m=vod-search-pg-%page-wd-%keyWords.html");
        ruleModel.setRuleResultList("<li><a class=\"videoName\">[\\s\\S]*?</li>");
        ruleModel.setRuleResultTitle("\"new.gif\">([\\s\\S]*?)</a>");
        ruleModel.setRuleResultLinkHeader("http://juhezyw.cc/");
        ruleModel.setRuleResultLink("href=\"(.*?)\"");
        ruleModel.setRuleResultType("<span class=\"category\">(.*?)</span>");
        ruleModel.setRuleResultTime("<span class=\"region\">(.*?)</span>");
        ruleModel.setRuleDetailCover("<div class=\"left\"><img src=\"(.*?)\"");
        ruleModel.setRuleDetailDesc("<div class=\"right\">(.*?)</div>");
        ruleModel.setRuleDetailListM3u8("<div class=\"playlist wbox\">[\\s\\S]*?</ul>");
        ruleModel.setRuleDetailMain("<li><input type=\"checkbox\"[\\s\\S]*?</li>");
        ruleModel.setRuleDetailTitle("/>(.*?)\\$");
        ruleModel.setRuleDetailLink("value=\"(.*?)\"");
        ruleModel.setBlockWords(Arrays.asList("伦理片","福利片"));
        return ruleModel;
    }

}
