package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VimVasaProvider;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProvider", propOrder = {"uid", "url", "name", "selfSignedCertificate"})
public class VimVasaProvider extends DynamicData {
  protected String uid;
  
  @XmlElement(required = true)
  protected String url;
  
  protected String name;
  
  protected String selfSignedCertificate;
  
  public String getUid() {
    return this.uid;
  }
  
  public void setUid(String paramString) {
    this.uid = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getSelfSignedCertificate() {
    return this.selfSignedCertificate;
  }
  
  public void setSelfSignedCertificate(String paramString) {
    this.selfSignedCertificate = paramString;
  }
}
