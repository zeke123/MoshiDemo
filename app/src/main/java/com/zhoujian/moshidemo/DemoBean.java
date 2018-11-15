package com.zhoujian.moshidemo;

import java.util.List;

public class DemoBean {


    /**
     * name : BeJson
     * url : http://www.bejson.com
     * page : 88
     * isNonProfit : true
     * address : {"street":"科技园路.","city":"江苏苏州","country":"中国"}
     * links : [{"name":"Google","url":"http://www.google.com"},{"name":"Baidu","url":"http://www.baidu.com"},{"name":"SoSo","url":"http://www.SoSo.com"}]
     */

    private String name;
    private String url;
    private int page;
    private boolean isNonProfit;
    private AddressBean address;
    private List<LinksBean> links;

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isIsNonProfit() {
        return isNonProfit;
    }

    public void setIsNonProfit(boolean isNonProfit) {
        this.isNonProfit = isNonProfit;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public List<LinksBean> getLinks() {
        return links;
    }

    public void setLinks(List<LinksBean> links) {
        this.links = links;
    }

    public static class AddressBean {
        /**
         * street : 科技园路.
         * city : 江苏苏州
         * country : 中国
         */

        private String street;
        private String city;
        private String country;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "AddressBean{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
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

        @Override
        public String toString() {
            return "LinksBean{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "DemoBean{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", page=" + page +
                ", isNonProfit=" + isNonProfit +
                ", address=" + address +
                ", links=" + links +
                '}';
    }
}
