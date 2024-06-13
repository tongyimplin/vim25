package com.vmware.vim25;

import com.vmware.vim25.InaccessibleDatastore;
import com.vmware.vim25.InaccessibleFTMetadataDatastore;
import com.vmware.vim25.InvalidDatastore;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InaccessibleDatastore", propOrder = {"detail"})
@XmlSeeAlso({InaccessibleFTMetadataDatastore.class})
public class InaccessibleDatastore extends InvalidDatastore {
  protected String detail;
  
  public String getDetail() {
    return this.detail;
  }
  
  public void setDetail(String paramString) {
    this.detail = paramString;
  }
}
