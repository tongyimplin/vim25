package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseSourceFile;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseSourceFile", propOrder = {"targetDeviceId", "url", "memberName", "create", "sslThumbprint", "httpHeaders", "size"})
public class HttpNfcLeaseSourceFile extends DynamicData {
  @XmlElement(required = true)
  protected String targetDeviceId;
  
  @XmlElement(required = true)
  protected String url;
  
  protected String memberName;
  
  protected boolean create;
  
  protected String sslThumbprint;
  
  protected List<KeyValue> httpHeaders;
  
  protected Long size;
  
  public String getTargetDeviceId() {
    return this.targetDeviceId;
  }
  
  public void setTargetDeviceId(String paramString) {
    this.targetDeviceId = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public String getMemberName() {
    return this.memberName;
  }
  
  public void setMemberName(String paramString) {
    this.memberName = paramString;
  }
  
  public boolean isCreate() {
    return this.create;
  }
  
  public void setCreate(boolean paramBoolean) {
    this.create = paramBoolean;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
  
  public List<KeyValue> getHttpHeaders() {
    if (this.httpHeaders == null)
      this.httpHeaders = new ArrayList<>(); 
    return this.httpHeaders;
  }
  
  public Long getSize() {
    return this.size;
  }
  
  public void setSize(Long paramLong) {
    this.size = paramLong;
  }
}
