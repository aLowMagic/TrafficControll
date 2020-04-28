package com.example.demo.po;

public class FaqClassify {
    private String FAQCLASSIFYID;

    private String FAQCLASSIFYNAME;

    private String FAQPARENTID;

    private String FAQCLASSIFYIMAGE;

    public String getFAQCLASSIFYID() {
        return FAQCLASSIFYID;
    }

    public void setFAQCLASSIFYID(String FAQCLASSIFYID) {
        this.FAQCLASSIFYID = FAQCLASSIFYID == null ? null : FAQCLASSIFYID.trim();
    }

    public String getFAQCLASSIFYNAME() {
        return FAQCLASSIFYNAME;
    }

    public void setFAQCLASSIFYNAME(String FAQCLASSIFYNAME) {
        this.FAQCLASSIFYNAME = FAQCLASSIFYNAME == null ? null : FAQCLASSIFYNAME.trim();
    }

    public String getFAQPARENTID() {
        return FAQPARENTID;
    }

    public void setFAQPARENTID(String FAQPARENTID) {
        this.FAQPARENTID = FAQPARENTID == null ? null : FAQPARENTID.trim();
    }

    public String getFAQCLASSIFYIMAGE() {
        return FAQCLASSIFYIMAGE;
    }

    public void setFAQCLASSIFYIMAGE(String FAQCLASSIFYIMAGE) {
        this.FAQCLASSIFYIMAGE = FAQCLASSIFYIMAGE == null ? null : FAQCLASSIFYIMAGE.trim();
    }
}