package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionClientInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionClientInfo", propOrder = {"version", "description", "company", "type", "url"})
public class ExtensionClientInfo extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected Description description;
  
  @XmlElement(required = true)
  protected String company;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String url;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public Description getDescription() {
    return this.description;
  }
  
  public void setDescription(Description paramDescription) {
    this.description = paramDescription;
  }
  
  public String getCompany() {
    return this.company;
  }
  
  public void setCompany(String paramString) {
    this.company = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
