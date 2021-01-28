package com.yili.proxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInner proxyInner = new ProxyInner();
        proxyInner.setRent(host);
        Rent proxy = (Rent) proxyInner.getProxy();
        proxy.rent();
    }
}
