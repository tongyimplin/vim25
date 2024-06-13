package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ModeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeInfo", propOrder = {"browse", "read", "modify", "use", "admin", "full"})
public class ModeInfo extends DynamicData {
  protected String browse;
  
  @XmlElement(required = true)
  protected String read;
  
  @XmlElement(required = true)
  protected String modify;
  
  @XmlElement(required = true)
  protected String use;
  
  protected String admin;
  
  @XmlElement(required = true)
  protected String full;
  
  public String getBrowse() {
    return this.browse;
  }
  
  public void setBrowse(String paramString) {
    this.browse = paramString;
  }
  
  public String getRead() {
    return this.read;
  }
  
  public void setRead(String paramString) {
    this.read = paramString;
  }
  
  public String getModify() {
    return this.modify;
  }
  
  public void setModify(String paramString) {
    this.modify = paramString;
  }
  
  public String getUse() {
    return this.use;
  }
  
  public void setUse(String paramString) {
    this.use = paramString;
  }
  
  public String getAdmin() {
    return this.admin;
  }
  
  public void setAdmin(String paramString) {
    this.admin = paramString;
  }
  
  public String getFull() {
    return this.full;
  }
  
  public void setFull(String paramString) {
    this.full = paramString;
  }
}
