package com.microsoft.graphdataconnect.skillsfinder.replyextractor.regex;

public class RomanianQuoteHeaderRegex extends QuoteHeaderRegex {
    @Override
    public String on() {
        return "În";
    }

    @Override
    public String wrote() {
        return "a scris";
    }

    @Override
    public String to() {
        return "Către";
    }

    @Override
    public String from() {
        return "De la";
    }

    @Override
    public String subject() {
        return "Subiect";
    }

    @Override
    public String sent() {
        return "Trimis";
    }

    @Override
    public String date() {
        return "Data";
    }
}
