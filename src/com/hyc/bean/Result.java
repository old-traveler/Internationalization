package com.hyc.bean;

import java.util.List;

public class Result {

    /**
     * tSpeakUrl : http://openapi.youdao.com/ttsapi?q=hello&langType=en&sign=B363CCAB69C2EA882B4922D2AD363270&salt=1524133297501&voice=4&format=mp3&appKey=13c673e0dd102b42
     * web : [{"value":["Hello","How do you do","hi"],"key":"你好"},{"value":["How are you","How Do You Do","Harvey, how are you Harvey"],"key":"你好吗"},{"value":["Teacher Kim Bong-du","My Teacher Mr Kim","Seonsaeng Kim Bong-du"],"key":"老师你好"}]
     * query : 你好
     * translation : ["hello"]
     * errorCode : 0
     * dict : {"url":"yddict://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD"}
     * webdict : {"url":"http://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD"}
     * basic : {"explains":["hello","hi"]}
     * l : zh-CHS2EN
     * speakUrl : http://openapi.youdao.com/ttsapi?q=%E4%BD%A0%E5%A5%BD&langType=zh-CHS&sign=F794081C66A784BFF964D75E4B7EA290&salt=1524133297501&voice=4&format=mp3&appKey=13c673e0dd102b42
     */

    private String tSpeakUrl;
    private String query;
    private String errorCode;
    private DictBean dict;
    private WebdictBean webdict;
    private BasicBean basic;
    private String l;
    private String speakUrl;
    private List<WebBean> web;
    private List<String> translation;

    public String getTSpeakUrl() {
        return tSpeakUrl;
    }

    public void setTSpeakUrl(String tSpeakUrl) {
        this.tSpeakUrl = tSpeakUrl;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public DictBean getDict() {
        return dict;
    }

    public void setDict(DictBean dict) {
        this.dict = dict;
    }

    public WebdictBean getWebdict() {
        return webdict;
    }

    public void setWebdict(WebdictBean webdict) {
        this.webdict = webdict;
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getSpeakUrl() {
        return speakUrl;
    }

    public void setSpeakUrl(String speakUrl) {
        this.speakUrl = speakUrl;
    }

    public List<WebBean> getWeb() {
        return web;
    }

    public void setWeb(List<WebBean> web) {
        this.web = web;
    }

    public List<String> getTranslation() {
        return translation;
    }

    public void setTranslation(List<String> translation) {
        this.translation = translation;
    }

    public static class DictBean {
        /**
         * url : yddict://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class WebdictBean {
        /**
         * url : http://m.youdao.com/dict?le=eng&q=%E4%BD%A0%E5%A5%BD
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class BasicBean {
        private List<String> explains;

        public List<String> getExplains() {
            return explains;
        }

        public void setExplains(List<String> explains) {
            this.explains = explains;
        }
    }

    public static class WebBean {
        /**
         * value : ["Hello","How do you do","hi"]
         * key : 你好
         */

        private String key;
        private List<String> value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public List<String> getValue() {
            return value;
        }

        public void setValue(List<String> value) {
            this.value = value;
        }
    }
}