package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OvfDeploymentOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfDeploymentOption", propOrder = {"key", "label", "description"})
public class OvfDeploymentOption extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String label;
  
  @XmlElement(required = true)
  protected String description;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
