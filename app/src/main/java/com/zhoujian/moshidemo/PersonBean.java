package com.zhoujian.moshidemo;

import java.util.List;

public class PersonBean {


    private List<LinksBean> links;

    public List<LinksBean> getLinks() {
        return links;
    }

    public void setLinks(List<LinksBean> links) {
        this.links = links;
    }

    public static class LinksBean {
        /**
         * name : Google
         * url : http://www.google.com
         */

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
