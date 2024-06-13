package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtManagedEntityInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtManagedEntityInfo", propOrder = {"type", "smallIconUrl", "iconUrl", "description"})
public class ExtManagedEntityInfo extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected String smallIconUrl;
  
  protected String iconUrl;
  
  protected String description;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getSmallIconUrl() {
    return this.smallIconUrl;
  }
  
  public void setSmallIconUrl(String paramString) {
    this.smallIconUrl = paramString;
  }
  
  public String getIconUrl() {
    return this.iconUrl;
  }
  
  public void setIconUrl(String paramString) {
    this.iconUrl = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
