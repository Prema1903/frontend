
package com.prema;

import javax.persistence.*;
@Entity
public class Book {
    @Id
    private String subCode;
    private String subName;
    
    @Column(columnDefinition="LONGBLOB")
    private byte[] subDoc;
    
    public Book() {
    }

    public Book(String subCode, String subName, byte[] subDoc) {
        this.subCode = subCode;
        this.subName = subName;
        this.subDoc = subDoc;
    }
    
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public byte[] getSubDoc() {
        return subDoc;
    }

    public void setSubDoc(byte[] subDoc) {
        this.subDoc = subDoc;
    }
    
}
