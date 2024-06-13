package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionServerInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionServerInfo", propOrder = {"url", "description", "company", "type", "adminEmail", "serverThumbprint"})
public class ExtensionServerInfo extends DynamicData {
  @XmlElement(required = true)
  protected String url;
  
  @XmlElement(required = true)
  protected Description description;
  
  @XmlElement(required = true)
  protected String company;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected List<String> adminEmail;
  
  protected String serverThumbprint;
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
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
  
  public List<String> getAdminEmail() {
    if (this.adminEmail == null)
      this.adminEmail = new ArrayList<>(); 
    return this.adminEmail;
  }
  
  public String getServerThumbprint() {
    return this.serverThumbprint;
  }
  
  public void setServerThumbprint(String paramString) {
    this.serverThumbprint = paramString;
  }
}
